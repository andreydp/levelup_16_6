package ua.dp.levelup.homework.lesson13.People;

import ua.dp.levelup.homework.lesson13.Bar;
import ua.dp.levelup.homework.lesson13.Order;

/**
 * Created by andreypo on 12/19/2016.
 */
public class Barman extends Employee
{
    private String specialDrink;
    Bar bar;

    public Barman(String name, int age, String specialDrink)
    {
        super(name, age);
        this.specialDrink = specialDrink;
    }

    public String getSpecialDrink()
    {
        return specialDrink;
    }

    public void setSpecialDrink(String specialDrink)
    {
        this.specialDrink = specialDrink;
    }

    public void completeOrder(String drinkName, int amount)
    {
        Order[] orders = getBar().getOrders();
        for (int i = 0; i < orders.length; i++)
        {
            if(orders[i].getDrink().getName().equals(drinkName))
            {
                getBar().decreaseDrinkAmount(drinkName, amount);
                getBar().removeOrder(orders[i].getID());
            }
        }
    }

    public Bar getBar()
    {
        return bar;
    }

    public void setBar(Bar bar)
    {
        this.bar = bar;
    }

    @Override
    public String toString()
    {
        return "Barman{" +
                "name=" + getName() +
                " tipProfit=" + getTipProfit() +
                ", specialDrink='" + specialDrink + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Barman barman = (Barman) o;

        return getName() != null ? getName().equals(barman.getName()) && getAge() == barman.getAge() : barman.getName() == null;
    }

    @Override
    public int hashCode()
    {
        return getName() != null ? getName().hashCode() * 43 : 0;
    }
}
