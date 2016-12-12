package ua.dp.levelup.homework.lesson3.task2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by andrey on 13.11.16.
 */
public class Main
{
    public static void main(String[] args)
    {
        Animal shark1 = new Shark(true, "Molusks", 0, false);
        Animal shark2 = new Shark(true);
        Animal shark3 = new Shark("Sea Lions");
        Animal shark4 = new Shark("Human divers", true);
        Animal cow1 = new Cow(false);
        Animal cow2 = new Cow(false, "Insects");
        Animal cow3 = new Cow(true, "Grain", 4, true);
        Animal bird1 = new Bird(false, "Rabbits", 2, true);
        Animal bird2 = new Bird(false);
        Animal bird3 = new Bird("Birds", true);

        List<Animal> animalsList = new LinkedList<>();
        animalsList.add(shark1);
        animalsList.add(shark2);
        animalsList.add(shark3);
        animalsList.add(shark4);
        animalsList.add(cow1);
        animalsList.add(cow2);
        animalsList.add(cow3);
        animalsList.add(bird1);
        animalsList.add(bird2);
        animalsList.add(bird3);

        for (int i = 0; i < animalsList.size(); i++)
        {
            Animal currentAnimal = animalsList.get(i);
            if (i == 0)
            {
                System.out.println("Printing list of all animals created via contructors:\n");
            }
            System.out.println(currentAnimal);

        }
        System.out.println("");
        System.out.println("---------------------------------");

        for (int i = 0; i < animalsList.size(); i++)
        {
            Animal currentAnimal = animalsList.get(i);
            if (i == 0)
            {
                System.out.println("Printing animal exceptrional ability via get methods:\n");
            }
            System.out.println(currentAnimal.isVegetarian() + " " + currentAnimal.getEats() + " " + currentAnimal.getNoOfLegs());
        }

    }
}
