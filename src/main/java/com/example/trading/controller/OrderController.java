package com.example.trading.controller;

import com.example.trading.dto.StockOrderRequest;
import com.example.trading.dto.StockOrderResponse;
import com.example.trading.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trading/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<StockOrderResponse> placeOrder(@RequestBody StockOrderRequest request) {
        // TODO: 주식 주문 API 구현
        // 1. 클라이언트로부터 주문 요청을 받아 OrderService에 전달해야 합니다.
        // 2. 주문 결과를 JSON 형식으로 반환해야 합니다.
        return null; // TODO: 응답 결과 반환
    }
}
