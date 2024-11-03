package com.playground.cncf.orders.model;

public record OrderPayment(Long id, String paymentToken, double amount) {
}
