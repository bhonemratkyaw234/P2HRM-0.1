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
public class AttendanceList extends javax.swing.JPanel {
    private String userRole;

    /**
     * Creates new form DutyRoster
     */
    
   
    
  
    
    
    public AttendanceList(String userRole) {
        initComponents();
       
        
       if("teamleader".equalsIgnoreCase(userRole)) {
           SelectTeamCombo.setEnabled(false);
       }
       
    }

  
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton7 = new swingComponents.PanelButtons("roster");
        transparentTextfield1 = new swingComponents.transparentTextfield();
        SelectTeamCombo = new swingComponents.transparentComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        transparentComboBox2 = new swingComponents.transparentComboBox();

        setPreferredSize(new java.awt.Dimension(1267, 754));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Attendance");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 20, 200, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText(":Search");
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 80, 30));

        transparentTextfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentTextfield1ActionPerformed(evt);
            }
        });
        add(transparentTextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, -1));
        add(SelectTeamCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 120, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Select For All Time Or Today :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Select Specific Date :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 100, -1));

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

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1250, 630));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Select Team:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 36, -1, 30));
        add(transparentComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void transparentTextfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentTextfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentTextfield1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swingComponents.transparentComboBox SelectTeamCombo;
    private javax.swing.JButton jButton7;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private swingComponents.transparentComboBox transparentComboBox2;
    private swingComponents.transparentTextfield transparentTextfield1;
    // End of variables declaration//GEN-END:variables
}
