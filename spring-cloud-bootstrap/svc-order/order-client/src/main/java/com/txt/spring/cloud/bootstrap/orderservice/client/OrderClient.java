package com.txt.spring.cloud.bootstrap.orderservice.client;

public interface OrderClient {
    OrderResponse order(OrderDTO orderDTO);
}
