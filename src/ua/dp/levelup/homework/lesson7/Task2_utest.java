package ua.dp.levelup.homework.lesson7;

import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by andrey on 12.12.16.
 */
public class Task2_utest
{
    @Test(timeout = 1000)
    public void checkCorrectCardColor()
    {
        //given
        int cardColor = 2;
        String expected = "трефы";

        //when
        String actual = Task2.getCardColorName(cardColor);

        //then
        assertEquals("Wrong card color, should return 'трефы'", expected, actual);
    }

    @Test
    public void checkCorrectCardName()
    {
        //given
        int cardColor = 2;
        int cardNumber = 6;
        String expected = "шестерка трефы";

        //when
        String actual = Task2.getFullCardName(cardColor,cardNumber);

        //then
        assertEquals("Wrong card name, should return 'шестерка трефы'", expected, actual);
    }

    @Test
    public void checkIncorrectCardColor()
    {
        //given
        int cardColor = 5;

        String actual = Task2.getCardColorName(cardColor);
        assertNull("Returned not null for incorrect card color name", actual);
    }
}