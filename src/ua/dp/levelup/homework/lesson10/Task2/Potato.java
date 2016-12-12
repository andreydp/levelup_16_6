package ua.dp.levelup.homework.lesson10.Task2;

/**
 * Created by andrey on 11.12.16.
 */
public class Potato extends Vegetable implements Cloneable
{
    static final int CALORIES = 30;
    int size = 1;

    public Potato(String name, String color, String taste)
    {
        super(name, CALORIES, color, taste);
    }

    public Potato(String name, String color, String taste, int size)
    {
        super(name, CALORIES * size, color, taste);
        this.size = size;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Potato potato = (Potato) o;

        return size == potato.size;

    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString()
    {
        return "Potato{" +
                "calories= " + getCalories() +
                ", size=" + size +
                '}';
    }
}
