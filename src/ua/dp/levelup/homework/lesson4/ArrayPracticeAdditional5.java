package ua.dp.levelup.homework.lesson4;

/**
 * Created by andreypo on 11/17/2016.
 */
public class ArrayPracticeAdditional5
{
    //   В массиве из 30 элементов числа образуют неубывающую последовательность. Найти количество различных чисел в массиве.
    static int countUniqueValuesInArray(int[] array)
    {
        int result = array.length;

        for (int i = 0; i < array.length; i++)
        {
            int currentValue = array[i];
            for (int j = 0; j < array.length; j++)
            {
                if (j == i) continue;
                if (array[j] == currentValue)
                {
                    result--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 1, 2, 5, 6, 7, 7, 10, 14, 18, 20, 22, 22, 30, 32, 32, 48, 50, 50, 52, 60, 62, 64, 67, 69, 70, 70, 80, 90, 100};
        System.out.println(countUniqueValuesInArray(arr));
    }

}
