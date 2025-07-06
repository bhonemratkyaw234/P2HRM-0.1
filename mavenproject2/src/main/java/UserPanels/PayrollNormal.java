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
public class PayrollNormal extends javax.swing.JPanel {

    /**
     * Creates new form DutyRoster
     */
    
   
    
    private String[] TableNames = {"first", "second"};
    private int currentTable = 0;
    
    
    public PayrollNormal() {
        initComponents();
       
        
        LeaveTables.setLayout(new CardLayout());
        LeaveTables.add(FirstTable, "first");
        LeaveTables.add(SecondTable, "second");
       
    }

  
    
    
    
  
    public void switchDutyTables2(String panelName) {
    CardLayout card = (CardLayout) LeaveTables.getLayout();
    card.show(LeaveTables, panelName);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeaveTables = new javax.swing.JPanel();
        FirstTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SecondTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton13 = new swingComponents.PanelButtons("roster");

        setPreferredSize(new java.awt.Dimension(1267, 754));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeaveTables.setLayout(new java.awt.CardLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"This is table", "1", null, null},
                {null, "", null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout FirstTableLayout = new javax.swing.GroupLayout(FirstTable);
        FirstTable.setLayout(FirstTableLayout);
        FirstTableLayout.setHorizontalGroup(
            FirstTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
        );
        FirstTableLayout.setVerticalGroup(
            FirstTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        LeaveTables.add(FirstTable, "card2");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"This is Second", "hi", "hi"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout SecondTableLayout = new javax.swing.GroupLayout(SecondTable);
        SecondTable.setLayout(SecondTableLayout);
        SecondTableLayout.setHorizontalGroup(
            SecondTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
        );
        SecondTableLayout.setVerticalGroup(
            SecondTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        LeaveTables.add(SecondTable, "card3");

        add(LeaveTables, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1250, 540));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Payroll");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 20, 120, -1));

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton13.setText("Download Payslip");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FirstTable;
    private javax.swing.JPanel LeaveTables;
    private javax.swing.JPanel SecondTable;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
