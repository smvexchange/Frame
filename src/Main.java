import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class MyFrame extends JFrame {
    MyFrame() {
        setSize(400,300);
        setVisible(true);
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                setLocation(e.getXOnScreen() - getX(), e.getYOnScreen() - getY());
            }
        });
    }
}

public class Main {

    public static void main(String[] args) {
        new MyFrame();
    }
}

