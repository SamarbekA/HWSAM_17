package PackHW_17_2;

public class Trapezium extends Shape {
    private int a;
    private int b;
    private int c;
    private int d;

    public Trapezium(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPerimeter() {
        return a+b+c+d;
    }
}

