package ua.dp.levelup.classwork.lesson6;

/**
 * Created by java on 22.11.2016.
 */
public class Main1
{
    static void printScore(int score)
    {
        if (score == 3)
        {
            System.out.println("WIN!");
        }
        else if (score == 1)
        {
            System.out.println("DRAW");
        }
        else if (score == 0)
        {
            System.out.println("LOOSE");
        }
        else
        {
            System.out.println("INVALID SCORE");
        }
    }

    public static void main(String[] args)
    {
        printScore(3);
    }
}
