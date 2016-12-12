package ua.dp.levelup.homework.lesson10.Task1d;

import java.util.Arrays;

/**
 * Created by andrey on 08.12.16.
 */
public class Square
{

    //TODO: generify rotate, make it graphic

    int size;

    Section sectionA;
    Section sectionB;
    Section sectionC;
    Section sectionD;

    static double beginX = 0;
    static double beginY = 0;
    String color;

    public Square(int size)
    {
        this(size, beginX, beginY);
    }

    public Square(int size, double beginX, double beginY)
    {
        this.size = size;
        sectionA = new Section(new Point(beginX, beginY), new Point(beginX, beginY + size));
        sectionB = new Section(sectionA.getPointB(), new Point(beginX + size, beginY + size));
        sectionC = new Section(sectionB.getPointB(), new Point(beginX + size, beginY));
        sectionD = new Section(sectionC.getPointB(), new Point(beginX, beginY));
    }

    void decreaseSize(int by)
    {
        double beginX = sectionA.getPointA().getX() > 0 ? sectionA.getPointA().getX() - by : sectionA.getPointA().getX() - by;
        double beginY = sectionA.getPointA().getY() > 0 ? sectionA.getPointA().getY() - by : sectionA.getPointA().getY() + by;
        this.size -= by;

        sectionA = new Section(new Point(beginX, beginY), new Point(beginX, beginY + size - by));
        sectionB = new Section(sectionA.getPointB(), new Point(beginX + size - by, beginY + size - by));
        sectionC = new Section(sectionB.getPointB(), new Point(beginX + size - by, beginY));
        sectionD = new Section(sectionC.getPointB(), new Point(beginX, beginY));
    }

    void increaseSize(int by)
    {
        double beginX = sectionA.getPointA().getX() > 0 ? sectionA.getPointA().getX() + by : sectionA.getPointA().getX() - by;
        double beginY = sectionA.getPointA().getY() > 0 ? sectionA.getPointA().getY() + by : sectionA.getPointA().getY() - by;
        this.size += by;

        sectionA = new Section(new Point(beginX, beginY), new Point(beginX, beginY + size));
        sectionB = new Section(sectionA.getPointB(), new Point(beginX + size, beginY + size));
        sectionC = new Section(sectionB.getPointB(), new Point(beginX + size, beginY));
        sectionD = new Section(sectionC.getPointB(), new Point(beginX, beginY));
    }

    void setColor(String color)
    {
        this.color = color;
    }

    void rotate(double rad)
    {
        System.out.println("Square rotated by " + rad);
    }

    @Override
    public String toString()
    {
        return "Square{" +
                "size=" + size +
                ", sectionA=" + sectionA +
                ", sectionB=" + sectionB +
                ", sectionC=" + sectionC +
                ", sectionD=" + sectionD +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return size == square.size && (sectionA != null ? sectionA.equals(square.sectionA) : square.sectionA == null && (sectionB != null ? sectionB.equals(square.sectionB) : square.sectionB == null && (sectionC != null ? sectionC.equals(square.sectionC) : square.sectionC == null && (sectionD != null ? sectionD.equals(square.sectionD) : square.sectionD == null && (color != null ? color.equals(square.color) : square.color == null)))));
    }

    @Override
    public int hashCode()
    {
        int result = size;
        result = 31 * result + (sectionA != null ? sectionA.hashCode() : 0);
        result = 31 * result + (sectionB != null ? sectionB.hashCode() : 0);
        result = 31 * result + (sectionC != null ? sectionC.hashCode() : 0);
        result = 31 * result + (sectionD != null ? sectionD.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    public static void main(String[] args)
    {
        Square s = new Square(5);
        System.out.println(s);
        s.decreaseSize(1);
        System.out.println(s);
        s.increaseSize(1);
        System.out.println(s);
    }
}
