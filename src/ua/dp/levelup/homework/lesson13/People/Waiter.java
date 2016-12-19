package ua.dp.levelup.homework.lesson13.People;

import ua.dp.levelup.homework.lesson13.Bar;
import ua.dp.levelup.homework.lesson13.Order;

/**
 * Created by andreypo on 12/19/2016.
 */
public class Waiter extends Employee
{
    private Bar bar;

    public Bar getBar()
    {
        return bar;
    }

    public void setBar(Bar bar)
    {
        this.bar = bar;
    }

    public Waiter(String name, int age)
    {
        super(name, age);

    }


    public void takeTip(int amount)
    {
        getBar().addTip(amount);
    }

    public void takeOrder(Order order)
    {
        getBar().addOrder(order);
    }

    @Override
    public String toString()
    {
        return "Waiter{" +
                " tipProfit=" + getTipProfit() +
                "name=" + getName() +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Waiter waiter = (Waiter) o;

        return bar != null && getName() != null ? bar.equals(waiter.bar) && getName().equals(waiter.getName()) : waiter.bar == null;

    }

    @Override
    public int hashCode()
    {
        return bar != null ? bar.hashCode() : 0;
    }
}
