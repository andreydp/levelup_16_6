package ua.dp.levelup.classwork.lesson18.autosalon;

import java.util.*;

/**
 * Created by java on 13.01.2017.
 */
public class AutoSalon
{
    private Car[] cars;

    public AutoSalon(Car[] cars)
    {
        this.cars = cars;
    }

    public double calculateCarsPrice()
    {
        double totalPrice = 0d;

        for (Car c : cars)
        {
            totalPrice += c.getPrice();
        }

        return totalPrice;
    }

    public Car[] getCarsBySpeedRange(int from, int to)
    {
        List<Car> carList = new ArrayList<>();
        for (Car c : cars)
        {
            if (c.getMaxSpeed() <= to && c.getMaxSpeed() >= from)
            {
                carList.add(c);
            }
        }
        return carList.toArray(new Car[1]);
    }

    public List<Car> sortByFuelConsumption()
    {
        List<Car> res = Arrays.asList(cars);
        Collections.sort(res, getComparator());
        return res;
    }

    private Comparator<Car> getComparator()
    {
        return (c1, c2) ->
                Double.compare(c1.getFuelConsumption(), c2.getFuelConsumption());
    }
}
