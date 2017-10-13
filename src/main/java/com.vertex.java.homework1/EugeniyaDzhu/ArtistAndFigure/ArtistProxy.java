package com.vertex.java.homework1.EugeniyaDzhu.ArtistAndFigure;

public class ArtistProxy implements ArtistInterfase{

    private Artist artist;

    @Override
    public void printFigures(int count) {
        if (artist == null) {
            artist = new Artist();
        }
        artist.printFigures(count);
    }
}
