package assignment2;

public class basicStudent03 {
    private int Id;
    private String name;
    private char[] grade;

    public basicStudent03(int Id, String name, char[] grade)
    {
        this.Id = Id;
        this.name = name;
        this.grade = grade;
    }

    public void displayData() {
        System.out.println("Your Data: " + Id + " " + name + " " + String.valueOf(grade));
    }
    public static void main(String[] args) {
        basicStudent03 obj1 = new basicStudent03(2, "test", new char[] {'A','+'});
        obj1.displayData();
        
        // A char can be passed in 2 ways. These methods are pass-by-reference
        char[] grades = {'B','+'};
        basicStudent03 obj2 = new basicStudent03(2, "test", grades);
        obj2.displayData();
    }
}
