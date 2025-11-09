package assignment3;

class Circle {
    public static float pi = 3.14f;
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }
}
class Square {
    float side;

    Square(float side) {
        this.side = side;
    }
}
class Rectangle {
    float len, width;
    Rectangle(float len, float width) {
        this.len = len;
        this.width = width;
    }
}

class calculateArea {
    public static void calculate(Circle c) {
        float result = Circle.pi * c.radius * c.radius;
        System.out.println("Area of circle = "+result);
    }
    public static void calculate(Square s) {
        float result = s.side * s.side;
        System.out.println("Area of square = "+ result);
    }
    public static void calculate(Rectangle r) {
        float result = r.len * r.width;
        System.out.println("Area of Rectangle = "+result);
    }
}

public class calculateShapesArea08 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(23.5f, 10f);
        calculateArea.calculate(r);

        Square s = new Square(20f);
        calculateArea.calculate(s);

        Circle c = new Circle(10.2f);
        calculateArea.calculate(c);
    }
}
