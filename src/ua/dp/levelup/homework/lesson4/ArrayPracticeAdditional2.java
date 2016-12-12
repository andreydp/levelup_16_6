package ua.dp.levelup.homework.lesson4;

import java.util.Arrays;

/**
 * Created by andreypo on 11/17/2016.
 */

//2. Дан массив целых чисел.
public class ArrayPracticeAdditional2
{
    //      а) Все элементы, кратные числу 10, заменить нулем.
    static int[] replaceTenByZero(int[] array)
    {
        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < newArray.length; i++)
        {
            if (newArray[i] % 10 == 0)
            {
                newArray[i] = 0;
            }
        }
        return newArray;
    }

    //      б) Все нечетные элементы удвоить, а четные уменьшить вдвое.
    static int[] doEvenDivideMultiply(int[] array)
    {
        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < newArray.length; i++)
        {
            if (newArray[i] % 2 == 0)
            {
                newArray[i] /= 2;
            } else
            {
                newArray[i] *= 2;
            }
        }
        return newArray;
    }

    //      в) Нечетные элементы уменьшить на m, а элементы с нечетными номерами увеличить на n.
    static int[] doEvenDecreaseIncrease(int[] array, int m, int n)
    {
        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < newArray.length; i++)
        {
            if (newArray[i] % 2 != 0)
            {
                newArray[i] -= m;
            }
            if (i % 2 == 0)
            {
                newArray[i] += n;
            }
        }
        return newArray;
    }

    public static void main(String[] args)
    {
        int[] initialArray = {1, 3, 5, 10, 20, 30, 40, 44, 55, 60, 71};
        System.out.println(Arrays.toString(initialArray));
        System.out.println(Arrays.toString(replaceTenByZero(initialArray)));
        System.out.println(Arrays.toString(doEvenDivideMultiply(initialArray)));
        System.out.println(Arrays.toString(doEvenDecreaseIncrease(initialArray, 1, 2)));
    }
}
