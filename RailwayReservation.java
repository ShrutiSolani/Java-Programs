//5. In a railway reservation system, a particular bogey is allocated for women passengers. The
//bogey comprises of 72 seats. The 1st
//preference is given to female passengers whose age is>=65.
//Passengers can provide their choice of seats that include lower, upper, middle, side
//lower, side upper.
//WAP that allocates seats to the passengers according to their request. If
//the number of requests exceeds the capacity of bogey it should give “reservation full”
//message
import java.util.Scanner;
public class RailwayReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int available = 72;
        String choice;
        int seats,i;
        do {
            if(available > 0)
            {
                System.out.println("Do you want reservation ? (Y/N)");
                choice = sc.next();
                System.out.println("How many seats do you want ? ");
                seats = sc.nextInt();
                int age[] = new int[seats];
                String gender[] = new String[seats];
                System.out.println("Enter Gender and age of all passengers.");
                for(i = 0;i < seats;i++)
                {
                    System.out.print("Enter gender "+(i+1)+" : ");
                    gender[i] = sc.next();
                    System.out.print("Enter age "+(i+1)+" : ");
                    age[i] = sc.nextInt();
                    checkSeats(gender, age, seats,available);
                }
            }
            else
            {
                break;
            }
        }while(choice != "N");
    }
    static void checkSeats(String gender[], int age[], int seats,int available) {
        int countsc = 0,i,countf = 0;
        for (i = 0; i < seats; i++)
        {
            if(gender[i] == "F" && age[i] >= 65)
            {
                countsc += 1;
                System.out.println("Seat reserved : "+gender[i]+" "+age[i]);
                available -= 1;
            }
        }
        for(i = 0; i < seats; i++)
        {
            if(gender[i] == "F" && age[i] < 65)
            {
                countf += 1;
                System.out.println("Seat reserved : "+gender[i]+" "+age[i]);
                available -= 1;
            }
        }
    }
}
