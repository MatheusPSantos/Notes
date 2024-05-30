package com.camunda.academy;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import com.camunda.academy.handler.CreditCardServiceHandler;

import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.client.api.worker.JobWorker;
import io.camunda.zeebe.client.impl.oauth.OAuthCredentialsProvider;
import io.camunda.zeebe.client.impl.oauth.OAuthCredentialsProviderBuilder;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        final OAuthCredentialsProvider credentialsProvider = new OAuthCredentialsProviderBuilder()
                .authorizationServerUrl(PaymentApplication.getZeebeAuthorizationServerUrl())
                .audience(PaymentApplication.getZeebeTokenAudience())
                .clientId(PaymentApplication.getZeebeClientId())
                .clientSecret(PaymentApplication.getZeebeClientSecret())
                .build();

        try {
            final ZeebeClient client = ZeebeClient.newClientBuilder()
                    .gatewayAddress(PaymentApplication.getZeebeAddress())
                    .credentialsProvider(credentialsProvider)
                    .build();

            final Map<String, Object> variables = new HashMap<String, Object>();
            variables.put("reference", "C8_12345");
            variables.put("amount", Double.valueOf(100.00));
            variables.put("cardNumber", "1234567812345678");
            variables.put("cardExpiry", "12/2023");
            variables.put("cardCVC", "123");

            client.newCreateInstanceCommand()
                    .bpmnProcessId("paymentProcess")
                    .latestVersion()
                    .variables(variables)
                    .send()
                    .join();

            final JobWorker creditCardWorker = client.newWorker()
                    .jobType("chargeCreditCard")
                    .handler(new CreditCardServiceHandler())
                    .timeout(Duration.ofSeconds(10).toMillis())
                    .open();
            Thread.sleep(40000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
