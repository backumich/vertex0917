public class Punctuation extends Temp {

    public static int punctuationCount;
    private char punctuation;

    public Punctuation(char punctuation) {
        System.out.println("punctuation= "+punctuation);
        this.punctuation = punctuation;
        ++punctuationCount;
    }

    public char getPunctuation() {
        return punctuation;
    }
}