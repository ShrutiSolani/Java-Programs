//Write a program that reads any positive integer n and prints the digits in words.
//For example, if input is 1265 then output is one two six five.
import java.util.*;
public class IntToWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String ch[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String num = "";
        while(n != 0)
        {
            int temp = n%10;
            num = ch[temp]+" " + num;
            n = n/10;
        }
        System.out.println("Number in words : "+num);
    }
}
