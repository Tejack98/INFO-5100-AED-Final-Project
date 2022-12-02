/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SupplyChainInterface;

import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author adity
 */
public class HandlerSignUp extends javax.swing.JPanel {

    /**
     * Creates new form HandlerSignUp
     */
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    public HandlerSignUp() {
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

        lblDateOfBirth = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDateOfBirth = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        lblPhoneNo = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        cboxGender = new javax.swing.JComboBox<>();
        lblState = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblGender1 = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        cboxVehicle = new javax.swing.JComboBox<>();

        lblDateOfBirth.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblDateOfBirth.setText("Date Of Birth");

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Handler Profile");

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        lblPhoneNo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblPhoneNo.setText("Phone No.");

        lblName.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblName.setText("Name");

        lblUsername.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblUsername.setText("Email");

        lblGender.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblGender.setText("Gender");

        cboxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblState.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblState.setText("State");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblCity.setText("City");

        lblZipCode.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblZipCode.setText("Zipcode");

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblAddress.setText("Address");

        lblGender1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblGender1.setText("Vehicle");

        txtPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNoActionPerformed(evt);
            }
        });

        cboxVehicle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName)
                            .addComponent(lblUsername)
                            .addComponent(lblPhoneNo)
                            .addComponent(lblDateOfBirth)
                            .addComponent(lblGender)
                            .addComponent(lblState)
                            .addComponent(lblCity)
                            .addComponent(lblZipCode)
                            .addComponent(lblAddress)
                            .addComponent(lblGender1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSignUp)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(txtDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(cboxGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtZipcode, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(txtState, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(txtPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                .addComponent(cboxVehicle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 200, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(cboxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender1)
                    .addComponent(cboxVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNo)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateOfBirth)
                    .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipCode)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSignUp)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNoActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        try{
            if(EmpytyFieldValidation()){

                if(RegexValidation()){

                    String name = txtName.getText();
                    long cellPhoneNumber = Long.parseLong(txtPhoneNo.getText());
                    String emailId = txtEmail.getText();
                    String gender = cboxGender.getSelectedItem().toString();
                    String Vehicle = cboxVehicle.getSelectedItem().toString();
                    String dob = txtDateOfBirth.getText();
                    String Address = txtAddress.getText();
                    String City = txtCity.getText();
                    String State = txtState.getText();
                    long Zipcode = Long.parseLong(txtZipcode.getText());
                    
                    Random random=new Random();
                    int HandlerID=random.nextInt((9999 - 100) + 1) + 10;

                    String password = name + String.valueOf(random.nextInt((9999 - 100) + 1)+ 10);
                    JOptionPane.showMessageDialog(this,"Handler Registered Successfully.Your New Id is:"+HandlerID+" and password: "+password+",Please save this Id for furture reference.");

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
            JOptionPane.showMessageDialog(this,"Handler not registered, Try again");
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
    private javax.swing.JComboBox<String> cboxGender;
    private javax.swing.JComboBox<String> cboxVehicle;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGender1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}
