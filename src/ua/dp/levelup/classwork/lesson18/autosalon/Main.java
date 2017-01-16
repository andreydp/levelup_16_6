package ua.dp.levelup.classwork.lesson18.autosalon;

/**
 * Created by java on 13.01.2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        Car[] cars = {
                new Lanos(10, 160, Configuration.BASIC),
                new Mercedes(15, 220, Configuration.LUX),
                new Opel(18, 220, Configuration.EXCLUSIVE),
                new Opel(18, 180, Configuration.BASIC),
                new Lanos(12, 170, Configuration.LUX),
                new Mercedes(18, 180, Configuration.BASIC),
        };


        AutoSalon autoSalon = new AutoSalon(cars);

        System.out.println("Total price: " + autoSalon.calculateCarsPrice());
        System.out.println(autoSalon.sortByFuelConsumption());
    }
}
