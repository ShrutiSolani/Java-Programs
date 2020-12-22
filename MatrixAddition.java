//30. Write a program for matrix addition

import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c,i,j;
        System.out.print("Enter number of rows : ");
        r=  sc.nextInt();
        System.out.print("Enter number of columns : ");
        c= sc.nextInt();
        int a1[][] = new  int[r][c];
        int a2[][] = new int[r][c];
        int a3[][] = new int[r][c];
        for(i = 0;i < r;i++)
        {
            for(j = 0;j < c;j++)
            {
                System.out.print("Enter a1["+i+"]["+j+"] : ");
                a1[i][j] = sc.nextInt();
            }
        }
        for(i = 0;i < r;i++)
        {
            for(j = 0;j < c;j++)
            {
                System.out.print("Enter a2["+i+"]["+j+"] : ");
                a2[i][j] = sc.nextInt();
            }
        }
        for(i = 0;i < r;i++)
        {
            for(j = 0;j < c;j++)
            {
                a3[i][j] = a1[i][j] + a2[i][j];
            }
        }
        for(i = 0;i < r;i++)
        {
            for(j = 0;j < c;j++)
            {
                System.out.print(a3[i][j]+ "\t");
            }
            System.out.print("\n");
        }
    }
}
