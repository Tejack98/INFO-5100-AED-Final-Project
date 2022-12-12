/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HealthcareInterface.nurse;

import healthcare.Enterprise.donorBank.DonorBankEnterprise;
import healthcare.Enterprise.donorBank.DonorBankOrganization;
import userinterface.HealthcareInterface.doctor.*;
import healthcare.enterprise.Enterprise;
import healthcare.enterprise.healthCare.DoctorOrganization;
import healthcare.enterprise.healthCare.NurseOrganization;
import healthcare.enterprise.pharmacy.PharmacyEnterprise;
import healthcare.enterprise.pharmacy.PharmacyOrganization;
import healthcare.enterprise.vaccination.VaccinationEnterprise;
import healthcare.enterprise.vaccination.VaccinationOrganization;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.userAccount.UserAccount;
import healthcare.workQueue.DonorBankRequest;
import healthcare.workQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shriyapandita
 */
public class NurseRequestOrganPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestPharmacistForMedicinePanel
     */
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    private NurseOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    JPanel userProcessContainer;
    
    public NurseRequestOrganPanel( Network network, UserAccount userAccount,Enterprise enterprise) {
        initComponents();
        this.userAccount = userAccount;
        this.organization = (NurseOrganization) organization;
        this.enterprise = enterprise;
        this.network = network;
        txtUserName.setText(userAccount.getUserName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        requestbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMsg = new javax.swing.JTextField();
        cboxBlood1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOrg = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel6.setText("Request Organ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtUserName.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtUserName.setEnabled(false);
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setText("By User");

        requestbtn.setBackground(new java.awt.Color(153, 204, 255));
        requestbtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        requestbtn.setText("Request Organ");
        requestbtn.setBorder(null);
        requestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel2.setText("Message");

        cboxBlood1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        cboxBlood1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxBlood1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel9.setText("Blood Type");

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel3.setText("Organ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(txtOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboxBlood1, 0, 223, Short.MAX_VALUE)
                            .addComponent(txtUserName)))
                    .addComponent(requestbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxBlood1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(requestbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestbtnActionPerformed
        // TODO add your handling code here:
        try {
            if (EmpytyFieldValidation()) {

                if (RegexValidation()) {
        DonorBankRequest request = new DonorBankRequest();
        request.setSender(userAccount);
        request.setBloodType(cboxBlood1.getSelectedItem().toString());
        request.setOrgan(txtOrg.getText());
        request.setMessage(txtMsg.getText());
        request.setReqType("organ");
        request.setStatus("Organ Requested");

        Organization org = null;
        for (Enterprise enterprise : network.getEnterpriseMasterList().getEnterpriseList()) {
            if (enterprise instanceof DonorBankEnterprise) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof DonorBankOrganization) {
                        org = organization;
                        break;
                    }
                }
            }                  
        }
        if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(request);
                request.setReceiver(null);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
        JOptionPane.showMessageDialog(null, "Organ request sent to Donor bank Organization successfully.");
                }}}
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Doctor not registered, Try again");
            System.out.println(e.toString());
            emptyValidationStatus = true;
        }
    }//GEN-LAST:event_requestbtnActionPerformed

    private boolean RegexValidation()
    {
        if(!txtOrg.getText().matches("^[a-zA-Z ]+$"))
        {
            txtOrg.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtOrg.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(txtOrg.getText().matches("^[a-zA-Z ]+$"))
        {
            txtOrg.setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
            validationCheck=true;
        }
        
        
        return validationCheck;
    }
    
    private boolean EmpytyFieldValidation()
    {
        if(txtOrg.getText().equals(null) || txtOrg.getText().trim().isEmpty() )
        {
            txtOrg.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtOrg.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtOrg.getText().equals(null) && !txtOrg.getText().trim().isEmpty() )
        {
            txtOrg.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
            emptyValidationStatus= true;
        }
        return emptyValidationStatus;
    }
    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void cboxBlood1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxBlood1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxBlood1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboxBlood1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton requestbtn;
    private javax.swing.JTextField txtMsg;
    private javax.swing.JTextField txtOrg;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
