package ua.dp.levelup.classwork.lesson16;

import javax.swing.*;
import javax.swing.plaf.metal.MetalIconFactory;
import java.awt.*;

/**
 * Created by java on 27.1.2016.
 */
public class LabelPanel extends JPanel
{
    public LabelPanel()
    {
        JLabel plainLabel = new JLabel("Plain Smal Label");
        add(plainLabel);

        JLabel fancyLabel = new JLabel("Fancy big label");

        Font fancyFont = new Font(
                    "Serif", Font.BOLD | Font.ITALIC, 32);

        fancyLabel.setFont(fancyFont);
        add(fancyLabel);

//        Icon tigerIcon = new MetalIconFactory.FolderIcon16();
//        Icon tigerIcon = new ImageIcon("D:/coursera.jpg");

//        fancyLabel.setIcon(tigerIcon);

        fancyLabel.setHorizontalAlignment(JLabel.RIGHT);
    }
}
