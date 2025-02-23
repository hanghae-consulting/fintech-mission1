package com.example.trading.repository;

import com.example.trading.entity.StockOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockOrderRepository extends JpaRepository<StockOrder, Long> {
    List<StockOrder> findByUserId(String userId);
    // TODO: 사용자 ID를 기반으로 주문 내역 조회 기능 추가
    // 1. 특정 사용자의 주문 내역을 반환해야 합니다.
}
