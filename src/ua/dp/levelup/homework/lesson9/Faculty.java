package ua.dp.levelup.homework.lesson9;

import java.util.Random;

/**
 * Created by andrey on 04.12.16.
 */
public enum Faculty
{
    GRIFFINDOR("Griffindor", "Гриффиндор"), SLYTHERIN("Slytherin", "Слизерин"), HUFFLEPUFF("Hufflepuff", "Хаффлпафф"), RAVENCLAW("Ravenclaw", "Рейвенклоу");

    String nameEn;
    String nameRu;

    Faculty(String nameEn, String nameRu)
    {
        this.nameEn = nameEn;
        this.nameRu = nameRu;
    }

    static Faculty getRandomFaculty()
    {
        return Faculty.values()[new Random().nextInt(Faculty.values().length)];
    }

//    static Faculty getRandomFaculty (Faculty excludeFaculty)
//    {
//        Faculty newFaculty = getRandomFaculty();
//        return newFaculty == excludeFaculty ? getRandomFaculty() : newFaculty;
//    }

    static int getFacultyCount(Student[] students, Faculty faculty)
    {
        int result = 0;
        for (Student currentStudent : students)
            if (null != currentStudent.faculty && currentStudent.faculty == faculty)
            {
                result++;
            }
        return result;
    }

    //Rude but simple way to check if limit of faculty was already breached. TODO: think of beatyfing
    public static void organizeStudents(Student[] students, int facultyLimit)
    {
        for (int i = 0; i < students.length; i++)
        {
            Faculty currentFaculty = getRandomFaculty();
            if (getFacultyCount(students, currentFaculty) != facultyLimit)
            {
                students[i].faculty = currentFaculty;
            }
            else
            {
                i--;
            }
        }
    }
}
