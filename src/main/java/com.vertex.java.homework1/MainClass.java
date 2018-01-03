package com.vertex.java.homework1;

public class MainClass {
    public static void main(String[] args) {


        Text testText=new Text("Нравится ли тебе Java? очень нравится? Тогда посвящай Java, как можно больше " +
                "времени, и днем, и ночью, и во сне)");
        
        System.out.println("com.vertex.java.homework1.Letter.letterCount= "+Letter.letterCount);
        System.out.println("com.vertex.java.homework1.Word.wordCount= "+Word.wordCount);
        System.out.println("com.vertex.java.homework1.Punctuation.punctuationCount= "+Punctuation.punctuationCount);
        System.out.println("com.vertex.java.homework1.Sentence.sentenceCount= "+Sentence.sentenceCount);

        System.out.println("End com.vertex.java.homework1.Sentence= "+testText.findEndSentence('?'));
        System.out.println("Start word= "+testText.findStartWord('п'));
    }
}
