package ua.dp.levelup.homework.lesson10.Task1c;

/**
 * Created by andrey on 08.12.16.
 */
public class Moon extends Planet
{
    String name;

    public Moon(String name)
    {
        super(name);
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Moon{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Moon moon = (Moon) o;

        return name != null ? name.equals(moon.name) : moon.name == null;

    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
