package ua.dp.levelup.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by java on 03.02.2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(6);


        for (Integer i : list)
        {
            list.remove(1);
        }
    }
}
