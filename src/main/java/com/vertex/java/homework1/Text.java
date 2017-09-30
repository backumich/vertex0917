package com.vertex.java.homework1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Программа считывает текст со строки (в закомментированом коде - с консоли), считает количество предложений,
 * количество вопросительных предложений, количество пунктуации, слов, слов на букву "п" и букв.
* Класс текст принимает метод main.
 * В идеале, хотелось бы решить через наследование и передавать лист в следующий класс.
* */

public class  Text  implements SplitCounter{
        private String text;
        private /*static*/ List <Sentense> listSentenses = new ArrayList<>();
        Sentense sentense;

    public Text(String t) {
        this.text = t;
    }

    public Text(){
    }

    public List <Sentense> getListSentenses() {
        Pattern p = Pattern.compile("[^?!.]+[?!.]|[^?!.]+[\\p{ASCII}]*");
        Matcher m = p.matcher(text);

        while (m.find()){
            listSentenses.add(new Sentense(m.group()));
        }
        return listSentenses;
    }

    @Override
    public int count() {
        splits();
        int count = listSentenses.size();
        System.out.println("Amount of sentenses " + count);
        return count;
    }

    @Override
    public void splits() {
        Pattern p = Pattern.compile("[^?!.]+[?!.]|[^?!.]+[\\p{ASCII}]*");
        Matcher m = p.matcher(text);

        while (m.find()){
            listSentenses.add(new Sentense(m.group()));
        }
    }

    public long countQuestionMark(){
        long count=
                listSentenses.stream()
                 .filter(a -> a.toString().endsWith("?"))
                .count();
        System.out.println("sentences with Question mark " + count);
        return count;
    }

    public static void main(String[] args) throws IOException {
//       try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//           String line = reader.readLine();
        String line = "Нравится ли тебе Java? Очень нравится? Тогда посвящай Java, как можно больше\n" +
                "времени, и днем, и ночью, и во сне";
        Text text = new Text(line);
        text.count();
        text.countQuestionMark();

//        com.vertex.java.homework1.Sentense sentense = new com.vertex.java.homework1.Sentense(text.getListSentenses());
        Sentense sentense = new Sentense(line);
        sentense.count();
        sentense.countWordsStartWithP();

        Word word = new Word(line);
        word.count();
//       }

    }
}
