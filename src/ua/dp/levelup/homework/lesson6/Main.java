package ua.dp.levelup.homework.lesson6;

import java.util.*;

/**
 * Created by andrey on 23.11.16.
 */
public class Main
{
    //   1. Дано слово. Добавить к нему в начале и конце столько звездочек, сколько букв в этом слове.
    static String surroundByStars(String word)
    {
        String result = "";
        for (int i = 0; i < word.length(); i++)
        {
            result += "*";
        }
        return result + word + result;
    }

    //    2. Дано название футбольного клуба. Напечатать его на экране "столбиком".
    static void printByLine(String word)
    {
        for (char c : word.toCharArray())
        {
            System.out.println(c);
        }
    }

    //    3. Найти сумму положительных нечетных чисел, меньших 50.
    static int getPositiveSum(int from)
    {
        int result = 0;
        for (int i = from; i > 0; i--)
        {
            if (i % 2 != 0)
            {
                result += i;
            }
        }
        return result;
    }

    //    4. Вася открыл счет в банке 1 марта, вложив 1000 грн. Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. Определить:
//    а) прирост суммы вклада за каждый месяц с 1-го марта до конца года;
    static double[] calculateBankBillProfitByMonth(double deposit, int percentage, int startMonth)
    {
        double[] result = new double[12 - startMonth];
        double currentBalance = deposit;
        for (int i = 0; i < 12 - startMonth; i++)
        {
            currentBalance += currentBalance * percentage / 100;
            if (i == 0)
            {
                result[i] = currentBalance - deposit;
            }
            else
            {
                result[i] = currentBalance - deposit - result[i - 1];
            }
        }
        return result;
    }

    //   4. б) сумму вклада через: полгода, 2 года, 5 лет.
    static double calculateBankBillProfitTotal(double deposit, int percentage, int duration)
    {
        double result = 0;
        if (duration > 0)
        {
            result = deposit + deposit * percentage / 100;
            result += calculateBankBillProfitTotal(result, percentage, --duration);
        }
        return result;
    }

    //    5. Определить, войдет ли в конверт с внутренними размерами a и b мм прямоугольная открытка размером с и d мм.
//    Для размещения открытки в конверте необходим зазор в 1 мм с каждой стороны.
    static boolean checkPostSize(int postSizeA, int postSizeB, int envelopeSizeA, int envelopeSizeB)
    {
        int offset = 1;
        return envelopeSizeA - postSizeA >= offset && envelopeSizeB - postSizeB >= offset;
    }

    //    6. Даны два различных вещественных числа. Определить наибольшее из них применив один неполный условный оператор.
    static double getMaxFromTwoDoubleValues(double first, double second)
    {
        if (first > second)
        {
            return first;
        }
        return second;
    }

    //    7. Записать условие, которое является истинным, когда:
    //    a) только одно из чисел А и В четное;
    static boolean isOneOfValuesEven(int a, int b)
    {
        return (a % 2 == 0 && b % 2 > 0) || (a % 2 > 0 && b % 2 == 0);
    }

    //   7. б) хотя бы одно из чисел А и В положительно;
    static boolean isOneOfValuesPositive(int a, int b)
    {
        return a > 0 || b > 0;
    }

    //    8. Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для значений
    // 1, 2, ..., 10 фунтов (1 фунт = 453 г).

    static void printPoundToKgTable(int poundSizeDepth)
    {
        double poundSize = 0.453d;
        for (int i = 1; i <= poundSizeDepth; i++)
        {
            System.out.println(i + " lbs -> " + i * poundSize + " kg");
        }
    }

    //  9.  Напечатать таблицу перевода 1, 2, ... 20 долларов США в гривны по текущему курсу (значение курса вводится с клавиатуры).

    static void printUAHUSDRate(int dollarsDepth)
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter USD/UAH rate:");
            double usdRate = scan.nextDouble();
            for (int i = 1; i <= dollarsDepth; i++)
            {
                System.out.println(i + " USD -> " + i * usdRate + " UAH");
            }
            scan.close();
        } catch (InputMismatchException e)
        {
            System.out.println("Incorrect rate, try again.");
            printUAHUSDRate(dollarsDepth);
        }
    }

    //  10.   Одноклеточная амеба каждые 3 часа делится на 2 клетки.
    //        Определить, сколько клеток будет через 3, 6, 9, ..., 24 часа, если первоначально была одна амеба.

    static int getAmebaGross(int amebaCount, int splitHours)
    {
        int splitHoursThreshold = 3;
        if (splitHours >= splitHoursThreshold)
        {
            amebaCount = getAmebaGross(amebaCount * 2, splitHours - splitHoursThreshold);
        }
        return amebaCount;
    }

    //    11. В массиве записаны оценки по информатике 22 учеников класса. Определить количество учеников,
    //    оценка которых меньше средней оценки по классу, и вывести номера элементов массива, соответствующих таким ученикам.
    static double getAverageInArray(int[] array)
    {
        double total = 0;
        for (int anArray : array)
        {
            total += anArray;
        }
        return total / array.length;
    }

    static void printBelowAverageStudentScore(int[] score)
    {
        double averageScore = getAverageInArray(score);
        int belowAverageUserCount = 0;
        for (int i = 0; i < score.length; i++)
        {
            if (score[i] < averageScore)
            {
                belowAverageUserCount++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Total below average: " + belowAverageUserCount);
    }

    //    12. Дан массив целых чисел. Определить количество четных элементов и количество элементов, оканчивающихся на цифру 5.
    static void getEvenAndEnding5Elements(int[] array)
    {
        int evenCount = 0;
        int ending5Count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] %2 == 0 ) evenCount++;
            if (array[i] % 10 == 5) ending5Count++;
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Ending by 5 count: " + ending5Count);
    }
    public static void main(String[] args)
    {
//        System.out.println(Arrays.toString(calculateBankBillProfitByMonth(1000, 2, 3)));
//        System.out.println(calculateBankBillProfitTotal(1000, 2, 60));
//        System.out.println(checkPostSize(1, 2, 2, 3));
//        System.out.println(getMaxFromTwoDoubleValues(3.4d, 3.3d));
//        System.out.println(isOneOfValuesEven(1, 2));
//        System.out.println(isOneOfValuesPositive(1, -2));
//        printPoundToKgTable(10);
//        printUAHUSDRate(20);
//        System.out.println(getAmebaGross(1, 24));
//        int[] score = {1, 3, 2, 4, 2, 3, 4, 5, 5, 2, 5, 5, 4, 3, 4, 4, 5, 5, 2, 3, 4, 5};
//        printBelowAverageStudentScore(score);
//        getEvenAndEnding5Elements(score);
    }
}
