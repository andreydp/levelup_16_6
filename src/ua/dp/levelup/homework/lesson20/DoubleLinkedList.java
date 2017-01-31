package ua.dp.levelup.homework.lesson20;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by andrey on 25.01.17.
 */
public class DoubleLinkedList<T> extends AbstractList<Node<T>>
        implements Iterable<Node<T>>
{
    private Node<T> head = null;
    private Node<T> tail = null;

    @Override
    public void add(Node node, int index)
    {
        if (index < 0 || index > size || (null == head && index != 0)) throw new InvalidListIndexException();
        if (null == node) return;
        if (index == 0)
        {
            addFirst(node);
            return;
        }
        if (index == size)
        {
            addLast(node);
        } else
        {
            Node tmp = get(index);
            node.setNext(tmp.next());
            node.setPrevious(tmp);
            tmp.setNext(node);
        }
    }

    @Override
    public void remove(int index)
    {
        if (index < 0 || index >= size || null == head) throw new InvalidListIndexException();
        if (index == 0)
        {
            removeFirst();
        } else if (index == size - 1)
        {
            removeLast();
        } else
        {
            Node tmp = head;
            for (int currentIndex = 0; currentIndex <= index; currentIndex++)
            {
                if (currentIndex == index)
                {
                    tmp.next().setPrevious(tmp.previous());
                    tmp.previous().setNext(tmp.next());
                    size--;
                    break;
                }
                tmp = tmp.next();
            }
        }
    }

    @Override
    public void addFirst(Node node)
    {
        if (null == node) return;
        if (null == head)
        {
            head = node;
            tail = node;
        } else
        {
            node.setNext(head);
            head.setPrevious(node);
            head = node;
        }
        size++;
    }

    @Override
    public void addLast(Node node)
    {
        if (null == node) return;
        if (null == tail)
        {
            addFirst(node);
            return;
        } else
        {
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }
        size++;
    }

    @Override
    public void removeFirst()
    {
        if (null == head) return;
        if (size == 1)
        {
            head = null;
            tail = null;
        } else
        {
            head.next().setPrevious(null);
            head = head.next();
        }
        size--;
    }

    @Override
    public void removeLast()
    {
        if (null == tail) return;
        if (size == 1)
        {
            head = null;
            tail = null;
        } else
        {
            tail.previous().setNext(null);
            tail = tail.previous();
        }
        size--;
    }

    @Override
    public Node getFirst()
    {
        return head;
    }

    @Override
    public Node getLast()
    {
        return tail;
    }

    @Override
    public Node get(int index)
    {
        if (index < 0 || index >= size) throw new InvalidListIndexException();
        Node result = head;
        for (int currentIndex = 0; currentIndex < size; currentIndex++)
        {
            if (currentIndex == index) break;
            result = result.next();
        }
        return result;
    }

    @Override
    public boolean isEmpty()
    {
        return null == head;
    }

    @Override
    public boolean isNotEmpty()
    {
        return !isEmpty();
    }

    @Override
    public Iterator<Node<T>> iterator()
    {
        return new Iterator<Node<T>>()
        {
            private Node<T> cursor = head;

            @Override
            public boolean hasNext()
            {
                return null != cursor;
            }

            @Override
            public Node<T> next()
            {
                if (!hasNext()) throw new NoSuchElementException();
                Node<T> tmp = cursor;
                cursor = tmp.next();
                return tmp;
            }
        };
    }

    public void swap(int nodeA, int nodeB)
    {
        Node<T> tmpA = get(nodeA);
        Node<T> tmpB = get(nodeB);

        if (tmpA.previous() == tmpB)
        {
            tmpB.setNext(tmpA.next());
            tmpA.setPrevious(tmpB.previous());
            tmpA.setNext(tmpB);
        } else if (tmpA.next() == tmpB)
        {

        }

    }
}
