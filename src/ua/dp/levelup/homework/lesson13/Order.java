package ua.dp.levelup.homework.lesson13;

import ua.dp.levelup.homework.lesson13.Drinks.Drink;

/**
 * Created by andreypo on 12/19/2016.
 */
public class Order
{
    private Drink drink;
    private int amount;

    private int ID = 0;

    public Order(Drink drink, int amount)
    {
        this.drink = drink;
        this.amount = amount;
        ++ID;
    }

    public int getID()
    {
        return ID;
    }

    public Drink getDrink()
    {
        return drink;
    }

    public void setDrink(Drink drink)
    {
        this.drink = drink;
    }

    public int getAmount()
    {
        return amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return ID == order.ID;

    }

    @Override
    public int hashCode()
    {
        return ID * 57;
    }

    @Override
    public String toString()
    {
        return "Order{" +
                "drink=" + drink +
                ", amount=" + amount +
                ", ID=" + ID +
                '}';
    }
}
