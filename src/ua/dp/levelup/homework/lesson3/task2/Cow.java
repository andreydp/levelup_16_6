package ua.dp.levelup.homework.lesson3.task2;

/**
 * Created by andrey on 13.11.16.
 */
public class Cow extends Mamal
{
    //Attention!!! This is super a cow, nothing similar can be found in real world!
    boolean hoof = true;

    public Cow(boolean vegetarian, String eats)
    {
        super(vegetarian, eats, 4);
        this.hoof = true;
    }

    public Cow(boolean vegetarian, String eats, int noOfLegs, boolean hoof)
    {
        super(vegetarian, eats, noOfLegs);
        this.hoof = hoof;
    }

    public Cow(boolean hoof)
    {
        super(true, "Grass", 4);
        this.hoof = hoof;
    }

    private Cow()
    {
        super(true, "Grass", 4);
    }

    public boolean hoof()
    {
        return hoof;
    }

    public boolean isHoof()
    {
        return hoof;
    }

    @Override
    public String toString()
    {
        return "Cow{" +
                "hoof=" + hoof +
                ", vegetarian=" + this.isVegetarian() +
                ", eats='" + this.getEats() + '\'' +
                ", noOfLegs=" + this.getNoOfLegs() +
                '}';
    }
}
