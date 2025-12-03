package com.example.order.order.service;

import com.example.order.order.dto.OrderRequestDto;
import com.example.order.order.dto.OrderResponseDto;

public interface OrderService {

    OrderResponseDto placeOrder(OrderRequestDto orderRequestDto);
}
