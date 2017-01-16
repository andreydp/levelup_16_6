package ua.dp.levelup.homework.lesson18;

import ua.dp.levelup.homework.lesson18.impl.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andreypo on 1/16/2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        List<Aircraft> aircrafts = new ArrayList<>();
        aircrafts.add(new Boeing747(1100, 120_000, 500, 400, 60, 14_000, 12_000, 600));
        aircrafts.add(new AirbusA380(1200, 160_000, 600, 600, 90, 16_000, 13_000, 900));
        aircrafts.add(new Antonov225(1000, 860_000, 1600, 100, 900, 12_000, 11_000, 2500));
        aircrafts.add(new BoeingC17(900, 660_000, 1400, 100, 800, 10_000, 11_000, 2000));
        aircrafts.add(new RaptorF22(1900, 20_000, 2000, 2, 2, 5000, 15_000, "M61A2 Vulcan"));
        aircrafts.add(new Sukhoi25(1700, 10_000, 1800, 2, 3, 5000, 16_000, "Х-25МЛ"));

        AirLine airLine = new AirLine(aircrafts);

        System.out.println(airLine);
        System.out.println(airLine.sortByMaxDistance());
        System.out.println(airLine.calculateTotalCapacity());
        System.out.println(airLine.calculateTotalMaxWeight());
    }
}
