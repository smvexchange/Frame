import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class SimpleMotionListener implements MouseMotionListener {


    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse dragged " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse moved at " + e.getX() + ", " + e.getY());
    }
}
