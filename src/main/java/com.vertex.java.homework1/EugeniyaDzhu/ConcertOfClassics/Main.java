package com.vertex.java.homework1.EugeniyaDzhu.ConcertOfClassics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fr= new FileReader("src/main/java/com.vertex.java.homework1/EugeniyaDzhu/ConcertOfClassics/LadiesAndGentlemen.txt");
        Scanner scan = new Scanner(fr);

        List<Listener> listenerList = new ArrayList();

        while (scan.hasNextLine()) {

            String string = scan.nextLine();
            String sex;
            if (string.indexOf("GENTLEMAN") > -1) {
                sex = "GENTLEMAN";
                string = string.substring(10);
            } else {
                sex = "LADY";
                string = string.substring(5);
            };

            System.out.println(sex + " " + Integer.parseInt(string));
            Listener listener = new Listener(Sex.valueOf(sex) , Integer.parseInt(string));
            listenerList.add(listener);
            listenerList = listenerList.stream()
                    .sorted(Listener::compareTo)
                    .collect(Collectors.toList());

            listenerList.stream()
                    .forEachOrdered(System.out::println);

        }


        fr.close();
    }
}
