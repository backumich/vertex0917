package homework2Patterns;


class Rectangular implements Figure {
    private double height;
    private Square square;


    private Rectangular() {
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    public double getHeight() {
        return height;
    }

    public Square getSquare() {
        return  square;
    }

     public static class Builder{
        private Rectangular rectangular;

        public Builder() {
            this.rectangular = new Rectangular();
        }

        public Builder withHeight(double height){
            rectangular.height = height;
            return this;
        }

        public Builder withSquare(Square width){
            rectangular.square = width;
            return this;
        }

        public Rectangular build(){
            return new Rectangular();
        }

    }

    @Override
    public String toString(){
        return "Thi is Rectangular";
    }
}
