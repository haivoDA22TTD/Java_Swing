import javax.swing.*;
import java.awt.event.*;

public class MouseListenerExample extends JFrame {
    public MouseListenerExample() {
        setTitle("MouseListener Example");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        JButton button = new JButton("Click Me");
        button.setBounds(120, 100, 150, 50);
        add(button);

        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Click chuột!");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Chuột được nhấn xuống!");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Chuột được thả ra!");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Chuột vừa vào nút!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Chuột vừa rời nút!");
            }
        });

        setVisible(true);
    }
}
