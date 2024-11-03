package com.playground.cncf.orders.model;

import java.util.List;

public record OrderDTO(Long id, Long customerId, List<OrderItemDTO> items, String paymentToken, OrderStatus orderStatus) {
}

