

import java.io.FileReader;
import java.util.Scanner;

class Teacher {

    public static void writeTextToConsole() throws Exception{

        FileReader fr= new FileReader("vertex0917/src/main/java/com.vertex.java.homework1/EugeniyaDzhu/TeacherWithMarkers/Text.txt");
        Scanner scan = new Scanner(fr);

        String phrase = "";
        int phraseLeft = 0;
        Marker marker = new Marker();

        int i = 1;
        while (scan.hasNextLine()) {

            phrase = scan.nextLine();

            while (phrase.length() > 0) {
                if (phraseLeft >= 0) {
                    marker.setColorAndCapacity();
                }
                phraseLeft = marker.printText(phrase);
                if (phraseLeft > 0) {
                    phrase = phrase.substring(phrase.length() - phraseLeft, phrase.length());
                } else {
                    phrase = "";
                }
            }
            System.out.println();
            i++;
        }

        fr.close();

     }

 }

 class Marker {
    public static final String[] COLORSET = {"red", "orange", "yellow", "green", "blue", "purple", "black"};
    public static final int MARKERCAPACITY = 10;

    private String color;
    private int capacity;

    void setColorAndCapacity(){
       color = COLORSET[(int) ( Math.random() * 7 )];
       capacity = (int) ( Math.random() * MARKERCAPACITY + 1 );
    }

    int printText (String phrase) {

        System.out.print("<" + color + ">" + phrase.substring(0, Math.min(phrase.length(), capacity)) +"</" + color + ">");
        //System.out.print(phrase.substring(0, Math.min(phrase.length(), capacity)));
        return phrase.length() - capacity;
    }

 }
