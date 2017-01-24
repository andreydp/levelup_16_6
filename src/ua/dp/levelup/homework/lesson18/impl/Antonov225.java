package ua.dp.levelup.homework.lesson18.impl;

import ua.dp.levelup.homework.lesson18.CargoPlane;

/**
 * Created by andreypo on 1/16/2017.
 */
public class Antonov225 extends CargoPlane
{
    public Antonov225(int speed, int weight, int fuelConsumption, int capacity, int maxWeight, int maxDistance, int maxHeight, int volume)
    {
        super(speed, weight, fuelConsumption, capacity, maxWeight, maxDistance, maxHeight, volume);
    }

    @Override
    public String toString()
    {
        return "Antonov225{" +
                " speed=" + getSpeed() +
                ", weight=" + getWeight() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", capacity=" + getCapacity() +
                ", maxWeight=" + getMaxWeight() +
                ", maxDistance=" + getMaxDistance() +
                ", maxHeight=" + getMaxHeight() +
                ", volume=" + getVolume() +
                "}";
    }
}
