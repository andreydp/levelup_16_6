package ua.dp.levelup.homework.lesson18;


import java.util.*;

/**
 * Created by andreypo on 1/16/2017.
 */
public class AirLine
{
    private List<Aircraft> aircraftList = new ArrayList<>(10);

    public AirLine(List<Aircraft> aircraftList)
    {
        this.aircraftList = aircraftList;
    }

    public List<Aircraft> getAircraftList()
    {
        return aircraftList;
    }

    public void setAircraftList(List<Aircraft> aircraftList)
    {
        this.aircraftList = aircraftList;
    }

    int calculateTotalCapacity()
    {
        int res = 0;
        for (Aircraft a : getAircraftList())
        {
            res += a.getCapacity();
        }
        return res;
    }

    int calculateTotalMaxWeight()
    {
        int res = 0;
        for (Aircraft a : getAircraftList())
        {
            res += a.getMaxWeight();
        }
        return res;
    }

    public List<Aircraft> sortByMaxDistance()
    {
        List<Aircraft> res = new ArrayList<>(aircraftList);
        Collections.sort(res, getComparator());
        return res;
    }

    private Comparator<Aircraft> getComparator()
    {
        return (a1, a2) ->
                Double.compare(a1.getMaxDistance(), a2.getMaxDistance());
    }

    @Override
    public String toString()
    {
        return "AirLine{" +
                "aircraftList=" + aircraftList +
                '}';
    }
}
