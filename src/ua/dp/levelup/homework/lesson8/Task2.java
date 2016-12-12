package ua.dp.levelup.homework.lesson8;

/**
 * Created by andrey on 01.12.16.
 */
public class Task2
{
    //  2.   Найти среднее арифметическое элементов массива, меньших некоторого числа m. * Решить задачу при помощи циклов while и for-each

    public static int getAverageInArray(int[] arr, int minValue)
    {
        int result = 0;
        int counter = 0;
        for (int i : arr)
        {
            if (i < minValue)
            {
                result += i;
                counter++;
            }
        }
        if (counter > 0) return result / counter;
        else return result;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 3, 5, 10, 11, 12};
        System.out.println(getAverageInArray(arr, 10));
    }

}
