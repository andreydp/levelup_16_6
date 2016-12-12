package ua.dp.levelup.homework.lesson7;

/**
 * Created by andreypo on 11/28/2016.
 */
public class Task7
{
//    7. Дан массив строк. Написать программу, которая:
//    а) выводит на экран значение всех строк через запятую, длина которых больше n.
//        б) выводит на экран значение всех неповторяющихся строк через запятую.

    public static String printCommaSeparatedLine(String[] strings, int minLength)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++)
        {
            if (strings[i].length() > minLength)
            {
                sb.append(strings[i]);
                if (i != strings.length - 1)
                {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public static int containsCount(String[] array, String str)
    {
        int result = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].equals(str))
            {
                result++;
            }
        }
        return result;
    }

    public static String printCommaSeparatedLineUnique(String[] strings)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++)
        {
            if (containsCount(strings, strings[i]) == 1)
            {
                sb.append(strings[i]);
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        String[] strs = {"123", "test", "blablabla", "testString", "test"};

        System.out.println(containsCount(strs, "test"));
        System.out.println(printCommaSeparatedLine(strs, 3));
        System.out.println(printCommaSeparatedLineUnique(strs));
    }
}
