package ua.dp.levelup.homework.lesson3.task2;

/**
 * Created by andrey on 13.11.16.
 */
public class Bird extends Animal
{
    boolean fly = true;

    public Bird(boolean vegetarian, String eats, int noOfLegs)
    {
        super(vegetarian, eats, noOfLegs);
    }

    public Bird(boolean vegetarian, String eats, int noOfLegs, boolean fly)
    {
        super(vegetarian, eats, noOfLegs);
        this.fly = fly;
    }

    public Bird(String eats, boolean fly)
    {
        super(false, eats, 2);
        this.fly = fly;
    }

    public Bird(boolean fly)
    {
        super(true, "Grain", 2);
        this.fly = false;
    }

    private Bird()
    {
        super(true, "Grass", 2);
    }

    public boolean canFly()
    {
        return fly;
    }

    @Override
    public String toString()
    {
        return "Bird{" +
                "fly=" + fly +
                ", vegetarian=" + this.isVegetarian() +
                ", eats='" + this.getEats() + '\'' +
                ", noOfLegs=" + this.getNoOfLegs() +
                '}';
    }
}
