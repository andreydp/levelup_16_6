package ua.dp.levelup.homework.lesson10.Task2;

/**
 * Created by andrey on 11.12.16.
 */
public class Vegetable implements Cloneable
{
    private String name;
    private int calories;
    private String color;
    private String taste;

    public Vegetable(String name, int calories, String color, String taste)
    {
        this.name = name;
        this.calories = calories;
        this.color = color;
        this.taste = taste;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getCalories()
    {
        return calories;
    }

    public void setCalories(int calories)
    {
        this.calories = calories;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getTaste()
    {
        return taste;
    }

    public void setTaste(String taste)
    {
        this.taste = taste;
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

        Vegetable vegetable = (Vegetable) o;

        return calories == vegetable.calories && (name != null ? name.equals(vegetable.name) : vegetable.name == null && (color != null ? color.equals(vegetable.color) : vegetable.color == null && (taste != null ? taste.equals(vegetable.taste) : vegetable.taste == null)));

    }

    @Override
    public int hashCode()
    {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + calories;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (taste != null ? taste.hashCode() : 0);
        return result;
    }

    @Override
    public String toString()
    {
        return "Vegetable{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }
}
