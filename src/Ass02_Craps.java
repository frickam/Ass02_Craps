import java.util.Random;
import java.util.Scanner;
public class Ass02_Craps
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        boolean done = false;

        do
        {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;

            if (crapsRoll == 2)
            {
                System.out.println("You rolled a " + crapsRoll + "! You Lose!");
            }
            else if (crapsRoll == 3)
            {
                System.out.println("You rolled a " + crapsRoll + "! You Lose!");
            }
            else if (crapsRoll == 12)
            {
                System.out.println("You rolled a " + crapsRoll + "! You Lose!");
            }
            else if (crapsRoll == 7)
            {
                System.out.println("You rolled a " + crapsRoll + "! You Win!");
            }
            else if (crapsRoll == 11)
            {
                System.out.println("You rolled a " + crapsRoll + "! You Win!");
            }
            else
            {
                int point = crapsRoll;
                System.out.println("You rolled a " + point + "! This is the point. Rolling again...");
                boolean finished = false;
                do
                {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    int crapsRoll2 = die1 + die2;
                    if (crapsRoll2 == point)
                    {
                        System.out.println("You rolled the point! You Win!");
                        finished = true;
                    }
                    else if (crapsRoll2 == 7)
                    {
                        System.out.println("You rolled a 7! You Lose!");
                        finished = true;
                    }
                    else
                    {
                        System.out.println("You rolled a " + crapsRoll2 + "! Rolling again . . .");
                    }
                }
                while(!finished);
            }
            SafeInput.getYNConfirm(in, "Would you like to play again");
        }
        while(!done);
    }
}
