package ua.dp.levelup.homework.lesson4;

import java.util.Arrays;

/**
 * Created by andrey on 17.11.16.
 */
public class ArrayPracticeAdditional3
{
    //    Рост 22 учеников класса представлен в виде массива. Рост мальчиков условно задан отрицательными числами. Определить средний рост мальчиков и средний рост девочек.
    static int[] studentsHeight = {120, 130, -137, 140, 150, 121, 120, -143, -144, -150, 133, 134, -155, 160, 124, -134, 133, 145, 148, 150, -148, 137};

    public static void main(String[] args)
    {
        int boys = 0;
        int girls = 0;
        int totalBoysHeight = 0;
        int totalGirlsHeight = 0;
        double averageBoyHeight = 0d;
        double averageGirlHeight = 0d;
        for (int i = 0; i < studentsHeight.length; i++)
        {
            if (studentsHeight[i] > 0)
            {
                girls++;
                totalGirlsHeight += studentsHeight[i];
            }
            if (studentsHeight[i] < 0)
            {
                boys++;
                totalBoysHeight += studentsHeight[i];
            }
        }

        averageBoyHeight = Math.abs((double) totalBoysHeight / boys);
        averageGirlHeight = (double) totalGirlsHeight / girls;

        System.out.println("AverageGirlHeight=" + averageGirlHeight + " AverageBoyHeight=" + averageBoyHeight);
    }
}
