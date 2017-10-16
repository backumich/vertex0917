package homework2Patterns;


import java.util.Random;

public class Artist implements ProxyInterf{
    private Figure[] array = new Figure[10];
    private Random random = new Random();
    private int count;
    private String [] figures = {"square", "cicle",  "oval", "rectangular"};


    public Artist(int count){
        this.count = count;
        drawFigure();
    }



    @Override
    public void drawFigure(){
        int arraysCount =(int) Math.ceil((float)count/(float)array.length);
        array = new Figure[array.length*arraysCount];
                for (int j = 0; j <array.length; j++) {
                    if(count >= j+1 ) {
                        array[j] = SingltonFabricPattern.getFigure(figures[random.nextInt(figures.length)]);
                        array[j].draw();
                        array[j] = null;  /*Память таким образом не засоряется?*/
                    }
                }

    }

}
