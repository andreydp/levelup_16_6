package ua.dp.levelup.homework.lesson8;

/**
 * Created by andrey on 01.12.16.
 */
public class Task10
{
//    10. Написать программу определения оценки студента по его рейтингу, на основе следующих правил:

    public static char getStudentScore(int rating)
    {
        if (rating >= 0 && rating <= 19) return 'F';
        if (rating >= 20 && rating <= 39) return 'E';
        if (rating >= 40 && rating <= 59) return 'D';
        if (rating >= 60 && rating <= 74) return 'C';
        if (rating >= 75 && rating <= 89) return 'B';
        if (rating >= 90 && rating <= 100) return 'A';

        return 0;
    }

    public static void main(String[] args)
    {
        System.out.println(getStudentScore(100));
    }
}
