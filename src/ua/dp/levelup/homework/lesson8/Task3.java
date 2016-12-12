package ua.dp.levelup.homework.lesson8;

/**
 * Created by andrey on 01.12.16.
 */
public class Task3
{
// 3.    В массиве из 20 элементов числа образуют неубывающую последовательность. Несколько элементов, идущих подряд, равны между собой. Найти количество таких элементов. Сколько различных чисел имеется в массиве?


    public static void main(String[] args)
    {
        int[] arr = {1, 3, 3, 4, 5, 5, 5, 5, 7, 8, 9, 12};

        int result = 0;
        int prevValue;
        boolean same = false;
        int uniqueDigitCount = 0;

        int counter = 0;

        while (counter < arr.length)
        {
            prevValue = arr[counter];
            counter++;
            if (counter < arr.length && prevValue == arr[counter])
            {
                if (!same)
                {
                    result++;
                }
                same = true;
                result++;
            }
            else
            {
                uniqueDigitCount++;
                same = false;
            }
        }
        System.out.println("Number of repeating elements: " + result);
        System.out.println("Number of unique elements: " + uniqueDigitCount);
    }

}
