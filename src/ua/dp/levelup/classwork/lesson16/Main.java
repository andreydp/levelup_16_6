package ua.dp.levelup.classwork.lesson16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by java on 27.12.2016.
 */
public class Main
{
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException
    {
        JFrame frame = new JFrame("This is my title");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout layout = new BorderLayout();

        LabelPanel labelPanel = new LabelPanel();
        Menu menu = new Menu();

        layout.addLayoutComponent(menu, BorderLayout.NORTH);
//        layout.addLayoutComponent(labelPanel, BorderLayout.CENTER);
//        frame.add(labelPanel);
        frame.add(menu);

        JLabel label = new JLabel();
        label.setText("0");

        frame.setLayout(layout);

        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                label.setText(++counter + "");
            }
        });

        JPanel btnPanel = new JPanel();
        btnPanel.setPreferredSize(new Dimension(30, 15));
        btnPanel.add(button);
        layout.addLayoutComponent(label, BorderLayout.LINE_START);
        frame.add(label);
        layout.addLayoutComponent(btnPanel, BorderLayout.CENTER);
        frame.add(btnPanel);
        frame.setVisible(true);
    }
}
