package ua.dp.levelup.homework.lesson16.calculator;

import ua.dp.levelup.homework.lesson16.calculator.fields.JTextFieldLimit;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by java on 27.12.2016.
 */
public class Calculator
{
    public static final int MAX_INPUT_LENGTH = 12;

    public static JLabel textLabel = new JLabel();

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(250, 350);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout borderLayout = new BorderLayout();

        textLabel.setBackground(Color.WHITE);
        textLabel.setOpaque(true);
        textLabel.setPreferredSize(new Dimension(100,20));

        borderLayout.addLayoutComponent(textLabel, BorderLayout.NORTH);
        frame.add(textLabel);

        MainPanel mainPanel = new MainPanel();

        borderLayout.addLayoutComponent(mainPanel, BorderLayout.CENTER);
        frame.add(mainPanel);


        frame.setLayout(borderLayout);
        frame.setVisible(true);
    }
}
