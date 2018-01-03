package com.vertex.java.homework1;

import java.util.ArrayList;

public class Word extends Temp{
    // TODO: 03.01.2018 static? are there should be the same lenghs among all words?
    // Or in case it is a count of all words that were created,
    // from OOP point of view it should not belong to word
    public static int wordCount;
    // TODO: 03.01.2018 same here
    private ArrayList<Letter> wordList;

    public Word(String word) {
        System.out.println("word= "+word);
        wordList=new ArrayList<>();
        for (int i = 0; i <word.length() ; i++) {
            wordList.add(new Letter(word.charAt(i)));
        }
        ++wordCount;
    }
    public ArrayList<Letter> getWordList() {
        return wordList;
    }
}