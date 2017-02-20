package ua.dp.levelup.homework.lesson28.Task1.entity.impl;

import ua.dp.levelup.homework.lesson28.Task1.entity.Employee;

/**
 * Created by andreypo on 2/17/2017.
 */
public class Designer extends Employee
{
    public Designer(String firstName, String lastName, Integer salary)
    {
        super(firstName, lastName, salary);
    }

    public Designer(Integer employeeId, String firstName, String lastName, Integer salary)
    {
        super(employeeId, firstName, lastName, salary);
    }
}
