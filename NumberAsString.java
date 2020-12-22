//13. Write a program that reads a 4 digit integer and breaks it in a sequence of individual digits
//[example:  1691 should be displayed as 1 6 9 1]

import java.util.*;
public class NumberAsString {
    public static void main(String[] args) {
        int n;
        String num = "";
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while(n != 0)
        {
            int temp = n % 10;
            num = temp + " "+ num;
            n = n/10;
        }
        System.out.println("number as sequence of individual digits : "+num);
    }
}
