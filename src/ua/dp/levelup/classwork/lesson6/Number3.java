package ua.dp.levelup.classwork.lesson6;

/**
 * Created by java on 22.11.2016.
 */
public class Number3
{
    static boolean isLuckyNumber (int number)
    {
        int firstHalfNumber = number % 1000;
        int secondHalfNumber = number / 1000;

        int firstHalfNumberOne = firstHalfNumber % 100;
        int firstHalfNumberTwo = firstHalfNumberOne / 10;
        int firstHalfNumberThree = firstHalfNumberTwo / 100;
        System.out.println(firstHalfNumber);
        System.out.println(secondHalfNumber);
        System.out.println(firstHalfNumberOne);
        System.out.println(firstHalfNumberTwo);
        return true;
    }

    public static void main(String[] args)
    {
        isLuckyNumber(123456);
    }
}
