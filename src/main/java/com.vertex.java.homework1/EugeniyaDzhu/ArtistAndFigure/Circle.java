package com.vertex.java.homework1.EugeniyaDzhu.ArtistAndFigure;

public class Circle implements Figure {

    static final int MAX_RADIUS = 1000;

    private Point centre;
    private int radius;

    @Override
    public Point getCentre() {
        return centre;
    }

    @Override
    public String print() {
        return null;
    }

    public int getRadius() {
        return radius;
    }

    private Circle(){

    };

    public static class CircleBilder {
        public Circle instance;

        public CircleBilder(){
            this.instance = new Circle();
        }

        public CircleBilder withCentre(){
            Point point = new Point();
            instance.centre = point;
            return this;
        }

        public CircleBilder withRadius(){
            int radius = (int) Math.random() * MAX_RADIUS + 1;
            return this;
        }

        public Circle bild(){
            return instance;
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }

//    public static void main(String[] args) {
//        Circle circle = new CircleBilder().bild();
//
//    }
}
