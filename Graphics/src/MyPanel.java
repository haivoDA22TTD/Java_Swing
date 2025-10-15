import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        // Vẽ hình chữ nhật màu xanh dương
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 60);

        // Vẽ hình oval màu đỏ
        g.setColor(Color.RED);
        g.fillOval(170, 50, 100, 60);

        // Vẽ đường thẳng màu tím
        g.setColor(Color.MAGENTA);
        g.drawLine(50, 130, 270, 130);

        // Vẽ dòng chữ
        g.setColor(Color.GREEN);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Hello Graphics!", 50, 180);
    }
}
