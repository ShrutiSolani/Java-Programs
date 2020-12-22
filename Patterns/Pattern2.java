//16. WAP to print the patterns
//* * * * *
//  * * * *
//    * * *
//      * *
//        *
public class Pattern2 {
    public static void main(String[] args) {
        int i,j;
        for(i = 0;i < 5; i++)
        {
            for(j = 1;j <= 5; j++)
            {
                if(j > i)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
