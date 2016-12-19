package ua.dp.levelup.homework.lesson13;

import ua.dp.levelup.homework.lesson13.Drinks.Drink;
import ua.dp.levelup.homework.lesson13.People.Barman;
import ua.dp.levelup.homework.lesson13.People.Positions;
import ua.dp.levelup.homework.lesson13.People.Waiter;

import java.util.Arrays;

/**
 * Created by andreypo on 12/19/2016.
 */
public class Main
{

    public static void main(String[] args)
    {

        Bar bar = new Bar("Andrey's bar");
        bar.addDrinkToStorage(new Drink("Vodka"), 5);
        bar.addDrinkToStorage(new Drink("Wine"), 5);


        Barman b1 = new Barman("Barman", 33, "Margarita");
        Waiter w1 = new Waiter("Waiter", 30);
        bar.addEmployee(b1);
        bar.addEmployee(w1);
        bar.addEmployee("John Doe", 26, Positions.BARMAN);
        bar.addEmployee("Miranda Wells", 26, Positions.BARMAN);


        w1.takeOrder(new Order(new Drink("Vodka"), 2));
        w1.takeTip(100);
        w1.takeTip(200);
        System.out.println(bar);
        b1.completeOrder("Vodka", 2);
        System.out.println(bar);
    }
}
