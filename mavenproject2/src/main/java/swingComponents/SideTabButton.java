/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingComponents;

/**
 *
 * @author HP
 */


import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;

public class SideTabButton extends JButton {
    private boolean pressed = false;
    private boolean active = false;

    private static final Color PRESSED_BG = Color.decode("#333333");
    private static final Color ACTIVE_BG = Color.decode("#333333");

    public SideTabButton(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setBorder(null);
        setOpaque(false);
        setForeground(Color.BLACK);
        setPreferredSize(new Dimension(120, 40));

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                pressed = true;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                pressed = false;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pressed = false;
                repaint();
            }
        });
    }

    public void setActive(boolean active) {
        this.active = active;
        repaint();
    }

    public boolean isActive() {
        return active;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        if (active) {
            g2.setColor(ACTIVE_BG);
            g2.fillRect(0, 0, getWidth(), getHeight());
        } else if (pressed) {
            g2.setColor(PRESSED_BG);
            g2.fillRect(0, 0, getWidth(), getHeight());
        }
        g2.dispose();
        super.paintComponent(g);
    }
}