package com.example.query.service;

import com.example.query.dto.StockHoldingResponse;
import com.example.trading.dto.StockOrderResponse;
import com.example.trading.repository.StockHoldingRepository;
import com.example.trading.repository.StockOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QueryService {

    private final StockHoldingRepository stockHoldingRepository;
    private final StockOrderRepository stockOrderRepository;

    public List<StockHoldingResponse> getUserHoldings(String userId) {
        // TODO: 사용자의 보유 주식 목록을 조회하는 기능 구현
        // 1. 특정 사용자가 보유한 모든 주식을 조회해야 합니다.
        // 2. 조회 결과를 DTO로 변환하여 반환해야 합니다.
        return null; // TODO: 조회된 데이터를 변환하여 반환
    }

    public List<StockOrderResponse> getOrderHistory(String userId) {
        // TODO: 사용자의 주문 이력 조회 기능 구현
        // 1. 특정 사용자가 수행한 모든 주문을 조회해야 합니다.
        // 2. 주문 정보를 DTO로 변환하여 반환해야 합니다.
        return null; // TODO: 조회된 데이터를 변환하여 반환
    }
}
