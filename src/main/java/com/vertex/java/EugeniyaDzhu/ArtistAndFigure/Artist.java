package com.vertex.java.EugeniyaDzhu.ArtistAndFigure;

import com.vertex.java.EugeniyaDzhu.ArtistAndFigure.FigureArrey;

public class Artist implements ArtistInterfase{

    Figure[] figures = new Figure[100];

    public Artist() {
        figures = FigureArrey.getFigureArrey();
    }

    @Override
    public void printFigures(int count) {
//        for (int i = 0; i < count; i++) {
//            System.out.println(figures[i].toString());
//        }

        int i = 0;
        int printCount = 0;
        while (printCount < count){
            if (!(figures[i] == null)) {
                System.out.println(figures[i].toString());
                figures[i] = null;
                printCount++;
            };
            i++;
            if (i >= 100) {
                figures = FigureArrey.getFigureArrey();
                i = 0;
            }
        }
    }
}
