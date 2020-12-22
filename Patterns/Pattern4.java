//18. WAP to print the following pattern
//1
//0 1
//1 0 1
//0 1 0 1
//1 0 1 0 1
public class Pattern4 {
    public static void main(String[] args) {
        int i,j;
        for(i = 0; i < 5; i++)
        {
            for(j = 0;j < 5; j++)
            {
                if(i >= j)
                {
                    if((i-j) % 2 == 0)
                    {
                        System.out.print(1 + "\t");
                    }
                    else if((i - j) % 2 != 0)
                    {
                        System.out.print(0 + "\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
