package ua.dp.levelup.homework.lesson28.util;

import ua.dp.levelup.homework.lesson28.DMDSoft;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

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
        while (true)
        {
            input = scanner.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(input);
            String currentArg = input.isEmpty() ? "" : tokenizer.nextToken();
            if (currentArg.equals("exit"))
            {
                break;
            } else if (tokenizer.countTokens() < 1 || args.indexOf(currentArg) < 0)
            {
                printHelp();
            } else if (currentArg.equals("get"))
            {
                currentArg = tokenizer.nextToken();
                if (currentArg.equals("all"))
                {
                    System.out.println(DMDSoft.departmentNames().toString());
                } else if (tokenizer.hasMoreTokens())
                {
                    int depIndex = DMDSoft.departmentNames().indexOf(currentArg);
                    currentArg = tokenizer.nextToken();
                    if (depIndex >= 0)
                    {
                        List<Integer> employeeIDs = DMDSoft.departmentList.get(depIndex).getEmployeeIDs();
                        if (currentArg.equals("ls"))
                        {
                            System.out.println(employeeIDs.toString());
                        } else if (employeeIDs.indexOf(Integer.parseInt(currentArg)) >= 0)
                        {
                            //TODO search by ID, replace by map
                        }
                    }
                }
            }

        }
    }

    void printHelp()
    {
        StringBuffer sb = new StringBuffer();
        sb.append(
                "get all - вывод на консоль всех доступных отделов через запятую \n" +
                        "get [department] ls - вывод на консоль всех доступных айди сотрудников через запятую\n" +
                        "get [department] [employeeId] - вывод на консоль данных сотрудника\n" +
                        "add [department] [employeeId] [firstName] [lastName] [salary] - добавление нового сотрудника в отдел\n" +
                        "exit - выход");
        System.out.println(sb.toString());
    }
}
