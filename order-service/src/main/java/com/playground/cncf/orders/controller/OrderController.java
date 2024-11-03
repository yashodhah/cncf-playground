package com.playground.cncf.orders.controller;

import com.playground.cncf.orders.model.OrderDTO;
import com.playground.cncf.orders.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping()
    public ResponseEntity<String> placeOrder(@RequestBody OrderDTO orderDTO) {
        orderService.placeOrder(orderDTO);
        return ResponseEntity.ok("Order has been placed");
    }

    @PutMapping
    public ResponseEntity<String> updateOrder(@RequestBody OrderDTO orderDTO) {
        orderService.updateOrder(orderDTO);
        return ResponseEntity.ok("Order has been updated");
    }
}
