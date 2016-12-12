package ua.dp.levelup.classwork.lesson7;

/**
 * Created by java on 25.11.2016.
 */
public class Cards
{
    static String getCardM(int mast)
    {
        switch ((mast))
        {
            case 1:
                return "Pik";
            case 2:
                return "Tef";
            case 3:
                return "Bubn";
            case 4:
                return "Cherv";
        }
        return null;
    }
}
