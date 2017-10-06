package com.vertex.java.homework1.EugeniyaDzhu.ArtistAndFigure;

public class Square implements Figure {

    static final int MAX_SIDE = 1000;

    private Point centre;
    private int side;

    public Point getCentre() {
        return centre;
    }

    @Override
    public String print() {
        return null;
    }

    public int getSide() {
        return side;
    }

    private Square(){

    };

    public static class SquareBilder {
        public Square instance;

        public SquareBilder(){
            this.instance = new Square();
        }

        public SquareBilder withCentre(){
            Point point = new Point();
            instance.centre = point;
            return this;
        }

        public SquareBilder withSide(){
            int side = (int) Math.random() * MAX_SIDE + 1;
            return this;
        }

        public Square bild(){
            return instance;
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
