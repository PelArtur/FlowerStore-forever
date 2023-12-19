package com.example.week8.flowers;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), WHITE("#FFFFFF"), YELLOW("#FFFF00");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }

    @JsonValue
    public String hi(){
        return toString();
    }
}
