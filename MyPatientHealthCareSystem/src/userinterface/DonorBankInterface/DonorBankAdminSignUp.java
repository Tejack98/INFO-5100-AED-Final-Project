/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.DonorBankInterface;

import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author adity
 */
public class DonorBankAdminSignUp extends javax.swing.JPanel {

    /**
     * Creates new form DonorBankAdminSignUp
     */
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    public DonorBankAdminSignUp() {
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

        txtZipcode = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        lblState = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(98, 155, 185));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtZipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 670, 360, -1));

        lblCity.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblCity.setText("City");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 530, -1, 20));

        btnSignUp.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 730, -1, -1));

        lblState.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblState.setText("State");
        add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 600, -1, 20));

        lblZipCode.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblZipCode.setText("Zipcode");
        add(lblZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, -1, 20));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 250, 360, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 320, 360, -1));

        lblTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Donor Admin Profile");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, 600, -1));

        lblName.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 250, -1, 20));
        add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 390, 360, -1));

        lblUsername.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblUsername.setText("Email");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 320, -1, 20));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 460, 360, -1));

        lblPhoneNumber.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblPhoneNumber.setText("Phone Number");
        add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, -1, 20));

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 530, 360, -1));
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 600, 360, -1));

        lblAddress.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblAddress.setText("Address");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 460, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/organdonation.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        try{
            if(EmpytyFieldValidation()){

                if(RegexValidation()){

                    String name = txtName.getText();
                    long cellPhoneNumber = Long.parseLong(txtPhoneNo.getText());
                    String emailId = txtEmail.getText();
                    String Address = txtAddress.getText();
                    String City = txtCity.getText();
                    String State = txtState.getText();
                    long Zipcode = Long.parseLong(txtZipcode.getText());
                    
                    Random random=new Random();
                    int donorID=random.nextInt((9999 - 100) + 1) + 10;

                    String password = name + String.valueOf(random.nextInt((9999 - 100) + 1)+ 10);
                    JOptionPane.showMessageDialog(this,"Donor Admin Registered Successfully.Your New Donor Admin Id is:"+donorID+" and password: "+password+",Please save this Doctor Admin Id for furture reference.");

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
            JOptionPane.showMessageDialog(this,"Donor Admin not registered, Try again");
            System.out.println(e.toString());
            emptyValidationStatus=true;
        }
    }                                               

    private boolean RegexValidation() {
        if(!txtName.getText().matches("^[a-zA-Z ]+$"))
        {
            txtName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtName.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(txtName.getText().matches("^[a-zA-Z ]+$"))
        {
            txtName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
        }
        
        if(!txtEmail.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$"))
        {
            txtEmail.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtEmail.setToolTipText("Please enter a valid Email Address in the form abc@xyy.com");
            validationCheck=false;
        }
        
        if(txtEmail.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$"))
        {
            txtEmail.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(!txtPhoneNo.getText().matches("^[0-9]{10}$"))
        {
            txtPhoneNo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPhoneNo.setToolTipText("Please enter a 10 digit number");
            validationCheck=false;
        }
        
        if(txtPhoneNo.getText().matches("^[0-9]{10}$"))
        {
            txtPhoneNo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        return validationCheck;
    }
    
    private boolean EmpytyFieldValidation() {
        if(txtName.getText().equals(null) || txtName.getText().trim().isEmpty() )
        {
            txtName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtName.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtName.getText().equals(null) && !txtName.getText().trim().isEmpty() )
        {
            txtName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
       
        
         
        
        
        
        if(txtAddress.getText().equals(null)|| txtAddress.getText().trim().isEmpty())
        {
            txtAddress.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtAddress.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtAddress.getText().equals(null) && !txtAddress.getText().trim().isEmpty())
        {
            txtAddress.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
           
        }
        
        if(txtCity.getText().equals(null)|| txtCity.getText().trim().isEmpty())
        {
            txtCity.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtCity.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtCity.getText().equals(null) && !txtCity.getText().trim().isEmpty())
        {
            txtCity.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
           
        }
        
        if(txtPhoneNo.getText().equals(null) || txtPhoneNo.getText().trim().isEmpty())
        {
            txtPhoneNo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPhoneNo.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus=false;
        }
        if(!txtPhoneNo.getText().equals(null) && !txtPhoneNo.getText().trim().isEmpty())
        {
            txtPhoneNo.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        return emptyValidationStatus;
    }//GEN-LAST:event_btnSignUpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}
