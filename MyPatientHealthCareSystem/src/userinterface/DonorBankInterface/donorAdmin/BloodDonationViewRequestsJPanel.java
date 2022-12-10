/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DonorBankInterface.donorAdmin;


import userinterface.LabInterface.labTech.*;
import healthcare.Ecosystem;
import healthcare.Enterprise.donorBank.DonorBankOrganization;
import healthcare.enterprise.Enterprise;
import healthcare.enterprise.lab.LabOrganization;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.userAccount.UserAccount;
import healthcare.workQueue.DoctorLabRequest;
import healthcare.workQueue.DonorBankRequest;
import healthcare.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tejas
 */
public class BloodDonationViewRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    
    UserAccount userAccount;
    DonorBankOrganization donorOrganization;
    Enterprise enterprise;
    Ecosystem ecosystem;
    Network network;

    public BloodDonationViewRequestsJPanel(Ecosystem ecosystem, UserAccount account,
            Organization organization, Enterprise enterprise, Network network) {
        initComponents();
        this.userAccount = account;
        this.ecosystem = ecosystem;
        this.donorOrganization = (DonorBankOrganization) organization;
        this.enterprise = enterprise;
        this.network = network;
        lblname.setText(userAccount.getPerson().getPersonName());
        populatebloodRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        actionPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bloodRequestJTable = new javax.swing.JTable();
        optionsPanel = new javax.swing.JPanel();
        refreshJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(36, 47, 65));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Blood Requests Received");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        lblname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblname.setText("Admin Name");

        bloodRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Request Intended By", "Blood Type", "Request Received By", "Status", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(bloodRequestJTable);

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addComponent(lblname)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 457, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(actionPanel);

        optionsPanel.setBackground(new java.awt.Color(71, 120, 197));

        refreshJButton.setBackground(new java.awt.Color(49, 84, 140));
        refreshJButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshJButton.setText("Refresh");
        refreshJButton.setBorder(null);
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        processJButton.setBackground(new java.awt.Color(49, 84, 140));
        processJButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        processJButton.setForeground(new java.awt.Color(255, 255, 255));
        processJButton.setText("Process Requests");
        processJButton.setBorder(null);
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        assignJButton.setBackground(new java.awt.Color(49, 84, 140));
        assignJButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(255, 255, 255));
        assignJButton.setText("Assign to me");
        assignJButton.setBorder(null);
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsPanelLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        optionsPanelLayout.setVerticalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(565, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(optionsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed

        populatebloodRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = bloodRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a blood request first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DonorBankRequest request = (DonorBankRequest) bloodRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Processing Req");

        ProcessBloodRequest processWorkRequestJPanel = new ProcessBloodRequest( request, userAccount, enterprise, network);
        jSplitPane1.setRightComponent(processWorkRequestJPanel);
    }//GEN-LAST:event_processJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = bloodRequestJTable.getSelectedRow();
        String status;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Blood Request first", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }
        status = (String) bloodRequestJTable.getValueAt(selectedRow, 4);

        if (status.equals("Blood Requested")) {
            WorkRequest request = (WorkRequest) bloodRequestJTable.getValueAt(selectedRow, 0);
            request.setReceiver(userAccount);
            request.setStatus("Assigned To Donor Bank");
            populatebloodRequestTable();
        } else if (status.equals("Assigned To Donor Bank")) {
            JOptionPane.showMessageDialog(null, "Already In Progress", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Your Request Cant be processed", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_assignJButtonActionPerformed
    
    public void populatebloodRequestTable() {
        DefaultTableModel model = (DefaultTableModel) bloodRequestJTable.getModel();

        model.setRowCount(0);
        System.out.println("_________________________________________________");
        System.out.println(donorOrganization.getWorkQueue().getWorkRequestList());

        for (WorkRequest request : donorOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSender().getPerson().getPersonName();          
            DonorBankRequest dr = (DonorBankRequest) request;
            row[2] = dr.getBloodType();
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getPersonName();
            row[4] = request.getStatus();
            row[5] = request.getRequestDate();

            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JButton assignJButton;
    private javax.swing.JTable bloodRequestJTable;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblname;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables
}
