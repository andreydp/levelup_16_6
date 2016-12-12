package ua.dp.levelup.homework.lesson7;

import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by andrey on 12.12.16.
 */
public class Task3_utest
{
    @Test(timeout = 1000)
    public void checkCorrectDayNameMonday()
    {
        //given
        int dayNumber = 1;
        String expected = "Monday";

        //when
        String actual = Task3.getDayNameByDayNumber(dayNumber);

        //then
        assertEquals("Wrong day name, should return Monday", expected, actual);
    }

    @Test(timeout = 1000)
    public void checkCorrectDayNameTuesday()
    {
        //given
        int dayNumber = 30;
        String expected = "Tuesday";

        //when
        String actual = Task3.getDayNameByDayNumber(dayNumber);

        //then
        assertEquals("Wrong day name, should return Tuesday", expected, actual);
    }

    @Test(timeout = 1000)
    public void checkCorrectDayNameTuesdayJan1IsTuesday()
    {
        //given
        int dayNumber = 2;
        int sundayDayNumber = 2;
        String expected = "Wednesday";

        //when
        String actual = Task3.getDayNameByDayNumber(dayNumber, sundayDayNumber);

        //then
        assertEquals("Wrong day name, should return Wednesday", expected, actual);
    }


    @Test(timeout = 1000)
    public void checkIncorrectDayNumber()
    {
        //given
        int dayNumber = 100500;

        //when
        String actual = Task3.getDayNameByDayNumber(dayNumber);

        //then
        assertNull("Not returned null for day number > 365!", actual);
    }
}
