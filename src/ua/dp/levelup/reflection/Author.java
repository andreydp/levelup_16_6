package ua.dp.levelup.reflection;

/**
 * Created by andrey on 07.03.17.
 */
public class Author
{
    @ToXML
    private String firstName;
    @ToXML
    private String lastName;
    @ToXML
    private int age;

    public Author(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
