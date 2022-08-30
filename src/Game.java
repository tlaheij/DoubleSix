import java.util.Scanner;
public class Game {
    private int rolls = 0;
    private String player = "";
    private final Scanner input = new Scanner(System.in);
    private int dice1 = 0;
    private int dice;
    private int numSix = 0;

    public Game(){
    }

    public int roll(String name, int numDice)
    {
        player = name;
        dice = numDice;
        rolls = 0;
        dice1 = 0;
        numSix = 0;

        System.out.println("Welcome player "+player);
        while (dice > numSix) {
            numSix = 0;
            System.out.println("Press enter to roll");
            String enter = input.nextLine();
            if (enter.equals("")) {
                for (int i=0; i<dice;i++) {
                    dice1 = (int) (Math.random() * 6 + 1);
                    System.out.println("dice " + (i+1) + ": " + dice1);
                    if (dice1 == 6){
                        numSix ++;
                    }
                }
                rolls +=1;
            }

        }
        System.out.println("player "+player+" scored "+ rolls);
        return rolls;
    }
}

