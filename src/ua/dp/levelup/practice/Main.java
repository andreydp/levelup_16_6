package ua.dp.levelup.practice;

import java.text.ParseException;

/**
 * Created by andreypo on 11/11/2016.
 */
public class Main
{
    static String parseInstrumentSuffix(String instrument)
    {
        if (!instrument.contains("."))
        {
            return instrument;
        }
        int index = instrument.indexOf('.');
        int suffixLength = instrument.length() - index;
        String suffix = instrument.substring(instrument.length() - suffixLength + 1, instrument.length());
        StringBuilder newSuffix = new StringBuilder();
        if (suffix.length() >= 3)
        {
            int dotCount = suffix.length() - suffix.replace(".", "").length();
            if ((suffix.startsWith("PR") || suffix.startsWith("WS")) && suffix.length() - dotCount == 3)
            {
                newSuffix.append((suffix.replace(".", "")));
            }
            else if ((suffix.endsWith("CL") || suffix.endsWith("WI") || suffix.endsWith("WD")) && !suffix.equals("CVCL"))
            {
                newSuffix.append(suffix.replace(".", ""));
                newSuffix.insert(newSuffix.length() - 2, " ");
            }
        }
        else
        {
            return instrument.replace(".", " ");
        }
        return instrument.substring(0, index) + " " + newSuffix;
    }

    public static void main(String[] args) throws ParseException
    {
        String[] array = {"AHL.PR.ACL", "BRK.A", "VALE.P", "HLM.PR", "AVV.CL", "IBM.RT", "WFC.PRJ", "HL.PRB", "BAC.WS.B", "IRET.PR.CL", "IBM.A.WI", "IBM.PRC.WD", "IBM.CVCL"};
        for (String elem : array)
        {
            System.out.println(elem + " -> " + parseInstrumentSuffix(elem));
        }
    }
}
