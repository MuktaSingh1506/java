package assignment1;

import java.util.Scanner;

public class simpleCalculator09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask choices from user and then perform the fuction
        System.out.println("User choices:");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

        int choice;
        do {
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            if(choice==5)
            break;
            System.out.println("Enter 2 values: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Result a+b = " + (a + b));
                    break;
                case 2:
                    System.out.println("Result a-b = " + (a - b));
                    break;
                case 3:
                    System.out.println("Result a*b = " + (a * b));
                    break;
                case 4:
                    if(b==0)
                    System.out.println("Division not possible");
                    else
                    System.out.println("Result a/b = " + (a / b));
                    break;
                default:
                    System.out.println("Enter right choice");
                    break;
            }

        } while (choice != 5);

        sc.close();
    }

}
