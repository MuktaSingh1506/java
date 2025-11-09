package assignment3;

class Vehicle {
    String name;
    void runs() {
        System.out.println("Vehicle is running...");
    }
}

interface Luxury {
    void ShowFeatures();
}

class Tesla extends Vehicle implements Luxury {
    @Override
    public void ShowFeatures() {
        System.out.println("Tesla is a luxury Car.");
    }
}
public class hybridInheritance03 {
    public static void main(String[] args) {
        Tesla t1 = new Tesla();
        t1.runs();
        t1.ShowFeatures();
    }
}
