package com.vertex.java.homework1.EugeniyaDzhu.ArtistAndFigure;

import java.lang.reflect.Array;

import com.vertex.java.homework1.EugeniyaDzhu.ArtistAndFigure.Circle;
import com.vertex.java.homework1.EugeniyaDzhu.ArtistAndFigure.Square;

public class FigureArrey {

    public static final int MAX_COUNT_FIGURE = 100;
    public static final String[] FIGURE_TYPES = {"Circle", "Oval", "Square", "Rectangular"};

    public static Figure getFigure(String figureType){

        Figure toReturn;

        switch (figureType) {
            case "Circle" :
                toReturn = new Circle.Bilder()
                                .withCentre()
                                .withRadius()
                                .bild();
                break;
            case "Oval" :
                toReturn = new Oval.Bilder()
                                .withCircle()
                                .withHeight()
                                .bild();
                break;
            case "Square" :
                toReturn = new Square.Bilder()
                                .withCentre()
                                .withSide()
                                .bild();
                break;
            case "Rectangular" :
                toReturn = new Rectangular.Bilder()
                                .withSquare()
                                .withHeight()
                                .bild();
                break;
            default:
                throw new IllegalArgumentException("No such figure");
        }

        return toReturn;
    }

    public static Figure[] getFigureArrey(){

        Figure[] figureArray = new Figure[MAX_COUNT_FIGURE];
        for (int i = 0; i < MAX_COUNT_FIGURE; i++) {
            figureArray[i] = getFigure(FIGURE_TYPES[(int) Math.random() * 4] );
        }

        return figureArray;
    }
}
