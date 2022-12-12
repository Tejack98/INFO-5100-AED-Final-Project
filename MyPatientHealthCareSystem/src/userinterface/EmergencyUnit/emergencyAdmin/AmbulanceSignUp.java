/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.EmergencyUnit.emergencyAdmin;

import userinterface.SupplyChainInterface.supplyManger.*;
import healthcare.Ecosystem;
import healthcare.db4oUtil.Db4oUtil;
import healthcare.enterprise.emergencyUnit.Ambulance;
import healthcare.enterprise.emergencyUnit.EmergencyUnitOrganization;
import healthcare.enterprise.supplyChain.SupplierOrganization;
import healthcare.enterprise.supplyChain.Vehicle;
import healthcare.organization.Organization;
import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author adity
 */
public class AmbulanceSignUp extends javax.swing.JPanel {

    /**
     * Creates new form VehicleSignUp
     */
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    
    private Ecosystem ecosystem;
    private EmergencyUnitOrganization emerOrganization;
    
    public AmbulanceSignUp(Ecosystem ecosystem, Organization organization) {
        initComponents();
        this.ecosystem = ecosystem;
        this.emerOrganization = (EmergencyUnitOrganization) organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVehicleName = new javax.swing.JLabel();
        txtVehicleNumber = new javax.swing.JTextField();
        lblVehicleType = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        lblVehicleNumber = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        txtVehicleName = new javax.swing.JTextField();
        txtVehicleType = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));

        lblVehicleName.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblVehicleName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVehicleName.setText("Ambulance Name");

        lblVehicleType.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblVehicleType.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVehicleType.setText("Ambulance Type");

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        lblVehicleNumber.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblVehicleNumber.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblVehicleNumber.setText("Ambulance Number");

        lblDescription.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDescription.setText("Description");

        txtVehicleType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleTypeActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Ambulance");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSignUp)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblVehicleNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVehicleType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVehicleName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVehicleName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehicleName)
                    .addComponent(txtVehicleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehicleType)
                    .addComponent(txtVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescription)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVehicleNumber)
                    .addComponent(txtVehicleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSignUp)
                .addContainerGap(245, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtVehicleTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleTypeActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        try{
            if(EmpytyFieldValidation()){

                if(RegexValidation()){

                    String VehicleName = txtVehicleName.getText();
                    String VehicleType = txtVehicleType.getText();
                    String VehicleNumber = txtVehicleNumber.getText();
                    String Description = txtDescription.getText();
                    
                    Ambulance amb = new Ambulance(VehicleName, VehicleNumber, VehicleType, Description, "Available");
                    emerOrganization.addNewVehicle(amb);
                    
                    JOptionPane.showMessageDialog(this,"Vehicle Registered Successfully");

                }
                else{
                    JOptionPane.showMessageDialog(this,"Some Error in entered data.Please check over the red fields to know more.");
                    validationCheck=true;
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Some Error in entered data. Please check over the red fields to know more.");
                emptyValidationStatus=true;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Health Care Admin not registered, Try again");
            System.out.println(e.toString());
            emptyValidationStatus=true;
        }
    }                                               

    private boolean RegexValidation() {
        if(!txtVehicleName.getText().matches("^[a-zA-Z ]+$"))
        {
            txtVehicleName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtVehicleName.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(txtVehicleName.getText().matches("^[a-zA-Z ]+$"))
        {
            txtVehicleName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
            validationCheck=true;
        }
        if(!txtVehicleType.getText().matches("^[a-zA-Z ]+$"))
        {
            txtVehicleType.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtVehicleType.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(txtVehicleType.getText().matches("^[a-zA-Z ]+$"))
        {
            txtVehicleType.setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
            validationCheck=true;
        }
       

        return validationCheck;
    }
    
    private boolean EmpytyFieldValidation() {
        if(txtVehicleName.getText().equals(null) || txtVehicleName.getText().trim().isEmpty() )
        {
            txtVehicleName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtVehicleName.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtVehicleName.getText().equals(null) && !txtVehicleName.getText().trim().isEmpty() )
        {
            txtVehicleName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
            emptyValidationStatus= true;
        }
       
        if(txtVehicleType.getText().equals(null) || txtVehicleType.getText().trim().isEmpty() )
        {
            txtVehicleType.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtVehicleType.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtVehicleType.getText().equals(null) && !txtVehicleType.getText().trim().isEmpty() )
        {
            txtVehicleType.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
            emptyValidationStatus= true;
        }
        
        if(txtDescription.getText().equals(null)|| txtDescription.getText().trim().isEmpty())
        {
            txtDescription.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtDescription.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtDescription.getText().equals(null) && !txtDescription.getText().trim().isEmpty())
        {
            txtDescription.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
           emptyValidationStatus= true;
        }
        if(txtVehicleNumber.getText().equals(null) || txtVehicleNumber.getText().trim().isEmpty())
        {
            txtVehicleNumber.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtVehicleNumber.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus=false;
        }
        if(!txtVehicleNumber.getText().equals(null) && !txtVehicleNumber.getText().trim().isEmpty())
        {
            txtVehicleNumber.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
            emptyValidationStatus= true;
        }
        return emptyValidationStatus;
    }//GEN-LAST:event_btnSignUpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVehicleName;
    private javax.swing.JLabel lblVehicleNumber;
    private javax.swing.JLabel lblVehicleType;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtVehicleName;
    private javax.swing.JTextField txtVehicleNumber;
    private javax.swing.JTextField txtVehicleType;
    // End of variables declaration//GEN-END:variables
}
