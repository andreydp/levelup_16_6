package ua.dp.levelup.homework.lesson8;

/**
 * Created by andrey on 01.12.16.
 */
public class Task9
{
//    9. Дано двузначное число. Необходимо написать программу, которая вернет строковое представление данного числа. Например, дано число 34, его строковое представление - thirty four.

    public static String getStringDigitValue(int digit)
    {
        switch (digit)
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
            case 0:
                return "zero";
        }
        return null;
    }

    public static String getStringNumberValue(int number)
    {
        StringBuilder sb = new StringBuilder();

        int firstDigit = number / 10;
        int secondDigit = number % 10;

        switch (number)
        {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
        }

        switch (firstDigit)
        {
            case 2:
                sb.append("twenty");
                break;
            case 3:
                sb.append("thirty");
                break;
            case 4:
                sb.append("forty");
                break;
            case 5:
                sb.append("fifty");
                break;
            case 6:
                sb.append("sixty");
                break;
            case 7:
                sb.append("seventy");
                break;
            case 8:
                sb.append("eighty");
                break;
            case 9:
                sb.append("ninety");
                break;
        }

        sb.append(" ").append(getStringDigitValue(secondDigit));
        return sb.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(getStringNumberValue(10));
    }
}
