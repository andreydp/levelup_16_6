package ua.dp.levelup.homework.lesson20;

/**
 * Created by andrey on 25.01.17.
 */
public class DoubleLinkedList extends AbstractList
{
    private Node head = null;
    private Node tail = null;

    @Override
    public void addNode(Node node, int index)
    {
        if (index < 0 || index > size || (null == head && index != 0)) throw new InvalidListIndexException();
        if (null == node) return;
        if (index == 0)
        {
            addFirst(node);
            return;
        }
        if (index == size - 1)
        {
            addLast(node);
        } else
        {
            Node tmp = head;
            for (int currentIndex = 0; currentIndex < size; currentIndex++)
            {
                if (currentIndex == index - 1)
                {
                    node.setNext(tmp.next());
                    node.setPrevious(tmp);
                    tmp.setNext(node);
                    if (currentIndex == size - 1) tail = node;
                    size++;
                    break;
                }
                tmp = tmp.next();
            }
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
}
