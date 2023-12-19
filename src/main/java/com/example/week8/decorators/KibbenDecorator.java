package com.example.week8.decorators;

import com.example.week8.flowers.Item;

public class KibbenDecorator extends ItemDecorator{
    public double getPrice(Item item){
        return 40 + item.getPrice();
    }

    @Override
    public String getDescription() {
        return "This is kibben decorator for flowers";
    }
}
