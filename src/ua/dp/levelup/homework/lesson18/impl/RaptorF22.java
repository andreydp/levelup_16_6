package ua.dp.levelup.homework.lesson18.impl;

import ua.dp.levelup.homework.lesson18.MilitaryPlane;

/**
 * Created by andreypo on 1/16/2017.
 */
public class RaptorF22 extends MilitaryPlane
{
    public RaptorF22(int speed, int weight, int fuelConsumption, int capacity, int maxWeight, int maxDistance, int maxHeight, String weapon)
    {
        super(speed, weight, fuelConsumption, capacity, maxWeight, maxDistance, maxHeight, weapon);
    }

    @Override
    public String toString()
    {
        return "RaptorF22{" +
                " speed=" + getSpeed() +
                ", weight=" + getWeight() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", capacity=" + getCapacity() +
                ", maxWeight=" + getMaxWeight() +
                ", maxDistance=" + getMaxDistance() +
                ", maxHeight=" + getMaxHeight() +
                ", weapon=" + getWeapon() +
                "}";
    }
}
