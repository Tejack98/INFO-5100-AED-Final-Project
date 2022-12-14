/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface.Administration;

import userinterface.HealthcareInterface.healthcareAdmin.*;
import healthcare.Ecosystem;
import healthcare.db4oUtil.Db4oUtil;
import javax.swing.JFrame;
import javax.swing.JPanel;
import userinterface.HealthcareInterface.healthcareAdmin.doctor.HealthCareAdminDoctorPanel;

/**
 *
 * @author Tejas
 */
public class AdministratorWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form HopsitalWorkArea
     */
    private Db4oUtil db4oUtil = Db4oUtil.getDb4oInstance();
    
    static Ecosystem ecosystem;
    public AdministratorWorkArea(Ecosystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        SysAdminManageEnterprise sme = new SysAdminManageEnterprise(ecosystem);
        jSplitPaneSystem.setRightComponent(sme);
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
        btnEnterprise = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnNetwork = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlPanel.setBackground(new java.awt.Color(153, 204, 255));
        controlPanel.setPreferredSize(new java.awt.Dimension(200, 600));
        controlPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEnterprise.setBackground(new java.awt.Color(255, 204, 204));
        btnEnterprise.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnEnterprise.setText("Enterprise");
        btnEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterpriseActionPerformed(evt);
            }
        });
        controlPanel.add(btnEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 127, 102, 55));

        btnAdmin.setBackground(new java.awt.Color(255, 204, 204));
        btnAdmin.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        controlPanel.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 200, 102, 55));

        btnLogout.setBackground(new java.awt.Color(255, 204, 204));
        btnLogout.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        controlPanel.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 102, -1));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrator");
        controlPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 6, 210, 42));

        btnNetwork.setBackground(new java.awt.Color(255, 204, 204));
        btnNetwork.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnNetwork.setText("Network");
        btnNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNetworkActionPerformed(evt);
            }
        });
        controlPanel.add(btnNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 54, 102, 55));

        jSplitPaneSystem.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
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
            .addComponent(jSplitPaneSystem, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterpriseActionPerformed
        // TODO add your handling code here:

        SysAdminManageEnterprise sme = new SysAdminManageEnterprise(ecosystem);
        jSplitPaneSystem.setRightComponent(sme);
    }//GEN-LAST:event_btnEnterpriseActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        db4oUtil.storeDb4oEcosystem(ecosystem);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNetworkActionPerformed
        // TODO add your handling code here:
        SysAdminMangeNetwork samn = new SysAdminMangeNetwork(ecosystem);
        jSplitPaneSystem.setRightComponent(samn);
    }//GEN-LAST:event_btnNetworkActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        SysAdminManageEnterpriseAdmin samea = new SysAdminManageEnterpriseAdmin(ecosystem);
        jSplitPaneSystem.setRightComponent(samea);
    }//GEN-LAST:event_btnAdminActionPerformed

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
            java.util.logging.Logger.getLogger(AdministratorWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdministratorWorkArea patientFrame = new AdministratorWorkArea(ecosystem);
                patientFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                patientFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnEnterprise;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNetwork;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPaneSystem;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
