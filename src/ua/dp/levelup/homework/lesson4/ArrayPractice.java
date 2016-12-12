package ua.dp.levelup.homework.lesson4;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by andreypo on 11/16/2016.
 */
public class ArrayPractice
{
    int[] arr;
    byte[] byteArray = new byte[26];
    String[] stringArray = new String[10];
    static final String[] DAYS_OF_WEEK = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    static void printArrayElem(int elemNum, String[] array)
    {
        System.out.println(array[elemNum]);
    }

    static boolean isEven ( int elem)
    {
        return elem % 2 == 0;
    }

    static boolean isPositive (int elem)
    {
        return elem > 0;
    }

    static int compare (int first, int second)
    {
        if (first > second) return 1;
        if (first < second) return -1;
        return 0;
    }

    public static void main(String[] args)
    {
        //Wednesday
        printArrayElem(2, DAYS_OF_WEEK);

        int[] mas = new int[] {37, 0, 50, 46, 34, 46, 0, 13};

        int[] mas2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] mas3 = new int[] {8, 7, 6, 5, 4, 3, 2, 1};

        for (int elem : mas3)
        {
            System.out.println("Elem " + elem + " is " + (isEven(elem) ? "even" : "not even") + " and "
                    + (isPositive(elem) ? "positive" : "negative"));
        }

        //Comparison
        int result = compare(mas3[2], mas3[3]);
        if (result > 0)
        {
            System.out.println(mas3[2] + " > " + mas3[3]);
        }

        //Two-dimensional array
        int[][] biDimension = new int[4][4];
        for (int i = 0; i < biDimension.length; i++)
        {
            for (int k = 0; k < biDimension[i].length; k++)
            {
                biDimension[i][k] =  i + i * k;
            }
        }
        System.out.println("__________________");
        for (int i = 0; i < biDimension.length; i++)
        {
            for (int k = 0; k < biDimension[i].length; k++)
            {
                System.out.print(" " + biDimension[i][k] + " ");
            }
            System.out.println();
        }
//        9.      Дан двумерный массив.
//            а) Вывести на экран элемент, расположенный в правом верхнем углу массива.
//            б) Вывести на экран элемент, расположенный в левом нижнем углу массива.
//
//        10.  Дан двумерный массив.
//            а) Вывести на экран элемент, расположенный в правом нижнем углу массива.
//            б) Вывести на экран элемент, расположенный в левом верхнем углу массива.
        System.out.println(biDimension[0][3]);
        System.out.println(biDimension[3][0]);
        System.out.println(biDimension[3][3]);
        System.out.println(biDimension[0][0]);

//        Дан двумерный массив. Составить программу:
//        а) вывода на экран любого элемента второй строки массива;
//        б) вывода на экран любого элемента массива.

        for (int arr : biDimension[1])
        {
            System.out.println(arr);
        }

        for (int[] aBiDimension : biDimension)
        {
            for (int anABiDimension : aBiDimension)
            {
                System.out.print(" " + anABiDimension + " ");
            }
            System.out.println();
        }
    }
}
