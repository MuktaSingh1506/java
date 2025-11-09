package assignment3;

class myAnimals {
    void births() {
        System.out.println("Animal has childs");
    }
}

class myDogs extends myAnimals {
    @Override
    void births() {
        System.out.println("Dog births puppies");
    }
}

class myCats extends myAnimals {
    @Override
    void births() {
        System.out.println("Cat births kittens");
    }
}

public class methodOverridingSuperClassReference {
    public static void main(String[] args) {
        // Show how method overriding works when superclass reference is used to call a subclass method.
        myAnimals a;
        a = new myDogs();
        a.births();
        System.out.println(a.getClass());

        a = new myCats();
        a.births();
        System.out.println(a.getClass());
    }

}

