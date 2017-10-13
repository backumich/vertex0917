package com.vertex.java.homework1.EugeniyaDzhu.ArtistAndFigure;

public class Oval implements Figure {

    static final int MAX_RADIUS = 1000;

    private Circle circle;
    private int height;

    @Override
    public Point getCentre() {
        return circle.getCentre();
    }

    @Override
    public String print() {
        return null;
    }

    public int getHeight() {
        return height;
    }

    private Oval(){

    };

    public static class Bilder {
        public Oval instance;

        public Bilder(){
            this.instance = new Oval();
        }

        public Bilder withCircle(){
            Circle circle = new Circle.Bilder()
                                .withCentre()
                                .withRadius()
                                .bild();
            instance.circle = circle;
            return this;
        }

        public Bilder withHeight(){
            int height = (int) (Math.random() * MAX_RADIUS) + 1;
            instance.height = height;
            return this;
        }

        public Oval bild(){
            return instance;
        }

    }

    @Override
    public String toString() {
        return "Oval -->" +
                "centre " + this.circle.getCentre().toString() +
                ", radius " + this.circle.getRadius() +
                ", height " + height ;

    }

}
