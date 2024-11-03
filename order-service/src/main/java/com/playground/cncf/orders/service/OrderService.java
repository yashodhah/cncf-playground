package com.playground.cncf.orders.service;

import com.playground.cncf.orders.model.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class OrderService {

    private final OrderProcessingService orderProcessingService;

    public OrderService(OrderProcessingService orderProcessingService) {
        this.orderProcessingService = orderProcessingService;
    }

    public void placeOrder(OrderDTO orderDTO) {
        log.info("Placing order : order id {}", orderDTO.id());
        orderProcessingService.processOrder(orderDTO);
    }

    public void updateOrder(OrderDTO orderDTO) {
        log.info("Updating order status : order id {}", orderDTO.id());
    }

    public void shipOrder() {
        // Ship order logic
    }

    public void deliverOrder() {
        // Deliver order logic
    }

    public void cancelOrder() {
        // Cancel order logic
    }
}
