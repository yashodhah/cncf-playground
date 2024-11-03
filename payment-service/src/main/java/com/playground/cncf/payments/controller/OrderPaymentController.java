package com.playground.cncf.payments.controller;

import com.playground.cncf.payments.model.OrderPayment;
import com.playground.cncf.payments.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/payments")
public class OrderPaymentController {

    private final PaymentService paymentService;

    public OrderPaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping()
    public ResponseEntity<String> processPayment(@RequestBody OrderPayment orderPayment) {
        paymentService.processPayment(orderPayment);
        return ResponseEntity.ok("Payment successful mate! drugs on the way");
    }
}
