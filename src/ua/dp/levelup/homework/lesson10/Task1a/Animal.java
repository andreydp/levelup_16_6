package ua.dp.levelup.homework.lesson10.Task1a;

/**
 * Created by andreypo on 12/8/2016.
 */
class Animal
{
    private String name;

    protected void run()
    {
        System.out.println(name + " run!");
    }

    protected void jump()
    {
        System.out.println(name + " jump!");
    }

    Animal(String name)
    {
        this.name = name;
    }

    String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Animal{" + "name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return name != null ? name.equals(animal.name) : animal.name == null;

    }

    @Override
    public int hashCode()
    {
        int salt = 42;
        return name != null ? name.hashCode() * salt + 1 : 0;
    }

    public static void main(String[] args)
    {
        Animal a1 = new Dog("Dog1");
        Animal a2 = new Puppy("Puppy");
        Animal a3 = new Animal("Animal1");


        Animal[] arr = new Animal[3];

        arr[0] = a1;
        arr[1] = a2;
        arr[2] = a3;

        for (Animal a : arr)
        {
            System.out.println(a.getName());
        }

    }
}
