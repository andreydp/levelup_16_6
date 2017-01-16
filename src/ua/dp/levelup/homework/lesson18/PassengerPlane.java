package ua.dp.levelup.homework.lesson18;

/**
 * Created by andreypo on 1/16/2017.
 */
public abstract class PassengerPlane extends Aircraft
{
    private int maxPassengerCount; //depends on configuration

    public PassengerPlane(int speed, int weight, int fuelConsumption, int capacity, int maxWeight, int maxDistance,
                          int maxHeight, int maxPassengerCount)
    {
        super(speed, weight, fuelConsumption, capacity, maxWeight, maxDistance, maxHeight);
        this.maxPassengerCount = maxPassengerCount;
    }


    public int getMaxPassengerCount()
    {
        return maxPassengerCount;
    }

    public void setMaxPassengerCount(int maxPassengerCount)
    {
        this.maxPassengerCount = maxPassengerCount;
    }

    @Override
    public String toString()
    {
        return "PassengerPlane{" +
                "maxPassengerCount=" + getMaxPassengerCount() +
                " speed=" + getSpeed() +
                ", weight=" + getWeight() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", capacity=" + getCapacity() +
                ", maxWeight=" + getMaxWeight() +
                ", maxDistance=" + getMaxDistance() +
                ", maxHeight=" + getMaxHeight() +
                "}";
    }
}
