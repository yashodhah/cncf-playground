package com.playground.cncf.orders.model;

import java.time.LocalDateTime;
import java.util.List;

public record Order(Long orderId, Long customerId, List<OrderItemDTO> orderItemDTOS, OrderStatus status, LocalDateTime createdDate, LocalDateTime updatedDate) {
}
