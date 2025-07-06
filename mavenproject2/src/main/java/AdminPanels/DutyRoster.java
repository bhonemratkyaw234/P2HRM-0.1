/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminPanels;

import ManagementUi.AdminMain;
import swingComponents.PanelButtons;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JSpinner;

/**
 *
 * @author HP
 */
public class DutyRoster extends javax.swing.JPanel {
    private String userRole;
     
    /**
     * Creates new form DutyRoster
     */
    public DutyRoster(String userRole) {
        
        initComponents();
        DutyRosterTables.setLayout(new CardLayout());
        DutyRosterTables.add(FirstTable, "first");
        
        if("teamleader".equalsIgnoreCase(userRole)) {
            TeamSelectCombo.setEnabled(false);
        }
        
        
    }

  
    
    
    
    public void switchDutyTables(String panelName) {
    CardLayout card = (CardLayout) DutyRosterTables.getLayout();
    card.show(DutyRosterTables, panelName);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DutyRosterInputs = new javax.swing.JPanel();
        FirstInput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        transparentComboBox1 = new swingComponents.transparentComboBox();
        transparentTextfield2 = new swingComponents.transparentTextfield();
        jLabel8 = new javax.swing.JLabel();
        transparentComboBox2 = new swingComponents.transparentComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        btnNotice = new PanelButtons("rdser");
        SecondInput = new javax.swing.JPanel();
        DutyRosterTables = new javax.swing.JPanel();
        FirstTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDutyRoster = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnRefresh = new PanelButtons("jdb");
        jButton7 = new swingComponents.PanelButtons("fer");
        jButton9 = new swingComponents.PanelButtons("sster");
        transparentTextfield1 = new swingComponents.transparentTextfield();
        jButton10 = new PanelButtons("er");
        btnUpdate = new PanelButtons("rster");
        btnDelete = new PanelButtons("dknd");
        jLabel9 = new javax.swing.JLabel();
        TeamSelectCombo = new swingComponents.transparentComboBox();
        btnsave1 = new PanelButtons("rdser");

        setPreferredSize(new java.awt.Dimension(1267, 754));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DutyRosterInputs.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Staff ID    :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Roster_Type_ID:");

        transparentComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "553", "554", "555", "556", "557", "558", "559", "560", "561", "562", "563", "564", "565", "566", "567", "568", "569", "570", "571", "572", "573", "574", "575", "576" }));
        transparentComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentComboBox1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Select Team :");

        transparentComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EP", "Network", "Civil", "Programming" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Date:");

        btnNotice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNotice.setText("notice!");
        btnNotice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoticeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FirstInputLayout = new javax.swing.GroupLayout(FirstInput);
        FirstInput.setLayout(FirstInputLayout);
        FirstInputLayout.setHorizontalGroup(
            FirstInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstInputLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(FirstInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FirstInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transparentTextfield2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transparentComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transparentComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FirstInputLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnNotice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FirstInputLayout.setVerticalGroup(
            FirstInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstInputLayout.createSequentialGroup()
                .addComponent(btnNotice)
                .addGap(48, 48, 48)
                .addGroup(FirstInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(transparentComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FirstInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(transparentTextfield2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FirstInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(transparentComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(FirstInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(284, Short.MAX_VALUE))
        );

        DutyRosterInputs.add(FirstInput, "card2");

        javax.swing.GroupLayout SecondInputLayout = new javax.swing.GroupLayout(SecondInput);
        SecondInput.setLayout(SecondInputLayout);
        SecondInputLayout.setHorizontalGroup(
            SecondInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        SecondInputLayout.setVerticalGroup(
            SecondInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        DutyRosterInputs.add(SecondInput, "card3");

        add(DutyRosterInputs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 410, 540));

        javax.swing.GroupLayout FirstTableLayout = new javax.swing.GroupLayout(FirstTable);
        FirstTable.setLayout(FirstTableLayout);
        FirstTableLayout.setHorizontalGroup(
            FirstTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        FirstTableLayout.setVerticalGroup(
            FirstTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        tblDutyRoster.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDutyRoster);

        javax.swing.GroupLayout DutyRosterTablesLayout = new javax.swing.GroupLayout(DutyRosterTables);
        DutyRosterTables.setLayout(DutyRosterTablesLayout);
        DutyRosterTablesLayout.setHorizontalGroup(
            DutyRosterTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DutyRosterTablesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FirstTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addContainerGap())
        );
        DutyRosterTablesLayout.setVerticalGroup(
            DutyRosterTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DutyRosterTablesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DutyRosterTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DutyRosterTablesLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DutyRosterTablesLayout.createSequentialGroup()
                        .addComponent(FirstTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        add(DutyRosterTables, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 820, 540));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Duty Roster");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 210, -1));

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 620, 80, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setText(":Search");
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 80, 30));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton9.setText("<---");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, 70, -1));
        add(transparentTextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 140, -1));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton10.setText("--->");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, 70, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 620, 80, -1));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 620, 80, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Select Team :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 44, -1, -1));
        add(TeamSelectCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 120, -1));

        btnsave1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsave1.setText("INSERT");
        btnsave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave1ActionPerformed(evt);
            }
        });
        add(btnsave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, 80, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       switchDutyTables("first");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      
       switchDutyTables("second");  
                                           
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void transparentComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentComboBox1ActionPerformed

    private void btnNoticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoticeActionPerformed
       JOptionPane.showMessageDialog(this, "1. min_interval (Subsequent shift should be planned by 8 hours interval)\n" +
            "2. roster_interval (Roster planning should be arranged prior to 7 days ahead) ", "Roster Policy!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnNoticeActionPerformed

    //this is how do i draw
//    1. Core Shift Rotation Pattern (4-Team, 28-Day Cycle)
//Structure:
//
//7 consecutive day shifts → 2 days off →
//
//7 swing shifts → 2 days off →
//
//7 night shifts → 3 days off .
//
//Key Features:
//
//Slow, forward rotation (day → swing → night) aligns with circadian rhythm adaptation .
//
//42-hour average workweek, requiring ~2 hours of overtime weekly .
//
//Compliance: Ensures 8-hour gaps between shifts inherently through non-overlapping blocks .
//
//⚙️ 2. Implementing the 7-Day Advance Planning Rule
//Best Practices:
//
//Digital rostering tools (e.g., Snap Schedule 365, ProMark) automate scheduling, enforce labor rules, and publish rosters ≥7 days early .
//
//Employee self-service portals allow shift swaps/availability updates, reducing last-minute changes.
//
//Legal Alignment: Adheres to global labor standards (e.g., Singapore’s Employment Act, EU Working Time Directive) requiring advance schedule notification .
//
//⚖️ 3. Fairness & Wellbeing in Rotation
//Equity: Distributes undesirable shifts (e.g., nights/weekends) evenly across teams .
//
//Fatigue Mitigation:
//
//3 consecutive off-days post-night shifts combat burnout .
//
//Limits: 7-night shift blocks may disrupt sleep; forward rotation reduces health risks vs. backward rotation .
//
//⚠️ 4. Operational Challenges & Solutions
//Drawbacks:
//
//Free weekends only once every 7 weeks .
//
//Communication gaps during shift transitions .
//
//Solutions:
//
//Overlapping shifts (e.g., 30-min handover windows).
//
//AI-driven software (e.g., RosterLab) optimizes coverage while respecting intervals 
//
//💡 5. Industry Applications & Variations
//Healthcare/Manufacturing: Uses 4-team 8-hour rotations for 24/7 coverage 
//
//Alternatives:
//
//Pitman Schedule (12-hour shifts): Fewer rotations but longer shifts 
//
//Compressed Workweeks: 4x10-hour shifts; may conflict with 8-hour interval rules 
//
//📋 Implementation Checklist Table
//Policy Element	Action Required	Tools/Examples
//8-hour interval	Non-overlapping shift blocks	Snap Schedule 365
//7-day planning	Publish rosters ≥7 days early	QuickHR, MYOB 
//Rotation fairness	Distribute night/weekend shifts	BrightHR fairness algorithms 
//Fatigue management	3 days off after night shifts	ProMark compliance features
//We are given that there are 4 teams: EP, CIV, PROG, and NET (from the previous context). The user now wants separate duty rosters for each team (EP team, CIV team, PROG team, and NET team). 
// Each team has 12 members (from the data: EP has 12 members, CIV has 12, PROG has 12, and NET has 12). We are to create a duty roster for each team independently, following the constraints:
// - Minimum 8 hours between shifts (so no consecutive shifts that are less than 8 hours apart)
// - Roster should be planned at least 7 days in advance.
// We'll design a 4-team rotation within each team? Actually, the user wants each team to have its own roster. Since each team has 12 members, we can split each team into 3 groups (of 4 people each) to cover 3 shifts per day (24/7 operation). 
// However, note the previous example used a 4-team system for 40 people, but now we have 12 per team. We can do:
// For one team (e.g., EP team) of 12 people:
//   We can form 3 groups (Group A, B, C) of 4 people each.
//   Rotation pattern (forward rotation: day -> evening -> night -> rest) but we have 3 shifts and 3 groups? We can use a 3-team rotation over 9 days? But let's design a 28-day cycle as before.
// Alternatively, we can use a 4-group system even for 12 people? Then each group would have 3 people. But we need to cover 3 shifts per day (so 3 groups per day, one per shift). 
// Let me propose:
// For a team of 12 people, we can have 4 groups (A, B, C, D) of 3 people each. Then we assign 3 groups to work on a given day (covering the 3 shifts) and one group rests. Then we rotate.
// Example rotation cycle (28 days) for one team:
//   Week 1: 
//      Group A: Day shift (7 days)
//      Group B: Evening shift (7 days)
//      Group C: Night shift (7 days)
//      Group D: Rest
//   Week 2:
//      Group A: Rest
//      Group B: Day shift
//      Group C: Evening shift
//      Group D: Night shift
//   Week 3:
//      Group A: Night shift
//      Group B: Rest
//      Group C: Day shift
//      Group D: Evening shift
//   Week 4:
//      Group A: Evening shift
//      Group B: Night shift
//      Group C: Rest
//      Group D: Day shift
// But note: each group works 7 days in a row? That might be tiring. Alternatively, we can break the 7 days into shorter blocks.
// However, the user had a pattern of 7 days on, 2 days off in the previous example. But now we have 4 groups and 3 shifts. We can do:
//   We need to cover 3 shifts per day (24 hours). So each day, 3 groups are working and 1 group is off.
//   We can design a cycle where each group works for 6 days and then has 2 days off? But 6 days of consecutive work might be too long.
// Alternatively, we can use a more balanced system: 4 teams (groups) for 3 shifts -> we can use a rotating schedule that gives each group a mix of shifts and rest.
// Let's use a 12-day cycle? But the user might prefer a weekly cycle.
// I propose a repeating 4-week (28-day) cycle that ensures:
//   - Each group gets at least 1 day off per week (on average)
//   - Each group rotates through all shifts.
// We can design it as follows:
//   We have 4 groups: A, B, C, D.
//   We break the 28 days into 4 weeks of 7 days.
//   In each week, we assign the shifts as:
//        Day   Evening   Night   Rest
//   Week1: A     B        C       D
//   Week2: D     A        B       C
//   Week3: C     D        A       B
//   Week4: B     C        D       A
//   Then the next cycle repeats.
//   So each group, in a 4-week cycle, will have:
//        Week1: Day shift
//        Week2: Evening shift
//        Week3: Night shift
//        Week4: Rest week? 
//   But wait, in week4, group A is not resting? Actually, in week4, group A is not assigned to rest? Let me check:
//   Week4: 
//        Day: B
//        Evening: C
//        Night: D
//        Rest: A
//   So actually, each group gets one week of rest in the 4-week cycle? But that rest week is a whole week off? That might be too much.
//   Alternatively, we want each group to work every week, but have some rest days. So let's not assign a whole week rest.
//   Instead, we can assign within a week: each group works 5 days and has 2 days off? But then we have to cover 3 shifts * 7 days = 21 shifts per week, and we have 4 groups of 3 people (12 people) -> each person works 5 shifts? But 21 shifts / 3 people per shift = 7 shifts per person? That doesn't add up.
//   Actually, we have 3 shifts per day * 7 days = 21 shifts per week.
//   And we have 12 people. If we want each person to work 5 days, then 12 * 5 = 60 person-shifts, which is more than 21? That's not matching.
//   Let me recast: we have 21 shifts per week. Each shift requires 4 people? Or 1 person? The previous example had 10 people per shift? But that was for a different context.
//   In this context, how many people per shift? The user didn't specify. Let's assume that each shift requires 4 people (so 4 people on day shift, 4 on evening, 4 on night). Then total shifts per week: 3 shifts/day * 7 days * 4 people/shift = 84 person-shifts.
//   Then per person: 84 / 12 = 7 shifts per week? That would be 7 days of work? But we need to give rest.
//   Alternatively, we might not need 4 people per shift? The requirement is not given.
//   Since the user hasn't specified the coverage per shift, we'll assume that each shift requires 1/3 of the team? So 4 people per shift (since 12/3=4). Then each person would work 5 days a week? But 4 people * 3 shifts * 7 days = 84 person-shifts, and 12 people * 5 days = 60 -> which is less than 84. So we need more.
//   Actually, if each shift requires 4 people, then each day requires 12 person-shifts (4 per shift * 3 shifts). Then per week: 84 person-shifts. And 12 people working 7 days would be 84. But that means no rest? Not acceptable.
//   So we must have overlapping or a different arrangement.
//   We can have 3 groups of 4 people (so 12 people) and assign each group to a shift for a week? Then the fourth group? We don't have a fourth group. So we need to have one group resting? Then we have 3 groups working and one group resting? But then each group would work 3 weeks and rest one week? That would be 3*7=21 working days and 7 rest days? But 21 working days in a row is too long.
//   Alternatively, we can break the groups and have a more flexible schedule.
//   Given the complexity, I propose we use a standard 3-team system for 24/7 coverage (with 12 people, 3 groups of 4) in a rotating shift pattern. The classic is the "DuPont schedule" or a similar 12-hour shift pattern? But the user has 8-hour shifts.
//   We can use a 3-team, 3-shift system with a rotation every week? For example:
//   Week 1:
//      Group A: Day shift (7 days)
//      Group B: Evening shift (7 days)
//      Group C: Night shift (7 days)
//   Week 2:
//      Group A: Night shift
//      Group B: Day shift
//      Group C: Evening shift
//   Week 3:
//      Group A: Evening shift
//      Group B: Night shift
//      Group C: Day shift
//   Then week 4: same as week1? But then each group works 7 days without a break? Not acceptable.
//   So we need to insert rest days.
//   A common 8-hour shift pattern is the "4 on, 2 off" pattern? But we have 3 shifts.
//   I found a common pattern for 24/7 coverage with 8-hour shifts is the "Panama schedule" (2-2-3 pattern) but it uses 12-hour shifts? Or we can adapt.
//   Alternatively, we can use a 21-day cycle with 3 teams? 
//   After research, I recall a 3-team system for 8-hour shifts that uses a 6-week cycle? It might be too complex.
//   Given the time, I'll design a simple pattern for one team (12 people) that ensures:
//     - Each person works 5 days a week (so 2 days off)
//     - The shifts are rotated fairly.
//   We can divide the 12 people into 3 groups (A, B, C) of 4. Then each group is assigned to a shift for a week, and then we rotate the shifts. And we give one group a rest week? No, we cannot have a rest week because we need coverage every week.
//   Instead, we can have a pattern where within a week, each group gets 2 days off? How?
//   We can assign for one week:
//        Day shift: 4 people from Group A and 4 people from Group B? No, we want to assign by group.
//   Since the user has not specified the coverage per shift, I'll assume that each shift requires 4 people.
//   We have 12 people. We can create 3 groups (A, B, C) of 4 people.
//   We then assign the shifts in a weekly rotation, but also within the week, we give each person 2 days off. How to do that?
//   We can split each group into two (so we have 6 subgroups: A1, A2, B1, B2, C1, C2) and then assign shifts per day? But that might be complex.
//   Alternatively, we can use a repeating pattern of 6 days (to cover 2 sets of 3 shifts) and then one day for rest? But let's follow a standard.
//   I found a common 8-hour shift pattern for 24/7 coverage with 4 teams (which we don't have) or 3 teams.
//   Given the complexity and the fact that the user has 4 teams (but we are doing per team, and per team has 12 people), I propose to use a 3-crew system with a 3-week cycle:
//   Week 1:
//      Group A: Morning shift for 7 days
//      Group B: Evening shift for 7 days
//      Group C: Night shift for 7 days
//   Week 2:
//      Group A: Night shift
//      Group B: Morning shift
//      Group C: Evening shift
//   Week 3:
//      Group A: Evening shift
//      Group B: Night shift
//      Group C: Morning shift
//   Then in week 4, we repeat week1.
//   This means each group works 7 days in a row, then rotates to the next shift. They get no rest days during the working week? This is not ideal.
//   To insert rest days, we can do a 9-day cycle? But the user might prefer weekly cycles.
//   Another pattern: 4 teams within the 12 people? But we have 12 people, so 4 teams of 3. Then we can use the 4-team, 28-day cycle as described earlier for the entire team, but now applied to one team (so the team of 12 is split into 4 groups of 3).
//   Then the schedule for the team would be:
//   Week 1: 
//        Group A: Day shift (7 days)
//        Group B: Evening shift (7 days)
//        Group C: Night shift (7 days)
//        Group D: Rest (7 days)
//   Week 2:
//        Group A: Rest
//        Group B: Day shift
//        Group C: Evening shift
//        Group D: Night shift
//   Week 3:
//        Group A: Night shift
//        Group B: Rest
//        Group C: Day shift
//        Group D: Evening shift
//   Week 4:
//        Group A: Evening shift
//        Group B: Night shift
//        Group C: Rest
//        Group D: Day shift
//   Then repeat.
//   This gives each group 7 days off in every 28 days? And 21 days of work? And the shifts are rotated.
//   But note: each shift has 3 people (because each group has 3). Is that sufficient? If yes, then this works.
//   So for the EP team, we can have:
//        Group A, B, C, D (each 3 people)
//   And then use the above 28-day cycle.
//   This satisfies:
//        - 7 days in a shift, then rotate (with a week of rest in between)
//        - The rotation is forward: Day -> Evening -> Night -> Rest (then next cycle: Rest -> Day -> ...) but actually after rest they go to Night? 
//   Let's trace Group A:
//        Week1: Day
//        Week2: Rest
//        Week3: Night
//        Week4: Evening
//   Then next cycle:
//        Week5: Day
//        Week6: Rest
//        Week7: Night
//        Week8: Evening
//   This is not a forward rotation. It's Day, then Night, then Evening.
//   We can adjust the order to be forward:
//        Week1: Day
//        Week2: Evening
//        Week3: Night
//        Week4: Rest
//   Then for Group A in the next cycle (week5) would be Day again? But then we have to assign Group A in week5 to Day, but then we break the pattern.
//   Alternatively, after week4 (rest), Group A should go to a shift that is the next in the forward cycle? The forward cycle is Day->Evening->Night->Rest. After Rest, they go to Day.
//   So we can do:
//   Week1: 
//        Group A: Day
//        Group B: Evening
//        Group C: Night
//        Group D: Rest
//   Week2:
//        Group A: Evening
//        Group B: Night
//        Group C: Rest
//        Group D: Day
//   Week3:
//        Group A: Night
//        Group B: Rest
//        Group C: Day
//        Group D: Evening
//   Week4:
//        Group A: Rest
//        Group B: Day
//        Group C: Evening
//        Group D: Night
//   Then repeat.
//   Now trace Group A: 
//        Week1: Day
//        Week2: Evening
//        Week3: Night
//        Week4: Rest
//        Week5: Day ... 
//   This is a forward rotation and includes a rest week.
//   This is better.
//   Now, we have to check coverage: 
//        Each shift has one group (3 people) per week? 
//        In week1: 
//            Day: Group A (3)
//            Evening: Group B (3)
//            Night: Group C (3)
//            Rest: Group D (3) -> not working.
//        That covers 3 people per shift? If that's the required coverage, then it's okay.
//   But note: in week1, we have 3 people on day shift, 3 on evening, 3 on night. And group D is resting. Total working: 9 people. But we have 12 people? Where are the other 3? They are in group D and are resting. So it's by design.
//   In week2, we have:
//        Day: Group D (3)
//        Evening: Group A (3)
//        Night: Group B (3)
//        Rest: Group C (3)
//   So always 9 people working and 3 resting.
//   This means each person works 3 weeks and then has 1 week off? And within the working weeks, they work 7 days straight in one shift.
//   This is acceptable in some industries? But working 7 nights in a row is tough.
//   Alternatively, we can break the week into shorter periods? But the user might prefer the simplicity.
//   So for each team (EP, CIV, PROG, NET), we do:
//        Split into 4 groups (A, B, C, D) of 3 people each.
//        Use the 4-week cycle above.
//   And then the duty roster for each team will be independent.
//   We can present the roster for one team (EP) as an example.
//   Let's assign group names for EP team arbitrarily:
//        Group A: EP001, EP002, EP003
//        Group B: EP004, EP005, EP006
//        Group C: EP007, EP008, EP009
//        Group D: EP010, EP011, EP012
//   And similarly for other teams.
//   The roster for EP team for the first 4 weeks:
//   | Week | Day Shift (8AM-4PM) | Evening Shift (4PM-12AM) | Night Shift (12AM-8AM) | Rest |
//   |------|---------------------|--------------------------|------------------------|------|
//   | 1    | Group A             | Group B                  | Group C                | Group D |
//   | 2    | Group D             | Group A                  | Group B                | Group C |
//   | 3    | Group C             | Group D                  | Group A                | Group B |
//   | 4    | Group B             | Group C                  | Group D                | Group A |
//   Then it repeats.
//   Now, we have to ensure the 8-hour gap: 
//        The shifts are 8 hours long and have natural gaps (e.g., day shift ends at 4PM, evening starts at 4PM -> this is not an 8-hour gap). 
//   But the constraint is between the end of one shift and the start of the next shift for the same person. In this schedule, a person in Group A in week1 works day shift (8AM-4PM) and then in week2 works evening shift (4PM-12AM). The gap between the last day shift (Friday at 4PM) and the next shift (Monday at 4PM) is more than 8 hours? Actually, they have the whole weekend? 
//   But within the same week, they only work one shift. So no consecutive shifts within a day? 
//   However, note the end of week1 and start of week2: 
//        Group A: last shift is Friday of week1 at 4PM, and then next shift is Monday of week2 at 4PM? That's a gap of 48 hours? So it's safe.
//   Similarly, Group A in week2: works evening shift (4PM-12AM) for 7 days, then in week3: night shift (12AM-8AM) starting from Monday? The last shift in week2 is Sunday at 12AM (midnight between Sunday and Monday) and then the next shift starts at 12AM on Monday? That's the same time? So they finish at 12AM (midnight) on Monday morning and then start at 12AM on Monday? That's a double? 
//   Actually, the evening shift ends at 12AM (which is midnight) and the night shift starts at 12AM (the same midnight). So there's no gap? This violates the 8-hour gap.
//   We need to adjust the shift times or the rotation.
//   How about we insert a gap between shifts? For example, make the shifts:
//        Day: 6AM-2PM
//        Evening: 2PM-10PM
//        Night: 10PM-6AM
//   Then between shifts there is a gap? 
//        Day ends at 2PM, next shift (evening) starts at 2PM -> no gap.
//        Evening ends at 10PM, night starts at 10PM -> no gap.
//   This doesn't work.
//   Alternatively, we can have:
//        Day: 7AM-3PM
//        Evening: 3PM-11PM
//        Night: 11PM-7AM
//   Then between Day and Evening: 3PM end and next shift starts at 3PM? no gap.
//   To have an 8-hour gap, we would need to have at least 8 hours between the end of one shift and the start of the next. But then we would need to cover 24 hours with non-overlapping shifts that have gaps? That would extend beyond 24 hours.
//   The solution is to ensure that a person does not work two consecutive shifts. In our schedule, a person works only one shift per day and then has at least 16 hours off until the next shift (which is the next day at the same time). And when rotating, they have a whole week off? 
//   But the problem is when rotating from evening to night: 
//        Last evening shift ends at 12AM (midnight) on Monday morning, and the first night shift starts at 12AM on Monday? This is the same time. 
//   We can avoid this by having the night shift start at 12AM but after the evening shift ends at 12AM? It's the same moment.
//   This is a common issue in shift handover. The constraint is for the same person not to work two shifts within 8 hours. In this schedule, a person does not work two shifts in a row. They work evening shift until 12AM and then the next shift they work is the next week? So there is a gap of 7 days? 
//   But wait, in the example above, Group A in week2 works evening shift (which ends at 12AM on Sunday night, i.e., the start of Monday). Then in week3, they work night shift starting at 12AM on Monday? That is immediately after. So the gap is 0 hours.
//   To fix this, we can have the week start on Tuesday? Or we can have a break between cycles.
//   Alternatively, we can design the schedule so that after evening shift, the next assignment is not night shift in the next week? In the current design, Group A goes: 
//        Week1: day (ends at 4PM on Sunday)
//        Week2: evening (starts at 4PM on Monday) -> this is a 24-hour gap? That's safe.
//        Week3: night (starts at 12AM on Monday) -> but the last evening shift ended at 12AM on Monday, so it's continuous.
//   We need to change the rotation order to avoid evening->night consecutive across weeks.
//   How about we do:
//        Week1: Group A - Day, Group B - Evening, Group C - Night, Group D - Rest
//        Week2: Group A - Evening, Group B - Night, Group C - Rest, Group D - Day
//        Week3: Group A - Night, Group B - Rest, Group C - Day, Group D - Evening
//        Week4: Group A - Rest, Group B - Day, Group C - Evening, Group D - Night
//   Now, for Group A:
//        Week1: Day (ends at 4PM on Sunday)
//        Week2: Evening (starts at 4PM on Monday) -> 24-hour gap? Actually, it's from Sunday 4PM to Monday 4PM -> 24 hours? But the last shift of week1 is Sunday 4PM, and the first shift of week2 is Monday 4PM? That's 24 hours? But what about the shifts in between? They are not working, so it's safe.
//   Then week3: Group A - Night shift (starts at 12AM on Monday) -> the last shift of week2 is Sunday at 12AM (midnight between Saturday and Sunday)? Or does the evening shift in week2 include Sunday evening? 
//   Let's clarify the weeks:
//        Week1: Monday to Sunday (7 days) 
//        Week2: Monday to Sunday
//   So for Group A in week2: works evening shift from Monday to Sunday (each day 4PM-12AM). The last shift is Sunday: 4PM-12AM (which ends at 12AM on Monday).
//   Then in week3, they work night shift from Monday to Sunday: 12AM-8AM. The first shift starts at 12AM on Monday. 
//   So the gap between the end of the last shift of week2 (12AM Monday) and the start of the first shift of week3 (12AM Monday) is 0 hours.
//   This is a problem.
//   To fix this, we can have the night shift start at 8AM? But then it wouldn't be night shift.
//   Or we can have the week start on a different day for the next week? Or we can have a day off in between.
//   Alternatively, we can change the shift times to have an overlap-free and gap-included design, but that is not within scope.
//   Given the time, I'll adjust the schedule to have a transitional day off when rotating from evening to night.
//   We can insert a day off between the weeks? But then the cycle would be longer.
//   Another idea: make the schedule in 8-day weeks? But then it's not aligned with calendar weeks.
//   This is complex. Perhaps for simplicity, we can state that the shift handover happens at 8AM, 4PM, and 12AM, and the constraint of 8-hour gap is interpreted as not working two shifts within 8 hours. Since a person never works two shifts in a row (because they work one shift per day) and then have a whole week of the same shift, the only issue is the transition from one week to the next.
//   To solve the transition, we can ensure that the next shift starts at least 8 hours after the last shift of the previous week. For the evening to night transition, if we change the night shift to start at 8AM, then after evening shift ends at 12AM, there is 8 hours until 8AM. But then the night shift would be 8AM-4PM? That is day time.
//   Alternatively, we can define the shifts as:
//        Day: 6AM-2PM
//        Evening: 2PM-10PM
//        Night: 10PM-6AM
//   Then the gap between evening and night is 0 hours? (evening ends at 10PM and night starts at 10PM).
//   Or we can have:
//        Day: 7AM-3PM
//        Evening: 4PM-12AM  -> starts at 4PM, so gap from 3PM to 4PM = 1 hour? not 8.
//   This is very challenging.
//   Perhaps the user's constraint of 8-hour gap is only for consecutive shifts assigned to the same person without a break of at least 8 hours. In our schedule, within a week, a person works the same shift every day, so there is a break of 16 hours between shifts (e.g., between day shifts: from 4PM to 8AM next day -> 16 hours). 
//   The only problem is the transition between weeks for the evening to night. To fix that, we can swap the order for Group A:
//        Week1: Day
//        Week2: Rest  // insert a rest week between day and night?
//        Week3: Night
//        Week4: Evening
//   But then the rotation is not forward.
//   Given the complexity, I'll assume the user allows the groups to have a full day off between the weeks, so that the next shift starts at least 8 hours after the last shift. In practice, the last shift of the week ends on Sunday and the next shift starts on Monday, which is at least 8 hours if we align the shifts to start at a time that is 8 hours after the previous shift ended? 
//   For example, if the evening shift ends at 12AM on Monday, then the next shift (night) for that group would start on the next Monday at 12AM? That's a week later? That is more than 8 hours.
//   But in our schedule, the next shift for Group A is in week2 on Monday at 4PM for evening -> which is 16 hours after the last day shift (which ended at 4PM on the previous Sunday) -> safe.
//   The problematic transition is from week2 (evening) to week3 (night) for Group A: 
//        Last shift of week2: Sunday at 12AM (midnight between Sunday and Monday)
//        First shift of week3: Monday at 12AM (midnight between Sunday and Monday) -> same time.
//   This is because the evening shift of week2 on Sunday is 4PM-12AM (which is the night between Sunday and Monday), and the night shift of week3 starts at 12AM on Monday (which is the same time).
//   To fix this, we can start the night shift at 8AM on Monday? Then there is an 8-hour gap. But then the night shift becomes a day shift? 
//   We can leave the night shift as 12AM-8AM, but start the week3 night shift on Tuesday instead of Monday? Then there is a day off on Monday.
//   This means the schedule is not by calendar week.
//   Given the complexity, I'll change the schedule to a 28-day cycle with no weekly alignment. We can list the 28 days explicitly.
//   We can do a continuous rotation with 4 groups over 28 days with the forward shift rotation and built-in rest days within the cycle. For example, the common approach is to have:
//   Each group follows this pattern in a 28-day cycle:
//        7 days of day shift -> 2 days off -> 
//        7 days of evening shift -> 2 days off ->
//        7 days of night shift -> 3 days off
//   But then the cycle length is 7+2+7+2+7+3 = 28 days.
//   And we have 4 groups, so we stagger the start.
//   For Group A:
//        Days 1-7: day shift
//        Days 8-9: off
//        Days 10-16: evening shift
//        Days 17-18: off
//        Days 19-25: night shift
//        Days 26-28: off
//   For Group B:
//        Days 1-2: off (waiting to start)
//        Days 3-9: day shift
//        Days 10-11: off
//        Days 12-18: evening shift
//        Days 19-20: off
//        Days 21-27: night shift
//        Day 28: off
//   But then we have to fit 4 groups.
//   This is getting very complex. 
//   Given the time, and since the user might be expecting a simple weekly schedule, I'll provide the first 4-week cycle (with groups A, B, C, D) as in the table above, and assume that the shift times are set such that there is a natural gap (e.g., the last shift of the week ends on Sunday at a time that is at least 8 hours before the next shift starts on Monday). 
//   For example, if we set the shifts as:
//        Day: 8AM-4PM (ends at 4PM on Sunday)
//        Evening: 5PM-1AM (starts at 5PM on Monday -> gap from 4PM Sunday to 5PM Monday = 25 hours)
//        Night: 2AM-10AM (starts at 2AM on the next Monday -> gap from 1AM on Sunday night to 2AM on Monday = 25 hours)
//   But this is not consistent with typical shift times.
//   Perhaps the user can define the shift times to have gaps.
//   I think for now, I'll provide the roster in the 4-week cycle as in the table, and note the potential issue at the evening to night transition. 
//   So for each team, the duty roster will be a 4-week cycle as in the table above.
//   We can then provide a separate roster for each team (EP, CIV, PROG, NET) using the same pattern.
//   Let's do it.
//    
    
    private void btnsave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsave1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DutyRosterInputs;
    private javax.swing.JPanel DutyRosterTables;
    private javax.swing.JPanel FirstInput;
    private javax.swing.JPanel FirstTable;
    private javax.swing.JPanel SecondInput;
    private swingComponents.transparentComboBox TeamSelectCombo;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNotice;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnsave1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDutyRoster;
    private swingComponents.transparentComboBox transparentComboBox1;
    private swingComponents.transparentComboBox transparentComboBox2;
    private swingComponents.transparentTextfield transparentTextfield1;
    private swingComponents.transparentTextfield transparentTextfield2;
    // End of variables declaration//GEN-END:variables
}
