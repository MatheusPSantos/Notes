package br.com.redirect.shortener.url;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class Main implements RequestHandler<Map<String, Object>, Map<String, Object>> {

    private static final Logger log = LoggerFactory.getLogger(Main.class);
    private final S3Client s3Client = S3Client.builder().build();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Map<String, Object> handleRequest(Map<String, Object> stringObjectMap, Context context) {
        String pathParameters = stringObjectMap.get("rawPath").toString();
        String shortnerUrlCode = pathParameters.replace("/", "");
        System.out.println("ShortnerUrlCode retrieved " + shortnerUrlCode);
        if (shortnerUrlCode == null || shortnerUrlCode.isEmpty()) {
            throw new IllegalArgumentException("Invalid input: 'shortnerUrlCode' is required.");
        }
        String objectKey = shortnerUrlCode + ".json";
        System.out.println("searching by key " + objectKey);
        GetObjectRequest getRequest = GetObjectRequest.builder()
                .bucket("rocket-seat-java-lambda-url-shortener-storage")
                .key(objectKey)
                .build();
        InputStream s3ObjectStream;
        try {
            s3ObjectStream = s3Client.getObject(getRequest);
            System.out.println("object retrieved from S3 for key " + objectKey);
            System.out.println("s3ObejctStream = " + s3ObjectStream.toString());
        } catch (Exception e) {
            throw new RuntimeException("Error fetching data from S3: " + e.getMessage(), e);
        }

        UrlData urlData;
        try {
            urlData = objectMapper.readValue(s3ObjectStream, UrlData.class);
        } catch (Exception e) {
            throw new RuntimeException("Error deserializing URL data: " + e.getMessage(), e);
        }

        long currentTimeInSeconds = System.currentTimeMillis() / 1000;
        Map<String, Object> response = new HashMap<>();

        if (urlData.getExpirationTime() < currentTimeInSeconds) {

            response.put("statusCode", 410);
            response.put("body", "This URL expired.");
            return response;


        }

        response.put("statusCode", 302);
        Map<String, String> headers = new HashMap<>();
        headers.put("Location", urlData.getOriginalUrl());
        response.put("headers", headers);
        System.out.println("Finishing process returning response = " + response.toString());
        return response;

    }
}