package br.com.alura.ecommerce;

import br.com.alura.ecommerce.domain.EcommerceTopics;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Map;
import java.util.regex.Pattern;

public class LogService {
    public static void main(String[] args) {
        var logService = new LogService();
        try (var kafkaService = new KafkaService<>(LogService.class.getSimpleName(),
                Pattern.compile(EcommerceTopics.ECOMMERCE_ALL_TOPICS.getValue()),
                logService::parse,
                String.class,
                Map.of(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName())
        )) {
            kafkaService.run();
        }
    }

    private void parse(ConsumerRecord<String, String> record) {
        System.out.println("----------------------------");
        System.out.println("...::: LOG :::..." + record.toString());
    }

}
