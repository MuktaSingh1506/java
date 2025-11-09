package assignment1;
import java.util.Scanner;

public class reverse04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        int result = 0; 

        int temp;
        while(true)
        {
            if(num==0)
            break;
            temp = num % 10;
            result = result*10 + temp;
            num = num/10;
            
        }

        System.out.println("Result: "+ result);
        sc.close();
    }
}
