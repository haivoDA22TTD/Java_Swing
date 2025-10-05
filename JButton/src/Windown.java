import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windown extends JFrame {
    public Windown() {
        // Tiêu đề cửa sổ
        setTitle("Windown");
        // Kích thước cửa sổ
        setSize(800, 600);
        // Thoát khỏi chương trình khí bấm nút x
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // Tạo nút
        JButton button = new JButton("Click Here");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Your clicked");
            }
        });
        // Thêm nút vào cửa sổ
        add(button);
        // Hiển thị cửa sổ
        setVisible(true);
    }
}
