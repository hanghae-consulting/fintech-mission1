package com.example.trading.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockOrderRequest {
    private String userId;
    private String stockSymbol;
    private int quantity;
    private double price;
    private String orderType; // "BUY" or "SELL"
}
