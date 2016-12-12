package ua.dp.levelup.homework.lesson4;

/**
 * Created by andrey on 17.11.16.
 */
public class ArrayPracticeAdditional4
{
//    4. Определить, имеются ли в одномерном массиве только два одинаковых элемента.

    static boolean checkArray(int[] array)
    {
        int uniqueCounter = 0;
        for (int i = 0; i < array.length; i++)
        {
            int currentValue = array[i];
            for (int j = i; j > 0; j--)
            {
                if (currentValue == array[j - 1])
                {
                    uniqueCounter++;
                }
            }
        }
        return uniqueCounter == 1;
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 2, 6, 6};
        System.out.println(checkArray(arr));
    }
}
