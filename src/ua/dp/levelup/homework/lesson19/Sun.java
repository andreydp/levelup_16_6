package ua.dp.levelup.homework.lesson19;

/**
 * Created by andrey on 23.01.17.
 */
public class Sun extends NaturalLight
{
    boolean isFiring;
    int power;

    public Sun(boolean isDay, String sourceName, String action)
    {
        super(isDay, sourceName, action);
    }

    @Override
    public void turnOn()
    {

    }

    @Override
    public void turnOff()
    {

    }

    @Override
    public void show()
    {

    }

    @Override
    public int getPower()
    {
        return 0;
    }
}
