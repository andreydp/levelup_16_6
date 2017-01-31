package ua.dp.levelup.homework.lesson21.tree;

import java.util.Comparator;

/**
 * Created by java on 27.01.2017.
 */
public class BinaryTree<T> implements Tree<T>
{
    private class Node<V>
    {
        @Override
        public String toString()
        {
            return "Node{" +
                    "value=" + value +
                    '}';
        }

        private Node<V> parent;
        private Node<V> left;
        private Node<V> right;
        private final V value;

        public Node(V value)
        {
            this.value = value;
        }

        public Node<V> getParent()
        {
            return parent;
        }

        public void setParent(Node<V> parent)
        {
            this.parent = parent;
        }

        public Node<V> getLeft()
        {
            return left;
        }

        public void setLeft(Node<V> left)
        {
            left.setParent(this);
            this.left = left;
        }

        public Node<V> getRight()
        {
            return right;
        }

        public void setRight(Node<V> right)
        {
            right.setParent(this);
            this.right = right;
        }

        public V getValue()
        {
            return value;
        }

    }

    private Node<T> root;
    private int size = 0;
    private final Comparator<T> comparator;

    public BinaryTree(Comparator<T> comparator)
    {
        this.comparator = comparator;
    }

    @Override
    public void add(T value)
    {
        if (null == root)
        {
            root = new Node<>(value);
        } else
        {
            add(value, root);
        }
    }

    private void add(T val, Node<T> parent)
    {
        if (comparator.compare(val, parent.getValue()) == 0)
        {
            return;
        }
        if (comparator.compare(val, parent.getValue()) < 0)
        {
            if (parent.getLeft() == null)
            {
                parent.setLeft(new Node<>(val));
            } else
            {
                add(val, parent.getLeft());
            }
        } else if (comparator.compare(val, parent.getValue()) > 0)
        {
            if (parent.getRight() == null)
            {
                parent.setRight(new Node<>(val));
            } else
            {
                add(val, parent.getRight());
            }
        }
    }

    public Node<T> search(T value)
    {
        if (root == null)
            return null;
        else
            return search(value, root);
    }

    private Node<T> search(T value, Node<T> parent)
    {
        if (comparator.compare(value, parent.getValue()) == 0)
        {
            return parent;
        } else if (comparator.compare(value, parent.getValue()) < 0)
        {
            if (parent.getLeft() == null)
                return null;
            else
                return search(value, parent.getLeft());
        } else if (comparator.compare(value, parent.getValue()) > 0)
        {
            if (parent.getRight() == null)
                return null;
            else
                return search(value, parent.getRight());
        }
        return null;
    }

    @Override
    public void addAll(T[] value)
    {

    }

    @Override
    public void remove(T value)
    {
        if (root == null) return;
        Node<T> node = search(value);
        if (null != node)
        {
            if (root == node)
            {
                if (null == root.getLeft() && null == root.getRight())
                {
                    root = null;
                    return;
                }
                if (null != root.getLeft() && null == root.getRight())
                {
                    root = root.getLeft();
                    return;
                }
                if (null == root.getLeft() && null != root.getRight())
                {
                    root = root.getRight();
                }
            } else if (null == node.getLeft() && null == node.getRight())
            {
                if (comparator.compare(value, node.getParent().getValue()) < 0)
                {

                }
            }
        }
    }

    public void remove(T value, Node<T> parent)
    {

    }

    @Override
    public void print()
    {
        if (null == root) return;
        printChild(root);
    }

    private void printChild(Node<T> parent)
    {
        if (null != parent.getLeft())
        {
            printChild(parent.getLeft());
        }

        System.out.println(parent.getValue());

        if (null != parent.getRight())
        {
            printChild(parent.getRight());
        }
    }
}
