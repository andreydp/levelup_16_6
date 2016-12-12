package ua.dp.levelup.homework.lesson7;

/**
 * Created by andreypo on 11/28/2016.
 */
public class Task5
{
//    5. Дана строка. Написать программу, которая возвращает строку, написанную в обратном порядке.

    public static String reverseString(String string)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = string.length() - 1; i >= 0; i--)
        {
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(reverseString("abcd"));
    }
}
