package ua.dp.levelup.homework.lesson7;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

/**
 * Created by andrey on 12.12.16.
 */
public class Task6_utest
{
    @Test(timeout = 1000)
    public void checkCorrectEmail()
    {
        //given
        String email = "poletaiev@gmail.com";
        boolean expected = true;

        //when
        boolean actual = Task6.checkEmail(email);

        //then
        assertSame("checkCorrectEmail fail!", expected, actual);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void checkNotEmail()
    {
        String someString = "test";
        boolean expected = false;
        boolean actual = Task6.checkEmail(someString);

        assertNotSame(expected, actual);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void checkEmailWithoutZOne()
    {
        String someString = "poletaiev@gmail";
        boolean expected = false;
        boolean actual = Task6.checkEmail(someString);

        assertNotSame(expected, actual);
    }
}
