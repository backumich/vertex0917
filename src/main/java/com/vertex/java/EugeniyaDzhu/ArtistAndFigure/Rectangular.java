package com.vertex.java.EugeniyaDzhu.ArtistAndFigure;

import com.vertex.java.EugeniyaDzhu.ArtistAndFigure.Square;

public class Rectangular implements Figure {

    static final int MAX_SIDE = 1000;

    private Square square;
    private int height;

    @Override
    public Point getCentre() {
        return square.getCentre();
    }

    @Override
    public String print() {
        return null;
    }

//    public int getWidth() {
//        return square.getSide();
//    }

    public int getHeight() {
        return height;
    }

    private Rectangular(){

    };

    public static class Bilder {
        public Rectangular instance;

        public Bilder(){
            this.instance = new Rectangular();
        }

        public Bilder withSquare(){
            Square square = new Square.Bilder()
                    .withCentre()
                    .withSide()
                    .bild();
            instance.square = square;
            return this;
        }

        public Bilder withHeight(){
            int height = (int) (Math.random() * MAX_SIDE) + 1;
            instance.height = height;
            return this;
        }

        public Rectangular bild(){
            return instance;
        }

    }

    @Override
    public String toString() {
        return "Rectangular -->" +
                "bottom left corner " + square.getCentre().toString() +
                ", side " + square.getSide() +
                ", height " + height +
                '}';
    }
}