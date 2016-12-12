package ua.dp.levelup.homework.lesson7;

/**
 * Created by andreypo on 11/28/2016.
 */
public class Task4
{
//    4. Напишите программу для перевода чисел от 1 до 10 в строковое значение. Например, для числа 1 результатом будет строка “one”.

    public static String numberToMnemonicString(int number)
    {
        if (number >= 1 && number <= 10)
        {
            switch (number)
            {
                case 1:
                    return "one";
                case 2:
                    return "two";
                case 3:
                    return "three";
                case 4:
                    return "four";
                case 5:
                    return "five";
                case 6:
                    return "six";
                case 7:
                    return "seven";
                case 8:
                    return "eight";
                case 9:
                    return "nine";
                case 10:
                    return "ten";
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        System.out.println(numberToMnemonicString(2));
    }
}
