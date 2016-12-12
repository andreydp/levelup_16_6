package ua.dp.levelup.homework.lesson7;

import junit.framework.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by andrey on 12.12.16.
 */
public class Task5_utest
{
    @Test(timeout = 1000)
    public void checkReverseString()
    {
        //given
        String someString = "mystring";
        String expected = "gnirtsym";

        //when
        String actual = Task5.reverseString(someString);

        //then
        assertEquals("Wrong reverse string!", expected, actual);
    }

    @Test(timeout = 1000)
    public void checkIncorrectForEmptyString()
    {
        String someString = "";
        String expected = Task5.reverseString(someString);

        assertFalse(!someString.equals(expected));
    }
}
