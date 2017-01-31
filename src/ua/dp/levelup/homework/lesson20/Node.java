package ua.dp.levelup.homework.lesson20;

/**
 * Created by java on 24.01.2017.
 */
public class Node<V>
{
    private Node<V> next = null;
    private Node<V> previous = null;
    private V value;

    public Node(V value)
    {
        this.value = value;
    }

    public Node<V> next()
    {
        return next;
    }

    public void setNext(Node<V> next)
    {
        this.next = next;
        if (null != next)
        {
            next.setPrevious(this);
        }
    }


    public Node<V> previous()
    {
        return previous;
    }


    public void setPrevious(Node<V> previous)
    {
        this.previous = previous;
        if (null != previous)
        {
            previous.setNext(this);
        }
    }

    public V getValue()
    {
        return value;
    }

    public void setValue(V value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
