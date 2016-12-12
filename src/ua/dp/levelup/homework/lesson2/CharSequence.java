package ua.dp.levelup.homework.lesson2;

/**
 * Created by andrey on 07.11.16.
 */
public class CharSequence
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 128; i++)
        {
            char s = (char) i;
            System.out.print(s + " ");
        }
    }
}
