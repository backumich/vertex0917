package com.vertex.java.homework1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Text {

    // TODO: 03.01.2018 not so good to use class name in variable name.
    // Because when you change variable type you can forget to change the name,
    // moreover, common IDE can easily show you the type of the variable, no need in 'List' in the name
    // moreover, it seems that this list is the list of sentences, not texts
    private ArrayList<Sentence> textList;

    public Text(String text) {
        System.out.println("text= "+text);
        textList = new ArrayList<>();
        // TODO: 03.01.2018 please get rid of warnings. Here initialization of String is redundant
        String tempString=new String();
        StringTokenizer st = new StringTokenizer(text, "?.!",true);
        while(st.hasMoreTokens()){
            tempString=st.nextToken();
            if(st.hasMoreTokens()) {
                tempString += st.nextToken();
            }
            // TODO: 03.01.2018 can be inlined or trim can be included into Sentence constructor
            tempString=tempString.trim();
            textList.add(new Sentence(tempString));
        }

    }

    public int findEndSentence(char symbol){
        int count;
        count=0;
        // TODO: 03.01.2018 previous two lines can be combined into one. Next line can be replaced with foreach or even with stream.
        for (int i=0; i<textList.size(); i++) {
            // TODO: 03.01.2018 textList.get(i).getSentenceList().get(textList.get(i).getSentenceList().size()-1 unreadable, so can you please use more variables
            if(textList.get(i).getSentenceList().get(textList.get(i).getSentenceList().size()-1) instanceof Punctuation){
                if(((Punctuation) textList.get(i).
                        getSentenceList().get(textList.get(i).getSentenceList().size()-1)).getPunctuation()==symbol){
                    count++;
                }
            }
        }
        return count;
    }

    public int findStartWord (char symbol){
        int count;
        count=0;

        Sentence tempSentense;
        Word tempWord;

        // TODO: 03.01.2018 same here
        for (int i=0; i<textList.size(); i++) {
            tempSentense=textList.get(i);
            for (int j=0; j<tempSentense.getSentenceList().size(); j++) {
                if(tempSentense.getSentenceList().get(j)instanceof Word){
                    // TODO: 03.01.2018 casting is potential ClassCastException
                    tempWord= (Word)tempSentense.getSentenceList().get(j);
                    if(tempWord.getWordList().get(0).getLetter()==symbol ){
                        ++count;
                    }
                }
            }
        }
        return count;
    }
}
