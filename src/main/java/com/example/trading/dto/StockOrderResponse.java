package com.example.trading.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class StockOrderResponse {
    private String stockSymbol;
    private int quantity;
    private double price;
    private String orderType;
    private LocalDateTime orderTime;
}
