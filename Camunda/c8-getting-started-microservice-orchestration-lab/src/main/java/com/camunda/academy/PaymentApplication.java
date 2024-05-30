package com.camunda.academy;

public class PaymentApplication {
  private static final String ZEEBE_ADDRESS = "d02cec98-be5d-4b02-9a19-1989bcc31191.syd-1.zeebe.camunda.io:443";
  private static final String ZEEBE_CLIENT_ID = "fvn1AGk29FiG0HniAAfid-Y_DRu5Puum";
  private static final String ZEEBE_CLIENT_SECRET = "HH4vrJet.2~EsRLiSAgerQ4oAce12yVTh5_TVxpo2LcW3rXNxSc3oOsycELQ-Njj";
  private static final String ZEEBE_AUTHORIZATION_SERVER_URL = "https://login.cloud.camunda.io/oauth/token";
  private static final String ZEEBE_REST_ADDRESS = "https://syd-1.zeebe.camunda.io/d02cec98-be5d-4b02-9a19-1989bcc31191";
  private static final String ZEEBE_GRPC_ADDRESS = "grpcs://d02cec98-be5d-4b02-9a19-1989bcc31191.syd-1.zeebe.camunda.io:443";
  private static final String ZEEBE_TOKEN_AUDIENCE = "zeebe.camunda.io";

  public static String getZeebeAddress() {
    return ZEEBE_ADDRESS;
  }

  public static String getZeebeClientId() {
    return ZEEBE_CLIENT_ID;
  }

  public static String getZeebeClientSecret() {
    return ZEEBE_CLIENT_SECRET;
  }

  public static String getZeebeAuthorizationServerUrl() {
    return ZEEBE_AUTHORIZATION_SERVER_URL;
  }

  public static String getZeebeRestAddress() {
    return ZEEBE_REST_ADDRESS;
  }

  public static String getZeebeGrpcAddress() {
    return ZEEBE_GRPC_ADDRESS;
  }

  public static String getZeebeTokenAudience() {
    return ZEEBE_TOKEN_AUDIENCE;
  }
}
