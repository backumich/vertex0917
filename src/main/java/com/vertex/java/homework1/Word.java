package com.vertex.java.homework1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* Все закомментированные строки - попытка решить через наследование
* */
public class Word/* extends com.vertex.java.homework1.Sentense*/ implements SplitCounter {
    private List<Letter> letters = new ArrayList<>();
    private Letter letter;
    private String  word;
    private SplitCounter t;

//    public com.vertex.java.homework1.Word(String t, String stringSent, String word) {
//        super(t, stringSent);
//        this.word = word;
//    }

//    public com.vertex.java.homework1.Word(String word) {
//        super(word);
//    }
    public Word(String word) {
            this.word = word;
        }

//    public com.vertex.java.homework1.Word( com.vertex.java.homework1.SplitCounter t1) {
//        this.t = t1;
//    }

    public List<Letter> getLetters() {
        return letters;
    }

    public void setLetters(List<Letter> letters) {
        this.letters = letters;
    }

    public Letter getLetter() {
        return letter;
    }

    public void setLetter(Letter letter) {
        this.letter = letter;
    }

    @Override
    public void splits() {
            Pattern p = Pattern.compile("\\w|[а-яА-Я]");
            Matcher m = p.matcher(word);

            while (m.find()){
                letters.add(new Letter(m.group()));
            }
    }

    @Override
    public int count() {
         splits();
         int count = letters.size();
        System.out.println("Amount of letters " + count);
        return count;
    }



// @Override
//    public void splits() {
//        for (com.vertex.java.homework1.Word word:
//             getWords()) {
//            Pattern p = Pattern.compile("\\w");
//            Matcher m = p.matcher(word.toString());
//
//            while (m.find()){
//                letters.add(new com.vertex.java.homework1.Letter(m.group()));
//            }
//        }
//    }
//    @Override
//    public int count() {
//         splits();
//         int count = letters.size();
//        System.out.println("Amount of letters " + count);
//        return count;
//    }
//
//    public long countWordsStartWithP(){
//        long count =
//                getWords().stream()
//                .filter(a -> a.toString().toLowerCase().startsWith("п"))
//                .count();
//        System.out.println("Number of words starting with П : " + count);
//        return count;
//    }

    @Override
    public String toString(){
        return this.word;
    }

}