import javax.swing.*;
import java.awt.event.*;

public class MousePositionExample extends JFrame {
    public MousePositionExample() {
        setTitle("Mouse Position Example");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("Click tại: (" + x + ", " + y + ")");
            }
        });

        setVisible(true);
    }
}
