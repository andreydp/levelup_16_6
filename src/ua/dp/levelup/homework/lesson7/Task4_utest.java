package ua.dp.levelup.homework.lesson7;

import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by andrey on 12.12.16.
 */
public class Task4_utest
{
    @Test(timeout = 1000)
    public void numberToMnemonicStringOne()
    {
        //given
        int digit = 1;
        String expected = "one";

        //when
        String actual = Task4.numberToMnemonicString(digit);

        //then
        assertEquals("Wrong digit name, should return 'one'", expected, actual);
    }


    @Test(timeout = 1000)
    public void numberToMnemonicStringTen()
    {
        //given
        int digit = 10;
        String expected = "ten";

        //when
        String actual = Task4.numberToMnemonicString(digit);

        //then
        assertEquals("Wrong digit name, should return 'ten'", expected, actual);
    }

    @Test(timeout = 1000)
    public void checkIncorrectDigitNumber()
    {
        //given
        int digitNumber = 100500;

        //when
        String actual = Task3.getDayNameByDayNumber(digitNumber);

        //then
        assertNull("Not returned null for digit > 10", actual);
    }
}
