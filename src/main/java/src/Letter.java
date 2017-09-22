public class Letter {

    public static int letterCount;

    private char letter;

    public Letter(char letter) {
        System.out.println("letter= "+letter);
        this.letter = letter;
        ++letterCount;
    }
    public char getLetter() {
        return letter;
    }
}