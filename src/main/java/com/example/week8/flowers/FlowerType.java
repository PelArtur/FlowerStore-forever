package com.example.week8.flowers;

import lombok.Getter;

public enum FlowerType {
    CHAMOMILE(9.5, FlowerColor.WHITE, 2.79, "Chamomile"),
    ROSE(13.1, FlowerColor.RED, 4.99, "Rose"),
    TULIP(12.5, FlowerColor.YELLOW, 1.99, "Tulip");

    @Getter
    private final double sepalLength;
    @Getter
    private final FlowerColor color;
    @Getter
    private final double price;
    @Getter
    private final String description;

    FlowerType(double sepalLength, FlowerColor color, double price, String description) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.description = description;
    }
}
