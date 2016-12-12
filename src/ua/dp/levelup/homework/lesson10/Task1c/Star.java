package ua.dp.levelup.homework.lesson10.Task1c;

/**
 * Created by andrey on 08.12.16.
 */
public class Star
{
    String name;

    public Star(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Star star = (Star) o;

        return name != null ? name.equals(star.name) : star.name == null;

    }

    @Override
    public int hashCode()
    {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString()
    {
        return "Star{" +
                "name='" + name + '\'' +
                '}';
    }
}
