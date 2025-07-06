/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminPanels;

import swingComponents.SideTabButton;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class UserControl extends javax.swing.JPanel {

    /**
     * Creates new form DutyRoster
     */
    
   
    
  
    
    
    public UserControl() {
        initComponents();
       
        
      
       
    }

  
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton7 = new swingComponents.PanelButtons("roster");
        transparentTextfield1 = new swingComponents.transparentTextfield();
        transparentComboBox1 = new swingComponents.transparentComboBox();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        transparentTextfield2 = new swingComponents.transparentTextfield();
        jButton8 = new swingComponents.PanelButtons("roster");
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        transparentComboBox3 = new swingComponents.transparentComboBox();
        jLabel8 = new javax.swing.JLabel();
        jButton9 = new swingComponents.PanelButtons("roster");
        jButton10 = new swingComponents.PanelButtons("roster");
        jButton11 = new swingComponents.PanelButtons("roster");

        setPreferredSize(new java.awt.Dimension(1267, 754));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("User Control");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 220, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText(":Generate!");
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 203, 90, 30));

        transparentTextfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentTextfield1ActionPerformed(evt);
            }
        });
        add(transparentTextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 140, -1));

        transparentComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentComboBox1ActionPerformed(evt);
            }
        });
        add(transparentComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 120, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Password  :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 120, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 910, 510));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("User ID :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        transparentTextfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentTextfield2ActionPerformed(evt);
            }
        });
        add(transparentTextfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 140, -1));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Refresh");
        add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 690, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Valid Until :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Designated Team :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        transparentComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentComboBox3ActionPerformed(evt);
            }
        });
        add(transparentComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 120, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Authorized Position :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setText("Activate");
        add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 690, 80, -1));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText("Reset");
        add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 690, 80, -1));

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton11.setText("Suspend");
        add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 690, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void transparentTextfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentTextfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentTextfield1ActionPerformed

    private void transparentTextfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentTextfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentTextfield2ActionPerformed

    private void transparentComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentComboBox1ActionPerformed

    private void transparentComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentComboBox3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private swingComponents.transparentComboBox transparentComboBox1;
    private swingComponents.transparentComboBox transparentComboBox3;
    private swingComponents.transparentTextfield transparentTextfield1;
    private swingComponents.transparentTextfield transparentTextfield2;
    // End of variables declaration//GEN-END:variables
}
