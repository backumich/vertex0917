package homework2Patterns;

public class ProxyArtist implements ProxyInterf{
    private Artist artist;
    private int countPaint;

    public ProxyArtist(int countPaint) {
        this.countPaint = countPaint;
    }

    public Artist makeArt(){
        if(artist == null)
            artist = new Artist(countPaint);

        return artist;
    }

    @Override
    public void drawFigure() {
        makeArt();
    }
}
