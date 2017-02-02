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
            if (left != null) left.setParent(this);
            this.left = left;
        }

        public Node<V> getRight()
        {
            return right;
        }

        public void setRight(Node<V> right)
        {
            if (right != null) right.setParent(this);
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
        size++;
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
        if (root == null) return null;
        else return search(value, root);
    }

    private Node<T> search(T value, Node<T> parent)
    {
        if (comparator.compare(value, parent.getValue()) == 0)
        {
            return parent;
        } else if (comparator.compare(value, parent.getValue()) < 0)
        {
            if (parent.getLeft() == null) return null;
            else return search(value, parent.getLeft());
        } else if (comparator.compare(value, parent.getValue()) > 0)
        {
            if (parent.getRight() == null) return null;
            else return search(value, parent.getRight());
        }
        return null;
    }

    @Override
    public void addAll(T[] value)
    {
        for (T v : value)
        {
            add(v);
        }
    }

    @Override
    public void remove(T value)
    {
        if (root == null) return;
        Node<T> currentNode = search(value);
        if (null != currentNode)
        {
            size--;

            Node<T> parent = currentNode.getParent();
            // Case 1: If current has no right child, current's left replaces current.
            if (currentNode.getRight() == null)
            {
                if (parent == null)
                {
                    root = currentNode.getLeft();
                } else
                {
                    int result = comparator.compare(parent.getValue(), value);
                    if (result > 0)
                    {
                        // If parent value is greater than current value,
                        // make the current left child a left child of parent.
                        parent.setLeft(currentNode.getLeft());
                    } else if (result < 0)
                    {
                        // If parent value is less than current value,
                        // make the current left child a right child of parent.
                        parent.setRight(currentNode.getLeft());
                    }
                }
            }
            // Case 2: If current's right child has no left child, current's right child
            //         replaces current.
            else if (currentNode.getRight().getLeft() == null)
            {
                currentNode.getRight().setLeft(currentNode.getLeft());

                if (parent == null)
                {
                    root = currentNode.getRight();
                } else
                {
                    int result = comparator.compare(parent.getValue(), value);
                    if (result > 0)
                    {
                        // If parent value is greater than current value,
                        // make the current right child a left child of parent.
                        parent.setLeft(currentNode.getRight());
                    } else if (result < 0)
                    {
                        // If parent value is less than current value,
                        // make the current right child a right child of parent.
                        parent.setRight(currentNode.getRight());
                    }
                }
            }
            // Case 3: If current's right child has a left child, replace current with current's
            //         right child's left-most child.
            else
            {
                // Find the right's left-most child.
                Node<T> leftmost = currentNode.getRight().getLeft();
                Node<T> leftmostParent = currentNode.getRight();

                while (leftmost.getLeft() != null)
                {
                    leftmostParent = leftmost;
                    leftmost = leftmost.getLeft();
                }

                // The parent's left subtree becomes the leftmost's right subtree.
                leftmostParent.setLeft(leftmost.getRight());

                // Assign leftmost's left and right to current's left and right children.
                leftmost.setLeft(currentNode.getLeft());
                leftmost.setRight(currentNode.getRight());

                if (parent == null)
                {
                    root = leftmost;
                } else
                {
                    int result = comparator.compare(parent.getValue(), value);
                    if (result > 0)
                    {
                        // If parent value is greater than current value,
                        // make leftmost the parent's left child.
                        parent.setLeft(leftmost);
                    } else if (result < 0)
                    {
                        // If parent value is less than current value,
                        // make leftmost the parent's right child.
                        parent.setRight(leftmost);
                    }
                }
            }
        }
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
