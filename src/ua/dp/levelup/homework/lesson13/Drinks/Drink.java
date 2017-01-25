package ua.dp.levelup.homework.lesson13.Drinks;

/**
 * Created by andreypo on 12/19/2016.
 */
public class Drink
{
    private String name;
    private int amount;

    public Drink(String name)
    {
        this.name = name;
    }


    public String getName()
    {
        return name;
    }


    public int getAmount()
    {
        return amount;
    }

    public void changeAmount(int amount)
    {
        if (amount < 0 && this.amount - amount < 0)
        {
            throw new RuntimeException("Insufficient drink count!");
        }
        this.amount += amount;
    }

    @Override
    public String toString()
    {
        return "Drink{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drink drink = (Drink) o;
        return name != null ? name.equals(drink.name) : drink.name == null;
    }

    @Override
    public int hashCode()
    {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result;
        return result;
    }
}
