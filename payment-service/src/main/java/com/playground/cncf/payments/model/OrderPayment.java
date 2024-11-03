package com.playground.cncf.payments.model;

public record OrderPayment(Long id,
                           String paymentToken,
                           double amount) {
}
