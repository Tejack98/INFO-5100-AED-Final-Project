/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.DonorBankInterface.donationHandler;

import healthcare.Enterprise.donorBank.DonorBankEnterprise;
import healthcare.Enterprise.donorBank.DonorBankOrganization;
import userinterface.Pharmacy.pharmacist.*;
import userinterface.LabInterface.labTech.*;
import healthcare.enterprise.Enterprise;
import healthcare.enterprise.healthCare.DoctorOrganization;
import healthcare.enterprise.healthCare.HealthCareEnterprise;
import healthcare.enterprise.pharmacy.PharmacyOrganization;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.userAccount.UserAccount;
import healthcare.workQueue.DoctorLabRequest;
import healthcare.workQueue.DonorBankRequest;
import healthcare.workQueue.WorkRequest;
import javax.swing.JOptionPane;

/**
 *
 * @author adity
 */
public class ProcessBloodRequest extends javax.swing.JPanel {

    /**
     * Creates new form CollectedMedicalHistory
     */
    
    DonorBankRequest request;
    UserAccount useraccount;
    Enterprise enterprise;
    Network network;
    String result = "";
    String solution = "";
    String type = "";
    
    public ProcessBloodRequest(DonorBankRequest request,UserAccount useraccount, Enterprise enterprise, Network network) {
        initComponents();
        this.request = request;
        this.useraccount = useraccount;
        this.enterprise = enterprise;
        this.network = network;
        txtPatientName.setText(request.getSender().getUserName());
        populateBloodRequest();
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
        btnSendResults = new javax.swing.JButton();
        txtPatientName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cboxBlood1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Blood Request Details");

        btnSendResults.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        btnSendResults.setText("Process And Send Results");
        btnSendResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendResultsActionPerformed(evt);
            }
        });

        txtPatientName.setBackground(new java.awt.Color(153, 204, 255));
        txtPatientName.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtPatientName.setEnabled(false);
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel12.setText("For User");

        cboxBlood1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        cboxBlood1.setEnabled(false);
        cboxBlood1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxBlood1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jLabel9.setText("Blood Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(cboxBlood1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSendResults, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(220, 220, 220)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(431, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboxBlood1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnSendResults)
                .addContainerGap(273, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jLabel12)
                    .addContainerGap(408, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendResultsActionPerformed
        // TODO add your handling code here:

      //  txtLabAssesmentsResults.setText(result);
        /*-----------------------*/
        int b = request.getHashcode();
        System.out.println("b" + b);
        //Dharati
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        Network inNetwork = null;
        
        for (Enterprise ent : network.getEnterpriseMasterList().getEnterpriseList()) {
            if (ent instanceof DonorBankEnterprise) {
                for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof DonorBankOrganization ){
                        for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()) {
                            if (work.getHashcode() == b) {
                                work.setStatus("Blood req done");
                            }
                        }
                    }
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Result Sent Successfully");
        
    }//GEN-LAST:event_btnSendResultsActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void cboxBlood1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxBlood1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxBlood1ActionPerformed

    
    public void populateBloodRequest() {
        
        cboxBlood1.setSelectedItem(request.getBloodType());
        
//       String medList = request.getMedlist();
//        
//        System.out.println("00000000000000000" + medList);
//        
//        if(medList.contains(String.valueOf("Disulfiram"))){
//            chkDis.setSelected(true);
//        }
//        if(medList.contains(String.valueOf("Campral"))){
//            chkCam.setSelected(true);
//        }
//        if(medList.contains(String.valueOf("Acamprosate"))){
//            chkAca.setSelected(true);
//        }
//        if(medList.contains(String.valueOf("Antabuse"))){
//            chkAnt.setSelected(true);
//        }
//        if(medList.contains(String.valueOf("Vivitrol"))){
//            chkViv.setSelected(true);
//        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendResults;
    private javax.swing.JComboBox<String> cboxBlood1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}
