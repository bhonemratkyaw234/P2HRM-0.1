/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserPanels;

import AdminPanels.*;
import swingComponents.SideTabButton;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Account extends javax.swing.JPanel {

    /**
     * Creates new form DutyRoster
     */
    
 
    
    public Account() {
        initComponents();
      
       
    }

  
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        circularPanel1 = new app.mavenproject2.CircularPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        transparentTextfield1 = new swingComponents.transparentTextfield();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        transparentTextfield7 = new swingComponents.transparentTextfield();
        jLabel14 = new javax.swing.JLabel();
        transparentTextfield8 = new swingComponents.transparentTextfield();

        setPreferredSize(new java.awt.Dimension(1267, 754));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Account");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 150, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(144, 144, 144));
        jLabel7.setText("MS");
        circularPanel1.add(jLabel7);
        jLabel7.setBounds(60, 30, 100, 90);

        add(circularPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 200, 150));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("User :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Maung Sein Win");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 160, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("maungsein@set.p2dpt.tech");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 160, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Email:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        transparentTextfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentTextfield1ActionPerformed(evt);
            }
        });
        add(transparentTextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 110, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Created Date :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Created By  :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, -1, -1));
        add(transparentTextfield7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 110, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Account Status :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, -1, -1));
        add(transparentTextfield8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void transparentTextfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentTextfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentTextfield1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.mavenproject2.CircularPanel circularPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private swingComponents.transparentTextfield transparentTextfield1;
    private swingComponents.transparentTextfield transparentTextfield7;
    private swingComponents.transparentTextfield transparentTextfield8;
    // End of variables declaration//GEN-END:variables
}
