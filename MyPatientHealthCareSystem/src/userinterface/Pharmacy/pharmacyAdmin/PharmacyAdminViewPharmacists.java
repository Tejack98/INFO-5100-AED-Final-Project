/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Pharmacy.pharmacyAdmin;

import userinterface.LabInterface.labAdmin.*;
import userinterface.HealthcareInterface.healthcareAdmin.doctor.*;
import healthcare.Ecosystem;
import healthcare.enterprise.healthCare.DoctorOrganization;
import healthcare.enterprise.healthCare.DoctorRole;
import healthcare.enterprise.healthCare.HealthCareAdminRole;
import healthcare.enterprise.lab.LabAssistantRole;
import healthcare.enterprise.lab.LabOrganization;
import healthcare.enterprise.pharmacy.PharmacistRole;
import healthcare.enterprise.pharmacy.PharmacyOrganization;
import healthcare.organization.Organization;
import healthcare.organization.OrganizationDirectory;
import healthcare.role.Role;
import healthcare.userAccount.UserAccount;
import healthcare.userAccount.UserAccountDirectory;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adity
 */
public class PharmacyAdminViewPharmacists extends javax.swing.JPanel {

    /**
     * Creates new form AdminViewDoctor
     */
    Ecosystem ecosystem;
    OrganizationDirectory orgList;
    public PharmacyAdminViewPharmacists(Ecosystem ecosystem, OrganizationDirectory orgList) {
        initComponents();
        this.ecosystem = ecosystem;
        this.orgList = orgList;
        populateOrganizationComboBox();
        populateData();  
    }
    
    private void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : orgList.getOrganizationList()) {
            if (organization instanceof PharmacyOrganization) {
                organizationJComboBox.addItem(organization);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pharTable = new javax.swing.JTable();
        lblSearchDoctorByID = new javax.swing.JLabel();
        txtSearchTechByname = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblEnterprise = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        btnView = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Pharmacist Information");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1200, 37));

        pharTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Email", "Address", "City", "State", "Zipcode", "Phone No.", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pharTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 1010, 220));

        lblSearchDoctorByID.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblSearchDoctorByID.setText("Search Technician By Name");
        add(lblSearchDoctorByID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));
        add(txtSearchTechByname, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 224, -1));

        btnSearch.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, -1));

        lblEnterprise.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblEnterprise.setText("Organization");
        add(lblEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        organizationJComboBox.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Doctor", "Nurse", "Patient" }));
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 224, -1));

        btnView.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnView.setText("Search");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/View Doctors.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        populateDataByPharName();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        populateData();
    }//GEN-LAST:event_btnViewActionPerformed

    private void populateData(){
        Organization org = (Organization) organizationJComboBox.getSelectedItem();
        UserAccountDirectory userAccounts = org.getUserAccountDirectory();  
        ArrayList<UserAccount> userList = userAccounts.getUserAccountList();
        
        DefaultTableModel model = (DefaultTableModel) pharTable.getModel();
        model.setRowCount(0);
        
        for(UserAccount ua: userList){
            
            if(ua.getRole().toString().equals(Role.RoleType.Pharmacist.toString())){
                
                PharmacistRole role = (PharmacistRole) ua.getRole();
                model.addRow(new Object[]
                {ua.getPerson().getPersonName(),ua.getUserEmail(), ua.getPerson().getAddress(), ua.getPerson().getCity(), ua.getPerson().getState(), String.valueOf(ua.getPerson().getZipcode()), String.valueOf(ua.getPerson().getContactNumber()),ua.getUserName()});
            }
            
        }
        
    }
    
    
    private void populateDataByPharName(){
        Organization org = (Organization) organizationJComboBox.getSelectedItem();
        String docName = txtSearchTechByname.getText().toLowerCase();
        
        UserAccountDirectory userAccounts = org.getUserAccountDirectory();  
        ArrayList<UserAccount> userList = userAccounts.getUserAccountList();
        
        DefaultTableModel model = (DefaultTableModel) pharTable.getModel();
        model.setRowCount(0);

        for (UserAccount ua : userList) {

            if (ua.getRole().toString().equals(Role.RoleType.Pharmacist.toString())) {

                if (ua.getPerson().getPersonName().toLowerCase().contains(docName)) {
                    PharmacistRole role = (PharmacistRole) ua.getRole();
                    model.addRow(new Object[]{ua.getPerson().getPersonName(), ua.getUserEmail(),ua.getPerson().getAddress(), ua.getPerson().getCity(), ua.getPerson().getState(), String.valueOf(ua.getPerson().getZipcode()), String.valueOf(ua.getPerson().getContactNumber()),ua.getUserName()});
                }
            }

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblSearchDoctorByID;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable pharTable;
    private javax.swing.JTextField txtSearchTechByname;
    // End of variables declaration//GEN-END:variables
}
