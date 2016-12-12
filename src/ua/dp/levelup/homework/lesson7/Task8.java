package ua.dp.levelup.homework.lesson7;

/**
 * Created by andreypo on 11/28/2016.
 */
public class Task8
{
    public enum Months
    {
        JANUARY(1, 31, "January", "Январь"),
        FEBRUARY(2, 28, "February", "Февраль"),
        MARCH(3, 31, "March", "Март"),
        APRIL(4, 30, "April", "Апрель"),
        MAY(5, 31, "May", "Май"),
        JUNE(6, 30, "June", "Июнь"),
        JULY(7, 31, "July", "Юиль"),
        AUGUDT(8, 31, "August", "Август"),
        SEPTEMBER(9, 30, "September", "Сентябрь"),
        OCTOBER(10, 31, "October", "Октябрь"),
        NOVEMBER(11, 30, "November", "Ноябрь"),
        DECEMBER(12, 31, "December", "Декабрь");


        private final int monthNumber;
        private final int days;
        private final String enName;
        private final String ruName;

        Months(int monthNumber, int days, String enName, String ruName)
        {
            this.monthNumber = monthNumber;
            this.days = days;
            this.enName = enName;
            this.ruName = ruName;
        }

        public int getMonthNumber()
        {
            return monthNumber;
        }

        public int getDays()
        {
            return days;
        }

        public String getEnName()
        {
            return enName;
        }

        public String getRuName()
        {
            return ruName;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(Months.JANUARY.getRuName());
        System.out.println(Months.DECEMBER.getRuName());
    }
}
