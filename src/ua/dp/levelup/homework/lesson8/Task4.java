package ua.dp.levelup.homework.lesson8;

/**
 * Created by andrey on 01.12.16.
 */
public class Task4
{
//    В массиве хранится информация о максимальной скорости каждой из 40 марок легковых автомобилей. Определить скорости двух самых быстрых автомобилей. * Задачу решить, не используя два прохода по массиву.

    public static int carsSpeed[] = {100, 110, 120, 90, 112, 114, 115};


    public static void getTwoMostSpeedyCars(int array[])
    {
        int firstMost = 0;
        int secondMost = 0;

        int counter = 0;

        while (counter < array.length)
        {
            if (counter == 0)
            {
                firstMost = array[counter];
            }
            else
            {
                if (array[counter] > firstMost)
                {
                    secondMost = firstMost;
                    firstMost = array[counter];
                }
                else if (array[counter] > secondMost)
                {
                    secondMost = array[counter];
                }
            }
            counter++;
        }
        System.out.println("First: " + firstMost + " Second: " + secondMost);
    }

    public static void main(String[] args)
    {
        getTwoMostSpeedyCars(carsSpeed);
    }
}
