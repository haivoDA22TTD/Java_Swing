import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyFrame extends JFrame implements KeyListener {
    public MyKeyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyKeyFrame");
        setSize(800, 600);
        setLayout(null);

        this.addKeyListener(this);
        this.setFocusable(true);
        this.requestFocusInWindow();
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped:" +e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed:" + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased:" + e.getKeyChar());
    }
}
