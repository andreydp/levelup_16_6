package ua.dp.levelup.homework.lesson18;

/**
 * Created by andreypo on 1/16/2017.
 */
public abstract class CargoPlane extends Aircraft
{
    private int volume;

    public CargoPlane(int speed, int weight, int fuelConsumption, int capacity, int maxWeight, int maxDistance, int maxHeight, int volume)
    {
        super(speed, weight, fuelConsumption, capacity, maxWeight, maxDistance, maxHeight);
        this.volume = volume;
    }

    public int getVolume()
    {
        return volume;
    }

    public void setVolume(int volume)
    {
        this.volume = volume;
    }

    @Override
    public String toString()
    {
        return "CargoPlane{" +
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
