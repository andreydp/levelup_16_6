package ua.dp.levelup.homework.lesson7;

import java.util.Scanner;

/**
 * Created by andreypo on 11/28/2016.
 */
public class Task1
{
    //    1. Составить программу, которая в зависимости от порядкового номера месяца (1, 2, ..., 12) выводит на экран количество дней в этом месяце. Рассмотреть два случая:
    //    год не является високосным;
    //2) год может быть високосным (информация об этом вводится в аргументы при запуске программы).

    public static int getNumberOfDaysInMonth(int monthNumber)
    {
        return getNumberOfDaysInMonth(monthNumber, false);
    }

    public static int getNumberOfDaysInMonth(int monthNumber, boolean isLeapYear)
    {
        switch (monthNumber)
        {
            case 1:
                return 31;
            case 2:
                return (isLeapYear) ? 29 : 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
        }
        return 0;
    }

    public static void main(String[] args)
    {
        System.out.println(getNumberOfDaysInMonth(2));
        if (args.length > 0)
        {
            int month = Integer.parseInt(args[0]);
            String leap = args[1];
            switch (leap)
            {
                case "y":
                    System.out.println(getNumberOfDaysInMonth(month, true));
                    break;
                case "n":
                    System.out.println(getNumberOfDaysInMonth(month, false));
                    break;
            }
        }
        else
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter month number:");
            int month = scanner.nextInt();
            System.out.println("Is leap year? (y/n)");
            String isLeapYearStr = scanner.next("[yn]");
            switch (isLeapYearStr)
            {
                case "y":
                    System.out.println(getNumberOfDaysInMonth(month, true));
                    break;
                case "n":
                    System.out.println(getNumberOfDaysInMonth(month, false));
                    break;
            }
        }
    }
}
