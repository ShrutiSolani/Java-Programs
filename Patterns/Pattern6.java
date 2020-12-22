//20. Write a program to generate following pattern (N=3)
//          3
//         323
//        32123
//         323
//          3
public class Pattern6 {
    public static void main(String[] args) {
        int i,j,k,l;
        for(i = 0; i < 3; i++)
        {
            int num = 3;
            for(j = 3;j > i; j--)
            {
                System.out.print("\t");
            }
            for(k = 0; k <= i; k++)
            {
                System.out.print(num-k+"\t");
            }
            for(l = i - 1; l >= 0; l--)
            {
                System.out.print(num - l+"\t");
            }
            System.out.println();
            for(k = 0; k <= i; k++)
            {
                System.out.print(num-k+"\t");
            }
            for(j = 3;j > i; j--)
            {
                System.out.print("\t");
            }
            //System.out.println();
        }
    }
}
