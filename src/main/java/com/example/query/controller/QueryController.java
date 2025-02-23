package com.example.query.controller;

import com.example.query.dto.StockHoldingResponse;
import com.example.query.service.QueryService;
import com.example.trading.dto.StockOrderResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/query")
@RequiredArgsConstructor
public class QueryController {

    private final QueryService queryService;

    @GetMapping("/holdings/{userId}")
    public ResponseEntity<List<StockHoldingResponse>> getHoldings(@PathVariable String userId) {
        // TODO: 보유 주식 조회 API 구현
        // 1. 사용자의 보유 주식 정보를 조회하여 반환해야 합니다.
        // 2. 조회 결과는 JSON 형식으로 반환해야 합니다.
        return null; // TODO: 조회 결과 반환
    }

    @GetMapping("/history/{userId}")
    public ResponseEntity<List<StockOrderResponse>> getOrderHistory(@PathVariable String userId) {
        // TODO: 주문 이력 조회 API 구현
        // 1. 사용자의 주문 내역을 조회하여 반환해야 합니다.
        // 2. 조회 결과는 JSON 형식으로 반환해야 합니다.
        return null; // TODO: 조회 결과 반환
    }
}
