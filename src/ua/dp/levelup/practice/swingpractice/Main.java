package ua.dp.levelup.practice.swingpractice;

import javax.swing.*;
import java.awt.*;

/**
 * Created by andrey on 10.12.16.
 */
public class Main extends Canvas
{
    public void paint(Graphics g)
    {
        g.drawLine(100,100,150,100);
        g.drawLine(150,100,150,150);
        g.drawLine(150,150,100,150);
        g.drawLine(100,150,100,100);
        setBackground(Color.WHITE);
//        g.fillRect(130, 30, 100, 80);
//        g.drawOval(30, 130, 50, 60);
//        setForeground(Color.RED);
//        g.fillOval(130, 130, 50, 60);
//        g.drawArc(30, 200, 40, 50, 90, 60);
//        g.fillArc(30, 130, 40, 50, 180, 40);

    }

    public static void main(String[] args)
    {
        Main m = new Main();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(m);
        f.setSize(400, 400);
        //f.setLayout(null);
        f.setVisible(true);
    }
}