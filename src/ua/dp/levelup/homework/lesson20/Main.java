package ua.dp.levelup.homework.lesson20;

/**
 * Created by andrey on 25.01.17.
 */
public class Main
{
    public static void main(String[] args)
    {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.addFirst(new Node(3));
        list.addFirst(new Node(2));
        list.addFirst(new Node(1));

        list.swap(1,2);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

    }
}
