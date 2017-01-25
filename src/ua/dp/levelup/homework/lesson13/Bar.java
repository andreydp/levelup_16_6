package ua.dp.levelup.homework.lesson13;

import ua.dp.levelup.homework.lesson13.Drinks.Drink;
import ua.dp.levelup.homework.lesson13.People.Barman;
import ua.dp.levelup.homework.lesson13.People.Employee;
import ua.dp.levelup.homework.lesson13.People.Positions;
import ua.dp.levelup.homework.lesson13.People.Waiter;

import java.util.Arrays;

/**
 * Created by andreypo on 12/19/2016.
 */
public class Bar
{
    private String name;
    private Barman[] barmen = new Barman[0];
    private Waiter[] waiters = new Waiter[0];
    private Drink[] drinks = new Drink[0];

    private int tipAMount = 0;
    private Order[] orders = new Order[0];

    public Bar(String name)
    {
        this.name = name;
    }

    void distributeTipToAllEmployees()
    {
        if (barmen.length == 0 && waiters.length == 0) return;
        int employeeTipPart = getTipAMount() / (barmen.length + waiters.length);
        for (Barman b : barmen) b.setTipProfit(employeeTipPart);
        for (Waiter w : waiters) w.setTipProfit(employeeTipPart);
        tipAMount = 0;
    }

    public Order[] getOrders()
    {
        return orders;
    }

    public int getTipAMount()
    {
        return tipAMount;
    }

    public void addTip(int tipAMount)
    {
        this.tipAMount += tipAMount;
    }

    public int getDrinkCount(Drink drink)
    {
        int res = 0;

        for (Drink d : drinks)
        {
            if (d.getName().equals(drink.getName()))
            {
                res += d.getAmount();
            }
        }
        return res;
    }

    public void addOrder(Order order)
    {
        if (getDrinkCount(order.getDrink()) < order.getAmount())
        {
            throw new RuntimeException("Not enough drinks of " + order.getDrink().getName());
        }
        orders = Arrays.copyOf(orders, orders.length + 1);
        orders[orders.length - 1] = order;
    }

    public void removeOrder(int orderID)
    {
        int arrayPos = -1;
        if (orders.length > 0)
        {
            for (int i = 0; i < orders.length; i++)
            {
                if (orders[i].getID() == orderID)
                {
                    arrayPos = i;
                }
            }
        }
        if (arrayPos >= 0 && arrayPos < orders.length)
        {
            Order[] copy = new Order[orders.length - 1];
            System.arraycopy(orders, 0, copy, 0, arrayPos);
            System.arraycopy(orders, arrayPos + 1, copy, arrayPos, orders.length - arrayPos - 1);
            orders = copy;
        }
    }

    public void addDrinkToStorage(Drink drink, int amount)
    {
        boolean added = false;

        for (Drink d : drinks)
        {
            if (d.equals(drink))
            {
                d.changeAmount(d.getAmount() + amount);
                added = true;
                break;
            }
        }
        if (!added || drinks.length == 0)
        {
            drinks = Arrays.copyOf(drinks, drinks.length + 1);
            drinks[drinks.length - 1] = drink;
            drink.changeAmount(amount);
        }
    }

    void addEmployee(Employee employee)
    {
        if (employee instanceof Barman)
        {
            barmen = Arrays.copyOf(barmen, barmen.length + 1);
            barmen[barmen.length - 1] = (Barman) employee;
            ((Barman) employee).setBar(this);
        }
        if (employee instanceof Waiter)
        {
            waiters = Arrays.copyOf(waiters, waiters.length + 1);
            waiters[waiters.length - 1] = (Waiter) employee;
            ((Waiter) employee).setBar(this);
        }
    }

    void addEmployee(String name, int age, Positions position)
    {
        if (position == Positions.BARMAN)
        {
            addEmployee(new Barman(name, age, this, ""));
        }
        if (position == Positions.WAITER)
        {
            addEmployee(new Waiter(name, age, this));
        }
    }

    public void fireEmployee(String name, Positions position)
    {
        int arrayPos = -1;
        switch (position)
        {
            case BARMAN:
            {
                if (barmen.length > 0)
                {
                    for (int i = 0; i < barmen.length; i++)
                    {
                        if (barmen[i].getName().equals(name))
                        {
                            arrayPos = i;
                        }
                    }
                }
                if (arrayPos >= 0 && arrayPos < barmen.length)
                {
                    Barman[] copy = new Barman[barmen.length - 1];
                    System.arraycopy(barmen, 0, copy, 0, arrayPos);
                    System.arraycopy(barmen, arrayPos + 1, copy, arrayPos, barmen.length - arrayPos - 1);
                    barmen = copy;
                }
            }
            break;
            case WAITER:
            {
                if (waiters.length > 0)
                {
                    for (int i = 0; i < waiters.length; i++)
                    {
                        if (waiters[i].getName().equals(name))
                        {
                            arrayPos = i;
                        }
                    }
                }
                if (arrayPos >= 0 && arrayPos < waiters.length)
                {
                    Waiter[] copy = new Waiter[waiters.length - 1];
                    System.arraycopy(waiters, 0, copy, 0, arrayPos);
                    System.arraycopy(waiters, arrayPos + 1, copy, arrayPos, waiters.length - arrayPos - 1);
                    waiters = copy;
                }
            }
        }
    }

    public Drink[] getDrinks()
    {
        return drinks;
    }

    public void decreaseDrinkAmount(String drinkName, int amount)
    {
        for (Drink drink : drinks)
        {
            if (drink.getName().equals(drinkName))
            {
                drink.changeAmount(-1 * amount);
            }
        }
    }

    @Override
    public String toString()
    {
        return "Bar{" +
                "name='" + name + '\'' +
                ", barmen=" + Arrays.toString(barmen) +
                ", waiters=" + Arrays.toString(waiters) +
                ", drinks=" + Arrays.toString(drinks) +
                ", tipAMount=" + tipAMount +
                ", orders=" + Arrays.toString(orders) +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bar bar = (Bar) o;

        if (name != null ? !name.equals(bar.name) : bar.name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(barmen, bar.barmen)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(waiters, bar.waiters)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(drinks, bar.drinks)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(orders, bar.orders);

    }

    @Override
    public int hashCode()
    {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(barmen);
        result = 31 * result + Arrays.hashCode(waiters);
        result = 31 * result + Arrays.hashCode(drinks);
        result = 31 * result + Arrays.hashCode(orders);
        return result;
    }
}
