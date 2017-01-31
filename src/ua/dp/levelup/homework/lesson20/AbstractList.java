package ua.dp.levelup.homework.lesson20;

/**
 * Created by java on 24.01.2017.
 */
public abstract class AbstractList<N>
{
    protected int size = 0;

    public int size()
    {
        return size;
    }

    public abstract void add(Node<N> node, int index);

    public abstract void remove(int index);

    public abstract void addFirst(Node<N> node);

    public abstract void addLast(Node<N> node);

    public abstract void removeFirst();

    public abstract void removeLast();

    public abstract Node<N> getFirst();

    public abstract Node<N> getLast();

    public abstract Node<N> get(int index);

    public abstract boolean isEmpty();

    public abstract boolean isNotEmpty();
}
