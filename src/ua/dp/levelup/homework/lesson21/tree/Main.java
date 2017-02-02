package ua.dp.levelup.homework.lesson21.tree;

/**
 * Created by java on 27.01.2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        BinaryTree<Integer> tree = new BinaryTree<>(Integer::compare);
        tree.add(10);
        tree.add(9);
        tree.add(8);
        tree.add(20);
        tree.add(24);
        tree.add(5);
        tree.add(16);

        tree.remove(24);

        tree.print();

    }
}
