package ua.dp.levelup.homework.lesson3.task1;

/**
 * Created by andrey on 13.11.16.
 */
public class Account
{
/*
    Задание 1
    Создать класс Account c полями (атрибутами) id и amount, конструкторами (без параметров, с параметром id, с двумя параметрами) и методами (getAmount(), getId()) для инициализации и извлечения значений атрибутов.
    В методе main класса Main создать 3 объекта класса Account инициализируя поля при помощи конструкторов. Также вывести на экран результаты вызова доступных методов.
*/

    int id;
    int amount;

    public Account()
    {
        this.id = 0; //Default id
        this.amount = 10; //Default amount
    }

    public Account(int id)
    {
        this.id = id;
        this.amount = 10; //Default amount
    }

    public Account(int id, int amount)
    {
        this.id = id;
        this.amount = amount;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    public int getId()
    {
        return id;
    }

    public int getAmount()
    {
        return amount;
    }


    @Override
    public String toString()
    {
        return "Account{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
