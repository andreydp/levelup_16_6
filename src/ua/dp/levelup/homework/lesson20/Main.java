package ua.dp.levelup.homework.lesson20;

/**
 * Created by andrey on 25.01.17.
 */
public class Main
{
    public static void main(String[] args)
    {

        AbstractList list = new DoubleLinkedList();
        list.addLast(new Node(1));
        list.addLast(new Node(2));
        list.addLast(new Node(3));
        list.addLast(new Node(4));

        list.addNode(new Node(5), 3);
        list.addNode(new Node(6), 3);
        list.addNode(new Node(7), 3);

        list.remove(1);
        list.remove(1);
        list.remove(1);
        list.remove(1);
        list.remove(1);
        list.remove(1);

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println(list.size);
    }
}
