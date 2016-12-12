package ua.dp.levelup.practice;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by andreypo on 11/23/2016.
 */
public class TEst
{
    static class OrderFlowData implements Comparable
    {
        Date timeStamp_;
        String message_;

        OrderFlowData(Date timeStamp, String message)
        {
            this.timeStamp_ = timeStamp;
            this.message_ = message;
        }

        public int compareTo(Object o)
        {
            return timeStamp_.compareTo(((OrderFlowData) o).timeStamp_);
        }
    }

    public static void main(String[] args) throws ParseException
    {
        File dir = new File("D:\\Inforeach\\TMS_8.2_Bayes_release20130229\\release\\EOD\\TradeBlotter\\datafiles");
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.matches("DailyReports\\d+.txt");
            }
        });
        for (File file : files)
        {
            System.out.println(file.toString());
        }

    }
}
