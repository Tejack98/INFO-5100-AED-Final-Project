/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.LabInterface.labTech;

import healthcare.enterprise.Enterprise;
import healthcare.enterprise.healthCare.DoctorOrganization;
import healthcare.enterprise.healthCare.HealthCareEnterprise;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.userAccount.UserAccount;
import healthcare.workQueue.DoctorLabRequest;
import healthcare.workQueue.WorkRequest;
import javax.swing.JOptionPane;

/**
 *
 * @author adity
 */
public class CollectedMedicalHistory extends javax.swing.JPanel {

    /**
     * Creates new form CollectedMedicalHistory
     */
    
    DoctorLabRequest request;
    UserAccount useraccount;
    Enterprise enterprise;
    Network network;
    String result = "";
    String solution = "";
    String type = "";
    
    public CollectedMedicalHistory(DoctorLabRequest request,UserAccount useraccount, Enterprise enterprise, Network network) {
        initComponents();
        this.request = request;
        this.useraccount = useraccount;
        this.enterprise = enterprise;
        this.network = network;
        populateMedicalHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMedicalHistory = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCurrentHealthRiskFound = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMedicalDoseConsumptionDetails = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtLabAssesmentsResults = new javax.swing.JTextArea();
        btnSendResults = new javax.swing.JButton();
        txtGender = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setBackground(new java.awt.Color(153, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient's Medical History and Symptoms");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 42));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("General Information");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setText("Gender");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setText("Age");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 200, -1));
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 200, -1));

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel7.setText("Medical History");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        txtMedicalHistory.setColumns(20);
        txtMedicalHistory.setRows(5);
        jScrollPane1.setViewportView(txtMedicalHistory);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 254, 100));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel8.setText("Current Health Risk Found");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, -1, -1));

        txtCurrentHealthRiskFound.setColumns(20);
        txtCurrentHealthRiskFound.setRows(5);
        jScrollPane2.setViewportView(txtCurrentHealthRiskFound);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 243, 100));

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel9.setText("Medical Dose Consumption Details");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, -1, -1));

        txtMedicalDoseConsumptionDetails.setColumns(20);
        txtMedicalDoseConsumptionDetails.setRows(5);
        jScrollPane3.setViewportView(txtMedicalDoseConsumptionDetails);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 243, 100));

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel10.setText("Lab Assesment Results");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        txtLabAssesmentsResults.setColumns(20);
        txtLabAssesmentsResults.setRows(5);
        jScrollPane4.setViewportView(txtLabAssesmentsResults);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 254, 100));

        btnSendResults.setBackground(new java.awt.Color(255, 204, 204));
        btnSendResults.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnSendResults.setText("Process And Send Results");
        btnSendResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendResultsActionPerformed(evt);
            }
        });
        add(btnSendResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 254, -1));

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 200, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CollectedMedicalHistoryLab.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, -1, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSendResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendResultsActionPerformed
        // TODO add your handling code here:
        if (request.isDrug_history() || request.isAlcohol_history()
                || request.isHr_risk() || request.isTemp_risk()
                || (request.isOxycodone_taken() && request.isOxycodone_risk())
                || (request.isFantanyl_taken() && request.isFantanyl_risk())
                || (request.isBupre_taken() && request.isBupre_risk())
                || (request.isMethadone_taken() && request.isMethadone_risk())
                || (request.isOxymorphone_taken() && request.isOxymorphone_risk())
                || (request.isInjection_checked()) || (request.isIntoxication_checked())
                || request.isWithdrawal_checked() || request.isDisease_checked()) {
            type = "Overdose [Pharmacotherapist]";
            result = result + "This is an Opioid Overdose case.";
            solution = "Patient is recommended for Pharmacotherapist.";
            request.setStatus("Lab req done");

        } // Send to Psychiatrist when the below criteria is true 
        else if (request.isDepression_history() || request.isAnxiety_history()
                || request.isDisrupt_history() || request.isBp_risk() || request.isResp_risk()) {
            type = "Overdose [Psychiatrist]";
            result = result + "This is an Opioid Overdose case.";
            solution = "Patient is recommended for Psychiatrist.";
            request.setStatus("Lab req done");

        } // If not any above criteria then patient can be treated medically 
        else {
            type = "Not Overdose [Medical Treatment]";
            result = result + "This is not an Opioid Overdose case." + "\n"
                    + "Patient is recommended for medical treatment .";
            solution = "Patient is recommended for medical treatm.";
            request.setStatus("Lab req done");

        }

        txtLabAssesmentsResults.setText(result);
        /*-----------------------*/
        int b = request.getHashcode();
        System.out.println("b" + b);
        //Dharati
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        Network inNetwork = null;
        
        for (Enterprise ent : network.getEnterpriseMasterList().getEnterpriseList()) {
            if (ent instanceof HealthCareEnterprise) {
                for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof DoctorOrganization) {
                        for (WorkRequest work : organization.getWorkQueue().getWorkRequestList()) {
                            if (work.getHashcode() == b) {
                                work.setStatus("Lab req done");
                                work.setLabresult(result);
                                work.setResulttype(type);
                                work.setSolution(solution);
                            }

                        }
                    }
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Result Sent Successfully");
        
    }//GEN-LAST:event_btnSendResultsActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    
    public void populateMedicalHistory() {

        txtName.setText(request.getName());
        txtGender.setText(request.getGender());
        txtAge.setText(Integer.toString(request.getAge()));
        String med_hist = "";
        String health_risk = "";
        String consum_risk = "";
        if (request.isDrug_history()) {
            med_hist = "Drug History Found" + "\n";

        }

        if (request.isAlcohol_history()) {
            med_hist = med_hist + "Alcohol History Found" + "\n";

        }

        if (request.isDepression_history()) {
            med_hist = med_hist + "Depression History Found" + "\n";
        }

        if (request.isAnxiety_history()) {
            med_hist = med_hist + "Anxiety History Found" + "\n";
        }
        if (request.isDisrupt_history()) {
            med_hist = med_hist + "Bad Social Relationships History Found" + "\n";
        }
        if (med_hist.length() > 0) {
            result = result + med_hist;
            txtMedicalHistory.setText(med_hist);
        } else {
            txtMedicalHistory.setText("No Severe Medical History Found");
        }

        if (request.isHr_risk()) {
            health_risk = "Heart Risk Found" + "\n";
        }

        if (request.isBp_risk()) {
            health_risk = "High Blood Pressure Diagnosed" + "\n";
        }

        if (request.isTemp_risk()) {
            health_risk = health_risk + "Fever Diagnosed" + "\n";
        }

        if (request.isResp_risk()) {
            health_risk = health_risk + "High Respiratory Rate Diagnosed" + "\n";
        }
        if (health_risk.length() > 0) {
            txtCurrentHealthRiskFound.setText(health_risk);
        } else {
            txtCurrentHealthRiskFound.setText("No Sever Health Risk Detected");
        }

        // Calculating consumption risk 
        if (request.isOxycodone_taken() && request.isOxycodone_risk()) {
            consum_risk = "Above Limit Oxycodone Conspumtion History" + "\n";
        }

        if (request.isFantanyl_taken() && request.isFantanyl_risk()) {
            consum_risk = consum_risk + "Above Limit Fantanyl Conspumtion History" + "\n";
        }

        if (request.isBupre_taken() && request.isBupre_risk()) {
            consum_risk = consum_risk + "Above Limit Buprenorphine Conspumtion History" + "\n";
        }

        if (request.isMethadone_taken() && request.isMethadone_risk()) {
            consum_risk = consum_risk + "Above Limit Methadon Conspumtion History" + "\n";
        }

        if (request.isOxymorphone_taken() && request.isOxymorphone_risk()) {
            consum_risk = consum_risk + "Above Limit Oxymorphone Conspumtion History" + "\n";
        }
        if (consum_risk.length() > 0) {
            txtMedicalDoseConsumptionDetails.setText(consum_risk);
        } else {
            txtMedicalDoseConsumptionDetails.setText("No severe medicine consumption history found");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendResults;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextArea txtCurrentHealthRiskFound;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextArea txtLabAssesmentsResults;
    private javax.swing.JTextArea txtMedicalDoseConsumptionDetails;
    private javax.swing.JTextArea txtMedicalHistory;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
