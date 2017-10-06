package com.vertex.java.homework1.EugeniyaDzhu.ArtistAndFigure;

import com.vertex.java.homework1.EugeniyaDzhu.ArtistAndFigure.Circle;

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

//    public int getWidth() {
//        return circle.getRadius();
//    }

    public int getHeight() {
        return height;
    }

    private Oval(){

    };

    public static class OvalBilder {
        public Oval instance;

        public OvalBilder(){
            this.instance = new Oval();
        }

        public OvalBilder withCircle(){
            Circle circle = new Circle.CircleBilder()
                                .withCentre()
                                .withRadius()
                                .bild();
            instance.circle = circle;
            return this;
        }

        public OvalBilder withHeight(){
            int radius = (int) Math.random() * MAX_RADIUS + 1;
            return this;
        }

        public Oval bild(){
            return instance;
        }

    }
}
