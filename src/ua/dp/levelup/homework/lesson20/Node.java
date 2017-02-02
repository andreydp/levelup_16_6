package ua.dp.levelup.homework.lesson20;

/**
 * Created by java on 24.01.2017.
 */
public class Node<V>
{
    private Node<V> next = null;
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
