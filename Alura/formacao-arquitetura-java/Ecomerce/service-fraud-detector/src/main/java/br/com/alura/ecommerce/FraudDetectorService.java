package br.com.alura.ecommerce;

import br.com.alura.ecommerce.domain.EcommerceTopics;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class FraudDetectorService {
    private final KafkaDispatcher<Order> orderKafkaDispatcher = new KafkaDispatcher<Order>();

    public static void main(String[] args) {
        var fraudDetectorService = new FraudDetectorService();
        try (var kafkaService = new KafkaService<Order>(
                FraudDetectorService.class.getSimpleName(),
                EcommerceTopics.ECOMMERCE_NEW_ORDER.getValue(),
                fraudDetectorService::parse,
                Order.class,
                Map.of())
        ) {
            kafkaService.run();
        }
    }

    private static boolean isFraud(Order order) {
        return order.getAmmount().compareTo(new BigDecimal("4500")) >= 0;
    }

    private void parse(ConsumerRecord<String, Order> record) throws ExecutionException, InterruptedException {
        System.out.println("Processing new order, checking for fraud");
        System.out.println(record.key());
        System.out.println(record.value());
        System.out.println(record.partition());
        System.out.println(record.offset());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        var order = record.value();
        if (isFraud(order)) {
            // pretending that fraud happens when the amount is >= 4500
            System.out.println("Order is a fraud!");
            orderKafkaDispatcher.send(EcommerceTopics.ECOMMERCE_ORDER_REJECTED.getValue(), order.getEmail(), order);
        } else {
            System.out.println("Approved order " + order);
            orderKafkaDispatcher.send(EcommerceTopics.ECOMMERCE_ORDER_APPROVED.getValue(), order.getEmail(), order);
        }

        System.out.println("Order processed.");
    }

}