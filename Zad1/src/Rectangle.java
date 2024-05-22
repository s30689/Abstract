public class Rectangle implements Figure {
    double baseSide;
    double side;
    public Rectangle(double baseSide,double side){
        this.baseSide=baseSide;
        this.side=side;

    }

    @Override
    public double getPerimeter() {
        return 2*(baseSide+side);
    }

    @Override
    public double getArea() {
        return (side*baseSide);
    }

    public String getType(){
        return getClass().getSimpleName();
    }
}

