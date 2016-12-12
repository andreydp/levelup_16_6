package ua.dp.levelup.homework.lesson10.Task1e;

/**
 * Created by andrey on 09.12.16.
 */
public class Circle
{
    double radius;

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public Circle(int radius)
    {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;

    }

    @Override
    public int hashCode()
    {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString()
    {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
