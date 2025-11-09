package assignment1;
import java.util.Scanner;

public class Sort06 {
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

        for(int i=1;i<size;i++)
        {
            int j=0;
            boolean flag = false;
            for(j=0; j<i; j++)
            {
                if(arr[i]<arr[j])
                {
                    flag = true;
                    break;
                }
            }
            // j is correct position for arr[i]

            if(flag)
            {
                int temp = arr[i];
                for(int k=i-1; k>=j ; k--)
                {
                    arr[k+1] = arr[k];
                }
                arr[j] = temp;
            }
        }
        for(int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
