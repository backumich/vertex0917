package com.vertex.java.homework1.EugeniyaDzhu.ArtistAndFigure;

public class Main {
    public static void main(String args[]) {

        Artist artist = new Artist();
        System.out.println("");

        for (int i = 0; i < 100; i++) {
            System.out.println(artist.figures[i].toString());
        }

    }

}
