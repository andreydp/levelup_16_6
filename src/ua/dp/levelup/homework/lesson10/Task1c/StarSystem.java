package ua.dp.levelup.homework.lesson10.Task1c;

import java.util.Arrays;

/**
 * Created by andrey on 08.12.16.
 */
public class StarSystem
{
//    3) Создать объект класса Звездная система, используя классы Планета, Звезда, Луна. Методы:
//    вывести на консоль количество планет в звездной системе, название звезды, добавление планеты в систему.

    Star star;
    Planet[] planets;

    public StarSystem(Star star, Planet[] planets)
    {
        this.star = star;
        this.planets = planets;
    }

    int getPlanetsAmount()
    {
        return planets.length;
    }

    String getStarName()
    {
        return star.getName();
    }

    void addPlanet(Planet planet)
    {
        planets = Arrays.copyOf(planets, planets.length + 1);
        planets[planets.length - 1] = planet;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StarSystem that = (StarSystem) o;

        if (star != null ? !star.equals(that.star) : that.star != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(planets, that.planets);

    }

    @Override
    public int hashCode()
    {
        int result = star != null ? star.hashCode() : 0;
        result = 33 * result + Arrays.hashCode(planets);
        return result;
    }

    @Override
    public String toString()
    {
        return "StarSystem{" +
                "star=" + star +
                ", planets=" + Arrays.toString(planets) +
                '}';
    }

    public static void main(String[] args)
    {
        StarSystem s = new StarSystem(new Star("Sun"), new Planet[2]);
        s.planets[0] = new Planet("Earth");
        s.planets[1] = new Moon("Moon");

        System.out.println(s.getPlanetsAmount());
    }
}
