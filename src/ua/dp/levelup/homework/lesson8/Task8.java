package ua.dp.levelup.homework.lesson8;

/**
 * Created by andrey on 01.12.16.
 */
public class Task8
{
// 8.   Дано число. Написать программу, которая возвращает его зеркальное отражение в виде числа.

    public static int getReverseNumber(int number)
    {
        int reverse = 0;
        while (number != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        return reverse;
    }

    public static void main(String[] args)
    {
        System.out.println(getReverseNumber(1234));
    }
}
