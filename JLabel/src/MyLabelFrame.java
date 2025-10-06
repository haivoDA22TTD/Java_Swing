import javax.swing.*;
import java.awt.*;

public class MyLabelFrame extends JFrame {
    public MyLabelFrame() {
        setTitle("JLabel Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400, 400);

        initUi(); // Gọi hàm tạo giao diện

        setVisible(true);
    }

    private void initUi() {
        JLabel label = new JLabel("Chào bạn!");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
    }
}
