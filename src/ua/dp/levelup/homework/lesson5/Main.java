package ua.dp.levelup.homework.lesson5;

import java.util.Arrays;

/**
 * Created by andreypo on 11/21/2016.
 */
public class Main
{

    //    3. Написать программу для вывода на экран всех элементов массива строк через запятую.
    public static void arrayToCommaSeparatedString(String[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
            if (i != array.length - 1)
            {
                System.out.print(", ");
            }
        }
    }

    //    4. Написать программу для вывода на экран всех элементов массива чисел в обратном порядке.
    public static void printArrayReverseOrder(int[] array)
    {
        for (int i = array.length - 1; i >= 0; i--)
        {
            System.out.print(array[i]);
            if (i != 0)
            {
                System.out.print(", ");
            }
        }
    }

    //    5. Написать программу для заполнения 20 элементов массива чисел с шагом 3, первым элементом которого будет 5.
    public static int[] fillArray(int firstElement, int size, int offset)
    {
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            if (i == 0)
            {
                array[i] = firstElement;
            }
            else
            {
                array[i] = array[i - 1] + offset;
            }
        }
        return array;
    }

    //    7. Выяснить, верно ли, что сумма элементов массива есть неотрицательное число, используя тернарный оператор.
    public static boolean isSumOfArrayPositive(int[] array)
    {
        int sum = 0;
        for (int elem : array)
        {
            sum += elem;
        }

        return sum > 0 ? true : false;
    }

    public static int findMaxElemInArray(int[] array)
    {
        int result = 0;
        for (int i = 0; i < array.length; i++)
        {
            result = (i == 0) ? array[0] : array[i] > result ? array[i] : result;
        }
        return result;
    }

    public static int findMinElemInArray(int[] array)
    {
        int result = 0;
        for (int i = 0; i < array.length; i++)
        {
            result = (i == 0) ? array[0] : array[i] < result ? array[i] : result;
        }
        return result;
    }

    public static int findDifferenceBetweenMaxAndMinElements(int[] array)
    {
        int difference = 0;
        int maxElem = findMaxElemInArray(array);
        int minElem = findMinElemInArray(array);
        difference = maxElem - minElem;
        return difference;
    }

    public static int getMinElemIndex(int[] array)
    {
        int index = 0;
        int minElem = findMinElemInArray(array);
        for (int i = 0; i < array.length; i++)
        {
            index = (array[i] == minElem) ? i : 0;
        }
        return index;
    }

    public static int getMaxElemIndex(int[] array)
    {
        int index = 0;
        int minElem = findMaxElemInArray(array);
        for (int i = 0; i < array.length; i++)
        {
            index = (array[i] == minElem) ? i : 0;
        }
        return index;
    }

    public static int[] getMinAndMaxElemIndexes(int[] array)
    {
        int[] result = new int[2];
        result[0] = getMinElemIndex(array);
        result[1] = getMaxElemIndex(array);
        return result;
    }

    public static void main(String[] args)
    {
        //  1.      Вывести на экран возрастающую последовательность из 10 чисел начиная с 15
        {
            int number = 15;
            for (int i = 0; i < 10; i++)
            {
                System.out.print(number + i + " ");
            }
        }

        System.out.println();
        //  2.  Вывести на экран убывающую последовательность нечетных чисел в интервале от 33 до 15.
        {
            for (int i = 33; i >= 15; i--)
            {
                if (i % 2 > 0)
                {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println();
        {
            //    3. Написать программу для вывода на экран всех элементов массива строк через запятую.
            arrayToCommaSeparatedString(new String[]{"First", "Second", "Third"});

        }

        System.out.println();
        {
            //    4.        Написать программу для вывода на экран всех элементов массива чисел в обратном порядке.
            printArrayReverseOrder(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        }

        System.out.println();
        {
            //    5.    Написать программу для заполнения 20 элементов массива чисел с шагом 3, первым элементом которого будет 5.
            System.out.println(Arrays.toString(fillArray(5, 20, 3)));
        }

        {
            //      6.  Написать программу для заполнения массива чисел из 10 элементов значениями переменной а, при условии что а является членом арифметической прогрессии 2а-1, а1=4.
            int a = 4;
            int offset = (2 * a) - 1;
            int size = 10;
            System.out.println(Arrays.toString(fillArray(a, size, offset)));
        }

        {
//            7. Выяснить, верно ли, что сумма элементов массива есть неотрицательное число, используя тернарный оператор.
            int[] arr1 = new int[]{1, 3, 5, -100, 6, 7, 8};
            System.out.println(isSumOfArrayPositive(arr1));
        }

        {
/*
            8. Дан массив чисел. Используя тернарный оператор определить:
            а) максимальный элемент;
            б) минимальный элемент;
            в) на сколько максимальный элемент больше минимального;
            г)  индекс максимального элемента;
            д) индекс минимального и индекс максимального элементов.
*/
            int[] arr2 = {1, 2, 3, -3};
            System.out.println(findMaxElemInArray(arr2));
            System.out.println(findMinElemInArray(arr2));
            System.out.println(findDifferenceBetweenMaxAndMinElements(arr2));
            System.out.println(findMinElemInArray(arr2));
            System.out.println(Arrays.toString(getMinAndMaxElemIndexes(arr2)));
        }
    }
}
