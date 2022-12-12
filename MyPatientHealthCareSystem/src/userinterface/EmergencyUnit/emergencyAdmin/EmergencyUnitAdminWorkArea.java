/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface.EmergencyUnit.emergencyAdmin;

import healthcare.Ecosystem;
import healthcare.db4oUtil.Db4oUtil;
import healthcare.enterprise.Enterprise;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.userAccount.UserAccount;

/**
 *
 * @author adity
 */
public class EmergencyUnitAdminWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form EmergencyUnitAdmin
     */
    static UserAccount userAccount;
    static Organization organization;
    static Enterprise enterprise;
    static Ecosystem ecosystem;
    static Network network;
    private Db4oUtil db4oUtil = Db4oUtil.getDb4oInstance();
    
    public EmergencyUnitAdminWorkArea(UserAccount userAccount, Organization organization, Enterprise enterprise ,Ecosystem ecosystem, Network network) {
        initComponents();
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        this.network = network;
        
        EmergencyHandlerSignUp aah = new EmergencyHandlerSignUp(ecosystem, enterprise.getOrganizationDirectory());
        jSplitPane1.setRightComponent(aah);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAddAmbulance = new javax.swing.JButton();
        btnAddAmbulanceHandler = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        Org_Name = new javax.swing.JButton();
        btnAddAmbulanceHandler1 = new javax.swing.JButton();
        btnAddAmbulanceHandler2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Emergency Unit Admin");

        btnAddAmbulance.setBackground(new java.awt.Color(153, 204, 255));
        btnAddAmbulance.setText("Add Ambulance");
        btnAddAmbulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAmbulanceActionPerformed(evt);
            }
        });

        btnAddAmbulanceHandler.setBackground(new java.awt.Color(153, 204, 255));
        btnAddAmbulanceHandler.setText("Add Ambulance Handler");
        btnAddAmbulanceHandler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAmbulanceHandlerActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 204, 204));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        Org_Name.setBackground(new java.awt.Color(153, 204, 255));
        Org_Name.setText("Orgainzation");
        Org_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Org_NameActionPerformed(evt);
            }
        });

        btnAddAmbulanceHandler1.setBackground(new java.awt.Color(153, 204, 255));
        btnAddAmbulanceHandler1.setText("View Handlers");
        btnAddAmbulanceHandler1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAmbulanceHandler1ActionPerformed(evt);
            }
        });

        btnAddAmbulanceHandler2.setBackground(new java.awt.Color(153, 204, 255));
        btnAddAmbulanceHandler2.setText("View Ambulance");
        btnAddAmbulanceHandler2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAmbulanceHandler2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnAddAmbulance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAddAmbulanceHandler, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Org_Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAddAmbulanceHandler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAddAmbulanceHandler2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddAmbulance, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddAmbulanceHandler, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddAmbulanceHandler1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddAmbulanceHandler2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Org_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddAmbulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAmbulanceActionPerformed
        // TODO add your handling code here:
        
        AmbulanceSignUp asu = new AmbulanceSignUp(ecosystem, organization);
        jSplitPane1.setRightComponent(asu);
    }//GEN-LAST:event_btnAddAmbulanceActionPerformed

    private void btnAddAmbulanceHandlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAmbulanceHandlerActionPerformed
        // TODO add your handling code here:
        
        EmergencyHandlerSignUp aah = new EmergencyHandlerSignUp(ecosystem, enterprise.getOrganizationDirectory());
        jSplitPane1.setRightComponent(aah);
    }//GEN-LAST:event_btnAddAmbulanceHandlerActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        db4oUtil.storeDb4oEcosystem(ecosystem);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void Org_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Org_NameActionPerformed
        // TODO add your handling code here:

        EmergencyUnitManageOrganization lmo = new EmergencyUnitManageOrganization(enterprise);
        jSplitPane1.setRightComponent(lmo);
    }//GEN-LAST:event_Org_NameActionPerformed

    private void btnAddAmbulanceHandler1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAmbulanceHandler1ActionPerformed
        // TODO add your handling code here:
        EmergencyUnitViewHandlers euvh = new EmergencyUnitViewHandlers(ecosystem, enterprise.getOrganizationDirectory());
        jSplitPane1.setRightComponent(euvh);
    }//GEN-LAST:event_btnAddAmbulanceHandler1ActionPerformed

    private void btnAddAmbulanceHandler2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAmbulanceHandler2ActionPerformed
        // TODO add your handling code here:
        EmergencyUnitViewAmbulance euva = new EmergencyUnitViewAmbulance(ecosystem, userAccount, organization, enterprise, network);
        jSplitPane1.setRightComponent(euva);
    }//GEN-LAST:event_btnAddAmbulanceHandler2ActionPerformed

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
            java.util.logging.Logger.getLogger(EmergencyUnitAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmergencyUnitAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmergencyUnitAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmergencyUnitAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmergencyUnitAdminWorkArea(userAccount, organization, enterprise, ecosystem, network).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Org_Name;
    private javax.swing.JButton btnAddAmbulance;
    private javax.swing.JButton btnAddAmbulanceHandler;
    private javax.swing.JButton btnAddAmbulanceHandler1;
    private javax.swing.JButton btnAddAmbulanceHandler2;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
