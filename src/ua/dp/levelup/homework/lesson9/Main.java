package ua.dp.levelup.homework.lesson9;

import static ua.dp.levelup.homework.lesson9.Faculty.*;

/**
 * Created by andrey on 04.12.16.
 */
public class Main
{
    public static void main(String[] args)
    {
        // Newbie student will have null Faculty, maybe not the best way of initializing like this. Think of adding dummy Faculty.
        Student[] students = new Student[20];
        students[0] = new Student("Ron", "Weasley", 24, Lang.EN, null);
        students[1] = new Student("Ron", "Weasley", 25, Lang.EN, null);
        students[2] = new Student("Ron", "Weasley", 26, Lang.EN, null);
        students[3] = new Student("Ron", "Weasley", 27, Lang.EN, null);
        students[4] = new Student("Ron", "Weasley", 28, Lang.EN, null);
        students[5] = new Student("Ron", "Weasley", 29, Lang.EN, null);
        students[6] = new Student("Ron", "Weasley", 30, Lang.EN, null);
        students[7] = new Student("Ron", "Weasley", 24, Lang.EN, null);
        students[8] = new Student("Ron", "Weasley", 24, Lang.EN, null);
        students[9] = new Student("Ron", "Weasley", 24, Lang.EN, null);
        students[10] = new Student("Ron", "Weasley", 24, Lang.EN, null);
        students[11] = new Student("Ron", "Weasley", 24, Lang.EN, null);
        students[12] = new Student("Ron", "Weasley", 24, Lang.EN, null);
        students[13] = new Student("Ron", "Weasley", 24, Lang.EN, null);
        students[14] = new Student("Ron", "Weasley", 24, Lang.EN, null);
        students[15] = new Student("Ron", "Weasley", 24, Lang.EN, null);
        students[16] = new Student("Ron", "Weasley", 24, Lang.EN, null);
        students[17] = new Student("Ron", "Weasley", 24, Lang.EN, null);
        students[18] = new Student("Ron", "Weasley", 24, Lang.EN, null);
        students[19] = new Student("Ron", "Weasley", 20, Lang.EN, null);
        Faculty.organizeStudents(students, 5);

        System.out.println(getFacultyCount(students, Faculty.GRIFFINDOR));
        System.out.println(getFacultyCount(students, Faculty.SLYTHERIN));
        System.out.println(getFacultyCount(students, Faculty.HUFFLEPUFF));
        System.out.println(getFacultyCount(students, Faculty.RAVENCLAW));
    }
}
