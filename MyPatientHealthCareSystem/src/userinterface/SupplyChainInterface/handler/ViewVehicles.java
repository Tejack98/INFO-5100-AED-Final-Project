/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplyChainInterface.handler;


import userinterface.Pharmacy.pharmacist.*;
import userinterface.LabInterface.labTech.*;
import healthcare.Ecosystem;
import healthcare.enterprise.Enterprise;
import healthcare.enterprise.lab.LabOrganization;
import healthcare.enterprise.pharmacy.PharmacyOrganization;
import healthcare.enterprise.supplyChain.SupplierOrganization;
import healthcare.enterprise.supplyChain.Vehicle;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.userAccount.UserAccount;
import healthcare.workQueue.DoctorLabRequest;
import healthcare.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tejas
 */
public class ViewVehicles extends javax.swing.JPanel {

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    
    UserAccount userAccount;
    SupplierOrganization suppOrganization;
    Enterprise enterprise;
    Ecosystem ecosystem;
    Network network;

    public ViewVehicles(Ecosystem ecosystem, UserAccount account,
            Organization organization, Enterprise enterprise, Network network) {
        initComponents();
        this.userAccount = account;
        this.ecosystem = ecosystem;
        this.suppOrganization = (SupplierOrganization) organization;
        this.enterprise = enterprise;
        this.network = network;
        lblname.setText(userAccount.getPerson().getPersonName());
        populateVehiclesTable();
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
        supplierChainVehicleJTable = new javax.swing.JTable();
        optionsPanel = new javax.swing.JPanel();
        refreshJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        assignJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        actionPanel.setBackground(new java.awt.Color(255, 204, 204));

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel6.setText("Book Vehicles");

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

        lblname.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblname.setText("Lab Assitant Name");

        supplierChainVehicleJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Type", "Description", "Number", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(supplierChainVehicleJTable);

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
                .addGap(0, 452, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(actionPanel);

        optionsPanel.setBackground(new java.awt.Color(153, 204, 255));

        refreshJButton.setBackground(new java.awt.Color(255, 204, 204));
        refreshJButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.setBorder(null);
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        assignJButton.setBackground(new java.awt.Color(255, 204, 204));
        assignJButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.setBorder(null);
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        assignJButton1.setBackground(new java.awt.Color(255, 204, 204));
        assignJButton1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        assignJButton1.setText("Deallocate");
        assignJButton1.setBorder(null);
        assignJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsPanelLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(assignJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        optionsPanelLayout.setVerticalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(assignJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(572, Short.MAX_VALUE))
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

        populateVehiclesTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = supplierChainVehicleJTable.getSelectedRow();
        String status;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a vehicle first", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }
        status = (String) supplierChainVehicleJTable.getValueAt(selectedRow, 4);

        if (status.equals("Available")) {
            
            Vehicle v = (Vehicle) supplierChainVehicleJTable.getValueAt(selectedRow, 0);
            v.setVehicleStatus("Booked");
            populateVehiclesTable();
        } else if (status.equals("Booked")) {
            JOptionPane.showMessageDialog(null, "Already Booked", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Your Request Cant be processed", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void assignJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = supplierChainVehicleJTable.getSelectedRow();
        String status;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a vehicle first", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }
        status = (String) supplierChainVehicleJTable.getValueAt(selectedRow, 4);

        if (status.equals("Booked")) {
            
            Vehicle v = (Vehicle) supplierChainVehicleJTable.getValueAt(selectedRow, 0);
            v.setVehicleStatus("Available");
            populateVehiclesTable();
        } else if (status.equals("Available")) {
            JOptionPane.showMessageDialog(null, "Already Available", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Your Request Cant be processed", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_assignJButton1ActionPerformed
    
    public void populateVehiclesTable() {
        DefaultTableModel model = (DefaultTableModel) supplierChainVehicleJTable.getModel();

        model.setRowCount(0);
        for (Vehicle v : suppOrganization.getVehicleList()) {
            Object[] row = new Object[6];
            row[0] = v;
            row[1] = v.getVehicleType();
            row[2] = v.getVehicleDescription();
            row[3] = v.getVehicleNumber();
            row[4] = v.getVehicleStatus();

            model.addRow(row);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton assignJButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblname;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable supplierChainVehicleJTable;
    // End of variables declaration//GEN-END:variables
}
