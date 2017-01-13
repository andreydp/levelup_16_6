package ua.dp.levelup.classwork.lesson18.autosalon;

/**
 * Created by java on 13.01.2017.
 */
public class Mercedes extends Car
{
    public Mercedes(double fuelConsumption, int maxSpeed, Configuration configuration)
    {
        super(fuelConsumption, maxSpeed, configuration);
    }

    @Override
    public double getPrice()
    {
        switch (getConfiguration())
        {
            case LUX:
                return 110_000;
            case EXCLUSIVE:
                return 160_000;
            default:
                return 60_000;
        }
    }
}
