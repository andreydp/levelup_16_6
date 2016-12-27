package ua.dp.levelup.classwork.lesson15;

/**
 * Created by java on 23.12.2016.
 */
public class Coin
{
    private double weight;
    private double diameter;

    public Coin(double weight, double diameter) throws CoinLogicException
    {
        try
        {
            if (diameter < 0) throw new CoinLogicException("Negative diameter");
            this.weight = weight;
            this.diameter = diameter;
        }
         catch (CoinLogicException e)
        {
            e.printStackTrace();
            throw e;
        }
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getDiameter()
    {
        return diameter;
    }

    public void setDiameter(double diameter) throws CoinLogicException
    {
        try
        {
            if (diameter < 0) throw new CoinLogicException("Negative diameter");
            this.diameter = diameter;
        }
        catch (CoinLogicException e)
        {
            e.printStackTrace();
            throw e;
        }
        this.diameter = diameter;
    }
}
