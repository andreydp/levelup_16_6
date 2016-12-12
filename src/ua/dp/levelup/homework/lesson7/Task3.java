package ua.dp.levelup.homework.lesson7;

/**
 * Created by andreypo on 11/28/2016.
 */
public class Task3
{
//3. Дано целое число k (1 <= k <= 365). Определить, каким днем недели (понедельником, вторником, ..., субботой или воскресеньем) является k-й день невисокосного года, в котором 1 января:
//    а) понедельник;
//    б) i-й день недели (если 1 января — понедельник, то d=1 , если вторник — d=2, ..., если воскресенье —  d= 7).

    public static String getDayNameByDayNumber(int dayNumber)
    {
        return getDayNameByDayNumber(dayNumber, 1);
    }

    public static String getDayNameByDayNumber(int dayNumber, int jan1DayNumber)
    {
        int dayWeek = (dayNumber + jan1DayNumber - 1) % 7;
        if(dayNumber < 1 || dayNumber > 365) return null;
        switch (dayWeek)
        {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
        }
        return null;
    }

    public static void main(String[] args)
    {
//        System.out.println(getDayNameByDayNumber(29));
//        System.out.println(getDayNameByDayNumber(28, 1));
//        System.out.println(getDayNameByDayNumber(28, 2));
        System.out.println(getDayNameByDayNumber(370));
    }
}
