package ua.dp.levelup.homework.lesson3.task2;

/**
 * Created by andrey on 13.11.16.
 */
public class Shark extends Fish
{
    boolean isPredator = true;

    public boolean isPredator()
    {
        return isPredator;
    }

    public Shark(boolean vegetarian, String eats, int noOfLegs, boolean isPredator)
    {
        super(vegetarian, eats, noOfLegs);
        this.isPredator = isPredator;
    }

    public Shark(String eats)
    {
        this(eats, true);
    }

    public Shark(String eats, boolean isPredator)
    {
        super(!isPredator, eats, 0);
    }

    public Shark(boolean isPredator)
    {
        this("Another fish", isPredator);
    }

    private Shark()
    {
        super(false, "Humans", 0);
    }

    @Override
    public String toString()
    {
        return "Shark{" +
                "isPredator=" + isPredator +
                ", vegetarian=" + this.isVegetarian() +
                ", eats='" + this.getEats() + '\'' +
                ", noOfLegs=" + this.getNoOfLegs() +
                '}';
    }
}
