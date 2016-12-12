package ua.dp.levelup.classwork.lesson6;

/**
 * Created by java on 22.11.2016.
 */
public class Numbers
{
    public static String whichIsGreater(int num)
    {
        String result;
        int secondDigit = num % 10;
        int firstDigit = num / 10;

        if (secondDigit > firstDigit)
        {
            result = "Second digit is greater";
        }
        else if (secondDigit < firstDigit)
        {
            result = ("First digit is greater");
        }
        else
        {
            result = "Digits are equals";
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(whichIsGreater(76));
    }
}
