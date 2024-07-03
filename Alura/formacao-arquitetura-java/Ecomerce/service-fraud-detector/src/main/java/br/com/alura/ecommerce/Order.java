package br.com.alura.ecommerce;

import java.math.BigDecimal;

public class Order {
    private final String orderID;
    private final BigDecimal ammount;
    private final String email;

    public Order(String orderID, BigDecimal ammount, String email) {

        this.orderID = orderID;
        this.ammount = ammount;
        this.email = email;
    }

    public String getOrderID() {
        return orderID;
    }

    public BigDecimal getAmmount() {
        return ammount;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", ammount=" + ammount +
                ", email='" + email + '\'' +
                '}';
    }
}
