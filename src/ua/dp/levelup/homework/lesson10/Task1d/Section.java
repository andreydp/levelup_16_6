package ua.dp.levelup.homework.lesson10.Task1d;

/**
 * Created by andrey on 08.12.16.
 */
public class Section
{
    Point pointA;
    Point pointB;

    public Section(Point pointA, Point pointB)
    {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Point getPointA()
    {
        return pointA;
    }

    public void setPointA(Point pointA)
    {
        this.pointA = pointA;
    }

    public Point getPointB()
    {
        return pointB;
    }

    public void setPointB(Point pointB)
    {
        this.pointB = pointB;
    }


    @Override
    public String toString()
    {
        return "Section{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Section section = (Section) o;

        return pointA != null && pointB != null && pointA.equals(section.getPointA()) && pointB.equals(section.getPointB());
    }

    @Override
    public int hashCode()
    {
        int result = pointA != null ? pointA.hashCode() : 0;
        result = 31 * result + (pointB != null ? pointB.hashCode() : 0);
        return result;
    }
}
