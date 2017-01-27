package ua.dp.levelup.homework.lesson20;

/**
 * Created by andrey on 25.01.17.
 */
public class Main
{
    public static void main(String[] args)
    {
        SingleLinkedList list = new SingleLinkedList();
        list.addFirst(new Node(5));
        list.addFirst(new Node(4));
        list.addFirst(new Node(3));
        list.addFirst(new Node(2));
        list.addFirst(new Node(1));
        list.addFirst(new Node(0));


//        list.swap(0,2);
        list.swap(2,0);



        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println(list.size);
    }
}
