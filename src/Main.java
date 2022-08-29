public class Main
{
    public static void main(String[] args)
    {
        Game result = new Game();
        int player1 = result.roll(1);
        int player2 = result.roll(2);

        if (player1 < player2)
        {
            System.out.println("player 1 wins with a score of " + player1);
        }
        else if (player1 > player2)
        {
            System.out.println("player 2 wins with a score of "+ player2);
        }
        else
        {
            System.out.println("draw");
        }
    }
}