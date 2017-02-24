package ua.dp.levelup.classwork.lesson27;

import java.io.*;

/**
 * Created by java on 17.02.2017.
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
//        OutputStream out = new FileOutputStream("file.txt");
//
//        out.write("Hello World!\r\nNIGGA".getBytes());
//        out.close();

        String fileName = "input.txt";
        String fileDada = readFromFile(fileName);
        System.out.println(fileDada);

        writeToFile(fileDada, "output.txt");
    }

    public static String readFromFile(String fileName) throws IOException
    {
        StringBuilder result = new StringBuilder();
        InputStream input = new FileInputStream(fileName);
        int data;
        while ((data = input.read()) >= 0)
        {
            result.append((char) data);
        }
        input.close();
        return result.toString();
    }

    public static void writeToFile(String data, String fileName) throws IOException
    {
        Writer out = new FileWriter(fileName);
        out.write(data.toUpperCase());
        out.close();
    }
}
