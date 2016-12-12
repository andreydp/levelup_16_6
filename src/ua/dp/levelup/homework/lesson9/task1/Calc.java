package ua.dp.levelup.homework.lesson9.task1;

/**
 * Created by andrey on 03.12.16.
 */
public class Calc
{

    public static Object parse(String value)
    {
        try
        {
            return Integer.parseInt(value);
        } catch (NumberFormatException ex1)
        {
            try
            {
                return Double.parseDouble(value);
            } catch (NumberFormatException ex2)
            {
                throw new RuntimeException("Un-parseable value!");
            }
        }
    }

    public static Double sum(Object a, Object b)
    {
        if (a instanceof Integer && b instanceof Integer)
        {
            return sum((Integer) a, (Integer) b);
        }

        if (a instanceof Double && b instanceof Double)
        {
            return sum((Double) a, (Double) b);
        }
        return 0d;
    }

    public static Double sum(Integer a, Integer b)
    {
        return (double) a + b;
    }

    public static Double sum(Double a, Double b)
    {
        return a + b;
    }

    public static Double subtract(Object a, Object b)
    {
        if (a instanceof Integer && b instanceof Integer)
        {
            return subtract((Integer) a, (Integer) b);
        }

        if (a instanceof Double && b instanceof Double)
        {
            return subtract((Double) a, (Double) b);
        }
        return null;
    }

    public static Double subtract(Integer a, Integer b)
    {
        return (double) a - b;
    }

    public static Double subtract(Double a, Double b)
    {
        return a - b;
    }

    public static Double divide(Object a, Object b)
    {
        if (a instanceof Integer && b instanceof Integer)
        {
            return divide((Integer) a, (Integer) b);
        }

        if (a instanceof Double && b instanceof Double)
        {
            return divide((Double) a, (Double) b);
        }
        return null;
    }

    public static Double divide(Integer a, Integer b)
    {
        return (double) a / b;
    }

    public static Double divide(Double a, Double b)
    {
        return a / b;
    }

    public static Double multiply(Object a, Object b)
    {
        if (a instanceof Integer && b instanceof Integer)
        {
            return multiply((Integer) a, (Integer) b);
        }

        if (a instanceof Double && b instanceof Double)
        {
            return multiply((Double) a, (Double) b);
        }
        return null;
    }

    public static Double multiply(Integer a, Integer b)
    {
        return (double) a * b;
    }

    public static Double multiply(Double a, Double b)
    {
        return a * b;
    }
}
