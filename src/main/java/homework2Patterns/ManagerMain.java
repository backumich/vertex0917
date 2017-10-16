package homework2Patterns;

public class ManagerMain {

    public static void main(String[] args) {
        ProxyInterf artist = new ProxyArtist(250);
        artist.drawFigure();

    }
}
