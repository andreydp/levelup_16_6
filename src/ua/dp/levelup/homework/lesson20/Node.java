package ua.dp.levelup.homework.lesson20;

/**
 * Created by java on 24.01.2017.
 */
public class Node
{
    private Node next = null;
    private Node previous = null;
    private Object value;

    public Node(Object value)
    {
        this.value = value;
    }

    public Node next()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }


    public Node previous()
    {
        return previous;
    }


    public void setPrevious(Node previous)
    {
        this.previous = previous;
    }

    public Object getValue()
    {
        return value;
    }

    public void setValue(Object value)
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
