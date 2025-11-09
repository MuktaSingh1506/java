package assignment2;

public class employeeClass01 {
    
    
    private int Id;
    private String name;
    private int salary;

    public employeeClass01(int Id, String name, int salary)
    {
        this.Id = Id;
        this.name = name;
        this.salary = salary;
    }

    public void displayData() {
        System.out.println("Your Data: " + Id + " " + name + " " + salary);
    }
    public static void main(String[] args) {
        employeeClass01 obj1 = new employeeClass01(0, "test", 2000);

        obj1.displayData();
    }
}
