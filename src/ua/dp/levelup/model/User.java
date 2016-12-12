package ua.dp.levelup.model;

/**
 * Created by java on 11.11.2016.
 */
public class User
{
    String firstName_;
    String lastName_;
    int age_;
    char gender_;

    public User(String firstName, String lastName, int age, char gender)
    {
        this.firstName_ = firstName;
        this.lastName_ = lastName;
        this.age_ = age;
        this.gender_ = gender;
    }

    @Override
    public String toString()
    {
        return "[firstname=" +  firstName_ + ", lastName=" + lastName_ + ", age=" + age_ + ", gender=" + gender_ + "]";
    }

    public static void main(String[] args)
    {
        User user = new User("Andrey", "Poletaiev", 28, 'm');
        System.out.println(user);
    }
}
