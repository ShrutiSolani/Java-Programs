//WAP to generate 10 random numbers from 15-20 and find their mean

import java.util.Random;

class RandomMean
{
    public static void main(String[] args) {
        Random random = new Random();
        int i;
        double a[] = new double[10];
        double sum = 0,mean;
        System.out.println("Random numbers generated are : ");
        for(i = 0;i < 10;i++)
        {
            a[i] = random.nextDouble() + 15;
            System.out.println(a[i]);
            sum += a[i];
        }
        mean = sum/10;
        System.out.println("Mean of random numbers : "+mean);
    }
}