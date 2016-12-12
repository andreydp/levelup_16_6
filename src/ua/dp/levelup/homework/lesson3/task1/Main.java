package ua.dp.levelup.homework.lesson3.task1;

/**
 * Created by andrey on 13.11.16.
 */
public class Main
{

    public static void main(String[] args)
    {
        Account acc1 = new Account();
        Account acc2 = new Account(1);
        Account acc3 = new Account(2, 20);

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);

        System.out.println("------------------------");

        System.out.println("id :" + acc1.getId() + " Amount:" + acc1.getAmount());
        System.out.println("id :" + acc2.getId() + " Amount:" + acc2.getAmount());
        System.out.println("id :" + acc3.getId() + " Amount" + acc3.getAmount());
    }
}
