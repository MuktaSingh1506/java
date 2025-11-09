package assignment1;

import java.util.Scanner;

public class countCharType07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();

        System.out.print("Enter a String: ");
        str = sc.next();

        int len = str.length();

        int countVowel = 0;
        int countCons = 0;
        int countDigit = 0;
        int countSpcl = 0;
        for(int i=0; i<len; i++) {
            char temp = str.charAt(i);
            if(temp>='0' && temp<='9')
            countDigit++;
            else if(temp=='a' || temp=='A' || temp=='e' || temp=='E' || temp=='i' || temp=='I' || temp=='o' || temp=='O' || temp=='u' || temp=='U')
            countVowel++;
            else if((temp>='a'&& temp<='z') || (temp>='A' && temp<='Z'))
            countCons++;
            else
            countSpcl++;
        }

        System.out.println("Count Vowel: "+ countVowel + "\nCount consonent: "+ countCons + "\nCount Digit: "+countDigit+"\nCount Special Characters: "+ countSpcl);
        sc.close();
    }
}