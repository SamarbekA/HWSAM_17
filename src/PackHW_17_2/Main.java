package PackHW_17_2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,2);
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter() + " centimeters.");
        Triangle triangle = new Triangle(5,3,6);
        System.out.println("Perimeter of the triangle is: " + triangle.getPerimeter() + " cm.");
        Circle circle = new Circle(4);
        System.out.println("Perimeter of the circle is: " + circle.getPerimeter() + " cm.");
        Square square = new Square(7,7,7,7);
        System.out.println("Perimeter of the square is: " + square.getPerimeter() + " cm.");
        Trapezium trapezium = new Trapezium(4,5,6,7);
        System.out.println("Perimeter of the trapezium is: " + trapezium.getPerimeter() + "cm.");
    }
}
