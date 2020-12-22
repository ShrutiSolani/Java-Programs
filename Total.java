//ask for rows and columns
//calculate sum of rows and columns
// 1    3   6   |   10
// 7    9   8   |   24
//---------------------
// 8    12  14  |   34
import java.util.Scanner;
public class Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c,i,j;
        System.out.print("Enter number of rows : ");
        r=  sc.nextInt();
        System.out.print("Enter number of columns : ");
        c= sc.nextInt();
        int a[][] = new int[r][c];
        int sum_row[] = new int[r];
        int sum_col[] = new int[c];
        int total = 0;
        for(i = 0;i < r;i++)
        {
            sum_row[i] = 0;
            for(j = 0;j < c;j++)
            {
                System.out.print("Enter a["+i+"]["+j+"] : ");
                a[i][j] = sc.nextInt();
                sum_row[i] += a[i][j];
                sum_col[j] += a[i][j];
            }
            total += sum_row[i];
        }
        for(i = 0;i < r;i++)
        {
            for(j = 0;j < c;j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("|\t"+sum_row[i]);
        }
        String str = "-\t";
        String str_repeat = str.repeat(c+2);
        System.out.println(str_repeat);

        for (j = 0;j < c;j++)
        {
            System.out.print(sum_col[j]+"\t");
        }
        System.out.println("|\t"+total);
    }

}
