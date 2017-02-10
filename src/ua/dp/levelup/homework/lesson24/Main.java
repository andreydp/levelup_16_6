package ua.dp.levelup.homework.lesson24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by andreypo on 2/10/2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        HashSet<Home> homeSet = new HashSet<>();
        homeSet.add(new Home(27, "Gagarina", 12, 50));
        homeSet.add(new Home(27, "Panikahi", 12, 150));
        homeSet.add(new Home(28, "Lenina", 12, 150));
        homeSet.add(new Home(12, "Rabochaya", 9, 59));
        homeSet.add(new Home(7, "Glinki", 9, 90));

        homeSet.add(new Home(14, "Gagarina", 20, 60));
        homeSet.add(new Home(15, "Panikahi", 21, 70));
        homeSet.add(new Home(3, "Lenina", 4, 80));
        homeSet.add(new Home(99, "Rabochaya", 1, 125));
        homeSet.add(new Home(123, "glinki", 2, 100));


        LinkedHashSet<Home> homeSet2 = new LinkedHashSet<>();
        homeSet2.add(new Home(27, "Gagarina", 12, 50));
        homeSet2.add(new Home(27, "Panikahi", 12, 150));
        homeSet2.add(new Home(28, "Lenina", 12, 150));
        homeSet2.add(new Home(12, "Rabochaya", 9, 59));
        homeSet2.add(new Home(7, "Glinki", 9, 90));

        homeSet2.add(new Home(14, "Gagarina", 20, 60));
        homeSet2.add(new Home(15, "Panikahi", 21, 70));
        homeSet2.add(new Home(3, "Lenina", 4, 80));
        homeSet2.add(new Home(99, "Rabochaya", 1, 125));
        homeSet2.add(new Home(123, "glinki", 2, 100));


        TreeSet<Home> homeSet3 = new TreeSet<>(Home.streetComparator());
        homeSet3.add(new Home(27, "Gagarina", 12, 50));
        homeSet3.add(new Home(27, "Panikahi", 12, 150));
        homeSet3.add(new Home(28, "Lenina", 12, 150));
        homeSet3.add(new Home(12, "Rabochaya", 9, 59));
        homeSet3.add(new Home(7, "Glinki", 9, 90));

        homeSet3.add(new Home(14, "Gagarina", 20, 60));
        homeSet3.add(new Home(15, "Panikahi", 21, 70));
        homeSet3.add(new Home(3, "Lenina", 4, 80));
        homeSet3.add(new Home(99, "Rabochaya", 1, 125));
        homeSet3.add(new Home(123, "glinki", 2, 100));

        System.out.println(homeSet3.size());
        homeSet3.forEach(System.out::println);

    }
}
