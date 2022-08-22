package PackHW_17_2;

public class Circle extends Shape{
    private double r;
    private double P = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2*P*r;
    }
}
