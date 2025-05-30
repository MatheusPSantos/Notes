package br.com.create.shortener.url;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Main implements RequestHandler<Map<String, Object>, Map<String, String>> {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final S3Client s3Client = S3Client.builder().build();

    @Override
    public Map<String, String> handleRequest(Map<String, Object> stringObjectMap, Context context) {
        String body = stringObjectMap.get("body").toString();
        System.out.println("body = " + body);
        Map<String, String> bodyMap;
        try {
            bodyMap = objectMapper.readValue(body, Map.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error parsing JSON body: " + e.getMessage(), e);
        }
        String originalUrl = bodyMap.get("originalUrl");
        String expirationTime = bodyMap.get("expirationTime");
        long expirationTimeInSeconds = Long.parseLong(expirationTime);
        String shortUrlCode = UUID.randomUUID().toString().substring(0, 8);

        UrlData urldata = new UrlData(originalUrl, expirationTimeInSeconds);

        System.out.println("urlData = " + urldata.toString());

        String urlDataJson = null;
        try {
            urlDataJson = objectMapper.writeValueAsString(urldata);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("urlDataJson = " + urlDataJson);
        PutObjectRequest request = PutObjectRequest.builder()
                .bucket("rocket-seat-java-lambda-url-shortener-storage")
                .key(shortUrlCode + ".json")
                .build();
        try {
            s3Client.putObject(request, RequestBody.fromString(urlDataJson));
        } catch (AwsServiceException e) {
            throw new RuntimeException(e);
        }

        Map<String, String> response = new HashMap<>();
        response.put("code", shortUrlCode);
        return response;
    }

}