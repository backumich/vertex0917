package homework2Patterns;

public class Square implements Figure {
    private Point lowerLeftCorner ;
    private double length;


    public Point getLowerLeftCorner(){
        return lowerLeftCorner;
    }

    public double getLength() {
        return length;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    public static class Builder{
        private Square square;

        public Builder(){
            this.square = new Square();
        }

        public Builder withLowerLeftCorn(Point p){
            square.lowerLeftCorner = p;
            return this;
        }

        public Builder withLength(double d){
            square.length = d;
            return this;
        }

        public Square build(){
            return square;
        }
    }

    @Override
    public String toString(){
        return "Thi is Square";
    }
}
