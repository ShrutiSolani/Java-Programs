//WAP to convert decimal number to Hexadecimal

import java.util.*;

class decToHex
{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a decimal number : ");
        n = sc.nextInt();
        String h1,h2 = "";
        h1 = Integer.toHexString(n);
        System.out.println("Hexadecimal number is : "+h1);
        //char[] ch = new char[15];
        char ch[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n != 0)
        {
            int temp = n % 16;
            h2 = ch[temp] + h2;
            n = n/16;
        }
        System.out.println("Hexadecimal number is : "+h2);
    }
}