package ua.dp.levelup.homework.lesson10.Task2;

/**
 * Created by andrey on 11.12.16.
 */
public class Pepper extends Vegetable implements Cloneable
{
    boolean bitter;
    int size = 1;

    public Pepper(String name, int calories, String color, String taste)
    {
        super(name, calories, color, taste);
    }

    public Pepper(String name, int calories, String color, String taste, int size, boolean bitter)
    {
        super(name, calories * size, color, taste);
        this.size = size;
        this.bitter = bitter;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public boolean isBitter()
    {
        return bitter;
    }

    public void setBitter(boolean bitter)
    {
        this.bitter = bitter;
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

        Pepper pepper = (Pepper) o;

        return bitter == pepper.bitter && size == pepper.size;
    }

    @Override
    public int hashCode()
    {
        int result = super.hashCode();
        result = 31 * result + (bitter ? 1 : 0);
        result = 31 * result + size;
        return result;
    }

    @Override
    public String toString()
    {
        return "Pepper{" +
                "calories=" + getCalories() +
                ", bitter=" + bitter +
                ", size=" + size +
                '}';
    }
}
