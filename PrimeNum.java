//12. WAP to generate the prime numbers between 1 and 100.
public class PrimeNum {
    public static void main(String[] args) {
        int i,j;
        String primenum = "";
        for(i = 1;i <= 100; i++)
        {
            int counter = 0;
            for(j = i;j >= 1; j--)
            {
                if(i % j == 0)
                {
                    counter += 1;
                }
            }
            if(counter == 2)
            {
                primenum += i + " ";
            }
        }
        System.out.println(primenum);
    }
}
