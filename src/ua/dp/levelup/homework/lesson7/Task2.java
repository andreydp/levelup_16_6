package ua.dp.levelup.homework.lesson7;

/**
 * Created by andreypo on 11/28/2016.
 */
public class Task2
{
//    2. Мастям игральных карт условно присвоены следующие порядковые номера: масти "пики" — 1,
//    масти "трефы" — 2, масти "бубны" — 3, масти "червы" — 4, а достоинству карт:
//        "валету" — 11, "даме" — 12, "королю" — 13, "тузу" — 14
//        (порядковые номера карт остальных достоинств соответствуют их названиям: "шестерка", "девятка" и т. п.).
//    По заданным номеру масти m (1 <= m <=  4) и номеру достоинства карты k (6 <= k <= 14) определить полное название
//        (масть и достоинство) соответствующей карты в виде "Дама пик", "Шестерка бубен" и т. п.

    public static String getFullCardName(int color, int card)
    {
        if ((color >= 1) && (color <= 4) && (card >= 6) && (card <= 14))
        {
            switch (card)
            {
                case 6:
                    return "шестерка" + " " + getCardColorName(color);
                case 7:
                    return "семерка" + " " + getCardColorName(color);
                case 8:
                    return "восьмерка" + " " + getCardColorName(color);
                case 9:
                    return "девятка" + " " + getCardColorName(color);
                case 10:
                    return "десятка" + " " + getCardColorName(color);
                case 11:
                    return "валет" + " " + getCardColorName(color);
                case 12:
                    return "дама" + " " + getCardColorName(color);
                case 13:
                    return "король" + " " + getCardColorName(color);
                case 14:
                    return "туз" + " " + getCardColorName(color);
            }
        }
        else
        {
            return null;
        }
        return null;
    }

    public static String getCardColorName(int color)
    {
        switch (color)
        {
            case 1:
                return "пики";
            case 2:
                return "трефы";
            case 3:
                return "бубны";
            case 4:
                return "червы";
        }
        return null;
    }

    public static void main(String[] args)
    {
        System.out.println(getFullCardName(1, 11));
    }
}
