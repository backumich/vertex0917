package com.vertex.java.enums;

import java.util.Arrays;
import java.util.EnumSet;

public enum EnumExample {
    FIRST_ELEMENT {
        @Override
        void specificMethod() {
            System.out.println("in specific method for first element");
        }
    }, THIRD_ELEMENT {
        @Override
        void specificMethod() {
            System.out.println("in specific method for second element");
        }
    }, SECOND_ELEMENT {
        @Override
        void specificMethod() {
            System.out.println("in specific method for third element");
        }
    };

    void commonMethod(){
        System.out.println("Common method, every enum instance has it");
    }

    abstract void specificMethod();

    public static void main(String[] args) {
        Arrays.stream(EnumExample.values())
                .forEach(EnumExample::commonMethod);


        Arrays.stream(EnumExample.values())
                .forEach(EnumExample::specificMethod);

//        System.out.println(EnumSet.range(SECOND_ELEMENT, THIRD_ELEMENT));
    }
}
