import java.util.ArrayList;
import java.util.StringTokenizer;

import static java.lang.Character.isLetter;

public class Sentence {

    public static int sentenceCount;
    private ArrayList<Temp>sentenceList;

    public Sentence(String sentence) {
        System.out.println("sentence= "+sentence);
        sentenceList=new ArrayList<>();

        String tempString=new String();
        char tempChar;

        StringTokenizer st = new StringTokenizer(sentence, " ,?)",true);
        while(st.hasMoreTokens()) {
            tempString=st.nextToken();
            tempChar=tempString.charAt(0);

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
