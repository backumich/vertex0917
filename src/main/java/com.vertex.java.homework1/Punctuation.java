package com.vertex.java.homework1;

public class Punctuation extends Temp {

    // TODO: 03.01.2018 same as word here
    public static int punctuationCount;
    private char punctuation;

    public Punctuation(char punctuation) {
        System.out.println("punctuation= "+punctuation);
        this.punctuation = punctuation;
        ++punctuationCount;
    }

    public char getPunctuation() {
        return punctuation;
    }
}