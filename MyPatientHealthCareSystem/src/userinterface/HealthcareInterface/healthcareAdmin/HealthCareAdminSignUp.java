/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HealthcareInterface.healthcareAdmin;

import healthcare.Ecosystem;
import healthcare.enterprise.healthCare.HealthCareAdminRole;
import healthcare.person.Person;
import healthcare.userAccount.UserAccount;
import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import userinterface.SendMail;

/**
 *
 * @author adity
 */
public class HealthCareAdminSignUp extends javax.swing.JPanel {

    /**
     * Creates new form HealthCareAdminSignUp
     */
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    Ecosystem ecosystem;   
    public HealthCareAdminSignUp() {
        initComponents();
        this.ecosystem = Ecosystem.getEcosystemInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhoneNo = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZipcode = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        lblSpeciality = new javax.swing.JLabel();
        cboxSpeciality = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Admin Profile");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 880, -1));

        lblName.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblName.setText("Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 96, -1));

        lblUsername.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblUsername.setText("Email");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, 96, -1));

        lblPhoneNumber.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblPhoneNumber.setText("Phone Number");
        add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, -1, -1));

        lblAddress.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblAddress.setText("Address");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, 96, -1));

        lblCity.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblCity.setText("City");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 96, -1));

        lblState.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblState.setText("State");
        add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, 96, -1));

        lblZipCode.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblZipCode.setText("Zipcode");
        add(lblZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, 96, -1));

        txtName.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 180, 230, -1));

        txtEmail.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 220, 230, -1));

        txtPhoneNo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        add(txtPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 290, 230, -1));

        txtAddress.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 330, 230, -1));

        txtCity.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 370, 230, -1));

        txtState.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 230, -1));

        txtZipcode.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        add(txtZipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 450, 230, -1));

        btnSignUp.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 490, -1, -1));

        lblSpeciality.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblSpeciality.setText("Enterprise");
        add(lblSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, 96, -1));

        cboxSpeciality.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cboxSpeciality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cboxSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 250, 230, 24));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guide-to-healthcare-administration-768x490.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, -1, 900));
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
                    int HealthCareAdminID=random.nextInt((9999 - 100) + 1) + 10;

                    String username = name.substring(0, 3) + String.valueOf(HealthCareAdminID);
                    String password = name + String.valueOf(random.nextInt((9999 - 100) + 1) + 10);
                    
                    
                    Person person = ecosystem.getPersonDirectory().createAndAddPerson(name,Address,City,State,Zipcode,cellPhoneNumber);
                    UserAccount u = ecosystem.getUserAccountDirectory().createUserAccount(HealthCareAdminID,username, password, person, new HealthCareAdminRole(), emailId);
                    
                    JOptionPane.showMessageDialog(this,"Health Care Admin Registered Successfully.Your New Id is:"+HealthCareAdminID+" and password: "+password+",Please save this Id for furture reference.");
                    
                    SendMail s = new SendMail();
                    s.sendUserRegisterEmail(emailId, username, password);

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
        
        if(!txtZipcode.getText().matches("^[0-9]{5}(?:-[0-9]{4})?$"))
        {
            txtZipcode.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtZipcode.setToolTipText("Please enter a valid zip code number");
            validationCheck=false;
        }
         if(txtZipcode.getText().matches("^[0-9]{5}(?:-[0-9]{4})?$"))
        {
            txtZipcode.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
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

        if(txtEmail.getText().equals(null) || txtEmail.getText().trim().isEmpty() )
        {
            txtEmail.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtEmail.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        
        if(!txtEmail.getText().equals(null) && !txtEmail.getText().trim().isEmpty() )
        {
            txtEmail.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
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
        
        if(txtState.getText().equals(null)|| txtState.getText().trim().isEmpty())
        {
            txtState.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtState.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtState.getText().equals(null) && !txtState.getText().trim().isEmpty())
        {
            txtState.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
           
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
        
        if(txtZipcode.getText().equals(null) || txtZipcode.getText().trim().isEmpty())
        {
            txtZipcode.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtZipcode.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus=false;
        }
        if(!txtZipcode.getText().equals(null) && !txtZipcode.getText().trim().isEmpty())
        {
            txtZipcode.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        return emptyValidationStatus;
    }//GEN-LAST:event_btnSignUpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JComboBox<String> cboxSpeciality;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
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
