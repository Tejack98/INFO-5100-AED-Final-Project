/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface.HealthcareInterface.patient;

import healthcare.Ecosystem;
import healthcare.db4oUtil.Db4oUtil;
import healthcare.enterprise.Enterprise;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.userAccount.UserAccount;
import userinterface.HealthcareInterface.doctor.*;
import userinterface.HealthcareInterface.healthcareAdmin.doctor.HealthCareAdminDoctorPanel;

/**
 *
 * @author Tejas
 */
public class PatientWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form HopsitalWorkArea
     */
    static UserAccount userAccount;
    static Organization organization;
    static Enterprise enterprise;
    static Ecosystem ecosystem;
    static Network network;
    private Db4oUtil db4oUtil = Db4oUtil.getDb4oInstance();
    
    public PatientWorkArea(UserAccount userAccount, Organization organization, Enterprise enterprise ,Ecosystem ecosystem, Network network) {
        initComponents();
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        this.network = network;
        BookAppointment ba = new BookAppointment(userAccount,organization,enterprise,ecosystem,network);
        jSplitPaneSystem.setRightComponent(ba);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPaneSystem = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBookApp = new javax.swing.JButton();
        btnViewApp = new javax.swing.JButton();
        btnEmergency = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlPanel.setBackground(new java.awt.Color(153, 204, 255));
        controlPanel.setPreferredSize(new java.awt.Dimension(200, 600));

        btnLogout.setBackground(new java.awt.Color(255, 204, 204));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient");

        btnBookApp.setBackground(new java.awt.Color(255, 204, 204));
        btnBookApp.setText("Book Appointment");
        btnBookApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppActionPerformed(evt);
            }
        });

        btnViewApp.setBackground(new java.awt.Color(255, 204, 204));
        btnViewApp.setText("View Appointment");
        btnViewApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAppActionPerformed(evt);
            }
        });

        btnEmergency.setBackground(new java.awt.Color(255, 204, 204));
        btnEmergency.setText("Emergency");
        btnEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergencyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnViewApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEmergency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBookApp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnBookApp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnViewApp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(48, 48, 48))
        );

        jSplitPaneSystem.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );

        jSplitPaneSystem.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneSystem, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneSystem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        db4oUtil.storeDb4oEcosystem(ecosystem);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBookAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppActionPerformed
        // TODO add your handling code here:
        BookAppointment ba = new BookAppointment(userAccount,organization,enterprise,ecosystem,network);
        jSplitPaneSystem.setRightComponent(ba);
    }//GEN-LAST:event_btnBookAppActionPerformed

    private void btnViewAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAppActionPerformed
        // TODO add your handling code here:
        ViewAppointment vp = new ViewAppointment(userAccount,organization,enterprise,ecosystem,network);
        jSplitPaneSystem.setRightComponent(vp);
    }//GEN-LAST:event_btnViewAppActionPerformed

    private void btnEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergencyActionPerformed
        // TODO add your handling code here:
        RequestEmergency re = new RequestEmergency(network, userAccount, enterprise);
        jSplitPaneSystem.setRightComponent(re);
        
    }//GEN-LAST:event_btnEmergencyActionPerformed

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
            java.util.logging.Logger.getLogger(PatientWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientWorkArea(userAccount,organization,enterprise,ecosystem,network).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookApp;
    private javax.swing.JButton btnEmergency;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnViewApp;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPaneSystem;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
