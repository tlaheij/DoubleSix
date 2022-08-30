import java.sql.SQLOutput;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Game result = new Game();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter player 1's name:");
        String name1 = input.nextLine();
        System.out.println("Enter player 2's name: ");
        String name2 = input.nextLine();
        System.out.println("Enter number of dice: ");
        int numDice = input.nextInt();

        int player1 = result.roll(name1, numDice);
        int player2 = result.roll(name2, numDice);

        if (player1 < player2)
        {
            System.out.println(name1 + " wins with a score of " + player1);
        }
        else if (player1 > player2)
        {
            System.out.println(name2 + " wins with a score of "+ player2);
        }
        else
        {
            System.out.println("draw");
        }
    }
}