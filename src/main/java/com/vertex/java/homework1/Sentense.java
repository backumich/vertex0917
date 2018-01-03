package com.vertex.java.homework1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Все закомментированные строки - попытка решить через наследование
 * */
public class Sentense/* extends com.vertex.java.homework1.Text*/  implements SplitCounter {
    private List<Word> words = new ArrayList<>();
    private List<Punct> puncts = new ArrayList<>();
    private String stringSent;
    private Text textSent;
    private List<Sentense> listS;

    // TODO: 03.01.2018 seems to be unused. It's not ok to have code in store
    public Sentense(Text t) {
        this.textSent = t;
    }

    public Sentense(String t) {
        this.stringSent = t;
    }

    // TODO: 04.01.2018 same here
    Sentense(List<Sentense> listS){
        this.listS = listS;
    }

//        public com.vertex.java.homework1.Sentense(String t, String stringSent) {
//        super(t);
//        this.stringSent = stringSent;
//    }
// TODO: 04.01.2018 the same here =)
    public Sentense() {
    }

    public List<Sentense> getList() {
        return textSent.getListSentenses();
    }

    public List<Word> getWords() {
        return words;
    }

    public List<Punct> getPuncts() {
        return puncts;
    }


    // TODO: 04.01.2018 is it some magic method that do splitting and must be called before any action can be done?
    // if so, then it must be called in constructor.
    @Override
    public void splits() {
        int countPunct = 0;
//        Данный код, если бы мы принимали список с класса Текст... :'(((
//        for (com.vertex.java.homework1.Sentense sentenseList :
//                textSent.getListSentenses()) {
//            Pattern p = Pattern.compile("\\w++");
//            Matcher matcherWord = p.matcher(sentenseList.toString());
//            while (matcherWord.find()) {
//                words.add(new com.vertex.java.homework1.Word(matcherWord.group()));
//            }
//
//            Pattern p2 = Pattern.compile("[\\\\p{com.vertex.java.homework1.Punct}]");
//            Matcher matcherPunct = p2.matcher(sentenseList.toString());
//            while (matcherPunct.find()) {
//                puncts.add(new com.vertex.java.homework1.Punct(matcherPunct.group()));
//                countPunct++;
//            }
//        }
        Pattern p = Pattern.compile("[a-zA-Zа-яА-Я]++");
        Matcher matcherWord = p.matcher(stringSent);
        while (matcherWord.find()) {
                words.add(new Word(matcherWord.group()));
            }


        Pattern p2 = Pattern.compile("[\\p{Punct}]");
        Matcher matcherPunct = p2.matcher(stringSent);
        while (matcherPunct.find()) {
            puncts.add(new Punct(matcherPunct.group()));
            countPunct++;
        }
        System.out.println("Amount of punctuation " + countPunct);

    }

    // TODO: 04.01.2018 if you print return result and avoid printing in method, then it would be more cool
    public long countWordsStartWithP(){
        long count =
                words.stream()
                        // TODO: 04.01.2018 not so good to use toString because everyone can change it (it is common habbit)
                        // and this method would brake. So it would be better to write 'special' method to get this string
                        .filter(a -> a.toString().toLowerCase().startsWith("п"))
                        .count();
        System.out.println("Number of words starting with П : " + count);
        return count;
    }

    @Override
    public int count() {
        splits();
        int count = getWords().size();
        System.out.println("Amount of words " + count);
        return count;
    }

    @Override
    public String toString() {
        return this.stringSent;
    }

}
