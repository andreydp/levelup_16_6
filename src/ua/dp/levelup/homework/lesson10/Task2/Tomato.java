package ua.dp.levelup.homework.lesson10.Task2;

/**
 * Created by andrey on 11.12.16.
 */
public class Tomato extends Vegetable
{
    int size = 1;
    static final int CALORIES = 10;

    public Tomato(String name, String color, String taste)
    {
        super(name, CALORIES, color, taste);
        setCalories(getCalories() * this.size);
    }

    public Tomato(String name, int calories, String color, String taste, int size)
    {
        super(name, calories, color, taste);
        this.size = size;
        setCalories(getCalories() * size);
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

        Tomato tomato = (Tomato) o;

        return size == tomato.size;

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
        return "Tomato{" +
                "calories=" + getCalories() +
                ", size=" + size +
                '}';
    }
}
