package com.vertex.java.patterns.decorator;

import org.w3c.dom.css.RGBColor;

public class LongHairDog implements Animal{

    private Dog dog;
    private double hairLength;

    public LongHairDog(Dog dog){
        this.dog=dog;
    }

    @Override
    public int getWeight() {
        return dog.getWeight();
    }

    @Override
    public int getLegs() {
        return dog.getLegs();
    }

    @Override
    public RGBColor getColor() {
        return dog.getColor();
    }


    public double getHairLength() {
        return hairLength;
    }

    public void setWeight(int weight){
        dog.setWeight(weight);
    }

    public void setHairLength(double hairLength) {
        if(hairLength <= 2){
            throw new IllegalArgumentException("LongHairDog can't have such short hair length");
        }
        this.hairLength = hairLength;
    }
}
