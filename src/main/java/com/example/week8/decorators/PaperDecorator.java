package com.example.week8.decorators;

import com.example.week8.flowers.Item;

public class PaperDecorator extends ItemDecorator{
    public double getPrice(Item item){
        return 13 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return "This is paper decorator for flowers";
    }
}
