package ua.dp.levelup.homework.lesson20.double_linked_list;

/**
 * Created by andreypo on 2/2/2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        DoubleLinkedList list = new DoubleLinkedList();

        list.addLast(new Node(1));
        list.addLast(new Node(2));
        list.addLast(new Node(3));
        list.addLast(new Node(4));
        list.addLast(new Node(5));

        list.swap(4, 1);
        //        list.swap(0, 1);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
    }
}
