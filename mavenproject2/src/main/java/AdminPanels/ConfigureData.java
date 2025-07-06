/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminPanels;

import HRpanels.*;
import swingComponents.PanelButtons;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/**
 *
 * @author HP
 */
public class ConfigureData extends javax.swing.JPanel {

    /**
     * Creates new form DutyRoster
     */
    
    private String[] cardNames = {"first", "second", "third"};
    private int currentCard = 0;
    
    private String[] TableNames = {"first", "second", "third", "fourth", "fifth"};
    private int currentTable = 0;
    
    
    public ConfigureData() {
        initComponents();
        
        
        
        
        JSpinner.DateEditor fromEditor = new JSpinner.DateEditor(spinnerFrom, "HH:mm");
        spinnerFrom.setEditor(fromEditor);

        JSpinner.DateEditor toEditor = new JSpinner.DateEditor(spinnerTo, "HH:mm");
        spinnerTo.setEditor(toEditor);
        
    }

  
    
    
    

    public void switchDutyTables2(String panelName) {
    CardLayout card = (CardLayout) RegisterTables.getLayout();
    card.show(RegisterTables, panelName);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterTables = new javax.swing.JPanel();
        FirstTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SecondTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        ThirdTable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        FourthTable = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        FifthTable = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new swingComponents.PanelButtons("roster");
        jButton13 = new swingComponents.PanelButtons("roster");
        jButton14 = new swingComponents.PanelButtons("roster");
        jButton15 = new swingComponents.PanelButtons("roster");
        jLabel1 = new javax.swing.JLabel();
        transparentTextfield1 = new swingComponents.transparentTextfield();
        jLabel3 = new javax.swing.JLabel();
        transparentTextfield2 = new swingComponents.transparentTextfield();
        spinnerFrom = new javax.swing.JSpinner();
        spinnerTo = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        transparentTextfield3 = new swingComponents.transparentTextfield();
        jLabel8 = new javax.swing.JLabel();
        transparentComboBox1 = new swingComponents.transparentComboBox();
        jLabel9 = new javax.swing.JLabel();
        transparentTextfield4 = new swingComponents.transparentTextfield();
        jLabel10 = new javax.swing.JLabel();
        transparentTextfield5 = new swingComponents.transparentTextfield();
        jLabel11 = new javax.swing.JLabel();
        transparentTextfield6 = new swingComponents.transparentTextfield();
        jLabel12 = new javax.swing.JLabel();
        transparentTextfield7 = new swingComponents.transparentTextfield();
        jLabel13 = new javax.swing.JLabel();
        transparentTextfield8 = new swingComponents.transparentTextfield();
        jLabel14 = new javax.swing.JLabel();
        transparentTextfield9 = new swingComponents.transparentTextfield();
        jLabel15 = new javax.swing.JLabel();
        transparentTextfield10 = new swingComponents.transparentTextfield();
        jLabel16 = new javax.swing.JLabel();
        transparentTextfield11 = new swingComponents.transparentTextfield();

        setPreferredSize(new java.awt.Dimension(1267, 754));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegisterTables.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"how are you", "hi", "hi", "hi"},
                {null, null, null, null},
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        FirstTableLayout.setVerticalGroup(
            FirstTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        RegisterTables.add(FirstTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"i am good", "hi", "hi"},
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        SecondTableLayout.setVerticalGroup(
            SecondTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        RegisterTables.add(SecondTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"table", "3", "3"},
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
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout ThirdTableLayout = new javax.swing.GroupLayout(ThirdTable);
        ThirdTable.setLayout(ThirdTableLayout);
        ThirdTableLayout.setHorizontalGroup(
            ThirdTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        ThirdTableLayout.setVerticalGroup(
            ThirdTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        RegisterTables.add(ThirdTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"fourth table", "hi", "hi"},
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
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout FourthTableLayout = new javax.swing.GroupLayout(FourthTable);
        FourthTable.setLayout(FourthTableLayout);
        FourthTableLayout.setHorizontalGroup(
            FourthTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        FourthTableLayout.setVerticalGroup(
            FourthTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        RegisterTables.add(FourthTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"fifth table", "hi", "hi"},
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
        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout FifthTableLayout = new javax.swing.GroupLayout(FifthTable);
        FifthTable.setLayout(FifthTableLayout);
        FifthTableLayout.setHorizontalGroup(
            FifthTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        FifthTableLayout.setVerticalGroup(
            FifthTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        RegisterTables.add(FifthTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(RegisterTables, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 820, 540));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Data Config");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 210, -1));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton10.setText("REFRESH");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 620, 90, -1));

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton13.setText("Create");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 90, -1));

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton14.setText("Update");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 620, 80, -1));

        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton15.setText("Delete");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 620, 80, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Create Shift Code :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        add(transparentTextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("To :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        transparentTextfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentTextfield2ActionPerformed(evt);
            }
        });
        add(transparentTextfield2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 110, -1));

        spinnerFrom.setModel(new javax.swing.SpinnerDateModel());
        add(spinnerFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        spinnerTo.setModel(new javax.swing.SpinnerDateModel());
        add(spinnerTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Create Team :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("From :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Shift Code Duration :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Create Salary Code :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        transparentTextfield3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentTextfield3ActionPerformed(evt);
            }
        });
        add(transparentTextfield3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 70, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Salary Amount :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));
        add(transparentComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Currency :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        transparentTextfield4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentTextfield4ActionPerformed(evt);
            }
        });
        add(transparentTextfield4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 70, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Create Leave type :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        transparentTextfield5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentTextfield5ActionPerformed(evt);
            }
        });
        add(transparentTextfield5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 110, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Create Level :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, 20));

        transparentTextfield6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentTextfield6ActionPerformed(evt);
            }
        });
        add(transparentTextfield6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 110, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Create Rank / Position:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 20));

        transparentTextfield7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentTextfield7ActionPerformed(evt);
            }
        });
        add(transparentTextfield7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 110, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Create Overtime Code :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, 20));

        transparentTextfield8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentTextfield8ActionPerformed(evt);
            }
        });
        add(transparentTextfield8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 110, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Create Overtime Rate :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, 20));

        transparentTextfield9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentTextfield9ActionPerformed(evt);
            }
        });
        add(transparentTextfield9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 110, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Create Allowance Code:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, 20));

        transparentTextfield10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentTextfield10ActionPerformed(evt);
            }
        });
        add(transparentTextfield10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 110, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Create Allowance Rate :");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, -1, 20));

        transparentTextfield11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentTextfield11ActionPerformed(evt);
            }
        });
        add(transparentTextfield11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
                                                 
    

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void transparentTextfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentTextfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentTextfield2ActionPerformed

    private void transparentTextfield3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentTextfield3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentTextfield3ActionPerformed

    private void transparentTextfield4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentTextfield4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentTextfield4ActionPerformed

    private void transparentTextfield5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentTextfield5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentTextfield5ActionPerformed

    private void transparentTextfield6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentTextfield6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentTextfield6ActionPerformed

    private void transparentTextfield7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentTextfield7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentTextfield7ActionPerformed

    private void transparentTextfield8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentTextfield8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentTextfield8ActionPerformed

    private void transparentTextfield9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentTextfield9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentTextfield9ActionPerformed

    private void transparentTextfield10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentTextfield10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentTextfield10ActionPerformed

    private void transparentTextfield11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentTextfield11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentTextfield11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FifthTable;
    private javax.swing.JPanel FirstTable;
    private javax.swing.JPanel FourthTable;
    private javax.swing.JPanel RegisterTables;
    private javax.swing.JPanel SecondTable;
    private javax.swing.JPanel ThirdTable;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JSpinner spinnerFrom;
    private javax.swing.JSpinner spinnerTo;
    private swingComponents.transparentComboBox transparentComboBox1;
    private swingComponents.transparentTextfield transparentTextfield1;
    private swingComponents.transparentTextfield transparentTextfield10;
    private swingComponents.transparentTextfield transparentTextfield11;
    private swingComponents.transparentTextfield transparentTextfield2;
    private swingComponents.transparentTextfield transparentTextfield3;
    private swingComponents.transparentTextfield transparentTextfield4;
    private swingComponents.transparentTextfield transparentTextfield5;
    private swingComponents.transparentTextfield transparentTextfield6;
    private swingComponents.transparentTextfield transparentTextfield7;
    private swingComponents.transparentTextfield transparentTextfield8;
    private swingComponents.transparentTextfield transparentTextfield9;
    // End of variables declaration//GEN-END:variables
}
