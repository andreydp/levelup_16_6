package ua.dp.levelup.homework.lesson20;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Created by java on 24.01.2017.
 */
public class SingleLinkedList<T> extends AbstractList<Node<T>> implements Iterable<Node<T>>
{
    private Node<T> root = null;

    @Override
    public void add(Node<T> node, int index)
    {
        if (index < 0 || index > size || (null == root && index != 0)) throw new InvalidListIndexException();
        if (null == node) return;
        if (index == 0)
        {
            addFirst(node);
        } else if (index == size - 1)
        {
            addLast(node);
        } else
        {
            Node<T> tmp = root;
            for (int currentIndex = 0; currentIndex < size; currentIndex++)
            {
                if (currentIndex == index - 1)
                {
                    node.setNext(tmp.next());
                    tmp.setNext(node);
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
        if (index < 0 || index > size || null == root) throw new InvalidListIndexException();
        if (index == 0)
        {
            removeFirst();
        } else if (index == size - 1)
        {
            removeLast();
        } else
        {
            Node<T> tmp = root;
            for (int currentIndex = 0; currentIndex < size; currentIndex++)
            {
                if (currentIndex == index - 1)
                {
                    tmp.setNext(tmp.next().next());
                    size--;
                    break;
                }
                tmp = tmp.next();
            }
        }
    }

    @Override
    public void addFirst(Node<T> node)
    {
        if (null == node) return;
        if (null == root)
        {
            root = node;
        } else
        {
            node.setNext(root);
            root = node;
        }
        size++;
    }

    @Override
    public void addLast(Node<T> node)
    {
        if (null == node) return;
        if (null == root)
        {
            root = node;
        } else
        {
            Node<T> tmp = root;
            while (tmp.next() != null)
            {
                tmp = tmp.next();
            }
            tmp.setNext(node);
        }
        size++;
    }

    @Override
    public void removeFirst()
    {
        Node<T> first = root;
        if (null == first)
        {
            return; //do nothing
        }
        root = first.next(); //can be null, if list size = 1
        if (first.next() != null)
        {
            first.setNext(null);
        }
        size--;
    }

    @Override
    public void removeLast()
    {
        Node<T> first = root;
        if (null == first) return;
        if (null == first.next())
        {
            root = null;
        } else
        {
            Node<T> tmp = first.next();
            Node<T> prev = tmp;
            while (null != tmp.next())
            {
                prev = tmp;
                tmp = tmp.next();
            }
            prev.setNext(null);
        }
        size--;
    }

    @Override
    public Optional<Node<T>> getFirst()
    {
        return Optional.ofNullable(root);
    }

    @Override
    public Optional<Node<T>> getLast()
    {
        Node<T> last = root;
        while (last != null && last.next() != null)
        {
            last = last.next();
        }
        return Optional.ofNullable(last);
    }

    @Override
    public Optional<Node<T>> get(int index)
    {
        if (index < 0 || index >= size) throw new InvalidListIndexException();
        Node<T> result = root;
        for (int currentIndex = 0; currentIndex < size; currentIndex++)
        {
            if (currentIndex == index) break;
            result = result.next();
        }
        return Optional.ofNullable(result);
    }

    @Override
    public boolean isEmpty()
    {
        return null == root;
    }

    @Override
    public boolean isNotEmpty()
    {
        return !isEmpty();
    }

    public void swap(int nodeA, int nodeB)
    {
        if (nodeA < 0 || nodeA >= size || nodeB < 0 || nodeB >= size)
            throw new InvalidListIndexException("Cannot swap to incorrect index");
        if (nodeA == nodeB) return;

        Node<T> aNode = get(nodeA).orElse(null);
        Node<T> bNode = get(nodeB).orElse(null);

        //swap nearby elements
        if (Math.abs(nodeA - nodeB) == 1)
        {
            if (nodeA == 0)
            {
                root = bNode;
                aNode.setNext(bNode.next());
                bNode.setNext(aNode);
            } else if (nodeB == 0)
            {
                root = aNode;
                bNode.setNext(aNode.next());
                aNode.setNext(bNode);
            } else
            {
                if (nodeA < nodeB)
                {
                    get(nodeA - 1).get().setNext(bNode);
                    aNode.setNext(bNode.next());
                    bNode.setNext(aNode);
                }
                if (nodeB < nodeA)
                {
                    get(nodeB - 1).get().setNext(aNode);
                    bNode.setNext(aNode.next());
                    aNode.setNext(bNode);
                }
            }
        } else if (nodeA == 0)
        {
            Node tmp = aNode.next();
            get(nodeB - 1).get().setNext(aNode);
            aNode.setNext(bNode.next());
            bNode.setNext(tmp);
            root = bNode;

        } else if (nodeB == 0)
        {
            Node tmp = bNode.next();
            get(nodeA - 1).get().setNext(bNode);
            bNode.setNext(aNode.next());
            aNode.setNext(tmp);
            root = aNode;
        }
    }

    @Override
    public Iterator<Node<T>> iterator()
    {
        return new Iterator<Node<T>>()
        {
            private Node<T> cursor = root;

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
}
