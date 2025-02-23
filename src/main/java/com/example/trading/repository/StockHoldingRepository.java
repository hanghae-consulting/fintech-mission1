package com.example.trading.repository;

import com.example.trading.entity.StockHolding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockHoldingRepository extends JpaRepository<StockHolding, Long> {
    // TODO: 사용자 ID를 기반으로 보유 주식 조회 기능 추가
    // 1. 특정 사용자의 보유 주식을 반환해야 합니다.
}
