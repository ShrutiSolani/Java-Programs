//32. The annual examination results of 5 students are tabulated as follows:
//Roll No Subject1 Subject2 Subject3
//WAP to read the data and determine the following
//Total marks obtained by each student
//The student who obtained the highest total marks

import java.util.Scanner;
public class TotalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[5][4];
        int total[] = new int[5];
        int i,j;
        for(i = 0;i < 5;i++)
        {
            System.out.print("Enter roll no. : ");
            a[i][0] = sc.nextInt();
            System.out.print("Enter marks in subject 1 : ");
            a[i][1] = sc.nextInt();
            System.out.print("Enter marks in subject 2 : ");
            a[i][2] = sc.nextInt();
            System.out.print("Enter marks in subject 3 : ");
            a[i][3] = sc.nextInt();
        }
        for(i = 0;i < 5;i++)
        {
            for(j = 1;j <= 3;j++)
            {
                total[i] += a[i][j];
            }
            System.out.println("Total marks of roll no. "+a[i][0]+" = "+total[i]);
        }
        int max = 0;
        for(i = 0;i < 5;i++)
        {
            if(total[i] > total[max])
            {
                max = i;
            }
        }
        System.out.println("Highest marks are obtained by roll no. "+a[max][0]);
        System.out.println("Highest score : "+total[max]);
    }
}
