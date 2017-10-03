package com.vertex.java.patterns.decorator;

import org.w3c.dom.css.RGBColor;

public class Dog implements Animal {

    private static final int NORMAL_LEGS_AMOUNT = 4;

    private int weight;
    private RGBColor color;


    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getLegs() {
        return NORMAL_LEGS_AMOUNT;
    }

    @Override
    public RGBColor getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(RGBColor color) {
        this.color = color;
    }
}
