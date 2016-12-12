package ua.dp.levelup.homework.lesson4;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by andreypo on 11/17/2016.
 */
public class ArrayPracticeAdditional1
{
    static int generateRandomValueForArray(int previousValue)
    {
        Random random = new Random();
        int value = random.nextInt();
        if (value == previousValue) value = generateRandomValueForArray(value);
        return value;
    }

    static boolean isInArray(int[] array, int number)
    {
        for (int elem : array)
        {
            if (elem == number)
            {
                return true;
            }
        }
        return false;
    }


    static int[] populateArray(int size)
    {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = generateRandomValueForArray(0);

            while (isInArray(Arrays.copyOfRange(array, 0, i), array[i]))
            {
                array[i] = generateRandomValueForArray(array[i]);
            }

        }
        return array;
    }

    public static void main(String[] args)
    {
        int[] arr = populateArray(20);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
