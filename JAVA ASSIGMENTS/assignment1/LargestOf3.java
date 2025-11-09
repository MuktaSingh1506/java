package assignment1;
import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 num: ");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();

        int largest;
        if(one>two)
        {
            if(one>three)
            largest = one;
            else
            largest = three;
        }
        else
        {
            if(two>three)
            largest = two;
            else
            largest = three;
        }
        System.out.println("Largest: "+ largest);
        sc.close();
    }
}
