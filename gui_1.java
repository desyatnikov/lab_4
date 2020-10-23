package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class gui_1 extends JFrame
{
    JTextArea textArea = new JTextArea(20,20);
    JScrollPane Scroll = new JScrollPane(textArea);
    JButton button = new JButton("Add some Text");
    public gui_1()
    { super("Example");
        setSize(310,310);
        setLayout(new FlowLayout());
        add(textArea);
        add(Scroll);
        setVisible(true);
        add(button);
        Scroll.setViewportView(textArea);
        button.addActionListener (new ActionListener()
        {
            public void actionPerformed(ActionEvent
                                                ae)

            {

                String txt = JOptionPane.showInputDialog(null,"Insert some text");
                textArea.append(txt);
            }
        });
    }

    public static void main(String[]args)
    {
        new gui_1().setVisible(true);

    }
}