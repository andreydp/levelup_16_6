package ua.dp.levelup.homework.lesson19;

/**
 * Created by andrey on 23.01.17.
 */
public class Fire extends NaturalLight
{
    private boolean isOn;

    public Fire(boolean isOn)
    {
        super(true, ",", "");
        this.isOn = isOn;
    }

    @Override
    public void turnOn()
    {
        isOn = true;
    }

    @Override
    public void turnOff()
    {
        isOn = false;
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
