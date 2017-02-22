package ua.dp.levelup.io;
/**
 * Created by andrey on 22.02.17.
 */

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by java on 21.02.2017.
 */
public class Explorer
{
    private static final String DEFAULT_PATH = "/Users/andrey";
    private static File currentDir = new File(DEFAULT_PATH);

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print(currentDir.getPath() + ">");
            String line = scanner.nextLine();

            if (line.startsWith("printDirs"))
            {
                printAllDirectories(currentDir);
            }
            else if (line.startsWith("printFiles"))
            {
                printAllFiles(currentDir);
            }
            else if (line.startsWith("open"))
            {
                openTextFile(line, currentDir);
            }
            else if (line.startsWith("mkDir"))
            {      //mkDir newFolderName
                createNewFolder(line, currentDir);
            } else if (line.startsWith("mkFile"))
            {
                createNewFile(line, currentDir);
            } else if (line.startsWith("cd"))
            {
                changeDirectory(line);
            } else if (line.startsWith("delete"))
            {
                delete(line, currentDir);
            } else if (line.startsWith("exit"))
            {
                break;
            }
        }
    }

    private static void changeDirectory(String line)
    {
        String folderName = line.split("\\s+")[1];

        if (folderName.contains(".."))
        {
            if (currentDir.getParentFile() != null) currentDir = currentDir.getParentFile();
            return;
        }

        File[] list = currentDir.listFiles(dir -> dir.isDirectory() && dir.getName().contains(folderName));

        if (list.length == 1)
        {
            currentDir = list[0];
        } else if (list.length == 0)
        {
            System.out.println("No such file or directory");
        } else
        {
            for (File dir : list)
            {
                System.out.println(dir.getName());
            }
        }
    }

    private static void createNewFolder(String line, File parent)
    {
        String folderName = line.split("\\s+")[1];

        File directory = new File(parent, folderName);
        boolean result = directory.mkdir();
        if (result) System.out.println("OK!");
    }

    private static void createNewFile(String line, File parent)
    {
        String fileName = line.split("\\s+")[1];

        File newFile = new File(parent, fileName);
        if (!newFile.exists())
        {
            boolean result = false;
            try
            {
                result = newFile.createNewFile();
            } catch (IOException e)
            {
                System.out.println("There was an error creating new file!");
            }
            if (result) System.out.println("OK!");
        } else
        {
            System.out.println("File " + newFile + " already exists!");
        }
    }

    private static void delete(String line, File parent)
    {
        String fileName = line.split("\\s+")[1];

        File aFile = new File(parent, fileName);
        if (aFile.exists())
        {
            boolean result = aFile.delete();
            if (result) System.out.println("OK!");
        } else
        {
            System.out.println("File/Directory " + aFile + " does not exist!");
        }
    }

    private static void printAllDirectories(File file)
    {
        File[] files = file.listFiles();
        if (files != null)
        {
            for (File f : files)
            {
                if (f.isDirectory() && !f.isHidden())
                {
                    System.out.println(f.getName());
                }
            }
        }
    }

    private static void printAllFiles(File file)
    {
        File[] files = file.listFiles();
        if (files != null)
        {
            for (File f : files)
            {
                if (f.isFile() && !f.isHidden())
                {
                    System.out.println(f.getName());
                }
            }
        }
    }

    private static void openTextFile(String line, File parent)
    {
        List supportedFilesList = Arrays.asList("txt", "csv");
        String fileName = line.split("\\s+")[1];
        if (null != fileName)
        {
            String extension = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length());
            File aFile = new File(parent, fileName);
            if (aFile.exists() && supportedFilesList.contains(extension))
            {
                try (BufferedReader reader = new BufferedReader(new FileReader(aFile)))
                {
                    String currentLine;
                    while ((currentLine = reader.readLine()) != null)
                    {
                        System.out.println(currentLine);
                    }
                } catch (IOException e)
                {
                    System.out.println("There was an error opening file!");
                }
            }
        }
    }
}
