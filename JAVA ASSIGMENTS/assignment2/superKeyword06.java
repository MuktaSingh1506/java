package assignment2;

import java.util.Date;

class address {
    private String city;
    private String country;
    private String pincode;

    public address(String city, String country, String pincode) {
        this.city = city;
        this.country = country;
        this.pincode = pincode;
    }

    public void displayAddress() {
        System.out.println("City: "+city);
        System.out.println("Country: "+country);
        System.out.println("Pincode: "+pincode);
    }
}

class Person extends address{
    int Id;
    String name;
    Date DOB;

    Person(int Id, String name, Date DOB, String city, String country, String pincode) {
        // Super should be the first statement
        super(city, country, pincode);

        this.DOB = DOB;
        this.Id = Id;
        this.name = name;

    }

    public void displayInfo() {
        System.out.println(String.valueOf(DOB));
    }

}
public class superKeyword06 {
    public static void main(String[] args) {
        Person h1 = new Person(1, "Radha", new Date(), "Bhopal", "India", "121004");

        h1.displayAddress();
        h1.displayInfo();

    }
}
