package ua.dp.levelup.homework.lesson10.Task1e;

/**
 * Created by andrey on 09.12.16.
 */
public class Ring
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

    public Ring(int radius)
    {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ring ring = (Ring) o;

        return Double.compare(ring.radius, radius) == 0;

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
        return "Ring{" +
                "radius=" + radius +
                '}';
    }
}
