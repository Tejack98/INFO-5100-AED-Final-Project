/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.DonorBankInterface.DonorBankProfile;

/**
 *
 * @author shriyapandita
 */
public class ProfileDetailsDonor extends javax.swing.JPanel {

    /**
     * Creates new form ProfileDetailsDonor
     */
    public ProfileDetailsDonor() {
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

        lblName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPhoneNo = new javax.swing.JLabel();
        lblDateofBirth = new javax.swing.JLabel();
        lblDonorBank = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtDateofBirth = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        txtDonorBank = new javax.swing.JTextField();
        lblDonorDetails = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        lblName.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblName.setText("Name");

        lblUsername.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUsername.setText("Username");

        lblAddress.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAddress.setText("Address");

        lblPhoneNo.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        lblPhoneNo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPhoneNo.setText("Phone No");

        lblDateofBirth.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        lblDateofBirth.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDateofBirth.setText("Date of Birth");

        lblDonorBank.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        lblDonorBank.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDonorBank.setText("Donor Bank");

        txtName.setBackground(new java.awt.Color(153, 204, 255));

        txtUsername.setBackground(new java.awt.Color(153, 204, 255));

        txtDateofBirth.setBackground(new java.awt.Color(153, 204, 255));

        txtAddress.setBackground(new java.awt.Color(153, 204, 255));

        txtPhoneNo.setBackground(new java.awt.Color(153, 204, 255));
        txtPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNoActionPerformed(evt);
            }
        });

        txtDonorBank.setBackground(new java.awt.Color(153, 204, 255));

        lblDonorDetails.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblDonorDetails.setText("Donor Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDonorBank, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDonorDetails)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addComponent(txtUsername)
                        .addComponent(txtAddress)
                        .addComponent(txtPhoneNo)
                        .addComponent(txtDateofBirth)
                        .addComponent(txtDonorBank)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblDonorDetails)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNo)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateofBirth)
                    .addComponent(txtDateofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDonorBank)
                    .addComponent(txtDonorBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDateofBirth;
    private javax.swing.JLabel lblDonorBank;
    private javax.swing.JLabel lblDonorDetails;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDateofBirth;
    private javax.swing.JTextField txtDonorBank;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}