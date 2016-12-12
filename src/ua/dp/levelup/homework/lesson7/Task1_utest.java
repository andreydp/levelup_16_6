package ua.dp.levelup.homework.lesson7;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Random;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by andrey on 12.12.16.
 */
public class Task1_utest
{
    @Test(timeout = 1000)
    public void checkCorrectDaysInFebruaryLeap()
    {
        //given
        int monthNumber = 2;
        boolean isLeap = true;
        int expected = 29;


        //when
        int actual = Task1.getNumberOfDaysInMonth(monthNumber, isLeap);


        //then
        assertEquals("Wrong number of days in February", expected, actual);
    }

    @Test(timeout = 1000)
    public void checkIncorrectMonthNumber()
    {
        //given
        int monthNumber = 13;
        int expected = 0;

        //when
        int actual = Task1.getNumberOfDaysInMonth(monthNumber);

        //then
        assertEquals("checkIncorrectMonthNumber failed, returned incorrect value",expected, actual);
    }

    @Test(timeout = 1000)
    public void checkCorrectMonthDaysRange()
    {
        //given
        int monthNumber = new Random().nextInt(12);

        //when
        int actual = Task1.getNumberOfDaysInMonth(monthNumber);

        //then
        assertTrue("Wrong number of days in February",(actual > 0 && actual < 32));
    }
}
