import javax.swing.*;
import java.awt.event.*;

public class MouseAdapterExample extends JFrame {
    public MouseAdapterExample() {
        setTitle("MouseAdapter Example");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        JButton button = new JButton("Hover or Click Me");
        button.setBounds(100, 100, 180, 50);
        add(button);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Đã click!");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Chuột vừa vào nút!");
            }
        });

        setVisible(true);
    }
}
