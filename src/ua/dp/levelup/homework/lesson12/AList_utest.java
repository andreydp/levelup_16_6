package ua.dp.levelup.homework.lesson12;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AList_utest
{

    AList list;
    AList sizedList;
    AList fromArrayList;

    @Before
    public void setUp()
    {
        list = new AList();
        sizedList = new AList(5);
        fromArrayList = new AList(new int[]{6, 5, 3, 1, 8, 7, 2, 4});
    }

    @Test
    public void shouldCheckThatListEmpty() throws Exception
    {
        //given
        int expected = 0;

        //when
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 0", expected, actual);
    }

    @Test
    public void shouldCheckThatListHasTheSameSizeAsInitializerArray() throws Exception
    {
        //given
        int expected = 8;

        //when
        int actual = fromArrayList.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 8", expected, actual);
    }

    @Test
    public void shouldAddElementAndReturnSizeOne() throws Exception
    {
        //given
        int expected = 1;

        //when
        list.add(5);
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }

    @Test
    public void shouldAddElementAndReturnSizeOneForSizedList() throws Exception
    {
        //given
        int expected = 1;

        //when
        sizedList.add(5);
        int actual = sizedList.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }

    @Test
    public void shouldAddElementsAndReturnSizeTwo() throws Exception
    {
        //given
        int expected = 2;

        //when
        list.add(5);
        list.add(6);
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 2", expected, actual);
    }

    @Test
    public void shouldAddElementsAndReturnSizeTwoForSizedList() throws Exception
    {
        //given
        int expected = 2;

        //when
        sizedList.add(5);
        sizedList.add(6);
        int actual = sizedList.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 2", expected, actual);
    }

    @Test
    public void shouldAddMoreElementsThanInitialSizeWithoutTroubles() throws Exception
    {
        //given
        int expected = 11;

        //when
        for (int i = 0; i < 11; i++)
        {
            list.add(i + 1);
        }
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 11", expected, actual);
    }

    @Test
    public void shouldReturnLastAddedElement()
    {
        //given
        int expected = 11;

        //when
        for (int i = 0; i < 11; i++)
        {
            list.add(i + 1);
        }
        int lastAddedIndex = list.size() - 1;
        int actual = list.get(lastAddedIndex);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 11", expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void shouldTryToGetZeroElementAndThrowException()
    {
        //when
        list.get(0);
    }

    @Test(expected = RuntimeException.class)
    public void shouldTryToGetElevenElementAndThrowException()
    {
        //when
        list.get(11);
    }

    @Test(expected = RuntimeException.class)
    public void shouldTryToGetNegativeElementAndThrowException()
    {
        //when
        list.get(-1);
    }

    @Test
    public void shouldRemoveElementFromEmptyList() throws Exception
    {
        //given
        int expected = 0;

        //when
        list.remove();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 0", expected, actual);
    }

    @Test
    public void shouldRemoveFirstElementFromListAndReturnZero() throws Exception
    {
        //given
        int expected = 0;

        //when
        list.add(1);
        list.remove();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 0", expected, actual);
    }

    @Test
    public void shouldIncreaseArrayLength() throws Exception
    {
        //given
        int expected = 12;

        //when
        for (int i = 0; i < 9; i++)
        {
            list.add(i + 1);
        }

        int actual = list.getArrayLength();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 12", expected, actual);
    }

    @Test
    public void shouldDecreaseArrayLength() throws Exception
    {
        //given
        int expected = 10;

        //when
        for (int i = 0; i < 9; i++)
        {
            list.add(i + 1);
        }
        list.remove();
        list.remove();
        int actual = list.getArrayLength();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 10", expected, actual);
    }

    @Test
    public void shouldDecreaseArrayLengthToTen() throws Exception
    {
        //given
        int expected = 10;

        //when
        for (int i = 0; i < 9; i++)
        {
            list.add(i + 1);
        }
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        list.remove();
        int actual = list.getArrayLength();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 10", expected, actual);
    }

    @Test
    public void shouldRemoveLastElementFromListAndReturnOne() throws Exception
    {
        //given
        int expected = 1;

        //when
        list.add(1);
        list.add(2);
        list.remove();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }

    @Test
    public void shouldRemoveSecondElementFromListAndReturnOne() throws Exception
    {
        //given
        int expected = 1;

        //when
        list.add(1);
        list.add(2);
        list.remove(1);
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }

    @Test
    public void shouldRemoveFirstElementFromListAndReturnOne() throws Exception
    {
        //given
        int expected = 1;

        //when
        list.add(1);
        list.add(2);
        list.removeFirst();
        int actual = list.size();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }

    @Test
    public void shouldRemoveFirstElementFromListAndSecondElementAsFirst() throws Exception
    {
        //given
        int expected = 2;

        //when
        list.add(1);
        list.add(2);
        list.removeFirst();
        int actual = list.get(0);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 2", expected, actual);
    }

    @Test
    public void shouldAddElementToTheStartAndReturnSizeThree() throws Exception
    {
        //given
        int expected = 3;

        //when
        list.add(1);
        list.add(2);
        list.addToStart(3);
        int actual = list.get(0);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 3", expected, actual);
    }

    @Test
    public void shouldAddElementToTheStartAndReturnSecondElementAsPreviousFirst() throws Exception
    {
        //given
        int expected = 1;

        //when
        list.add(1);
        list.add(2);
        list.addToStart(3);
        int actual = list.get(1);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 1", expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotRemoveElementByInvalidIndexInSizedListAndThrowException()
    {
        sizedList.remove(1000);
    }

    @Test
    public void shouldInsertElementAtFirstIndex() throws Exception
    {
        //given
        int expected = 8;

        //when
        list.add(0,expected);
        int actual = list.get(0);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 8", expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotAddElementToNotExistingIndexAndThrowException()
    {
        list.add(5, 10);
    }

    @Test
    public void shouldReturnIndexOfElement() throws Exception
    {
        //given
        int expected = 4;

        //when
        int actual = fromArrayList.indexOf(8);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is 4", expected, actual);
    }

    @Test
    public void shouldReturnMinusOneForNonExistingValueForIndexOf() throws Exception
    {
        //given
        int expected = -1;

        //when
        int actual = fromArrayList.indexOf(100500);

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is -1", expected, actual);
    }

    @Test
    public void shouldPrintList() throws Exception
    {
        //given
        String expected = "6,5,3,1,8,7,2,4";

        //when
        String actual = fromArrayList.toString();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is '6,5,3,1,8,7,2,4'", expected, actual);
    }

    @Test
    public void shouldPrintListWithSeparator() throws Exception
    {
        //given
        String separator = ".";
        String expected = "6.5.3.1.8.7.2.4";

        //when
        String actual = fromArrayList.toString(".");

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is '6.5.3.1.8.7.2.4'", expected, actual);
    }

    @Test
    public void shouldSortList() throws Exception
    {
        //given
        String expected = "1,2,3,4,5,6,7,8";

        //when
        fromArrayList.sort();
        String actual = fromArrayList.toString();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is '1,2,3,4,5,6,7,8'", expected, actual);
    }

    @Test
    public void shouldSortListReverseOrder() throws Exception
    {
        //given
        String expected = "8,7,6,5,4,3,2,1";

        //when
        fromArrayList.reverseSort();
        String actual = fromArrayList.toString();

        //then
        assertEquals("ERROR!!! Actual result is wrong! Expected is '8,7,6,5,4,3,2,1'", expected, actual);
    }
}