/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface;

import healthcare.Ecosystem;
import healthcare.db4oUtil.Db4oUtil;
import healthcare.enterprise.Enterprise;
import healthcare.enterprise.EnterpriseMasterDirectory;
import healthcare.enterprise.vaccination.VaccinationAdminRole;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.role.Role;
import healthcare.userAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Administration.AdministratorWorkArea;
import userinterface.DonorBankInterface.donationHandler.DonationHandlerWorkArea;
import userinterface.DonorBankInterface.donor.DonorWorkArea;
import userinterface.DonorBankInterface.donorAdmin.DonorAdminWorkArea;
//import userinterface.DonorBankInterface.Logindetails.AdminLogin.DonorAdminWorkArea;
import userinterface.EmergencyUnit.ambulanceHandler.AmbulanceHandlerWorkArea;
import userinterface.EmergencyUnit.emergencyAdmin.EmergencyUnitAdminWorkArea;
import userinterface.Pharmacy.pharmacist.PharmacistWorkArea;
import userinterface.Pharmacy.pharmacyAdmin.PharmacyAdminWorkArea;
import userinterface.HealthcareInterface.doctor.DoctorWorkArea;
import userinterface.HealthcareInterface.healthcareAdmin.HealthCareAdminWorkArea;
import userinterface.HealthcareInterface.healthcareAdmin.doctor.HealthCareAdminDoctorPanel;
import userinterface.HealthcareInterface.nurse.NurseWorkArea;
import userinterface.HealthcareInterface.patient.PatientWorkArea;
import userinterface.LabInterface.labAdmin.LabAdminWorkArea;
import userinterface.LabInterface.labTech.LabTechnicianWorkArea;
import userinterface.SupplyChainInterface.handler.HandlerWorkArea;
import userinterface.SupplyChainInterface.supplyManger.SupplyManagerWorkArea;
import userinterface.Vaccination.vaccinationAdmin.VaccinationAdminWorkArea;
import userinterface.Vaccination.vaccinator.VaccinatorWorkArea;

/**
 *
 * @author Tejas
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private Ecosystem ecosystem;
    private Db4oUtil db4oUtil = Db4oUtil.getDb4oInstance();
    
    public MainJFrame() {
        initComponents();
        ecosystem = db4oUtil.retrieveDb4oSystem();
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
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Hospital Management System");

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUsername.setText("Username  :");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPassword.setText("Password  :");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin))
                .addContainerGap(202, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        // Get user name
        String userName = txtUsername.getText();
        // Get Password
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount = ecosystem.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        Network inNetwork = null;

        if (userAccount == null) {
            for (Network network : ecosystem.getNetworkList()) {
                inNetwork = network;
                for (Enterprise enterprise : network.getEnterpriseMasterList().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }
                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        } else {
            Role role = userAccount.getRole();
            System.out.println(Role.RoleType.Administrator.toString());
            System.out.println(userAccount.getRole().toString());
            JFrame frame = role.createWorkArea(userAccount, inOrganization, inEnterprise, ecosystem, inNetwork);

// ======================== HealthCare================================================================          
            if (Role.RoleType.HealthCareAdmin.toString().equals(userAccount.getRole().toString())) {
                HealthCareAdminWorkArea healthcareFrame = (HealthCareAdminWorkArea) frame;
                healthcareFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                healthcareFrame.setVisible(true);
            }

            if (Role.RoleType.Doctor.toString().equals(userAccount.getRole().toString())) {
                DoctorWorkArea docFrame = (DoctorWorkArea) frame;
                docFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                docFrame.setVisible(true);
            }

            if (Role.RoleType.Nurse.toString().equals(userAccount.getRole().toString())) {
                NurseWorkArea nurseFrame = (NurseWorkArea) frame;
                nurseFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                nurseFrame.setVisible(true);
            }

            if (Role.RoleType.Patient.toString().equals(userAccount.getRole().toString())) {
                PatientWorkArea patientFrame = (PatientWorkArea) frame;
                patientFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                patientFrame.setVisible(true);
            }

// ===============================================================================================
// ============================DonorBank==========================================================
            if (Role.RoleType.DonorAdmin.toString().equals(userAccount.getRole().toString())) {
                DonorAdminWorkArea donorAdmin = (DonorAdminWorkArea) frame;
                donorAdmin.setExtendedState(JFrame.MAXIMIZED_BOTH);
                donorAdmin.setVisible(true);
            }

            if (Role.RoleType.Donor.toString().equals(userAccount.getRole().toString())) {
                DonorWorkArea donor = (DonorWorkArea) frame;
                donor.setExtendedState(JFrame.MAXIMIZED_BOTH);
                donor.setVisible(true);
            }
            System.out.println("------------------------------+++++-------------");
            System.out.println(userAccount.getRole().toString());
            
            if (Role.RoleType.DonationHandler.toString().equals(userAccount.getRole().toString())) {
                DonationHandlerWorkArea donationHandlerFrame = (DonationHandlerWorkArea) frame;
                donationHandlerFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                donationHandlerFrame.setVisible(true);
            }

// ===============================================================================================
// ============================Emergency unit======================================================
            if (Role.RoleType.EmergencyUnitAdmin.toString().equals(userAccount.getRole().toString())) {
                EmergencyUnitAdminWorkArea emergencyAdminFrame =  (EmergencyUnitAdminWorkArea) frame;
                emergencyAdminFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                emergencyAdminFrame.setVisible(true);
            }

            if (Role.RoleType.AmbulanceHandler.toString().equals(userAccount.getRole().toString())) {
                AmbulanceHandlerWorkArea ambHanlerFrame = (AmbulanceHandlerWorkArea) frame;
                ambHanlerFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                ambHanlerFrame.setVisible(true);
            }

// ===============================================================================================
// ============================lab unit=======================================================  
            if (Role.RoleType.LabAdmin.toString().equals(userAccount.getRole().toString())) {
                LabAdminWorkArea labAdminFrame = (LabAdminWorkArea) frame;
                labAdminFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                labAdminFrame.setVisible(true);
            }

            if (Role.RoleType.LabAssistant.toString().equals(userAccount.getRole().toString())) {
                LabTechnicianWorkArea labTechFrame = (LabTechnicianWorkArea) frame;
                labTechFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                labTechFrame.setVisible(true);
            }

// ===============================================================================================
// ============================Pharmacy===========================================================  
            if (Role.RoleType.PharmacyAdmin.toString().equals(userAccount.getRole().toString())) {
                PharmacyAdminWorkArea pharAdminFrame = (PharmacyAdminWorkArea) frame;
                pharAdminFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                pharAdminFrame.setVisible(true);
            }

            if (Role.RoleType.Pharmacist.toString().equals(userAccount.getRole().toString())) {
                PharmacistWorkArea pharFrame = (PharmacistWorkArea) frame;
                pharFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                pharFrame.setVisible(true);
            }

// ===============================================================================================
// ============================SupplyChain===========================================================  
            if (Role.RoleType.Handler.toString().equals(userAccount.getRole().toString())) {
                HandlerWorkArea hanFrame = (HandlerWorkArea) frame;
                hanFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                hanFrame.setVisible(true);
            }

            if (Role.RoleType.SupplyManager.toString().equals(userAccount.getRole().toString())) {
                SupplyManagerWorkArea supplierFrame = (SupplyManagerWorkArea) frame;
                supplierFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                supplierFrame.setVisible(true);

            }
            
// ===============================================================================================
// ============================Vaccination===========================================================  
            if (Role.RoleType.Vaccinator.toString().equals(userAccount.getRole().toString())) {
                VaccinatorWorkArea vaccFrame = (VaccinatorWorkArea) frame;
                vaccFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                vaccFrame.setVisible(true);
            }

            if (Role.RoleType.VaccinationAdmin.toString().equals(userAccount.getRole().toString())) {
                VaccinationAdminWorkArea vaccAdminFrame = (VaccinationAdminWorkArea) frame;
                vaccAdminFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                vaccAdminFrame.setVisible(true);

            }
            
// ===============================================================================================
// ============================AdminMaster===========================================================  
            if (Role.RoleType.Administrator.toString().equals(userAccount.getRole().toString())) {
                AdministratorWorkArea adminWA = (AdministratorWorkArea) frame;
                adminWA.setExtendedState(JFrame.MAXIMIZED_BOTH);
                adminWA.setVisible(true);
            }

        }

    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainJFrame frame = new MainJFrame();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
