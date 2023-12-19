package com.example.week8.flowers;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Flower extends Item{
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;
    @Getter
    private String description;

    public Flower(){
        sepalLength = FlowerType.TULIP.getSepalLength();
        color = FlowerType.TULIP.getColor();
        price = FlowerType.TULIP.getPrice();
        flowerType = FlowerType.TULIP;
        description = "Tulip\n-----------\nSepalLength: "
                + sepalLength + " cm\nColor: " + color + "\nPrice: " + price + "\n-----------";
    }

    public Flower(FlowerType flowerType){
        this.sepalLength = flowerType.getSepalLength();
        this.color = flowerType.getColor();
        this.price = flowerType.getPrice();
        this.flowerType = flowerType;
        this.description = flowerType.getDescription() + "\n-----------\nSepalLength: "
                + sepalLength + " cm\nColor: " + color + "\nPrice: " + price + "\n-----------";
    }
    public Flower(Flower flower){
        this.price = flower.price;
        this.color = flower.color;
        this.sepalLength = flower.sepalLength;
        this.flowerType = flower.flowerType;
        this.description = flower.description + "\n-----------\nSepalLength: "
                + sepalLength + " cm\nColor: " + color + "\nPrice: " + price + "\n-----------";
    }

    public Flower(int price, FlowerColor color, int sepalLength, FlowerType flowerType, String description){
        this.price = price;
        this.color = color;
        this.sepalLength = sepalLength;
        this.flowerType = flowerType;
        if(description.length() > 10){
            this.description = description + "\n-----------\nSepalLength: "
                    + sepalLength + " cm\nColor: " + color + "\nPrice: " + price + "\n-----------";;
        }
        else{
            this.description = description;
        }
    }

    public String getColor() {
        return color.toString();
    }
}
