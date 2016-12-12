package ua.dp.levelup.homework.lesson10.Task1a;

/**
 * Created by andreypo on 12/8/2016.
 */
public class Dog extends Animal
{
    Dog(String name)
    {
        super(name);
    }

    void bark()
    {
        System.out.println(this.getName() + " bark!");
    }

    void bite()
    {
        System.out.println(this.getName() + " bite!");
    }

    @Override
    public String toString()
    {
        return "Dog{" + "name='" + this.getName() + '\'' + '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return this.getName() != null ? this.getName().equals(dog.getName()) : dog.getName() == null;
    }

    @Override
    public int hashCode()
    {
        int salt = 43;
        return this.getName() != null ? this.getName().hashCode() * salt + 7 : 0;
    }
}
