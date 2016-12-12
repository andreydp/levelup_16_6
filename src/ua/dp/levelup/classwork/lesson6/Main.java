package ua.dp.levelup.classwork.lesson6;

/**
 * Created by java on 22.11.2016.
 */
public class Main
{
    public static boolean isProgrammersDayMonth (int monthNumber)
    {
        return monthNumber == 9;
    }

    public static void main(String[] args)
    {
        int monthNumber = 9;
        if (isProgrammersDayMonth(monthNumber))
        {
            System.out.println("YEEEAH!");
        }
        else
        {
            System.out.println("DUHHH!!");
        }
    }
}
