import java.util.ArrayList;

public class Word extends Temp{
    public static int wordCount;
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