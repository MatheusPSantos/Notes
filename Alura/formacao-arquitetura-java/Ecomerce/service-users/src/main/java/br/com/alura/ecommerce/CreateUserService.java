package br.com.alura.ecommerce;

import br.com.alura.ecommerce.domain.EcommerceTopics;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class CreateUserService {
    private final Connection connection;

    CreateUserService() throws SQLException {
        String url = "jdbc:sqlite:users_database.db";
        this.connection = DriverManager.getConnection(url);
        connection.createStatement().execute("" +
                "CREATE TABLE IF NOT EXISTS Users (" +
                "   uuid varchar(200) primary key," +
                "   email varchar(200)" +
                ")");
    }

    public static void main(String[] args) throws SQLException {
        var createUserService = new CreateUserService();
        try (var kafkaService = new KafkaService<>(
                CreateUserService.class.getSimpleName(),
                EcommerceTopics.ECOMMERCE_NEW_ORDER.getValue(),
                createUserService::parse,
                Order.class,
                Map.of()
        )) {
            kafkaService.run();
        }
    }

    private void parse(ConsumerRecord<String, Order> record) throws ExecutionException, InterruptedException, SQLException {
        System.out.println("Processing new order, checking for new user");
        System.out.println(record.key());
        System.out.println(record.value());
        System.out.println(record.partition());
        System.out.println(record.offset());
        var order = record.value();
        if (isNewUser(order.getEmail())) {
            insertNewUser(UUID.randomUUID().toString(), order.getEmail());
        }
    }

    private void insertNewUser(String userId, String email) throws SQLException {
        var insert = connection.prepareStatement("INSERT INTO Users (uuid, email) VALUES (?, ?)");

        insert.setString(1, userId);
        insert.setString(2, email);
        insert.execute();
        System.out.println("User created with email " + email);
    }

    private boolean isNewUser(String email) throws SQLException {
        var exists = connection.prepareStatement("SELECT uuid FROM Users WHERE email = ? LIMIT 1");
        exists.setString(1, email);
        var results = exists.executeQuery();
        return !results.next();
    }

}
