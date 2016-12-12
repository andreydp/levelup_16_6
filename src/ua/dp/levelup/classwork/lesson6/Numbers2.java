package ua.dp.levelup.classwork.lesson6;

/**
 * Created by java on 22.11.2016.
 */
public class Numbers2
{
    static void whichIsGreater (float num1, float num2)
    {
        if (num1 > num2)
        {
            System.out.println("First is greater");
        }
        else if (num2 > num1)
        {
            System.out.println("Second is greater");
        }
        else
        {
            System.out.println("Both are equals");
        }
    }

    public static void main(String[] args)
    {
        float f1 = 1.45f;
        float f2 = 1.46f;
        whichIsGreater(f1, f2);
    }
}
