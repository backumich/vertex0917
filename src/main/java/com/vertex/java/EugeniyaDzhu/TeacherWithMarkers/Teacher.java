package com.vertex.java.EugeniyaDzhu.TeacherWithMarkers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Teacher {

    public static void writeTextToConsole() throws Exception{

        FileReader fr = null;

        try {
            fr = new FileReader("src/main/java/com/vertex/java/EugeniyaDzhu/TeacherWithMarkers/Text.txt");

            Scanner scan = new Scanner(fr);

            String phrase = "";
            int phraseLeft = 0;
            Marker marker = new Marker();

            while (scan.hasNextLine()) {

                phrase = scan.nextLine();

                while (phrase.length() > 0) {
                    if (phraseLeft >= 0) {
                        marker.setColorAndRoominess();
                    }
                    phraseLeft = marker.printText(phrase);
                    if (phraseLeft > 0) {
                        phrase = phrase.substring(phrase.length() - phraseLeft, phrase.length());
                    } else {
                        phrase = "";
                    }
                }
                System.out.println();

            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
        }
        catch (IOException ex) {
            System.out.println(ex.toString());
        }
        finally {
            if (fr != null) {
                try {
                    fr.close();
                }
                catch (IOException ex) {
                    System.out.println(ex.toString());
                }
            }
        }

    }

}