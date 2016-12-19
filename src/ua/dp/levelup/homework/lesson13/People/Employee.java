package ua.dp.levelup.homework.lesson13.People;

/**
 * Created by andreypo on 12/19/2016.
 */
public class Employee
{
    private String name;
    private int age;
    private int tipProfit;

    Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int getTipProfit()
    {
        return tipProfit;
    }

    public void setTipProfit(int tipProfit)
    {
        this.tipProfit = tipProfit;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tipProfit=" + tipProfit +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (tipProfit != employee.tipProfit) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;

    }

    @Override
    public int hashCode()
    {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + tipProfit;
        return result;
    }
}
