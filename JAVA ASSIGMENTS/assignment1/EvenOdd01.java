package assignment1;
import java.util.Scanner;

public class EvenOdd01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter a Input to find Even and Odd: ");
        i = sc.nextInt();

        
        String result = i%2==0?"Even": "Odd";
        System.out.println("No. is: " + result);
        sc.close();

    }
}
