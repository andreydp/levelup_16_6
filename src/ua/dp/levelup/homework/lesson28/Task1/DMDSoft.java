package ua.dp.levelup.homework.lesson28.Task1;

import ua.dp.levelup.homework.lesson28.Task1.entity.Department;
import ua.dp.levelup.homework.lesson28.Task1.entity.impl.Developer;
import ua.dp.levelup.homework.lesson28.Task1.util.CmdLineParser;

import java.util.*;

/**
 * Created by andreypo on 2/17/2017.
 */
public class DMDSoft
{
    public static List<Department> departmentList = new ArrayList<>();

    public static List<String> departmentNames()
    {
        List<String> result = new ArrayList<>();

        for (Department aDepartment : departmentList)
        {
            result.add(aDepartment.getName());
        }
        return result;
    }

    void initialize()
    {
        Department devDepartment = new Department("Developers");
        devDepartment.addEmployeesList(Arrays.asList(
                new Developer("Mark", "Tsukerberg", 5000),
                new Developer("Gabe", "Newell", 4000),
                new Developer("Bill", "Gates", 5000),
                new Developer("Pavel", "Durov", 6000),
                new Developer("Paul", "Tones", 7000),
                new Developer("Donald", "Trump", 8000),
                new Developer("Barak", "Obama", 9000),
                new Developer("John", "Doe", 2000)
        ));
        Department managerDepartment = new Department("Managers");
        managerDepartment.addEmployeesList(Arrays.asList(
                new Developer("Mark", "Tsukerberg", 5000),
                new Developer("Gabe", "Newell", 4000),
                new Developer("Bill", "Gates", 5000),
                new Developer("Pavel", "Durov", 6000),
                new Developer("Paul", "Tones", 7000),
                new Developer("Donald", "Trump", 8000),
                new Developer("Barak", "Obama", 9000),
                new Developer("John", "Doe", 2000)
        ));
        departmentList.add(devDepartment);
        departmentList.add(managerDepartment);

        new CmdLineParser();
    }
}