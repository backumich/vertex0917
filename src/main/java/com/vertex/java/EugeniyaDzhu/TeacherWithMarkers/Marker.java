package com.vertex.java.EugeniyaDzhu.TeacherWithMarkers;

public class Marker {
    public static final String[] COLOR_SET = {"red", "orange", "yellow", "green", "blue", "purple", "black"};
    public static final int MARKER_ROOMINESS = 10;

    private String color;
    private int roominess;

    void setColorAndRoominess(){
        color = COLOR_SET[(int) ( Math.random() * 7 )];
        roominess = (int) ( Math.random() * MARKER_ROOMINESS + 1 );
    }

    int printText (String phrase) {

        System.out.print("<" + color + ">" + phrase.substring(0, Math.min(phrase.length(), roominess)) +"</" + color + ">");
        //System.out.print(phrase.substring(0, Math.min(phrase.length(), capacity)));
        return phrase.length() - roominess;
    }

}
