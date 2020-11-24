//3. WAP in which a random number generated between 0-1000 is the cash inflow to the person
//playing the game. Two people play the game 5 times and the winner is the one whose total
//cash is maximum and the program displays the winner
import java.util.*;
public class RandomGame {
    public static void main(String[] args) {
        String p1,p2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter player 1 name : ");
        p1 = sc.next();
        System.out.print("Enter player 2 name : ");
        p2 = sc.next();
        Random r = new Random();
        int i;
        for(i = 0;i < 5;i++)
        {
            int r1 = r.nextInt(1000);
            int r2 = r.nextInt(1000);
            if(r1 > r2)
            {
                System.out.println("Winner is "+p1);
                System.out.println("You won "+r1);
            }
            else if(r1 < r2)
            {
                System.out.println("Winner is "+p2);
                System.out.println("You won "+r2);
            }
            else
            {
                System.out.println("Draw");
            }
            System.out.println();
        }
    }
}
