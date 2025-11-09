package assignment2;

abstract class Shape {
    int[] side;  // By default: package-private
    float area, perimeter;

    abstract protected void calPerimeter();

    public float getPerimeter() {
        calPerimeter();
        return perimeter;
    }
}
class Square extends Shape {
    Square(int sides[]) {
        side = new int[1];
        for(int i=0; i<1; i++) {
            side[i] = sides[i];
        }
    }
    protected void calPerimeter() {
        perimeter = side[0]*(4.0f);
    }
}
class Triangle extends Shape {
    Triangle(int sides[]) {
        side = new int[3];
        for(int i=0; i<3; i++) {
            side[i] = sides[i];
        }
    }
    protected void calPerimeter() {
        perimeter = side[0] + side[1] + side[2];
    }
}
class Rectangle extends Shape {
    Rectangle(int sides[]) {
        side = new int[2];
        side[0] = sides[0];
        side[1] = sides[1];
    }
    protected void calPerimeter() {
        perimeter = 2*(side[0]+side[1]);
    }
}

public class hierarchicalInheritance {
    public static void main(String[] args) {
        Square sq = new Square(new int[]{10});
        System.out.println(sq.getPerimeter());

        Rectangle rc = new Rectangle(new int[] {10, 20});
        System.out.println(rc.getPerimeter());

        Triangle tr = new Triangle(new int[] {10, 20, 30});
        System.out.println(tr.getPerimeter());
    }
    
}
