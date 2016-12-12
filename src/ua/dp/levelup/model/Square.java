package ua.dp.levelup.model;

/**
 * Created by java on 11.11.2016.
 */
public class Square extends Shape
{
    double side;

    public Square ()
    {

    }
    public Square(double side)
    {
        this("Black", side);
    }

    public Square(String color, double side)
    {
        this.color = color;
        this.side = side;
    }

    double getPerimeter()
    {
        return side * 4;
    }
}
