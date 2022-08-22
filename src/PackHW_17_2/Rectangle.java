package PackHW_17_2;

public class Rectangle extends Shape{
    private double l;
    private double w;

    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    public double getPerimeter() {
        return 2*(l+w);
    }
}