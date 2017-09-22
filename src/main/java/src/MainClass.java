public class MainClass {
    public static void main(String[] args) {


        Text testText=new Text("Нравится ли тебе Java? очень нравится? Тогда посвящай Java, как можно больше " +
                "времени, и днем, и ночью, и во сне)");
        
        System.out.println("Letter.letterCount= "+Letter.letterCount);
        System.out.println("Word.wordCount= "+Word.wordCount);
        System.out.println("Punctuation.punctuationCount= "+Punctuation.punctuationCount);
        System.out.println("Sentence.sentenceCount= "+Sentence.sentenceCount);

        System.out.println("End Sentence= "+testText.findEndSentence('?'));
        System.out.println("Start word= "+testText.findStartWord('п'));
    }
}
