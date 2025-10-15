import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vẽ hình bằng Graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Canh giữa màn hình

        MyPanel panel = new MyPanel(); // Gọi class chứa phần vẽ
        frame.add(panel); // Thêm panel vào frame

        frame.setVisible(true);
    }
}
