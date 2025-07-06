/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManagementUi;

import TeamLeaderPanels.LeaveManagement;
import HRpanels.StaffRegistrationHR;
import AdminPanels.*;
import SideMenus.*;
import UserPanels.*;
import HRpanels.*;
import TeamLeaderPanels.*;


import app.mavenproject2.*;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author HP
 */
public class AdminMain extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdminMain.class.getName());
    private StaffRegistrationHR sr;
    private LeaveAssignment la;
    
    private TeamsAndMembers teamsAndmembersPanel;
    private Payroll p;
    
    private UserControl usrc;
    private AccessMatrixpanel matrixPanel;
    
    
    private DefaultPanel defaultPanel;
    ////////////////////////////// for normal user
    private PayrollNormal paynormal;
    private LeaveApplication lap;
    
    ////////////////////////////
    ///for HR
    
    
    
    
    private StaffRegistrationHR registerhr;
    
    
    
    ///////////////////////
    //for team leader
    
    
    private LeaveManagement lm;
  
    
    
   
    
    //////////////////////
    private AttendanceList attendanceListPanel;
    private HRpanel hrp;
    private TEAMLEADERpanel tlp;
    private NormalUserpanel nup;
    private Adminpanel ap;
    private ConfigureData sra;
    private DutyRoster dutyRosterPanel;
    
    private String userRole;
    
    
    /**
     * Creates new form Main
     */
    
public AdminMain(String userRole) {
        this.userRole = userRole;
        initComponents();
        
        
        
        hrp = new HRpanel(this, dutyRosterPanel, attendanceListPanel, teamsAndmembersPanel);
        MenuLayers.add(hrp, "HRmenu");
        tlp = new TEAMLEADERpanel(this, dutyRosterPanel, attendanceListPanel, teamsAndmembersPanel);
        MenuLayers.add(tlp, "TEAMLEADERmenu");
        nup = new NormalUserpanel(this);
        MenuLayers.add(nup, "NORMALmenu");
        ap = new Adminpanel(this, dutyRosterPanel, attendanceListPanel, teamsAndmembersPanel);
        MenuLayers.add(ap, "ADMINmenu");
        
        
        switchMenus(getPanelNameForRole(userRole));

        //////////////////////////////////////////////
        ///FOR ADMIN MENU
        attendanceListPanel = new AttendanceList(userRole);
        AdminForms.add(attendanceListPanel, "attendanceList");
        
        dutyRosterPanel = new DutyRoster(userRole);
        AdminForms.add(dutyRosterPanel, "dutyRoster");
        
        sr = new StaffRegistrationHR();
        AdminForms.add(sr, "register");
        la = new LeaveAssignment();
        AdminForms.add(la, "assign");
        lm = new LeaveManagement();
        AdminForms.add(lm, "manage");
        teamsAndmembersPanel = new TeamsAndMembers(userRole);
        AdminForms.add(teamsAndmembersPanel, "teamsAndmembers");
        p = new Payroll();
        AdminForms.add(p, "pay");
         
        usrc = new UserControl();
        AdminForms.add(usrc, "control");
        
        sra = new ConfigureData();
        AdminForms.add(sra, "dataconfig");
        
        matrixPanel = new AccessMatrixpanel();
        AdminForms.add(matrixPanel, "matrix");
        
        ///////////////////// for normal user
        lap = new LeaveApplication();
        AdminForms.add(lap, "leave");
        
        paynormal = new PayrollNormal();
        AdminForms.add(paynormal, "paynormal");
        /////////////////////////////////
        
        
        
        defaultPanel = new DefaultPanel();
        AdminForms.add(defaultPanel, "defaultPanel");
        CardLayout card = (CardLayout) AdminForms.getLayout(); // default cardlayout
        card.show(AdminForms, "defaultPanel");
        //for HR
        
        
        
        
       
        
        
        
       
        
        registerhr = new StaffRegistrationHR();
        AdminForms.add(registerhr, "registerhr");
        
        
        
        ///////////////////// for teamleader
        
        
       
        
        lm = new LeaveManagement();
        AdminForms.add(lm, "lm");
        
        
     
        
    }

    /**
     * Returns the card name for the given user role.
     */
    private String getPanelNameForRole(String role) {
        switch (role.toLowerCase()) {
            case "hr": return "HRmenu";
            case "teamleader": return "TEAMLEADERmenu";
            case "normal": return "NORMALmenu";
            case "admin": return "ADMINmenu"; 
            default: return "NORMALmenu";
        }
    }
    
    public void switchAdminFrames(String panelName) {
        CardLayout card = (CardLayout) AdminForms.getLayout();
        card.show(AdminForms, panelName);
    }
    
    public void switchMenus(String panelName) {
        CardLayout cards = (CardLayout) MenuLayers.getLayout();
        cards.show(MenuLayers, panelName);
    }
     public void setActiveTab(int idx, java.util.List<String> cardNames) {
    CardLayout cl = (CardLayout) (AdminForms.getLayout());
    cl.show(AdminForms, cardNames.get(idx));
}
            
                      
//   java.util.List<javax.swing.JButton> tabButtons = java.util.Arrays.asList(
////    ButtonDutyRoster,
////    ButtonLeaveAssignment,
////    ButtonTeamsAndMembers,
////    ButtonLeaveManagement,
////    ButtonStaffRegistration ,
////    ButtonPayroll,
////    ButtonLogout
//);
//java.util.List<String> cardNames = java.util.Arrays.asList(
//    "roster", "register", "assign", "manage", "team", "pay", "logout"
//);

//// Helper to set the active tab
//java.util.function.Consumer<Integer> setActiveTab = idx -> {
//    for (int i = 0; i < tabButtons.size(); i++) {
//        if (i == idx) {
//            tabButtons.get(i).setBackground(new java.awt.Color(51, 51, 51)); // #333333
//            tabButtons.get(i).setForeground(java.awt.Color.WHITE);
//            tabButtons.get(i).setOpaque(true);
//            tabButtons.get(i).setContentAreaFilled(true);
//        } else {
//            tabButtons.get(i).setBackground(new java.awt.Color(0, 0, 0, 0)); // transparent
//            tabButtons.get(i).setForeground(java.awt.Color.WHITE);
//            tabButtons.get(i).setOpaque(false);
//            tabButtons.get(i).setContentAreaFilled(false);
//        }
//        tabButtons.get(i).setBorderPainted(false);
//    }
//    java.awt.CardLayout cl = (java.awt.CardLayout) (AdminForms.getLayout());
//    cl.show(AdminForms, cardNames.get(idx));
//};
//
//// Add listeners to each button
//for (int i = 0; i < tabButtons.size(); i++) {
//    final int idx = i;
//    tabButtons.get(i).addActionListener(e -> setActiveTab.accept(idx));
//}
//
//// Set the first tab as active by default
//setActiveTab.accept(0);
//}

   
 

   
    
 
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        AdminForms = new javax.swing.JPanel();
        MenuLayers = new javax.swing.JPanel();
        header1 = new app.mavenproject2.Header();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminForms.setLayout(new java.awt.CardLayout());
        jPanel2.add(AdminForms, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 750));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 1270, 750));

        MenuLayers.setLayout(new java.awt.CardLayout());
        getContentPane().add(MenuLayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 180, 580));
        getContentPane().add(header1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 170));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        setSize(new java.awt.Dimension(1461, 762));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        FlatLightLaf.setup();
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
//            logger.log(java.util.logging.Level.SEVERE, null, ex);
//        }
    //</editor-fold>

      /* Create and display the form */
       java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminForms;
    private javax.swing.JPanel MenuLayers;
    private app.mavenproject2.Header header1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
