class Shape {
    void calculateArea() {
        System.out.println("Calculating Area...");
    }

    void showArea() {
        System.out.println("Area Display");
    }
}

class Circle extends Shape {
    double radius = 5;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area = " + area);
    }

    void showArea() {
        System.out.println("Showing Circle Area");
    }
}

class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area = " + area);
    }

    void showArea() {
        System.out.println("Showing Rectangle Area");
    }
}

class Triangle extends Shape {
    double base = 8;
    double height = 4;

    void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle Area = " + area);
    }

    void showArea() {
        System.out.println("Showing Triangle Area");
    }
}

public class RunTimePolymorphismEx2 {
    public static void main(String[] args) {

        Shape s;

        s = new Shape();
        s.calculateArea();
        s.showArea();

        s = new Circle();
        s.calculateArea();
        s.showArea();

        s = new Rectangle();
        s.calculateArea();
        s.showArea();

        s = new Triangle();
        s.calculateArea();
        s.showArea();
    }
}