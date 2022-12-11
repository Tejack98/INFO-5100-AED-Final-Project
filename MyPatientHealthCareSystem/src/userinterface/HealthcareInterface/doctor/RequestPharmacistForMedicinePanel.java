/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HealthcareInterface.doctor;

import healthcare.enterprise.Enterprise;
import healthcare.enterprise.healthCare.DoctorOrganization;
import healthcare.enterprise.pharmacy.PharmacyEnterprise;
import healthcare.enterprise.pharmacy.PharmacyOrganization;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.userAccount.UserAccount;
import healthcare.workQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;

/**
 *
 * @author shriyapandita
 */
public class RequestPharmacistForMedicinePanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestPharmacistForMedicinePanel
     */
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    JPanel userProcessContainer;
    WorkRequest patientrequest;
    String medlist="";
    
    public RequestPharmacistForMedicinePanel(WorkRequest request, Network network, UserAccount userAccount,Enterprise enterprise) {
        initComponents();
        this.userAccount = userAccount;
        this.organization = (DoctorOrganization) organization;
        this.enterprise = enterprise;
        this.network = network;
        this.patientrequest = request;
        txtPatientName.setText(patientrequest.getSender().getUserName());
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
        txtPatientName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        requestbtn = new javax.swing.JButton();
        chkO2 = new javax.swing.JCheckBox();
        chkSin = new javax.swing.JCheckBox();
        chkViv = new javax.swing.JCheckBox();
        chkAnt = new javax.swing.JCheckBox();
        chkCam = new javax.swing.JCheckBox();
        chkDis = new javax.swing.JCheckBox();
        chkAca = new javax.swing.JCheckBox();
        chkCrocin = new javax.swing.JCheckBox();
        chkMef = new javax.swing.JCheckBox();
        chkSpasm = new javax.swing.JCheckBox();
        chkAld = new javax.swing.JCheckBox();
        chkMet = new javax.swing.JCheckBox();
        chkLosa = new javax.swing.JCheckBox();
        chkAlbu = new javax.swing.JCheckBox();
        chkHydro = new javax.swing.JCheckBox();
        chkAntihis = new javax.swing.JCheckBox();
        chkDolo = new javax.swing.JCheckBox();
        chkOme = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 204, 204));

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel6.setText("Prescription");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        txtPatientName.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtPatientName.setEnabled(false);
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setText("For Patient");

        requestbtn.setBackground(new java.awt.Color(153, 204, 255));
        requestbtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        requestbtn.setText("Request Pharmacist");
        requestbtn.setBorder(null);
        requestbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestbtnActionPerformed(evt);
            }
        });

        chkO2.setBackground(new java.awt.Color(255, 204, 204));
        chkO2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkO2.setText("O2");

        chkSin.setBackground(new java.awt.Color(255, 204, 204));
        chkSin.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkSin.setText("Sinarest");
        chkSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSinActionPerformed(evt);
            }
        });

        chkViv.setBackground(new java.awt.Color(255, 204, 204));
        chkViv.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkViv.setText(" Vivitrol");
        chkViv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVivActionPerformed(evt);
            }
        });

        chkAnt.setBackground(new java.awt.Color(255, 204, 204));
        chkAnt.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkAnt.setText("Antabuse");
        chkAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAntActionPerformed(evt);
            }
        });

        chkCam.setBackground(new java.awt.Color(255, 204, 204));
        chkCam.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkCam.setText("Campral");

        chkDis.setBackground(new java.awt.Color(255, 204, 204));
        chkDis.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkDis.setText("Disulfiram");
        chkDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDisActionPerformed(evt);
            }
        });

        chkAca.setBackground(new java.awt.Color(255, 204, 204));
        chkAca.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkAca.setText("Acamprosate");
        chkAca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAcaActionPerformed(evt);
            }
        });

        chkCrocin.setBackground(new java.awt.Color(255, 204, 204));
        chkCrocin.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkCrocin.setText("Crocin");
        chkCrocin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCrocinActionPerformed(evt);
            }
        });

        chkMef.setBackground(new java.awt.Color(255, 204, 204));
        chkMef.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkMef.setText("Meftal");
        chkMef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMefActionPerformed(evt);
            }
        });

        chkSpasm.setBackground(new java.awt.Color(255, 204, 204));
        chkSpasm.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkSpasm.setText("Spasm");
        chkSpasm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSpasmActionPerformed(evt);
            }
        });

        chkAld.setBackground(new java.awt.Color(255, 204, 204));
        chkAld.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkAld.setText("Aldrid");
        chkAld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAldActionPerformed(evt);
            }
        });

        chkMet.setBackground(new java.awt.Color(255, 204, 204));
        chkMet.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkMet.setText("Metformin");
        chkMet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMetActionPerformed(evt);
            }
        });

        chkLosa.setBackground(new java.awt.Color(255, 204, 204));
        chkLosa.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkLosa.setText("Losartan");
        chkLosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLosaActionPerformed(evt);
            }
        });

        chkAlbu.setBackground(new java.awt.Color(255, 204, 204));
        chkAlbu.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkAlbu.setText("Albuterol");
        chkAlbu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAlbuActionPerformed(evt);
            }
        });

        chkHydro.setBackground(new java.awt.Color(255, 204, 204));
        chkHydro.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkHydro.setText("Hydrocodone");
        chkHydro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHydroActionPerformed(evt);
            }
        });

        chkAntihis.setBackground(new java.awt.Color(255, 204, 204));
        chkAntihis.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkAntihis.setText("Antihistamines");
        chkAntihis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAntihisActionPerformed(evt);
            }
        });

        chkDolo.setBackground(new java.awt.Color(255, 204, 204));
        chkDolo.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkDolo.setText("Dolo");
        chkDolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDoloActionPerformed(evt);
            }
        });

        chkOme.setBackground(new java.awt.Color(255, 204, 204));
        chkOme.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        chkOme.setText("Omeprazole");
        chkOme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(requestbtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkAca)
                            .addComponent(chkDis)
                            .addComponent(chkCam)
                            .addComponent(chkAnt)
                            .addComponent(chkViv)
                            .addComponent(chkMef))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkHydro)
                            .addComponent(chkDolo)
                            .addComponent(chkO2)
                            .addComponent(chkSin)
                            .addComponent(chkCrocin)
                            .addComponent(chkSpasm))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkOme)
                            .addComponent(chkAlbu)
                            .addComponent(chkLosa)
                            .addComponent(chkMet)
                            .addComponent(chkAld)
                            .addComponent(chkAntihis)))
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAca)
                    .addComponent(chkHydro)
                    .addComponent(chkAld))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDis)
                    .addComponent(chkDolo)
                    .addComponent(chkMet))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCam)
                    .addComponent(chkO2)
                    .addComponent(chkLosa))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkAnt)
                    .addComponent(chkSin)
                    .addComponent(chkAlbu))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkViv)
                    .addComponent(chkCrocin)
                    .addComponent(chkAntihis))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkMef)
                    .addComponent(chkSpasm)
                    .addComponent(chkOme))
                .addGap(40, 40, 40)
                .addComponent(requestbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestbtnActionPerformed
        // TODO add your handling code here:
        try {
            if (EmpytyFieldValidation()) {

                if (RegexValidation()) {
                patientrequest.setSender(userAccount);
       // patientrequest.setReceiver();
        if (chkAca.isSelected())
        {
            medlist = medlist + " Acamprosate ,";
        
        }
        if (chkDis.isSelected())
        {
            medlist = medlist + "Disulfiram ,";
        
        }
       
        if(chkCam.isSelected())
        {
            medlist = medlist + "Campral ,";
        }
        if(chkAnt.isSelected())
        {
            medlist = medlist + "Antabuse ,";
        }
        if(chkViv.isSelected())
        {
            medlist = medlist + "Vivitrol ,";
        }
        
// ----------------------------------------------------------
        
        if(chkMef.isSelected())
        {
            medlist = medlist + "Meftal ,";
        }
        
        if(chkHydro.isSelected())
        {
            medlist = medlist + "Hydrocodone ,";
        }
        
        if(chkDolo.isSelected())
        {
            medlist = medlist + "Dolo ,";
        }
        
        if(chkO2.isSelected())
        {
            medlist = medlist + "O2 ,";
        }
        
        if(chkSin.isSelected())
        {
            medlist = medlist + "Sinarest ,";
        }
        
        if(chkCrocin.isSelected())
        {
            medlist = medlist + "Crocin ,";
        }
        
        if(chkSpasm.isSelected())
        {
            medlist = medlist + "Spasm ,";
        }
        
        if(chkAld.isSelected())
        {
            medlist = medlist + "Aldrid ,";
        }
        
        if(chkMet.isSelected())
        {
            medlist = medlist + "Metformin ,";
        }
        
        if(chkLosa.isSelected())
        {
            medlist = medlist + "Losartan ,";
        }
        
        if(chkAlbu.isSelected())
        {
            medlist = medlist + "Albuterol ,";
        }
        
        if(chkAntihis.isSelected())
        {
            medlist = medlist + "Antihistamines ,";
        }
        
        if(chkOme.isSelected())
        {
            medlist = medlist + "Omeprazole ,";
        }
        
//-----------------------------------------------------------
      
        System.out.println(medlist);
        patientrequest.setMedlist(medlist);
        patientrequest.setStatus("Prescription Given");
        patientrequest.setDiagnose("Following medicines have been prescribed : \n " + medlist);

        Organization org = null;
        for (Enterprise enterprise : network.getEnterpriseMasterList().getEnterpriseList()) {
            if (enterprise instanceof PharmacyEnterprise) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof PharmacyOrganization) {
                        org = organization;
                        break;
                    }
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(patientrequest);
                patientrequest.setReceiver(null);
                userAccount.getWorkQueue().getWorkRequestList().add(patientrequest);
            }
        }
        JOptionPane.showMessageDialog(null, "Medical prescription sent to pharmacist successfully.");
                }}}
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Donor not registered, Try again");
            System.out.println(e.toString());
            emptyValidationStatus = true;
        }
    }//GEN-LAST:event_requestbtnActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void chkSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkSinActionPerformed

    private void chkVivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkVivActionPerformed

    private void chkAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAntActionPerformed

    private void chkDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkDisActionPerformed

    private void chkAcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAcaActionPerformed

    private void chkCrocinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCrocinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCrocinActionPerformed

    private void chkMefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMefActionPerformed

    private void chkSpasmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSpasmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkSpasmActionPerformed

    private void chkAldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAldActionPerformed

    private void chkMetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMetActionPerformed

    private void chkLosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLosaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkLosaActionPerformed

    private void chkAlbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAlbuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAlbuActionPerformed

    private void chkHydroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHydroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkHydroActionPerformed

    private void chkAntihisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAntihisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkAntihisActionPerformed

    private void chkDoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDoloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkDoloActionPerformed

    private void chkOmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkOmeActionPerformed

    private boolean RegexValidation()
        {
            if(!txtPatientName.getText().matches("^[a-zA-Z ]+$"))
        {
            txtPatientName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPatientName.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(txtPatientName.getText().matches("^[a-zA-Z ]+$"))
        {
            txtPatientName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
        }
            return validationCheck;
        }
        
        private boolean EmpytyFieldValidation()
        {
            if( txtPatientName.getText().equals(null) ||  txtPatientName.getText().trim().isEmpty() )
        {
             txtPatientName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
             txtPatientName.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtPatientName.getText().equals(null) && ! txtPatientName.getText().trim().isEmpty() )
        {
             txtPatientName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
            return emptyValidationStatus;
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkAca;
    private javax.swing.JCheckBox chkAlbu;
    private javax.swing.JCheckBox chkAld;
    private javax.swing.JCheckBox chkAnt;
    private javax.swing.JCheckBox chkAntihis;
    private javax.swing.JCheckBox chkCam;
    private javax.swing.JCheckBox chkCrocin;
    private javax.swing.JCheckBox chkDis;
    private javax.swing.JCheckBox chkDolo;
    private javax.swing.JCheckBox chkHydro;
    private javax.swing.JCheckBox chkLosa;
    private javax.swing.JCheckBox chkMef;
    private javax.swing.JCheckBox chkMet;
    private javax.swing.JCheckBox chkO2;
    private javax.swing.JCheckBox chkOme;
    private javax.swing.JCheckBox chkSin;
    private javax.swing.JCheckBox chkSpasm;
    private javax.swing.JCheckBox chkViv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton requestbtn;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}
