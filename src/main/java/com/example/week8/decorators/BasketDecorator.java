package com.example.week8.decorators;

import com.example.week8.flowers.Item;

public class BasketDecorator extends ItemDecorator{
    public double getPrice(Item item){
        return 4 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return "This is basket decorator for flowers";
    }
}
