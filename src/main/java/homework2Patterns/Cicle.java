package homework2Patterns;

public class Cicle implements Figure{
    private Point pointCentr = new Point();
    private double radius;

//    protected Cicle() {
//    }

    public Point getPointCentr() {
        return pointCentr;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    public class Builder{
        private Cicle cicle;

        private Builder(){
            this.cicle = new Cicle();
        }

        public Builder withRadiusWidth(double r ){
            cicle.radius = r;
            return this;
        }

        public Builder withPointCentr(Point p ){
            cicle.pointCentr =p;
            return this;
        }

        public Cicle build(){
            return cicle;
        }
    }

    @Override
    public String toString(){
        return "Thi is Cicle";
    }
}
