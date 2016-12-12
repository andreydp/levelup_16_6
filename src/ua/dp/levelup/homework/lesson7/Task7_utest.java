package ua.dp.levelup.homework.lesson7;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

/**
 * Created by andrey on 12.12.16.
 */
public class Task7_utest
{
    String[] strings = {"123", "test", "blablabla", "testString", "test"};

    @Test
    public void checkContainsCount()
    {
        //given
        int expected = 2;
        String testStr = "test";

        //when
        int actual = Task7.containsCount(strings, testStr);

        //then
        assertSame("checkContainsCount fail! Should return 2", expected, actual);
    }

    @Test
    public void checkPrintCommaSeparatedLine()
    {
        //given
        int minLength = 3;
        String expected = "test,blablabla,testString,test";

        String actual = Task7.printCommaSeparatedLine(strings, minLength);
        assertEquals("checkPrintCommaSeparatedLine failure!", expected, actual);
    }

    @Test
    public void checkPrintCommaSeparatedLineUnique()
    {
        //given
        String expected = "123,blablabla,testString,";

        //when
        String actual = Task7.printCommaSeparatedLineUnique(strings);

        //then
        assertEquals("checkPrintCommaSeparatedLineUnique failure!", expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void checkPrintCommaSeparatedLineUniqueNull()
    {
        //given
        String someStr = null;

        //when
        String actual = Task7.printCommaSeparatedLineUnique(new String[]{someStr});
    }
}
