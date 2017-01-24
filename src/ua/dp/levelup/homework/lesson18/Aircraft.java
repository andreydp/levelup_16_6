package ua.dp.levelup.homework.lesson18;

/**
 * Created by andreypo on 1/16/2017.
 */
public abstract class Aircraft
{
    private int speed;
    private int weight;
    private int fuelConsumption;
    private int capacity;
    private int maxWeight;
    private int maxDistance;
    private int maxHeight;

    public Aircraft(int speed, int weight, int fuelConsumption, int capacity, int maxWeight, int maxDistance,  int maxHeight)
    {
        this.speed = speed;
        this.weight = weight;
        this.fuelConsumption = fuelConsumption;
        this.capacity = capacity;
        this.maxWeight = maxWeight;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getFuelConsumption()
    {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption)
    {
        this.fuelConsumption = fuelConsumption;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public int getMaxWeight()
    {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight)
    {
        this.maxWeight = maxWeight;
    }

    public int getMaxDistance()
    {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance)
    {
        this.maxDistance = maxDistance;
    }

    public int getMaxHeight()
    {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight)
    {
        this.maxHeight = maxHeight;
    }

    @Override
    public String toString()
    {
        return "Aircraft{" +
                "speed=" + speed +
                ", weight=" + weight +
                ", fuelConsumption=" + fuelConsumption +
                ", capacity=" + capacity +
                ", maxWeight= " + maxWeight +
                ", maxDistance=" + maxDistance +
                ", maxHeight=" + maxHeight +
                '}';
    }
}
