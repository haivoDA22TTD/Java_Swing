import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCheckBox extends JFrame {
    public MyCheckBox() {
        setTitle("MyCheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        JCheckBox checkBox1 = new JCheckBox("Java");
        JCheckBox checkBox2 = new JCheckBox("Python");
        JCheckBox checkBox3 = new JCheckBox("JavaScript");
        JCheckBox checkBox4 = new JCheckBox("C++");
        JCheckBox checkBox5 = new JCheckBox("C#");
        JCheckBox checkBox6 = new JCheckBox("Ruby");


        JButton button = new JButton("Confirm");
        button.setBackground(Color.ORANGE);
        button.setForeground(Color.black);
        button.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               StringBuilder sb = new StringBuilder("You select:\n");
               if(checkBox1.isSelected());
               if(checkBox2.isSelected());
               if(checkBox3.isSelected());
               if(checkBox4.isSelected());
               if(checkBox5.isSelected());
               if(checkBox6.isSelected());

               JOptionPane.showMessageDialog(null,sb.toString());

            }
        });
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);
        panel.add(checkBox4);
        panel.add(checkBox5);
        panel.add(checkBox6);
        panel.add(button);
        add(panel);
        setVisible(true);
    }
}
