/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Administration;


import healthcare.Ecosystem;
import healthcare.Enterprise.donorBank.DonorAdminRole;
import healthcare.enterprise.Enterprise;
import healthcare.enterprise.emergencyUnit.EmergencyUnitAdminRole;
import healthcare.enterprise.healthCare.HealthCareAdminRole;
import healthcare.enterprise.lab.LabAdminRole;
import healthcare.enterprise.pharmacy.PharmacyAdminRole;
import healthcare.enterprise.supplyChain.SupplyManagerRole;
import healthcare.enterprise.vaccination.VaccinationAdminRole;
import healthcare.network.Network;
import healthcare.person.Person;
import healthcare.systemAdmin.AdminMasterRole;
import healthcare.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SendMail;

/**
 *
 * @author saura
 */
public class SysAdminManageEnterpriseAdmin extends javax.swing.JPanel {

   

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    private Ecosystem ecosystem;
    public SysAdminManageEnterpriseAdmin(Ecosystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;

        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseMasterList().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getOrganizationName();
                    row[1] = network.getNetworkName();
                    row[2] = userAccount.getUserName();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();

        for (Network network : ecosystem.getNetworkList()) {
            networkJComboBox.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {
        enterpriseJComboBox.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseMasterList().getEnterpriseList()) {
            enterpriseJComboBox.addItem(enterprise);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel10.setText("Manage Enterprise");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 990, 80));

        enterpriseJTable.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 910, 240));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.setBorder(null);
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 85, 31));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setText("Network");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        networkJComboBox.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 238, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setText("Enterprise");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, 20));

        enterpriseJComboBox.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 238, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));

        nameJTextField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 238, -1));

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 30));

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 238, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 1060));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }


    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        try {
            if (EmpytyFieldValidation()) {

                if (RegexValidation()) {
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();

        String name = nameJTextField.getText();
        String email = txtEmail.getText();
        
        Random random = new Random();
        int adminId = random.nextInt((9999 - 100) + 1) + 10;
        
        String username = name.substring(0, 3) + String.valueOf(adminId);
        String password = name + String.valueOf(random.nextInt((9999 - 100) + 1) + 10);

        Person employee = enterprise.getPersonDirectory().createAndAddPersonAdmin(name);

        if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.HealthCare)){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(adminId, username, password, employee, new HealthCareAdminRole(), email);
        }
        
        if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.DonorBank)){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(adminId, username, password, employee, new DonorAdminRole(), email);
        }
        
        if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.EmergencyUnit)){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(adminId, username, password, employee, new EmergencyUnitAdminRole(), email);
        }
        
        if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Lab)){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(adminId, username, password, employee, new LabAdminRole(), email);
        }
        
        if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Pharmacy)){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(adminId, username, password, employee, new PharmacyAdminRole(), email);
        }
        
        if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.SupplyChain)){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(adminId, username, password, employee, new SupplyManagerRole(), email);
        }
        
        if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Vaccination)){
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(adminId, username, password, employee, new VaccinationAdminRole(), email);
        }
                
        JOptionPane.showMessageDialog(this, "Health Care Admin Registered Successfully.Your New Admin Username is:" + username + " and password: " + password + ",Please save this Id for furture reference.");

        SendMail s = new SendMail();
        s.sendUserRegisterEmail(email, username, password);
        populateTable();
                }}}
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "HealthCare Admin not registered, Try again");
            System.out.println(e.toString());
            emptyValidationStatus = true;
        }
    }//GEN-LAST:event_submitJButtonActionPerformed
    
    private boolean RegexValidation()
    {
        if(!nameJTextField.getText().matches("^[a-zA-Z ]+$"))
        {
            nameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            nameJTextField.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(nameJTextField.getText().matches("^[a-zA-Z ]+$"))
        {
            nameJTextField.setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
            validationCheck = true;
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
            validationCheck = true;
        }
        

         return validationCheck;
    }
    
     private boolean EmpytyFieldValidation()
     {  
         if(txtEmail.getText().equals(null) || txtEmail.getText().trim().isEmpty())
        {
            txtEmail.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtEmail.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus=false;
        }
        if(!txtEmail.getText().equals(null) && !txtEmail.getText().trim().isEmpty())
        {
            txtEmail.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
            emptyValidationStatus = true;
        }
        
        if(nameJTextField.getText().equals(null) || nameJTextField.getText().trim().isEmpty() )
        {
            nameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            nameJTextField.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!nameJTextField.getText().equals(null) && !nameJTextField.getText().trim().isEmpty() )
        {
            nameJTextField.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
            emptyValidationStatus = true;
        }

        

         return emptyValidationStatus;

     }
    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
