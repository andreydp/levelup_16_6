package ua.dp.levelup.homework.lesson12;

import java.util.Arrays;

/**
 * Created by andreypo on 12/15/2016.
 */
public class AList
{
    private int initialSize;
    private int size = 0;
    private float maxLoad = 0.8f;
    private float minLoad = 0.6f;
    private int[] array;
    private static final int MIN_SIZE = 10;

    public AList()
    {
        this.initialSize = MIN_SIZE;
        this.array = new int[initialSize];
    }

    public AList(int initialSize)
    {
        this.initialSize = initialSize;
        this.array = new int[initialSize];
    }

    public AList(int[] arr)
    {
        this.array = Arrays.copyOf(arr, arr.length);
        this.initialSize = arr.length;
        this.size = initialSize;
        resize();
    }

    public int size()
    {
        return size;
    }

    public void add(int n)
    {
        resize();
        array[size++] = n;
    }

    public void add(int index, int n) throws RuntimeException
    {
        if (index > size || index < 0)
        {
            throw new RuntimeException();
        }
        else if (index <= size)
        {
            int[] tmp = new int[size - index];
            for (int i = 0; i < tmp.length; i++)
            {
                tmp[i] = array[index + i];
                array[index + i] = 0;
                size--;
            }
            add(n);
            for (int elem : tmp)
            {
                add(elem);
            }
        }
    }

    public void addToStart(int n)
    {
        add(0, n);
    }

    public void removeFirst()
    {
        remove(0);
    }

    public void remove()
    {
        if (size > 0)
        {
            array[--size] = 0;
            resize();
        }
    }

    public void remove(int index) throws RuntimeException
    {
        if (index >= size || index < 0)
        {
            throw new RuntimeException();
        }
        else if (index < size)
        {
            for (int i = index; i < size; i++)
            {
                array[i] = array[i + 1];
            }
            size--;
            resize();
        }
    }

    public int get(int index)
    {
        if (index < 0 || index >= size) throw new RuntimeException();
        return array[index];
    }


    public int getArrayLength()
    {
        return array.length;
    }

    private void resize()
    {
        float currentLoad = size / (initialSize * 1.0f);
        if ((currentLoad <= minLoad && array.length > MIN_SIZE) || currentLoad >= maxLoad)
        {
            initialSize = getArrayLength() == 1 ? ++initialSize : (int) (size * 1.5);
            int[] tmp = new int[initialSize];
            for (int i = 0; i < size; i++)
            {
                tmp[i] = array[i];
            }
            array = tmp;
        }
    }

    public int indexOf(int value)
    {
        int res = -1;
        for (int i = 0; i < size; i++)
        {
            if (array[i] == value)
            {
                res = i;
            }
        }
        return res;
    }

    public void sort()
    {
        for (int i = 1; i < size; i++)
        {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--)
            {
                int buf = array[j - 1];
                array[j - 1] = array[j];
                array[j] = buf;
            }
        }
    }

    public void reverseSort()
    {
        for (int i = 1; i < size; i++)
        {
            for (int j = i; j > 0 && array[j - 1] < array[j]; j--)
            {
                int buf = array[j - 1];
                array[j - 1] = array[j];
                array[j] = buf;
            }
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++)
        {
            sb.append(array[i]);
            if (i != size - 1) sb.append(",");
        }
        return sb.toString();
    }

    public String toString(String separator)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++)
        {
            sb.append(array[i]);
            if (i != size - 1) sb.append(separator);
        }
        return sb.toString();
    }
}
