package ua.dp.levelup.homework.lesson20.double_linked_list;

import ua.dp.levelup.homework.lesson20.AbstractList;
import ua.dp.levelup.homework.lesson20.InvalidListIndexException;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Created by andrey on 25.01.17.
 */
public class DoubleLinkedList<T> extends AbstractList<Node<T>> implements Iterable<Node<T>>
{
    private Node<T> head = null;
    private Node<T> tail = null;

    @Override
    public void add(Node<T> node, int index)
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
            Node<T> tmp = get(index).get();
            node.setNext(tmp.getNext());
            node.setPrev(tmp);
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
            Node<T> tmp = head;
            for (int currentIndex = 0; currentIndex <= index; currentIndex++)
            {
                if (currentIndex == index)
                {
                    tmp.getNext().setPrev(tmp.getPrev());
                    tmp.getPrev().setNext(tmp.getNext());
                    size--;
                    break;
                }
                tmp = tmp.getNext();
            }
        }
    }

    @Override
    public void addFirst(Node<T> node)
    {
        if (null == node) return;
        if (null == head)
        {
            head = node;
            tail = node;
        } else
        {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
        size++;
    }

    @Override
    public void addLast(Node<T> node)
    {
        if (null == node) return;
        if (null == tail)
        {
            addFirst(node);
            return;
        } else
        {
            tail.setNext(node);
            node.setPrev(tail);
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
            head.getNext().setPrev(null);
            head = head.getNext();
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
            tail.getPrev().setNext(null);
            tail = tail.getPrev();
        }
        size--;
    }

    @Override
    public Optional<Node<T>> getFirst()
    {
        return Optional.ofNullable(head);
    }

    @Override
    public Optional<Node<T>> getLast()

    {
        return Optional.ofNullable(tail);

    }

    @Override
    public Optional<Node<T>> get(int index)
    {
        if (index < 0 || index >= size) throw new InvalidListIndexException();
        Node<T> result = head;
        for (int currentIndex = 0; currentIndex < size; currentIndex++)
        {
            if (currentIndex == index) break;
            result = result.getNext();
        }
        return Optional.ofNullable(result);
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
                cursor = tmp.getNext();
                return tmp;
            }
        };
    }

    public Iterator<Node<T>> descendingIterator()
    {
        return new Iterator<Node<T>>()
        {
            private Node<T> cursor = tail;

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
                cursor = tmp.getPrev();
                return tmp;
            }
        };
    }

    public void swap(int nodeA, int nodeB)
    {
        if (nodeA < 0 || nodeA >= size || nodeB < 0 || nodeB >= size) throw new InvalidListIndexException();
        if (nodeA == nodeB) return;

        Node<T> ANode = get(nodeA).get();
        Node<T> BNode = get(nodeB).get();

        Node<T> ANodePrev = ANode.getPrev();
        Node<T> BNodePrev = BNode.getPrev();

        Node<T> ANodeNext = ANode.getNext();
        Node<T> BNodeNext = BNode.getNext();

        if (BNode == ANodeNext)
        {
            BNode.setNext(ANode);
            BNode.setPrev(ANodePrev);
            ANode.setNext(BNodeNext);
            ANode.setPrev(BNode);
            BNodeNext.setPrev(ANode);
            if (null == ANodePrev)
            {
                head = BNode;
            } else
            {
                ANodePrev.setNext(BNode);
            }
        } else if (ANode == BNodeNext)
        {
            ANode.setNext(BNode);
            ANode.setPrev(BNodePrev);
            BNode.setNext(ANodeNext);
            BNode.setPrev(ANode);
            if (null == BNodePrev)
            {
                head = ANode;
            } else
            {
                BNodePrev.setNext(BNode);
            }
        } else
        {
            if (null == ANodePrev)
            {
                head = BNode;
            } else
            {
                ANodePrev.setNext(BNode);
            }
            BNode.setNext(ANodeNext);
            if (null == BNodePrev)
            {
                head = ANode;
            } else
            {
                BNodePrev.setNext(ANode);
            }
            ANode.setNext(BNodeNext);
            BNode.setPrev(ANodePrev);
            if (null == BNodeNext)
            {
                tail = ANode;
            } else
            {
                BNodeNext.setPrev(ANode);
            }
            ANode.setPrev(BNodePrev);
            if (null == ANodeNext)
            {
                tail = BNode;
            } else
            {
                ANodeNext.setPrev(BNode);
            }
        }
    }
}
