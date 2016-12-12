package ua.dp.levelup.homework.lesson3.task2;

/**
 * Created by andrey on 13.11.16.
 */
public class Fish extends Animal
{
    public Fish(boolean vegetarian, String eats, int noOfLegs)
    {
        super(vegetarian, eats, noOfLegs);
    }

    private Fish()
    {
        super(false, "Humans", 0);
    }

    @Override
    public String toString()
    {
        return "Fish{" +
                ", vegetarian=" + this.isVegetarian() +
                ", eats='" + this.getEats() + '\'' +
                ", noOfLegs=" + this.getNoOfLegs() +
                '}';
    }
}
