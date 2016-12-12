package ua.dp.levelup.homework.lesson7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by andrey on 12.12.16.
 */
public class Task8_utest
{
    @Test
    public void checkJanuaryName()
    {
        //given
        Task8.Months january = Task8.Months.JANUARY;
        String expected = "Январь";

        //when
        String actual = january.getRuName();

        //then
        assertEquals("Incorrect January ruName!", actual, expected);

    }
}
