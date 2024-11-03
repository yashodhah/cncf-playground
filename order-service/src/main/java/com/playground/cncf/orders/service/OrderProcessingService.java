package com.playground.cncf.orders.service;

import com.playground.cncf.orders.model.OrderDTO;
import com.playground.cncf.orders.model.Order;
import com.playground.cncf.orders.model.OrderStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class OrderProcessingService {

    @Autowired
    OrderPaymentService orderPaymentService;

    public void processOrder(OrderDTO orderDTO) {
        validateOrder(orderDTO);
        persistOrder(orderDTO);
        orderPaymentService.processOrderPayments(orderDTO);
    }


    private void persistOrder(OrderDTO orderDTO) {
        Order order = new Order(orderDTO.id(), orderDTO.customerId(), orderDTO.items(), OrderStatus.PLACED, LocalDateTime.now(), LocalDateTime.now());
        log.info("Persisting order details for order : order id {}", orderDTO.id());
    }

    private void validateOrder(OrderDTO orderDTO) {
        log.info("validating order details for order {}", orderDTO.id());
    }
}
