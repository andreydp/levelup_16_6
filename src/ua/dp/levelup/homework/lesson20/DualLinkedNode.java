package ua.dp.levelup.homework.lesson20;

/**
 * Created by andrey on 25.01.17.
 */
public class DualLinkedNode extends Node
{
    private DualLinkedNode previous = null;
    public DualLinkedNode(Object value)
    {
        super(value);
    }

    public DualLinkedNode previous()
    {
        return previous;
    }

    public DualLinkedNode next()
    {
        return (DualLinkedNode) next;
    }

    public void setPrevious(DualLinkedNode previous)
    {
        this.previous = previous;
    }

    public void setNext(DualLinkedNode next)
    {
        this.next = next;
    }

    @Override
    public String toString()
    {
        return "DualLinkedNode{" +
                "value=" + value +
                '}';
    }
}
