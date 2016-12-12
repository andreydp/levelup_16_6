package ua.dp.levelup.homework.lesson4;

/**
 * Created by andrey on 17.11.16.
 */
public class ArrayPracticeAdditional6
{
//    6. Дан массив целых чисел. Рассмотреть отрезки массива (группы идущих подряд чисел), состоящие из нечетных чисел. Получить наибольшую из длин рассматриваемых отрезков.

    static int maxNotEventLength(int[] array)
    {
        int maxLength = 0;
        int currentLength = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 > 0)
            {
                currentLength++;
                if (maxLength < currentLength)
                {
                    maxLength = currentLength;
                }
            } else
            {
                currentLength = 0;
            }
        }
        return maxLength;
    }

    public static void main(String[] args)
    {
        int arr[] = {1, 3, 5, 7, 9, 2, 3, 5, 7, 9, 11, 13, 15, 2, 1, 3, 5, 7, 9, 11, 13, 15, 17};
        System.out.println(maxNotEventLength(arr));
    }
}
