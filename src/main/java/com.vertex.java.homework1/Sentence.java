package com.vertex.java.homework1;

import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.Character.isLetter;

public class Sentence {

    public static int sentenceCount;
    private ArrayList<Temp>sentenceList;

    public Sentence(String sentence) {
        System.out.println("sentence= "+sentence);
        // TODO: 03.01.2018 same here (bad name)
        sentenceList=new ArrayList<>();

        // TODO: 03.01.2018 same here (no initialization is needed)
        String tempString=new String();
        char tempChar;

        //todo: why don't you use '.' and '('?
        StringTokenizer st = new StringTokenizer(sentence, " ,?)",true);
        while(st.hasMoreTokens()) {
            tempString=st.nextToken();
            tempChar=tempString.charAt(0);

            // TODO: 03.01.2018 wery bad to keep two different types of classes in one list
            if(isLetter(tempChar)){
                sentenceList.add(new Word(tempString));
            }else if(tempChar!=' '){
                sentenceList.add(new Punctuation(tempChar));
            }
        }
        ++sentenceCount;
    }

    public ArrayList<Temp> getSentenceList() {
        return sentenceList;
    }
}
