//34. WAP to find the binary form of a given number

import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        DecimalToBinary convert = new DecimalToBinary();
        convert.toBinary(n);
    }
    void toBinary(int n)
    {
        String num = "";
        while(n > 0)
        {
            int temp = n%2;
            num = temp + " "+ num;
            n = n/2;
        }
        System.out.print("Binary number : "+num);
    }
}
