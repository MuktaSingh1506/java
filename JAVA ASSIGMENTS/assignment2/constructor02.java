package assignment2;

public class constructor02 {
    private int Id;
    private String name;
    private int salary;

    public constructor02() {
        Id = 0;
        name = "NA";
        salary = 1000;
    }
    public constructor02(int Id, String name, int salary)
    {
        this.Id = Id;
        this.name = name;
        this.salary = salary;
    }

    public constructor02(constructor02 obj) {
        Id = obj.Id;
        name = obj.name;
        salary = obj.salary;
    }

    public void displayData() {
        System.out.println("Your Data: " + Id + " " + name + " " + salary);
    }
    public static void main(String[] args) {
        constructor02 obj1 = new constructor02(1, "test", 2000);
        constructor02 obj2 = new constructor02();
        constructor02 obj3 = new constructor02(obj1);

        System.out.println("New Object: ");
        obj1.displayData();
        System.out.println("New Object with default constructor: ");
        obj2.displayData();
        System.out.println("New Object with copy constructor: ");
        obj3.displayData();
    }
}
