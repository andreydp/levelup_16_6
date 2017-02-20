package ua.dp.levelup.homework.lesson28.entity;

/**
 * Created by andreypo on 2/17/2017.
 */
public abstract class Employee
{
    private static int employeeCount;
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private Integer salary;

    public Employee(String firstName, String lastName, Integer salary)
    {
        employeeId = employeeCount++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Integer getSalary()
    {
        return salary;
    }

    public void setSalary(Integer salary)
    {
        this.salary = salary;
    }

    @Override
    protected void finalize() throws Throwable
    {
        super.finalize();
        employeeCount--;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
