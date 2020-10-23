package GUI;

import java.awt.*;
import javax.swing.*;
public class gui_2 extends JFrame
{
    JTextField jta = new JTextField(10);

    Font fnt = new Font("Arial",Font.BOLD,20);
    gui_2()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,100);
        add(jta);
        jta.setForeground(Color.BLACK);
        jta.setFont(fnt);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new gui_2();
    }
}