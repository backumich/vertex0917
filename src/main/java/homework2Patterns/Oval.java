package homework2Patterns;

public class Oval implements Figure {
    private Cicle cicle; /*horizontal width with Point centre*/
    private double radiusHeight; /*vertical height*/

//    protected Oval() {
//    }

    public Cicle getCicle() {
        return cicle;
    }

    public double getRadiusHeight() {
        return radiusHeight;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    public class Builder{
        private Oval oval;

        private Builder(){
            this.oval = new Oval();
        }

        public Builder withCicle(Cicle r ){
            oval.cicle = new Cicle();
            return this;
        }

        public Builder withRadiusHeight(double r ){
            oval.radiusHeight = r;
            return this;
        }


        public Oval build(){
            return oval;
        }
    }

    @Override
    public String toString(){
        return "Thi is Oval";
    }
}
