package ua.dp.levelup.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by java on 07.02.2017.
 */
public class UtilTest
{

    @Test
    public void testArraysCopyOf()
    {
        String[] arr = {"a", "b", "c"};
        String[] arr2 = Arrays.copyOf(arr, arr.length);

        assertTrue(Arrays.equals(arr, arr2));
        HashSet<String>  set = new HashSet<>();
        set.add("a");
        set.add("2");
        set.add("3");
        set.add("6");
        set.add("s");

        set.forEach(System.out::println);
    }
}
