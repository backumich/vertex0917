package com.vertex.java.homework1.pyanykhHomeWork;

import java.util.ArrayList;
import java.util.Scanner;

 class Teacher {
    private ArrayList<Marker> list = new ArrayList();

     void takeMarker(Marker marker) {
        if (marker.getTeacher() == null) {
            list.add(marker);
            marker.setTeacher(this);
        } else System.out.println("Этот маркер у другого преподавателя");
    }

    void write() {
        System.out.print("Введите текст:");
        Scanner scan = new Scanner(System.in);
        write(scan.next());
    }

    private void write(String s) {
        if (!list.isEmpty()) {
            for (int n = 0; n < s.length(); n++) {
                for (Marker aList : list) {
                    if (aList.getVolume() != 0 && n < s.length()) {
                        System.out.print("<" + aList.getColor() + ">");
                        while (aList.getVolume() != 0 && n < s.length()) {
                            System.out.print(s.charAt(n));
                            n++;
                            aList.setVolume(aList.getVolume() - 1);
                        }
                        System.out.print("</" + aList.getColor() + ">");
                    }
                }
            }
        } else System.out.println("Нечем писать");
    }
}
