package ua.dp.levelup.homework.lesson28.Task1.entity;

import java.util.*;

/**
 * Created by andreypo on 2/17/2017.
 */
public class Department
{
    private String name;
    private Map<Integer, Employee> employeeMap;

    public Department(String name)
    {
        this.name = name;
        this.employeeMap = new HashMap<>();
    }

    public Employee getEmployeeById(Integer id)
    {
        return employeeMap.get(id);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Map<Integer, Employee> getEmployeeMap()
    {
        return employeeMap;
    }

    public Set<Integer> getEmployeeIdSet()
    {
        return employeeMap.keySet();
    }

    public void addEmployee(Employee employee)
    {
        employeeMap.put(employee.getEmployeeId(), employee);
    }

    public void removeEmployeeById(Integer id)
    {
        employeeMap.remove(id);
    }

    public void addEmployeesList(List<Employee> employees)
    {
        for(Employee emp : employees)
        {
            employeeMap.put(emp.getEmployeeId(), emp);
        }
    }

    public List<Integer> getEmployeeIdsList()
    {
        return new ArrayList<Integer>(getEmployeeIdSet());
    }
}
