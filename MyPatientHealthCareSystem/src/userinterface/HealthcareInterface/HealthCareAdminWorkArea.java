/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface.HealthcareInterface;

/**
 *
 * @author Tejas
 */
public class HealthCareAdminWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form HopsitalWorkArea
     */
    public HealthCareAdminWorkArea() {
        initComponents();
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
        btnDoctors = new javax.swing.JButton();
        btnPatients = new javax.swing.JButton();
        btnEncounters = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        workArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlPanel.setBackground(new java.awt.Color(100, 92, 170));
        controlPanel.setPreferredSize(new java.awt.Dimension(200, 600));

        btnDoctors.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        btnDoctors.setText("Doctors");
        btnDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorsActionPerformed(evt);
            }
        });

        btnPatients.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        btnPatients.setText("Patients");
        btnPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientsActionPerformed(evt);
            }
        });

        btnEncounters.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        btnEncounters.setText("Encounters");
        btnEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncountersActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPatients, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(15, 15, 15))
        );

        jSplitPaneSystem.setLeftComponent(controlPanel);

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

    private void btnDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorsActionPerformed
        // TODO add your handling code here:
        HealthCareAdminWorkPanel healthCareAdmin = new HealthCareAdminWorkPanel();
        jSplitPaneSystem.setRightComponent(healthCareAdmin);
    }//GEN-LAST:event_btnDoctorsActionPerformed

    private void btnPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientsActionPerformed
        // TODO add your handling code here:
//        HospitalPatientWorkPanel hospitalPatient = new HospitalPatientWorkPanel(personDirectory, patientDirectory, community);
//        jSplitPaneSystem.setRightComponent(hospitalPatient);
    }//GEN-LAST:event_btnPatientsActionPerformed

    private void btnEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncountersActionPerformed
        // TODO add your handling code here:
//        HospitalEncountersWorkPanel hospitalEncounters = new HospitalEncountersWorkPanel(patientDirectory, doctorDirectory);
//        jSplitPaneSystem.setRightComponent(hospitalEncounters);
    }//GEN-LAST:event_btnEncountersActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(HealthCareAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthCareAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthCareAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthCareAdminWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthCareAdminWorkArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoctors;
    private javax.swing.JButton btnEncounters;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPatients;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPaneSystem;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
