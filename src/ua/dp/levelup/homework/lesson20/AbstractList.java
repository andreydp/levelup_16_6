package ua.dp.levelup.homework.lesson20;

/**
 * Created by java on 24.01.2017.
 */
public abstract class AbstractList
{
    protected int size = 0;

    public int size()
    {
        return size;
    }

    public abstract void addNode(Node node, int index);

    public abstract void remove(int index);

    public abstract void addFirst(Node node);

    public abstract void addLast(Node node);

    public abstract void removeFirst();

    public abstract void removeLast();

    public abstract Node getFirst();

    public abstract Node getLast();

    public abstract Node get(int index);

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();
}
