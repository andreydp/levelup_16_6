package ua.dp.levelup.homework.lesson16.calculator;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by java on 27.12.2016.
 */
public class NumberPanel extends JPanel
{

    public NumberPanel()
    {
        GridLayout gridLayout = new GridLayout(4, 3, 5, 5);

        String[] opS = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "."};

        JButton button;
        for (String s : opS)
        {
            button = new JButton(s);
            button.addActionListener(getCLickListener());
            gridLayout.addLayoutComponent(s, button);
            add(button);
        }


        setLayout(gridLayout);
    }

//    private String getDisplayString()
//    {
//        return Calculator.textField.getText();
//    }
//
//    void setDisplayString(String s)
//    {
//        Calculator.textField.setText(s);
//    }

    public ActionListener getCLickListener()
    {
        return new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (Calculator.textLabel.getText().length() < Calculator.MAX_INPUT_LENGTH)
                {
                    if (e.getActionCommand().equals("."))
                    {
                        if (!Calculator.textLabel.getText().contains("."))
                            Calculator.textLabel.setText(Calculator.textLabel.getText() + ".");
                    } else
                    {
                        Calculator.textLabel.setText(Calculator.textLabel.getText() + e.getActionCommand());
                    }
                }
            }
        };
    }
}
