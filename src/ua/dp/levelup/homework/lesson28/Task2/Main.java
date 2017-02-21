package ua.dp.levelup.homework.lesson28.Task2;

/**
 * Created by andreypo on 2/21/2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            FormulaChecker.printUsage();
        }
        else
        {
            new FormulaChecker().check(args[0], args[1]);
        }
    }
}
