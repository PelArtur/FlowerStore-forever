package com.example.week8.flowers;

public abstract class Item {
    public String description;
    public abstract double getPrice();
    public String getDescription(){
        return description;
    }
}
