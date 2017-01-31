package ua.dp.levelup.homework.lesson21;

/**
 * Created by java on 27.01.2017.
 */
public class Main
{
    static int sum (int n)
    {
        if (n < 10) return n;
        return sum(n / 10) + n % 10;
    }

    public static void main(String[] args)
    {
        System.out.println(sum(775));
    }
}
