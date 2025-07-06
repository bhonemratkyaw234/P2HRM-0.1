package swingComponents ;

import javax.swing.*;
import java.awt.*;

public class transparentTextfield extends JTextField {

    public transparentTextfield() {
        super();
        setOpaque(false); // Make background transparent
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // Remove default border
        setForeground(Color.BLACK);
        setFont(getFont().deriveFont(Font.PLAIN, 14f));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw black underline
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setColor(Color.BLACK);
        int y = getHeight() - 2;
        g2.setStroke(new BasicStroke(2f));
        g2.drawLine(2, y, getWidth() - 2, y);
        g2.dispose();
    }
}