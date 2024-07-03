package br.com.alura.ecommerce;

import br.com.alura.ecommerce.domain.EcommerceTopics;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.util.Map;

public class EmailService {
    public static void main(String[] args) {
        var emailService = new EmailService();
        try (KafkaService kafkaService = new KafkaService<>(
                EmailService.class.getSimpleName(),
                EcommerceTopics.ECOMMERCE_SEND_EMAIL.getValue(),
                emailService::parse,
                String.class,
                Map.of()
        )) {
            kafkaService.run();
        }
    }


    private void parse(ConsumerRecord<String, String> record) {
        System.out.println("==========================================");
        System.out.println(record.key());
        System.out.printf(record.value());
        System.out.println(record.partition());
        System.out.println(record.offset());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("Order processed.");
        System.out.println("==========================================");
    }
}
