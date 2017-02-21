package ua.dp.levelup.homework.lesson28.Task2;

import ua.dp.levelup.homework.lesson28.Task2.helpers.FileUtils;
import ua.dp.levelup.homework.lesson28.Task2.helpers.FormulaHolder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by andreypo on 2/21/2017.
 */
public class FormulaChecker
{
    private List<FormulaHolder> formulaHolderList = new ArrayList<>();
    public static final char OPEN_BRACKET = '(';
    public static final char CLOSE_BRACKET = ')';

    public List<FormulaHolder> getFormulaHolderList()
    {
        return formulaHolderList;
    }

    public void check(String fileIn, String fileOut)
    {
        if (FileUtils.check(fileIn, fileOut))
        {
            System.out.println("Checking formulas from " + fileIn + ", writing failed results to " + fileOut);

            List<String> formulaList = FileUtils.getFileByRowsList(fileIn);
            if (null != formulaList)
            {
                for (String formula : formulaList)
                {
                    LinkedList<Integer> bracketPositionsList = new LinkedList<>();
                    for (int i = 0; i < formula.length(); i++)
                    {
                        if (formula.charAt(i) == OPEN_BRACKET)
                        {
                            bracketPositionsList.addFirst(i);
                        }
                        if (formula.charAt(i) == CLOSE_BRACKET)
                        {
                            if (!bracketPositionsList.isEmpty())
                            {
                                bracketPositionsList.removeLast();
                            } else
                            {
                                bracketPositionsList.addLast(i);
                            }
                        }
                    }
                    formulaHolderList.add(new FormulaHolder(formula, bracketPositionsList.toArray(new Integer[1])));
                }
            }
            if (!formulaHolderList.isEmpty())
            {
                List<String> result = new ArrayList<>();
                for (FormulaHolder fh: formulaHolderList)
                {
                    result.add(fh.getFailedFormula());
                    result.add(fh.getFailedPointersString());
                }
                FileUtils.writeToFile(fileOut, result);
            }
        }
    }

    public static void printUsage()
    {
        System.out.println("Usage: [path_to_file_in] [path_to_file_out]");
    }
}
