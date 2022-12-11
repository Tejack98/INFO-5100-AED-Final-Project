/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HealthcareInterface.nurse;

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
import healthcare.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shriyapandita
 */
public class NurseRequestVaccinesPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestPharmacistForMedicinePanel
     */
    private NurseOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    JPanel userProcessContainer;
    String vaccinelist="";
    
    public NurseRequestVaccinesPanel( Network network, UserAccount userAccount,Enterprise enterprise) {
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
        jButton2 = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        requestbtn = new javax.swing.JButton();
        chkCov = new javax.swing.JCheckBox();
        chkVar = new javax.swing.JCheckBox();
        chkMMR = new javax.swing.JCheckBox();
        chkPolio = new javax.swing.JCheckBox();
        chkTdap = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtMsg = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel6.setText("Request Vaccines");

        jButton2.setBackground(new java.awt.Color(71, 120, 197));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setText("By User");

        requestbtn.setBackground(new java.awt.Color(153, 204, 255));
        requestbtn.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        requestbtn.setText("Request Vaccines");
        requestbtn.setBorder(null);
        requestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestbtnActionPerformed(evt);
            }
        });

        chkCov.setBackground(new java.awt.Color(255, 204, 204));
        chkCov.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        chkCov.setText("Covishield");
        chkCov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCovActionPerformed(evt);
            }
        });

        chkVar.setBackground(new java.awt.Color(255, 204, 204));
        chkVar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        chkVar.setText("Varicella");
        chkVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVarActionPerformed(evt);
            }
        });

        chkMMR.setBackground(new java.awt.Color(255, 204, 204));
        chkMMR.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        chkMMR.setText("MMR");
        chkMMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMMRActionPerformed(evt);
            }
        });

        chkPolio.setBackground(new java.awt.Color(255, 204, 204));
        chkPolio.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        chkPolio.setText("Polio");
        chkPolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPolioActionPerformed(evt);
            }
        });

        chkTdap.setBackground(new java.awt.Color(255, 204, 204));
        chkTdap.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        chkTdap.setText("T-Dap ");
        chkTdap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTdapActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel2.setText("Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(requestbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkMMR)
                                    .addComponent(chkPolio)
                                    .addComponent(chkTdap)
                                    .addComponent(chkCov)
                                    .addComponent(chkVar)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 222, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkTdap)
                .addGap(30, 30, 30)
                .addComponent(chkPolio)
                .addGap(32, 32, 32)
                .addComponent(chkMMR)
                .addGap(27, 27, 27)
                .addComponent(chkVar)
                .addGap(29, 29, 29)
                .addComponent(chkCov)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(requestbtn)
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        userProcessContainer.remove(this);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void requestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestbtnActionPerformed
        // TODO add your handling code here:
        
        WorkRequest wr = new WorkRequest();
        wr.setSender(userAccount);
        
       // patientrequest.setReceiver();
        if (chkTdap.isSelected())
        {
            vaccinelist = vaccinelist + " T-Dap ,";
        
        }
        if (chkPolio.isSelected())
        {
            vaccinelist = vaccinelist + "Polio ,";
        
        }
       
        if(chkMMR.isSelected())
        {
            vaccinelist = vaccinelist + "MMR ,";
        }
        if(chkVar.isSelected())
        {
            vaccinelist = vaccinelist + "Varicella ,";
        }
        if(chkCov.isSelected())
        {
            vaccinelist = vaccinelist + "Covishield ,";
        }
      
        System.out.println(vaccinelist);
        wr.setVaccinesList(vaccinelist);
        wr.setMessage(vaccinelist);
        wr.setStatus("Vaccines Requested");
        wr.setDiagnose("Following Vaccines have been requested : \n " + vaccinelist);

        Organization org = null;
        for (Enterprise enterprise : network.getEnterpriseMasterList().getEnterpriseList()) {
            if (enterprise instanceof VaccinationEnterprise) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof VaccinationOrganization) {
                        org = organization;
                        break;
                    }
                }
            }                
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(wr);
                wr.setReceiver(null);
                userAccount.getWorkQueue().getWorkRequestList().add(wr);
            }
        }
        JOptionPane.showMessageDialog(null, "Vaccines request sent to vaccine Organization successfully.");

    }//GEN-LAST:event_requestbtnActionPerformed

    private void chkCovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCovActionPerformed

    private void chkVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkVarActionPerformed

    private void chkPolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPolioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPolioActionPerformed

    private void chkTdapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTdapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTdapActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void chkMMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMMRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMMRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkCov;
    private javax.swing.JCheckBox chkMMR;
    private javax.swing.JCheckBox chkPolio;
    private javax.swing.JCheckBox chkTdap;
    private javax.swing.JCheckBox chkVar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton requestbtn;
    private javax.swing.JTextField txtMsg;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
