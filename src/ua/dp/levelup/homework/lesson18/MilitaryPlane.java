package ua.dp.levelup.homework.lesson18;

/**
 * Created by andreypo on 1/16/2017.
 */
public abstract class MilitaryPlane extends Aircraft
{
    private String weapon;

    public MilitaryPlane(int speed, int weight, int fuelConsumption, int capacity, int maxWeight, int maxDistance, int maxHeight, String weapon)
    {
        super(speed, weight, fuelConsumption, capacity, maxWeight, maxDistance, maxHeight);
        this.weapon = weapon;
    }

    public String getWeapon()
    {
        return weapon;
    }

    public void setWeapon(String weapon)
    {
        this.weapon = weapon;
    }

    @Override
    public String toString()
    {
        return "MilitaryPlane{" +
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