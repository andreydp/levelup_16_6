package ua.dp.levelup.homework.lesson28.Task2.helpers;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andreypo on 2/21/2017.
 */
public class FileUtils
{
    public static boolean check(String fileIn, String fileOut)
    {
        File inFile = new File(fileIn);
        if (!inFile.exists() || inFile.isDirectory())
        {
            System.out.println(fileIn + " does not exist!");
            return false;
        }
        File outFile = new File(fileOut);
        if (outFile.exists() && outFile.isDirectory())
        {
            System.out.println("Cannot write to a directory " + fileOut);
            return false;
        }
        return true;
    }

    public static List<String> getFileByRowsList(String inFile)
    {
        List<String> result = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(inFile))))
        {
            String line;
            result = new ArrayList<>();
            while ((line = reader.readLine()) != null)
            {
                line = line.trim();
                result.add(line);
            }
        } catch (
                IOException e)
        {
            e.printStackTrace();
        }
        return result;
    }

    public static void writeToFile(String outFile, List<String> lines)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(outFile))))
        {
            for (String line : lines)
            {
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
