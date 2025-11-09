package assignment2;

public class staticMethod04 {
    // By default publicly available
    static int count = 1;
    public int Id;
    public staticMethod04() {
        Id = count;
        count++;
    }

    public static void main(String[] args) {
        staticMethod04 obj1 = new staticMethod04();
        System.out.println(obj1.Id);
        
        staticMethod04 obj2 = new staticMethod04();
        System.out.println(obj2.Id);

        staticMethod04 obj3 = new staticMethod04();
        System.out.println(obj3.Id);
    }
}
