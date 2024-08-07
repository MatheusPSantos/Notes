package br.com.alura.ecommerce.domain;

public enum EcommerceTopics {
    ECOMMERCE_SEND_EMAIL("ECOMMERCE_SEND_EMAIL"),
    ECOMMERCE_NEW_ORDER("ECOMMERCE_NEW_ORDER"),
    ECOMMERCE_ALL_TOPICS("ECOMMERCE.*"),
    ECOMMERCE_ORDER_REJECTED("ECOMMERCE_ORDER_REJECTED"),
    ECOMMERCE_ORDER_APPROVED("ECOMMERCE_ORDER_APPROVED");

    private final String s;

    EcommerceTopics(final String s) {
        this.s = s;
    }

    public String getValue() {
        return s;
    }

    @Override
    public String toString() {
        return this.getValue();
    }

}