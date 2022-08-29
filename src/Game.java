import java.util.Scanner;
public class Game {
    private int rolls = 0;
    private int player = 0;
    private final Scanner input = new Scanner(System.in);
    private int dice1 = 0;
    private int dice2 = 0;

    public Game(){
    }

    public int roll(int playerNum)
    {
        player = playerNum;
        rolls = 0;
        dice1 = 0;
        dice2 = 0;
        System.out.println("Welcome player "+player);
        while (dice1 != 6 || dice2 != 6) {
            System.out.println("Press enter to roll");
            String enter = input.nextLine();
            if (enter.equals("")) {
                dice1 = (int) (Math.random()*6+1);
                dice2 = (int) (Math.random()*6+1);
                System.out.println("dice 1: "+dice1);
                System.out.println("dice 2: "+dice2);
                rolls +=1;
            }

        }
        System.out.println("player "+player+" scored "+ rolls);
        return rolls;
    }
}

