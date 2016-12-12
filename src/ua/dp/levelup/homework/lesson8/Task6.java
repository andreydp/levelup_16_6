package ua.dp.levelup.homework.lesson8;

/**
 * Created by andrey on 01.12.16.
 */
public class Task6
{
//    6. Дана последовательность из n вещественных чисел, начинающаяся с отрицательного числа. Определить,
//    какое количество отрицательных чисел записано в начале последовательности. Условный оператор не использовать.

    public static int getNumberOfNegativeElements(double[] array)
    {
        int result = 0;

        int counter = 0;
        while (counter < array.length && array[counter] < 0)
        {
            result++;
            counter++;
        }

        return result;
    }

    public static void main(String[] args)
    {
        double[] arr = {-1.2d, -1.5d, -2.2d, 0d, -3d, 4d};

        System.out.println(getNumberOfNegativeElements(arr));
    }
}
