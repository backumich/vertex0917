package com.vertex.java.homework1;

public class Letter {

    // TODO: 03.01.2018 same here 
    public static int letterCount;

    private char letter;

    public Letter(char letter) {
        System.out.println("letter= "+letter);
        this.letter = letter;
        ++letterCount;
    }
    public char getLetter() {
        return letter;
    }
}