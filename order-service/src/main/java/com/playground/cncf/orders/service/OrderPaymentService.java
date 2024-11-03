package com.playground.cncf.orders.service;

import com.playground.cncf.orders.config.OrderServiceProperties;
import com.playground.cncf.orders.model.OrderDTO;
import com.playground.cncf.orders.model.OrderPayment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.concurrent.ThreadLocalRandom;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@Slf4j
public class OrderPaymentService {

    @Autowired
    private RestClient paymentServiceClient;

    @Autowired
    private OrderServiceProperties orderServiceProperties;

    public void processOrderPayments(OrderDTO orderDTO) {
        ResponseEntity<String> response = paymentServiceClient.post()
                .uri(orderServiceProperties.getPaymentsServiceURL() + "/api/v1/payments")
                .contentType(APPLICATION_JSON)
                .body(getOrderPayment(orderDTO))
                .retrieve()
                .toEntity(String.class);

        log.info(response.toString());
    }

    private OrderPayment getOrderPayment(OrderDTO orderDTO) {
        // TODO: generate actual amount wrt to an inventory
        double amount = ThreadLocalRandom.current().nextDouble(10, 120);
        return new OrderPayment(orderDTO.id(), orderDTO.paymentToken(), amount);
    }
}
