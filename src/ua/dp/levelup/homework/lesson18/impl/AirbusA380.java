package ua.dp.levelup.homework.lesson18.impl;

import ua.dp.levelup.homework.lesson18.PassengerPlane;

/**
 * Created by andreypo on 1/16/2017.
 */
public class AirbusA380 extends PassengerPlane
{
    public AirbusA380(int speed, int weight, int fuelConsumption, int capacity, int maxWeight, int maxDistance, int maxHeight, int maxPassengerCount)
    {
        super(speed, weight, fuelConsumption, capacity, maxWeight, maxDistance, maxHeight, maxPassengerCount);
    }

    @Override
    public String toString()
    {
        return "AirbusA380{" +
                "maxPassengerCount=" + getMaxPassengerCount() +
                " speed=" + getSpeed() +
                ", weight=" + getWeight() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", capacity=" + getCapacity() +
                ", maxDistance=" + getMaxDistance() +
                ", maxHeight=" + getMaxHeight() +
                "}";
    }
}
