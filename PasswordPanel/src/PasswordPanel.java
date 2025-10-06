import javax.swing.*;
import java.awt.*;

public class PasswordPanel extends JFrame {
    private JPasswordField passwordField;
    public PasswordPanel() {
        setTitle("Password Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        JLabel label = new JLabel("Enter your password:");
        passwordField = new JPasswordField(20);
        add(label,BorderLayout.WEST);
        add(passwordField,BorderLayout.CENTER);

        setVisible(true);
    }
    public String getPasswordField() {
        return new String(passwordField.getPassword());
    }
}
