package ua.dp.levelup.homework.lesson16.calculator.fields;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 * Created by andrey on 09.01.17.
 */
public class JTextFieldLimit extends PlainDocument
{
    private int limit;

    public JTextFieldLimit(int limit)
    {
        super();
        this.limit = limit;
    }

    public JTextFieldLimit(int limit, boolean upper)
    {
        super();
        this.limit = limit;
    }

    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException
    {
        if (str == null) return;

        if ((getLength() + str.length()) <= limit)
        {
            super.insertString(offset, str, attr);
        }
    }
}