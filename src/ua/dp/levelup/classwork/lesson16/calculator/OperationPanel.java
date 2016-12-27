package ua.dp.levelup.classwork.lesson16.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by java on 27.12.2016.
 */
public class OperationPanel extends JPanel
{
    public OperationPanel()
    {
        GridLayout gridLayout = new GridLayout(2, 3, 5, 5);

        String[] operations = {"/", "*", "+", "-", "=", "C"};

        for (String s : operations)
        {
            JButton button = new JButton(s);
            button.addActionListener(getClickListener());
            gridLayout.addLayoutComponent(s, button);
            add(button);
        }

        setLayout(gridLayout);
    }

    public ActionListener getClickListener()
    {
        return new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String operation = e.getActionCommand();
                switch (operation)
                {
                    case "C" :
                        Calculator.textField.setText("");
                }
            }
        };
    }
}
