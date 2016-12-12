package ua.dp.levelup.homework.lesson10.Task1a;

/**
 * Created by andreypo on 12/8/2016.
 */
public class Puppy extends Dog
{
    //    1) Создать объект класса Щенок, используя классы Животное, Собака. Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.
    Puppy(String name)
    {
        super(name);
    }

    @Override
    public String toString()
    {
        return "Puppy{" + "name='" + this.getName() + '\'' + '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Puppy puppy = (Puppy) o;

        return this.getName() != null ? this.getName().equals(puppy.getName()) : puppy.getName() == null;
    }

    @Override
    public int hashCode()
    {
        int salt = 44;
        return this.getName() != null ? this.getName().hashCode() * salt + 9 : 0;
    }
}
