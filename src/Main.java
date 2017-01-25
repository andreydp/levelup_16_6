/**
 * Created by andrey on 09.01.17.
 */
public class Main
{
    static void parse(String value)
    {
        Integer intResult;
        Double doubleResult;
        Object result;
        try
        {
            intResult = Integer.parseInt(value);
            result = intResult;
        }
        catch (NumberFormatException e)
        {
            doubleResult = Double.parseDouble(value);
            result = doubleResult;
        }
        System.out.println(result);
    }

    public static void main(String[] args)
    {
        parse("1.2");
    }
}
