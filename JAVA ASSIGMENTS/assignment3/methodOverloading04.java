package assignment3;

public class methodOverloading04 {

    static void add(int a, int b) {
        System.out.println("Sum = "+ (a+b));
    }
    static float add(int a, float b) {
        return (a+b);
    }

    static float add(float a, float b)
    {
        return (a+b);
    }

    public static void main(String[] args) {
        int a  =5;
        int b = 6;
        float c = 5.5f;

        add(a,b);
        System.out.println("Sum = "+ add(a,c));
        System.out.println("Sum = "+ add(c,c));
    }
}
