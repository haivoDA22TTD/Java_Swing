import javax.swing.*;
import java.awt.*;

public class MyTable extends JFrame {
    public MyTable() {
        setTitle("MyTable");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);



        String[][] data = {
                {"A01","Alex","Chicago"},
                {"A02","William","San Francisco"},
        };
        String [] column = {"Student code", "Student name", "Address"};

        JTable table = new JTable(data,column);
        table.setBackground(Color.GREEN);
        table.setFont(new Font("Arial",Font.BOLD,14));
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
}
