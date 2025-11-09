package assignment1;
import java.util.Scanner;

public class Table02 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no: ");
        int num;
        num = sc.nextInt();

        System.out.println("----------------");
        for(int i=0;i<=10;i++)
        {
            System.out.println(num + " X " + String.format("%2d",i) +" = "+ i*num);
        }
        System.out.println("----------------");

        sc.close();
    }
}
