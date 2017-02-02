package ua.dp.levelup.homework.lesson20.double_linked_list;

/**
 * Created by java on 24.01.2017.
 */
public class Node<V>
{

    private Node<V> next = null;
    private Node<V> prev = null;
    private final V value;

    protected Node(V value)
    {
        this.value = value;
    }

    public Node<V> getNext()
    {
        return next;
    }

    public void setNext(Node<V> next)
    {
        this.next = next;
//        if (getNext != null) getNext.setPrev(this);
    }

    public Node<V> getPrev()
    {
        return prev;
    }

    public void setPrev(Node<V> prev)
    {
        this.prev = prev;
//        if (prev != null) prev.setNext(this);
    }

    public V getValue()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
