import javax.swing.*;
import java.awt.*;

public class TextAreaPanel {
    private JFrame frame;
    private JTextArea textArea;

    public TextAreaPanel() {
        // Tạo giao diện
        frame = new JFrame("TextArea Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null); // căn giữa màn hình

        JPanel panel = new JPanel(new BorderLayout(5, 5));

        JLabel label = new JLabel("Ghi chú:");
        textArea = new JTextArea(5, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton button = new JButton("Hiển thị nội dung");
        button.addActionListener(e -> {
            String text = textArea.getText();
            JOptionPane.showMessageDialog(frame, "Nội dung: " + text);
        });

        panel.add(label, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
