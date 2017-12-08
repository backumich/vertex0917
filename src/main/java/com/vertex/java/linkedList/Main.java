package com.vertex.java.linkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyLinkList list = new MyLinkList();
        list.add(23);
        list.add(false);
        list.add("gfgsfh");
        list.add(12.2);

        for (Object l: list){
            System.out.println(((Element) l).getValue());
        }

    }
}

