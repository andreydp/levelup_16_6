package ua.dp.levelup.homework.lesson28.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andreypo on 2/17/2017.
 */
public class Department
{
    private String name;
    private List<Employee> employeeList;

    public Department(String name, List<Employee> employeeList)
    {
        this.name = name;
        this.employeeList = employeeList;
    }

    public List<Integer> getEmployeeIDs()
    {
        List<Integer> result = new ArrayList<>();

        for (Employee employee : employeeList)
        {
            result.add(employee.getEmployeeId());
        }
        return result;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Employee> getEmployeeList()
    {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList)
    {
        this.employeeList = employeeList;
    }
}
