package ua.dp.levelup.homework.lesson8;

/**
 * Created by andrey on 01.12.16.
 */
public class Task7
{
//   7. Дано натуральное число. Определить, сколько раз в нем встречается максимальная цифра
//        (например, для числа 132233 ответ равен 3, для числа 46 336 — 2, для числа 12 345 — 1). *
//    Задачу решить, не используя два прохода по массиву.


    public static int getMaxNumberCount(int number)
    {
        int result = 1;
        int maxDigit = number % 10;
        int nDigit = number / 10;

        while (nDigit != 0)
        {
            nDigit = nDigit / 10;
            int nextDigit = nDigit % 10;
            if (nextDigit == maxDigit)
            {
                result++;
            }
            else if (nextDigit > maxDigit)
            {
                maxDigit = nextDigit;
                result = 1;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(getMaxNumberCount(661673456));
    }
}
