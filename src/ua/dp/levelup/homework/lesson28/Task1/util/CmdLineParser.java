package ua.dp.levelup.homework.lesson28.Task1.util;

import ua.dp.levelup.homework.lesson28.Task1.DMDSoft;
import ua.dp.levelup.homework.lesson28.Task1.entity.Department;
import ua.dp.levelup.homework.lesson28.Task1.entity.impl.Developer;
import ua.dp.levelup.homework.lesson28.Task1.entity.impl.Manager;

import java.util.*;

/**
 * Created by andreypo on 2/17/2017.
 */
public class CmdLineParser
{
    List args = Arrays.asList("add", "get");

    public CmdLineParser()
    {
        printHelp();
        Scanner scanner = new Scanner(System.in);
        String input;
        List<String> departmentNames = DMDSoft.departmentNames();
        while (true)
        {
            input = scanner.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(input);
            String currentArg = input.isEmpty() ? "" : tokenizer.nextToken();
            if (currentArg.equals("exit"))
            {
                break;
            } else if (currentArg.equals("help"))
            {
                printHelp();
            } else if (tokenizer.countTokens() < 1 || args.indexOf(currentArg) < 0)
            {
                printHelp();
            } else if (currentArg.equals("get"))
            {
                currentArg = tokenizer.nextToken();
                if (currentArg.equals("all"))
                {
                    System.out.println(departmentNames);
                } else if (tokenizer.hasMoreTokens())
                {
                    int depIndex = DMDSoft.departmentNames().indexOf(currentArg);
                    currentArg = tokenizer.nextToken();
                    if (depIndex >= 0)
                    {
                        Department currentDepartment = DMDSoft.departmentList.get(depIndex);
                        List<Integer> employeeIDs = currentDepartment.getEmployeeIdsList();
                        if (currentArg.equals("ls") && null != employeeIDs)
                        {
                            System.out.println(employeeIDs.toString());
                        } else try
                        {
                            Integer currentEmployeeId = Integer.parseInt(currentArg);
                            if (null == currentDepartment.getEmployeeById(currentEmployeeId))
                            {
                                System.out.println("Employee with Id=" + currentEmployeeId + " not found!");
                            } else
                            {
                                System.out.println(currentDepartment.getEmployeeById(currentEmployeeId));
                            }
                        } catch (NumberFormatException e)
                        {
                            System.out.println("Incorrect Employee id, must specify number!");
                        }
                    }
                } else
                {
                    printHelp();
                }
            } else if (currentArg.equals("add") && tokenizer.countTokens() == 5)
            {
                currentArg = tokenizer.nextToken();
                int depIndex = departmentNames.indexOf(currentArg);

                if (depIndex >= 0)
                {
                    Department currentDepartment = DMDSoft.departmentList.get(depIndex);
                    try
                    {
                        currentArg = tokenizer.nextToken();
                        Integer currentEmployeeId = Integer.parseInt(currentArg);
                        if (null == currentDepartment.getEmployeeById(currentEmployeeId))
                        {
                            try
                            {
                                switch (currentDepartment.getName())
                                {
                                    case "Managers":
                                        currentDepartment.addEmployee(new Manager(currentEmployeeId, tokenizer.nextToken(), tokenizer.nextToken(), Integer.parseInt(tokenizer.nextToken())));
                                        System.out.println("OK!");
                                        break;
                                    case "Developers":
                                        currentDepartment.addEmployee(new Developer(currentEmployeeId, tokenizer.nextToken(), tokenizer.nextToken(), Integer.parseInt(tokenizer.nextToken())));
                                        System.out.println("OK!");
                                        break;
                                    default:
                                        System.out.println("Unknown department");
                                        break;
                                }
                            }
                            catch (NumberFormatException e)
                            {
                                System.out.println("Incorrect parameter! " +e);
                            }
                        }
                        else
                        {
                            System.out.println("Employee with id="+currentEmployeeId+" already exists in department!");
                        }
                    } catch (NumberFormatException e)
                    {
                        System.out.println("Incorrect Employee id, must specify number!");
                    }
                }
            } else
            {
                System.out.println("Incorrect parameter count!");
                printHelp();
            }
        }
    }


    void printHelp()
    {
        String sb = ("get all - вывод на консоль всех доступных отделов через запятую \n" +
                "get [department] ls - вывод на консоль всех доступных айди сотрудников через запятую\n" +
                "get [department] [employeeId] - вывод на консоль данных сотрудника\n" +
                "add [department] [employeeId] [firstName] [lastName] [salary] - добавление нового сотрудника в отдел\n" +
                "exit - выход");
        System.out.println(sb);
    }
}
