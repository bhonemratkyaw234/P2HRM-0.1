/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.mavenproject2;

/**
 *
 * @author HP
 */


import java.awt.*;
import javax.swing.*;

/**
 * A custom JPanel that displays itself as a perfect solid-color circle,
 * with support for child components.
 */
public class CircularPanel extends JPanel {

    private Color fillColor = new Color(68, 68, 68);

    public CircularPanel() {
        setOpaque(false);
        setLayout(null); // allow absolute positioning if needed
    }

    public void setFillColor(Color color) {
        this.fillColor = color;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        int diameter = Math.min(getWidth(), getHeight());
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw solid circle
        g2.setColor(fillColor);
        g2.fillOval((getWidth() - diameter) / 2, (getHeight() - diameter) / 2, diameter, diameter);

        g2.dispose();
        super.paintComponent(g);
    }

    @Override
    public Dimension getPreferredSize() {
        Dimension size = super.getPreferredSize();
        int diameter = Math.max(size.width, size.height);
        return new Dimension(diameter, diameter);
    }

    @Override
    public boolean contains(int x, int y) {
        int radius = Math.min(getWidth(), getHeight()) / 2;
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int dx = x - centerX;
        int dy = y - centerY;
        return dx * dx + dy * dy <= radius * radius;
    }
}