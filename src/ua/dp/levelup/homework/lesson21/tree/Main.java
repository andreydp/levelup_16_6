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

        tree.print();

        System.out.println(tree.search(9));
        tree.remove(10);
        tree.remove(9);
        tree.remove(8);
        tree.print();

    }
}
