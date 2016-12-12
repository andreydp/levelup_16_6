package ua.dp.levelup.homework.lesson1;

/**
 * Created by andreypo on 11/7/2016.
 */
public class EvenChecker
{
    private static boolean isEven(int digit)
    {
        return digit % 2 == 0;
    }

    public static void main(String[] args)
    {
        int digits[] = {5, 6, 7, 8};

        for (int digit : digits)
        {
            if (EvenChecker.isEven(digit))
            {
                System.out.println(digit + " is even!");
            } else
            {
                System.out.println(digit + " is not even!");
            }
        }
    }
}
