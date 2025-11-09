package assignment2;

abstract class shapes {
    // abstract float sides;
    abstract float area();
    abstract float perimeter();

    public void display() {
        float area = area();
        float perimeter = perimeter();
        System.out.println("Area = "+ String.valueOf(area) + " Perimeter: "+ String.valueOf(perimeter));
    }
}

class rectangle extends shapes {
    private float length, width;

    public rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    float area() {
        return length*width;
    }

    @Override float perimeter() {
        return (2*(length + width));
    }
}

class circle extends shapes {

    public static final float pi = 3.14f;
    private float radius;
    
    public circle(float radius) {
        this.radius = radius;
    }
    @Override
    float area() {
        return pi*radius*radius;
    }
    
    @Override float perimeter() {
        return (2*pi*radius);
    }

}

public class shapesAbstract05 {
    public static void main(String[] args) {
        circle c1 = new circle(2);
        c1.display();
        
        rectangle r1 = new rectangle(10, 10);
        r1.display();
    }
}