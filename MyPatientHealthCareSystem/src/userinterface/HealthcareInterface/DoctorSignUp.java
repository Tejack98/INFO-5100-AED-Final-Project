/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HealthcareInterface;

import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author adity
 */
public class DoctorSignUp extends javax.swing.JPanel {

    /**
     * Creates new form DoctorSignUp
     *
     */
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    public DoctorSignUp() {
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

        btnSignUp = new javax.swing.JButton();
        lblState = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblHospitalName = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblSpeciality = new javax.swing.JLabel();
        cboxHospitalName = new javax.swing.JComboBox<>();
        cboxSpeciality = new javax.swing.JComboBox<>();
        lblPhoneNo = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        lblState.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblState.setText("State");

        lblZipCode.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblZipCode.setText("Zipcode");

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Doctor Profile");

        lblName.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblName.setText("Name");

        lblUsername.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblUsername.setText("Email");

        lblHospitalName.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblHospitalName.setText("Hospital Name");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblAddress.setText("Address");

        lblCity.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblCity.setText("City");

        lblSpeciality.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblSpeciality.setText("Speciality");

        cboxHospitalName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboxSpeciality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblPhoneNo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblPhoneNo.setText("Phone No");

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
                        .addGap(161, 161, 161)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName)
                            .addComponent(lblUsername)
                            .addComponent(lblHospitalName)
                            .addComponent(lblAddress)
                            .addComponent(lblCity)
                            .addComponent(lblState)
                            .addComponent(lblZipCode)
                            .addComponent(lblSpeciality)
                            .addComponent(lblPhoneNo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtState, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtZipcode, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(cboxHospitalName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxSpeciality, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                        .addGap(0, 157, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSignUp)
                .addGap(253, 253, 253))
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
                    .addComponent(lblHospitalName)
                    .addComponent(cboxHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeciality)
                    .addComponent(cboxSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNo)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(btnSignUp)
                .addContainerGap(10, Short.MAX_VALUE))
        );
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
                    String emailId = txtEmail.getText();
                    String Speciality = cboxSpeciality.getSelectedItem().toString();
                    String HospitalName = cboxHospitalName.getSelectedItem().toString();
                    String Address = txtAddress.getText();
                    String City = txtCity.getText();
                    String State = txtState.getText();
                    long Zipcode = Long.parseLong(txtZipcode.getText());
                    long cellPhoneNumber = Long.parseLong(txtPhoneNo.getText());
                    
                    Random random=new Random();
                    int doctorID=random.nextInt((9999 - 100) + 1) + 10;

                    String password = name + String.valueOf(random.nextInt((9999 - 100) + 1)+ 10);
                    JOptionPane.showMessageDialog(this,"Doctor Registered Successfully.Your New Id is:"+doctorID+" and password: "+password+",Please save this Id for furture reference.");

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
            JOptionPane.showMessageDialog(this,"Doctor not registered, Try again");
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
        
        
        return emptyValidationStatus;
    
    }//GEN-LAST:event_btnSignUpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JComboBox<String> cboxHospitalName;
    private javax.swing.JComboBox<String> cboxSpeciality;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblSpeciality;
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
