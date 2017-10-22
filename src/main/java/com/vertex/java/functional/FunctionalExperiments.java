package com.vertex.java.functional;

public class FunctionalExperiments {

    public static void main(String[] args) {
        Test test = () -> System.out.println("I am TEST!!!!");

        test.test();

        Test test2 = new TestImpl();
        test2.test();
    }
}
