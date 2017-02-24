package ua.dp.levelup.Explorer;

import java.io.File;

/**
 * Created by java on 21.02.2017.
 */
public class CommandLineApp
{
    private static final String DEFAULT_PATH = "D:/";
    public static void main(String[] args)
    {
        File file = new File(DEFAULT_PATH);

        if (file.isDirectory())
        {
            printAllDirectories(file);
        }
    }

    private static void printAllDirectories(File file)
    {
        File[] files = file.listFiles();
        for (File f: files)
        {
            if(f.isDirectory() && !f.isHidden())
            {
                System.out.println(f.getName());

            }
        }
    }
}
