package ua.dp.levelup.homework.lesson8;

/**
 * Created by andrey on 01.12.16.
 */
public class Task5
{
//   5. Дана непустая последовательность целых чисел, оканчивающаяся нулем. Найти:
//    а) сумму всех чисел последовательности;
//    б) количество всех чисел последовательности.

    public static void printArrayInfo(int[] array)
    {
        int sum = 0;
        int num = 0;

        for (int elem : array)
        {
            sum += elem;
            num++;
        }

        System.out.println("Sum: " + sum + " Num: " + num);
    }

    public static void main(String[] args)
    {
        printArrayInfo(new int[]{1, 3, 5, 1, 2, 3, 0});
    }
}
