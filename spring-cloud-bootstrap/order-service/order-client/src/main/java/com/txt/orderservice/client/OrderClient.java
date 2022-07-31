package com.txt.orderservice.client;

public interface OrderClient {
    OrderResponse order(OrderDTO orderDTO);
}
