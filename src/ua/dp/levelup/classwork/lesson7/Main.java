package ua.dp.levelup.classwork.lesson7;

/**
 * Created by java on 25.11.2016.
 */
public class Main
{
    static void printDayByNumber(int day)
    {
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday".intern());
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Unknown");
        }
    }

    static void printSquare(int size)
    {
        for (int i = 1; i <= size; i++)
        {
            for (int k = 1; k <= size; k++)
            {
                if (i == 1 || i == size)
                {
                    System.out.print("*");
                }
                else if (k > 1 && k < size)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
//        for (int i = 0; i < 4; i++)
//        {
//            System.out.print("*");
//            for (int k = 0; i - k > 0; k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println();
        printSquare(10);
    }
}
