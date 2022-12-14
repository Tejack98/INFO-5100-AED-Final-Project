/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SupplyChainInterface.supplyManger;

import healthcare.Ecosystem;
import healthcare.db4oUtil.Db4oUtil;
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
public class VehicleSignUp extends javax.swing.JPanel {

    /**
     * Creates new form VehicleSignUp
     */
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    
    private Ecosystem ecosystem;
    private SupplierOrganization supOrganization;
    
    public VehicleSignUp(Ecosystem ecosystem, Organization organization) {
        initComponents();
        this.ecosystem = ecosystem;
        this.supOrganization = (SupplierOrganization) organization;
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
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVehicleName.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblVehicleName.setText("Vehicle Name");
        add(lblVehicleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));
        add(txtVehicleNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 230, -1));

        lblVehicleType.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblVehicleType.setText("Vehicle Type");
        add(lblVehicleType, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        btnSignUp.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        lblVehicleNumber.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblVehicleNumber.setText("Vehicle Number");
        add(lblVehicleNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        lblDescription.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblDescription.setText("Description");
        add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));
        add(txtVehicleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 230, -1));

        txtVehicleType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleTypeActionPerformed(evt);
            }
        });
        add(txtVehicleType, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 230, -1));

        lblTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Vehicle");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1238, 40));
        add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 230, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CreateVehicle.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
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
                    
                    Vehicle vehicle = new Vehicle(VehicleName, VehicleNumber, VehicleType, Description, "Available");
                    supOrganization.addNewVehicle(vehicle);
                    
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
        
        if(!txtDescription.getText().matches("^[a-zA-Z ]+$"))
        {
            txtDescription.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtDescription.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(txtDescription.getText().matches("^[a-zA-Z ]+$"))
        {
            txtDescription.setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
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
        
        if(txtVehicleType.getText().equals(null) || txtVehicleName.getText().trim().isEmpty() )
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
    private javax.swing.JLabel jLabel1;
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
