package ua.dp.levelup.homework.lesson13.People;

import ua.dp.levelup.homework.lesson13.Bar;
import ua.dp.levelup.homework.lesson13.Order;

/**
 * Created by andreypo on 12/19/2016.
 */
public class Waiter extends Employee
{

    public Waiter(String name, int age, Bar bar)
    {
        super(name, age, bar);

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
        return "Waiter{name=" + getName() +
                ", age=" + getAge() +
                ", tipProfit=" + getTipProfit() +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Waiter waiter = (Waiter) o;

        return getBar() != null && getName() != null ? getBar().equals(waiter.getBar()) && getName().equals(waiter.getName()) : waiter.getBar() == null;

    }

    @Override
    public int hashCode()
    {
        return getBar() != null ? getBar().hashCode() * 43 * getAge() : 0;
    }
}
