package com.vertex.java.homework1.EugeniyaDzhu.ArtistAndFigure;

import com.vertex.java.homework1.EugeniyaDzhu.ArtistAndFigure.Square;

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
            int radius = (int) Math.random() * MAX_SIDE + 1;
            return this;
        }

        public Rectangular bild(){
            return instance;
        }

    }
}