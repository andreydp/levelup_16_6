package ua.dp.levelup.homework.lesson28.Task2.helpers;

/**
 * Created by andreypo on 2/21/2017.
 */
public class FormulaHolder
{
    String failedFormula;
    Integer[] errorPointersPositions;
    String failedPointersString;

    public FormulaHolder(String failedFormula, Integer[] errorPointersPositions)
    {
        this.failedFormula = failedFormula;
        this.errorPointersPositions = errorPointersPositions;
        StringBuilder sb = new StringBuilder();
        sb.setLength(failedFormula.length());
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, ' ');
        }
        for (int pos : errorPointersPositions)
        {
            sb.setCharAt(pos, '^');
        }
        failedPointersString = sb.toString();
    }

    public String getFailedFormula()
    {
        return failedFormula;
    }

    public String getFailedPointersString()
    {
        return failedPointersString;
    }

    public void setFailedFormula(String failedFormula)
    {
        this.failedFormula = failedFormula;
    }

    public Integer[] getErrorPointersPositions()
    {
        return errorPointersPositions;
    }
}
