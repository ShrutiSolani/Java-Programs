//33. A record of average temperature is prepared for different cities month-wise
//WAP to read the data in 2D array and determine the following:
//State with highest temperature recorded in the months of April and May
//State with lowest temperature recorded in the months of December and January

import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp[][] = new int[5][13];
        int i,j;
        for (i = 0;i < 5;i++)
        {
            System.out.print("Enter state number : ");
            temp[i][0] = sc.nextInt();
            for(j = 1;j < 13;j++)
            {
                System.out.print("Enter temperature for month "+j+" : ");
                temp[i][j] = sc.nextInt();
            }
        }
        int ap_max = 0;
        for(i = 0;i < 5;i++)
        {
            if(temp[i][4] > temp[ap_max][4])
            {
                ap_max = i;
            }
        }
        System.out.println("Highest temperature in april is "+temp[ap_max][4]);
        int may_max = 0;
        for(i = 0;i < 5;i++)
        {
            if(temp[i][5] > temp[may_max][5])
            {
                may_max = i;
            }
        }
        System.out.println("Highest temperature in may is "+temp[may_max][5]);
        int dec_min = 0;
        for(i = 0;i < 5;i++)
        {
            if (temp[i][12] < temp[dec_min][12])
            {
                dec_min = i;
            }
        }
        System.out.println("State with min temperature in december : "+temp[dec_min][0]);
        int jan_min = 0;
        for(i = 0;i < 5;i++)
        {
            if (temp[i][12] < temp[jan_min][12])
            {
                jan_min = i;
            }
        }
        System.out.println("State with min temperature in january : "+temp[jan_min][0]);
    }
}
