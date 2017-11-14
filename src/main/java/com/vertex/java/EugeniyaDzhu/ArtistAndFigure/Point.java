package com.vertex.java.EugeniyaDzhu.ArtistAndFigure;

public final class Point {

    static final int MAX_X = 1189;
    static final int MAX_Y = 841;

    private int xCoordinate;
    private int yCoordinate;

//    public int getxCoordinate() {
//        return xCoordinate;
//    }
//
//    public void setxCoordinate(int xCoordinate) {
//        this.xCoordinate = xCoordinate;
//    }
//
//    public int getyCoordinate() {
//        return yCoordinate;
//    }
//
//    public void setyCoordinate(int yCoordinate) {
//        this.yCoordinate = yCoordinate;
//    }

    Point(){
        xCoordinate = (int) (Math.random() * MAX_X);
        yCoordinate = (int) (Math.random() * MAX_Y);
    }

    @Override
    public String toString() {
        return "(" + xCoordinate + ", " + yCoordinate + ")";
    }
}
