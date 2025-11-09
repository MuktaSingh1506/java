package assignment2;

import java.util.Date;

// By default class is public
class Car {
    String modelName;
    Date manufacturedOn;
    double maxSpeed;

    Car()
    {
        modelName = "NA";
        manufacturedOn = new Date();
        maxSpeed = 180;
    }
    Car(String modelName, Date manufacturedOn, double maxSpeed)
    {
        this.manufacturedOn = manufacturedOn;
        this.maxSpeed = maxSpeed;
        this.modelName = modelName;
    }

    void displayInfo()
    {
        // using %tD for date part of Date() 
        System.out.println("Your car details: ");
        System.out.printf("Model: %s :: Manufacturing Date: %tD :: Max Speed: %f",modelName,manufacturedOn,maxSpeed);
    }
}

public class constructorOverload07 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.displayInfo();
    }
}
