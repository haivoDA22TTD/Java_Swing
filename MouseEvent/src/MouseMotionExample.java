import javax.swing.*;
import java.awt.event.*;

public class MouseMotionExample extends JFrame {
    public MouseMotionExample() {
        setTitle("MouseMotionListener Example");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("Rê chuột trong vùng cửa sổ");
        label.setBounds(100, 100, 200, 30);
        add(label);

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Kéo chuột tại: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("Rê chuột tại: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        setVisible(true);
    }
}
