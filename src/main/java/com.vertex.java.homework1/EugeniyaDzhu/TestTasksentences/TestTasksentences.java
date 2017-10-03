package com.vertex.java.homework1.EugeniyaDzhu.TestTasksentences;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class TestTasksentences  {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String phrase1 = sc.nextLine();
        String phrase2 = "";

        try {
            byte[] utf8Bytes = phrase1.getBytes("UTF8");
            String phrase3 = new String(utf8Bytes,"UTF8");
            phrase2 = phrase3;
            //System.out.println(phrase2);
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        Text textForAnalysis = new Text(phrase2);

        System.out.println("Количество предложений " + textForAnalysis.getQty());
        System.out.println("Количество слов " + textForAnalysis.getTextWordQty());
        System.out.println("Количество символов " + textForAnalysis.getTextLettersQty());
        System.out.println("Количество вопросительных предложений " + Punctuation.getQuestionMarkQty());
        System.out.println("Количество слов на букву 'П' " + Word.getpWord());

    }
}

class Letter {

    public static int qty;
    public char value;

    public Letter(char c) {
        value = c;
    }

}

class Punctuation {

    static int qty;
    static int questionMarkQty;
    char value;

    public Punctuation(char c) {
        value = c;
        if (c=='?') {
            questionMarkQty += 1;
        }
    }

    public static boolean isPunctuationMark(char a){
        if (a=='.'| a==','| a==';'| a==':'| a==')'| a=='('| a=='['| a==']'| a=='{'| a=='}'| a=='!' | a=='?'| a==' ') {
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isEndOfsentenceMark(char a){
        if (a=='.'| a=='!' | a=='?') {
            return true;
        }
        else{
            return false;
        }
    }

    public static int getQuestionMarkQty(){

        return questionMarkQty;

    }

}
class Punctuations {

    //int qty;
    Punctuation[] value = new Punctuation[100];
    int length;

    public Punctuations (String s) {

        for (int i = 0; i < s.length(); i++) {
            Punctuation l = new Punctuation(s.charAt(i));
            value[i] = l;
        }
        length = s.length();
    }

    public int getLength() {
        return length;
    }

}

class Word {

    //int qty;
    Letter[] value = new Letter[100];
    int length;
    static int pWord =0;

    public Word (String s) {

        for (int i = 0; i < s.length(); i++) {
            Letter l = new Letter(s.charAt(i));
            value[i] = l;
        }
        length = s.length();

        if ((!(s == "")) && ((s.charAt(0) == 'П') | (s.charAt(0) == 'п'))) {
            pWord += 1;
        }
    }

    public int getLength() {
        return length;
    }

    public static int getpWord() {
        return pWord;
    }

}

class Sentence {

    public int wordQty;
    int punctuationQty;
    Word[] value = new Word[100];
    Punctuations[] punctuationMark = new Punctuations[100];

    public Sentence(String s) {

        String stringForMakingWord = "";
        String stringForMakingPunctuations = "";

        if ((Punctuation.isPunctuationMark(s.charAt(0)))){
            stringForMakingPunctuations += s.charAt(0);
        }
        else if (!(Punctuation.isPunctuationMark(s.charAt(0)))){
            stringForMakingWord += s.charAt(0);
        };

        for (int i = 1; i < s.length(); i++) {
            //s1 += s.charAt(i);

            if ((Punctuation.isPunctuationMark(s.charAt(i))) & !(stringForMakingPunctuations=="")){
                stringForMakingPunctuations += s.charAt(i);
            }
            else if (!(Punctuation.isPunctuationMark(s.charAt(i))) & !(stringForMakingWord=="")){
                stringForMakingWord += s.charAt(i);
            }
            else if ((Punctuation.isPunctuationMark(s.charAt(i))) & stringForMakingPunctuations==""){
                Word w = new Word(stringForMakingWord);
                value[wordQty] = w;
                if (!(stringForMakingWord == "")){
                    wordQty += 1;
                }
                stringForMakingWord = "";
                stringForMakingPunctuations += s.charAt(i);
            }
            else if ((!(Punctuation.isPunctuationMark(s.charAt(i)))) & stringForMakingWord==""){
                Punctuations p = new Punctuations(stringForMakingPunctuations);
                punctuationMark[wordQty] = p;
                stringForMakingPunctuations="";
                stringForMakingWord += s.charAt(i);
            }

        }


        Word w = new Word(stringForMakingWord);
        value[wordQty] = w;
        if (!(stringForMakingWord=="")) {
            wordQty +=1;
        }

        Punctuations p = new Punctuations(stringForMakingPunctuations);
        punctuationMark[wordQty] = p;

    }

    public int getWordQty() {
        return wordQty;
    }

}

class Text {

    Sentence[] value = new Sentence[10];
    int sentenceQty = 0;

    public Text(String s) {
        String stringForMakingSentence = "";

        for (int i = 0; i < s.length(); i++) {
            stringForMakingSentence += s.charAt(i);
            if (Punctuation.isEndOfsentenceMark(s.charAt(i))){
                Sentence sen = new Sentence(stringForMakingSentence);
                value[sentenceQty] = sen;
                sentenceQty += 1;
                stringForMakingSentence = "";
            }
        }
        if (!(Punctuation.isEndOfsentenceMark(s.charAt(s.length()-1)))) {
            Sentence sen = new Sentence(stringForMakingSentence);
            value[sentenceQty] = sen;
            sentenceQty += 1;

        }
    }

    public int getQty() {
        return sentenceQty;
    }

    public int getTextWordQty() {

        int wordQty = 0;
        for (int i = 0; i < sentenceQty; i++) {
            wordQty += value[i].getWordQty();
        }
        return wordQty;
    }

    public int getTextLettersQty() {

        int lettersQty = 0;
        Sentence sentenceFromText;
        int n;
        int h;
        for (int i = 0; i < sentenceQty; i++) {
            sentenceFromText = value[i];
            n = value[i].getWordQty();
            for (int j = 0; j < n; j++) {
                h = sentenceFromText.value[j].getLength();
                lettersQty += sentenceFromText.value[j].getLength();

            }
        }
        return lettersQty;
    }

}





