package ua.dp.levelup.homework.lesson10.Task1c;

/**
 * Created by andrey on 08.12.16.
 */
public class Planet
{
    //    3) Создать объект класса Звездная система, используя классы Планета, Звезда, Луна. Методы:
//    вывести на консоль количество планет в звездной системе, название звезды, добавление планеты в систему.
    String name;

    public Planet(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Planet planet = (Planet) o;

        return name != null ? name.equals(planet.name) : planet.name == null;

    }

    public String getName()
    {
        return name;
    }

    @Override
    public int hashCode()
    {
        int salt = 77;
        return name != null ? name.hashCode() * salt : 0;
    }

    @Override
    public String toString()
    {
        return "Planet{" +
                "name='" + name + '\'' +
                '}';
    }
}
