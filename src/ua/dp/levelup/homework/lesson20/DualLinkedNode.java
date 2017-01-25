package ua.dp.levelup.homework.lesson20;

/**
 * Created by andrey on 25.01.17.
 */
public class DualLinkedNode extends Node
{
    private Node previous = null;
    public DualLinkedNode(Object value)
    {
        super(value);
    }

    public Node previous()
    {
        return previous;
    }

    public void setPrevious(Node previous)
    {
        this.previous = previous;
    }

    @Override
    public String toString()
    {
        return "DualLinkedNode{" +
                "next= " + next() +
                ", previous=" + previous +
                '}';
    }
}
