/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingComponents;


import javax.swing.*;
import java.awt.*;

public class transparentComboBox<E> extends JComboBox<E> {

    public transparentComboBox() {
        super();
        setOpaque(false); // Makes background transparent
        setForeground(Color.BLACK);
        setBackground(new Color(0, 0, 0, 0)); // Transparent background
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
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