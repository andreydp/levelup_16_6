import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by andrey on 09.01.17.
 */
public class Main
{
    public static void main(String[] args)
    {

    }

    public static List<Citizen> readCSV(String fileName)
    {
        List<Citizen> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                if (line.startsWith("id")) continue;
                Scanner scanner = new Scanner(line);
                scanner.useDelimiter(";");
                long id = scanner.nextLong();
                String fName = scanner.next();
                String lName = scanner.next();
                int age = scanner.nextInt();

                list.add(new Citizen(id, fName, lName, age));
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return list;
    }
}