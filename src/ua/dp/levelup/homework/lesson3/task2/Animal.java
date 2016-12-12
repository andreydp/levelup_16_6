package ua.dp.levelup.homework.lesson3.task2;

/**
 * Created by andrey on 13.11.16.
 */
public class Animal
{
    /*
        Задание 2
        Создать класс Animal c полями (атрибутами):
            ·        vegetarian, принимающим значение true или false
            ·        eats, принимающим то, чем питается животное
        ·        noOfLegs, принимающим количество конечностей
        Создать конструктор со всеми параметрами.
        Создать методы:
            ·        isVegetarian()
        ·        getEats()
        ·        getNoOfLegs()
        Создать классы-наследники для класса Animal с названиями Fish и Bird, Mammal.
        В каждом классе должны быть конструкторы (Не забываем использовать ключевые слова this и super).
        Создать класс-наследник для класса Fish с названием Shark.
        Создать класс-наследник для класса Bird с названием Eagle.
        Создать класс-наследник для класса Mammal с названием Сow.
        И добавить в эти классы по одному отличительному свойству, например для класса Cow таким свойством будет hoof (наличие копыт).
        В конечных классах-наследниках реализовать несколько конструкторов с разным набором параметров.
        В методе main класса Main создать объекты классов Shark, Eagle, Сow, используя все доступные конструкторы. Также вывести на экран результаты вызова доступных методов.
    */
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    Animal(boolean vegetarian, String eats, int noOfLegs)
    {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    protected boolean isVegetarian()
    {
        return vegetarian;
    }

    protected String getEats()
    {
        return eats;
    }

    protected int getNoOfLegs()
    {
        return noOfLegs;
    }

    @Override
    public String toString()
    {
        return "Animal{" +
                "vegetarian=" + vegetarian +
                ", eats='" + eats + '\'' +
                ", noOfLegs=" + noOfLegs +
                '}';
    }
}
