package assignment1;

import java.util.Scanner;

public class maxMinInArr08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter number of elem: ");
        size = sc.nextInt();

        if(size<1)
        {
            System.out.println("Enter atleast one value to continue");
            sc.close();
            return;
        }
        int[] arr = new int[size];
        System.out.println("Enter "+size+ " Elements: ");

        for(int i=0; i< size; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i: arr)
        {
            if(i<min) min =i;
            if(i>max) max =i;
        }

        System.out.println("Min: " + min + "\nMax: " + max);
        sc.close();
    }
}
