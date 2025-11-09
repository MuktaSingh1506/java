package assignment3;

class Animals {
    public void eat() {
        System.out.println("Animal eats everything");
    }
    public void walk() {
        System.out.println("Animal walks");
    }
}

class Cow extends Animals{
    @Override
    public void eat() {
        System.out.println("Cow eats Grass");
    }
}

class Cat extends Animals {
    @Override
    public void eat() {
        System.out.println("Cat drinks milk");
    }
}
public class methodOverriding05 {
    public static void main(String[] args) {
        Animals cow1 = new Cow(), cat1 = new Cat();

        cow1.eat();
        cat1.eat();

        cow1.walk();
        cat1.walk();
    }
}
