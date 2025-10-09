import javax.swing.*;
import java.awt.event.*;

public class MouseWheelExample extends JFrame {
    public MouseWheelExample() {
        setTitle("MouseWheelListener Example");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("Cuộn chuột để xem hành động");
        label.setBounds(90, 120, 250, 30);
        add(label);

        addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                int notches = e.getWheelRotation();
                if (notches < 0) {
                    System.out.println("Cuộn lên");
                } else {
                    System.out.println("Cuộn xuống");
                }
            }
        });

        setVisible(true);
    }
}
