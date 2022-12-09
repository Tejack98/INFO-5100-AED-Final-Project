/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HealthcareInterface.healthcareAdmin.doctor;

import healthcare.Ecosystem;
import healthcare.enterprise.healthCare.DoctorRole;
import healthcare.enterprise.healthCare.HealthCareAdminRole;
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
public class AdminViewDoctor extends javax.swing.JPanel {

    /**
     * Creates new form AdminViewDoctor
     */
    Ecosystem ecosystem;
    OrganizationDirectory orgList;
    public AdminViewDoctor(Ecosystem ecosystem, OrganizationDirectory orgList) {
        initComponents();
        this.ecosystem = ecosystem;
        this.orgList = orgList;
        populateOrganizationComboBox();
        populateData();  
    }
    
    private void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : orgList.getOrganizationList()){
            organizationJComboBox.addItem(organization);
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
        docTable = new javax.swing.JTable();
        lblSearchDoctorByID = new javax.swing.JLabel();
        txtSearchDoctorByID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblEnterprise = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        btnView = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Doctor Information");

        docTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Email", "Hospital Name", "Speciality", "Address", "City", "State", "Zipcode", "Phone No."
            }
        ));
        jScrollPane1.setViewportView(docTable);

        lblSearchDoctorByID.setText("Search Doctor By ID");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");

        lblEnterprise.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblEnterprise.setText("Organization");

        organizationJComboBox.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Doctor", "Nurse", "Patient" }));

        btnView.setText("Search");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnDelete)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSearchDoctorByID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEnterprise, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearchDoctorByID, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(organizationJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addComponent(btnView))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterprise)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchDoctorByID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearchDoctorByID)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        populateData();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewActionPerformed

    private void populateData(){
        Organization org = (Organization) organizationJComboBox.getSelectedItem();
        UserAccountDirectory userAccounts = org.getUserAccountDirectory();  
        ArrayList<UserAccount> userList = userAccounts.getUserAccountList();
        
        DefaultTableModel model = (DefaultTableModel) docTable.getModel();
        model.setRowCount(0);
        
        for(UserAccount ua: userList){
            
            if(ua.getRole().toString().equals(Role.RoleType.Doctor.toString())){
                
                DoctorRole role = (DoctorRole) ua.getRole();
                model.addRow(new Object[]
                {ua.getPerson().getPersonName(),ua.getUserEmail(),role.getHospitalName(), role.getSpeciality(), ua.getPerson().getAddress(), ua.getPerson().getCity(), ua.getPerson().getState(), String.valueOf(ua.getPerson().getZipcode()), String.valueOf(ua.getPerson().getContactNumber())});
            }
            
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JTable docTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblSearchDoctorByID;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTextField txtSearchDoctorByID;
    // End of variables declaration//GEN-END:variables
}