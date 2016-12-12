package ua.dp.levelup.homework.lesson9;

/**
 * Created by andrey on 04.12.16.
 */
public class Student
{
//    3. Описать объект студента который должен обладать свойствами: имя(строка), фамилия(строка), возраст(число),
// язык(перечисление), факультет(перечисление).

    String name;
    String lastName;
    int age;
    Lang language;
    Faculty faculty;

    public Student(String name, String lastName, int age, Lang language, Faculty faculty)
    {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.language = language;
        this.faculty = faculty;
    }

    @Override
    public String toString()
    {
        switch (language)
        {
            case EN:
                return name + " " + lastName + " is " + age + " years old and studying at " + (faculty == null ? " " : faculty.nameEn) + " faculty";
            case RU:
                return name + " " + lastName + " " + age + " лет, студент факультета " + (faculty == null ? " " : faculty.nameRu);
        }
        return null;
    }

    public static void main(String[] args)
    {
        Student s1 = new Student("Ron", "Weasley", 24, Lang.EN, Faculty.GRIFFINDOR);
        Student s2 = new Student("Ron", "Weasley", 24, Lang.RU, Faculty.SLYTHERIN);
        System.out.println(s1);
        System.out.println(s2);
    }
}
