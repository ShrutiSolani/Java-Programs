//17. WAP to print the following pattern
//              *
//          *   *   *
//      *   *   *   *   *
//  *   *   *
//              *

public class Pattern3 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<= 3;i++)
        {
            System.out.print(" ");
            for(j=1;j<= 3-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<= 3;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(i=1;i<= 3;i++)
        {
            System.out.print(" ");
        }
        System.out.println("*");

    }
}
