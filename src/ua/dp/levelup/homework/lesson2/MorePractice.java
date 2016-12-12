package ua.dp.levelup.homework.lesson2;

/**
 * Created by andrey on 10.11.16.
 */
public class MorePractice
{
    public static void main(String[] args)
    {
/*
        Из трехзначного числа x вычли его последнюю цифру. Когда результат разде-
            лили на 10, а к частному слева приписали последнюю цифру числа x, то полу-
            чилось число 237. Найти число x.
*/
        int result = 237;
        int xLastDigit = result / 100;
        int x = result % 100 * 10 + xLastDigit;
        System.out.println(x);

        for (int i = 0; i < 10000; i++)
        {
            byte[] mas = new byte[10_000_000];
        }
    }
}
