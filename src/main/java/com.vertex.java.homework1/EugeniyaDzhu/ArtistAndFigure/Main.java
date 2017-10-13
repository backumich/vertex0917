package com.vertex.java.homework1.EugeniyaDzhu.ArtistAndFigure;

public class Main {
    public static void main(String args[]) {

        Artist artist = new Artist();
        System.out.println("");

        Circle circle = new Circle.Bilder().withCentre().withRadius().bild();
        System.out.println(circle.toString());

        for (int i = 0; i < 100; i++) {
            System.out.println(artist.figures[i].toString());
        }
        System.out.println("cdgc");
    }

}
