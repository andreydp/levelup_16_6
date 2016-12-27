package ua.dp.levelup.classwork.lesson15;

/**
 * Created by java on 23.12.2016.
 */
public class Main2
{
    public static void main(String[] args)
    {
        try
        {
            String shortString = "123";
            char chr = shortString.charAt(10);
        } catch (StringIndexOutOfBoundsException e)
        {
            throw new Error("@@@!!!!@@@@");
        } finally
        {

        }
    }
}
