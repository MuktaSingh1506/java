package assignment1;
import java.util.Scanner;

public class EvenInArray05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int size;
        System.out.print("Enter number of elem: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter "+size+ " Elements: ");

        for(int i=0; i< size; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++) {
            if(arr[i]%2==0)
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
    
}
