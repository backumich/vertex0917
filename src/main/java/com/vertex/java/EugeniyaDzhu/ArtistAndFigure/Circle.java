package com.vertex.java.EugeniyaDzhu.ArtistAndFigure;

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

    Circle(){

    };

    public static class Bilder {
        public Circle instance;

        public Bilder(){
            this.instance = new Circle();
        }

        public Bilder withCentre(){
            Point point = new Point();
            instance.centre = point;
            return this;
        }

        public Bilder withRadius(){
            int radius = (int) ((Math.random() * MAX_RADIUS))+ 1;
            instance.radius = radius;
            return this;
        }

        public Circle bild(){
            return instance;
        }

    }

    @Override
    public String toString() {
        return "Circle --> centre " + centre.toString() + ", radius " + radius ;
    }

//    public static void main(String[] args) {
//        Circle circle = new Bilder().bild();
//
//    }
}
