//23. Write a program to generate following pattern
//****
//***
//**
//*

import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter number of lines : ");
        n = sc.nextInt();
        for(i = 0;i < n;i++)
        {
            for(j = 0;j < (n-i);j++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }
    }
}
