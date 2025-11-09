package assignment3;

class myAnimal {
    void sound() {
        System.out.println("Animal makes some sounds");
    }
}

class myDog extends myAnimal {
    @Override
    void sound() {
        System.out.println("myDog Barks");
    }
}

class myCat extends myAnimal {
    @Override
    void sound() {
        System.out.println("myCat Meows");
    }
}

public class methodOverriddenAndResolution {
    public static void main(String[] args) {
        myAnimal a;
        a = new myDog();
        a.sound();
        System.out.println(a.getClass());

        a = new myCat();
        a.sound();
        System.out.println(a.getClass());
    }

}
