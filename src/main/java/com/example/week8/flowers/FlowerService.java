package com.example.week8.flowers;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    public List<Flower> getFlower() {
        return List.of(new Flower(12, FlowerColor.RED, 12, FlowerType.TULIP, "Tulip"));
    }
}
