package assignment3;

class Employee {
    private String name;
    
    Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Manager extends Employee {
    public long salary;
    Manager(String name) {
        super(name);
        salary = 20000;
    }
}

class Clerk extends Employee {
    public long salary;
    Clerk(String name) {
        super(name);
        salary = 10000;
    }
}

class Salesperson extends Employee {
    public long salary;
    Salesperson(String name) {
        super(name);
        salary = 15000;
    }
}

public class calculateSalary07 {
    public static long getSalary(Manager emp) {
        return emp.salary;
    }
    
    public static long getSalary(Clerk emp) {
        return emp.salary;

    }
    public static long getSalary(Salesperson emp) {
        return emp.salary;

    }

    public static void main(String[] args) {

        // using same getsalary to fetch salary of different class
        Manager m = new Manager("Rohan");
        System.out.println("Salary of " + m.getName() + " is: "+ getSalary(m));

        Clerk c = new Clerk("Geet");
        System.out.println("Salary of " + c.getName() + " is: "+ getSalary(c));

        Salesperson s = new Salesperson("Veer");
        System.out.println("Salary of " + s.getName() + " is: "+ getSalary(s));

    }
}
