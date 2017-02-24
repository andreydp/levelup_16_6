package ua.dp.levelup.homework.lesson24;


import java.util.Comparator;

/**
 * Created by andreypo on 2/10/2017.
 */
public class Home implements Comparable
{
    private int number;
    private String street;
    private int stageCount;
    private int tenantCount;

    public Home(int number, String street, int stageCount, int tenantCount)
    {
        this.number = number;
        this.street = street;
        this.stageCount = stageCount;
        this.tenantCount = tenantCount;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getStreet()
    {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public int getStageCount()
    {
        return stageCount;
    }

    public void setStageCount(int stageCount)
    {
        this.stageCount = stageCount;
    }

    public int getTenantCount()
    {
        return tenantCount;
    }

    public void setTenantCount(int tenantCount)
    {
        this.tenantCount = tenantCount;
    }

    public static Comparator<Home> streetComparator()
    {
        return (o1, o2) ->
        {
            if (o1.getStreet().equalsIgnoreCase(o2.getStreet())
                    && o1.getNumber() > o2.getNumber())
                return -1;

            if (o1.getStreet().equalsIgnoreCase(o2.getStreet())
                    && o1.getNumber() < o2.getNumber())
                return 1;

            if (o1.getStreet().equalsIgnoreCase(o2.getStreet())
                    && o1.getNumber() == o2.getNumber())
                return 0;

            return o1.getStreet().compareToIgnoreCase(o2.getStreet());
        };
    }

    public static Comparator<Home> numberComparator()
    {
        return (o1, o2) ->
        {
            if (Integer.compare(o1.getNumber(), o2.getNumber()) == 0
                    && o1.getStreet().compareToIgnoreCase(o2.getStreet()) > 0)
                return -1;

            if (Integer.compare(o1.getNumber(), o2.getNumber()) == 0
                    && o1.getStreet().compareToIgnoreCase(o2.getStreet()) < 0)
                return 1;

            if (Integer.compare(o1.getNumber(), o2.getNumber()) == 0
                    && o1.getStreet().compareToIgnoreCase(o2.getStreet()) == 0)
                return 0;

            return Integer.compare(o1.getNumber(), o2.getNumber());
        };
    }

    public static Comparator<Home> tenantComparator()
    {
        return (o1, o2) ->
        {
            if (Integer.compare(o1.getTenantCount(), o2.getTenantCount()) == 0
                    && (o1.getStreet().compareToIgnoreCase(o2.getStreet()) > 0
                    || Integer.compare(o1.getNumber(), o2.getNumber()) > 0))
                return -1;

            if (Integer.compare(o1.getTenantCount(), o2.getTenantCount()) == 0
                    && (o1.getStreet().compareToIgnoreCase(o2.getStreet()) < 0
                    || Integer.compare(o1.getNumber(), o2.getNumber()) < 0))
                return 1;

            if (Integer.compare(o1.getTenantCount(), o2.getTenantCount()) == 0
                    && (o1.getStreet().compareToIgnoreCase(o2.getStreet()) == 0
                    || Integer.compare(o1.getNumber(), o2.getNumber()) == 0))
                return 0;

            return Integer.compare(o1.getTenantCount(), o2.getTenantCount());
        };
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Home home = (Home) o;

        if (number != home.number) return false;
        if (stageCount != home.stageCount) return false;
        if (tenantCount != home.tenantCount) return false;
        return street.equals(home.street);

    }

    @Override
    public int hashCode()
    {
        int result = number;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        return result;
    }

    @Override
    public String toString()
    {
        return "Home{" +
                "number=" + number +
                ", street='" + street + '\'' +
                ", stageCount=" + stageCount +
                ", tenantCount=" + tenantCount +
                '}';
    }

    @Override
    public int compareTo( Object o)
    {
        Home home = (Home) o;
        if (streetComparator().compare(this, home) == 0
                && tenantComparator().compare(this, home) == 0
                && tenantComparator().compare(this, home) == 0
                && numberComparator().compare(this, home) == 0)
            return 0;

        if (streetComparator().compare(this, home) > 0
                || tenantComparator().compare(this, home) > 0
                || tenantComparator().compare(this, home) > 0
                || numberComparator().compare(this, home) > 0)
            return 1;

        if (streetComparator().compare(this, home) < 0
                || tenantComparator().compare(this, home) < 0
                || tenantComparator().compare(this, home) < 0
                || numberComparator().compare(this, home) < 0)
            return -1;

        return 0;
    }
}
