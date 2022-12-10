/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HealthcareInterface.patient;

import healthcare.Ecosystem;
import healthcare.enterprise.Enterprise;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.userAccount.UserAccount;
import healthcare.workQueue.PatientAppointmentRequest;
import healthcare.workQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author shriyapandita
 */
public class ViewAppointment extends javax.swing.JPanel {

    /**
     * Creates new form ViewAppointment
     */
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    Ecosystem ecosystem;
    Network network;
    public ViewAppointment(UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem ecosystem, Network network) {
        initComponents();
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        this.network = network;
        populateAppointmentListTable();
    }
    
    public void populateAppointmentListTable() {
        //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel model = (DefaultTableModel) appointmentsTable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = request;
            String date = ((WorkRequest) request).getRequestDate().toString();
            row[1] = date;
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            String doctmessage = ((PatientAppointmentRequest) request).getDoctorMessage();
            row[4] = request.getSolution() == null ? "Waiting" : request.getSolution();
            model.addRow(row);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentsTable = new javax.swing.JTable();
        vwDiganosisBtn = new javax.swing.JButton();
        txtDiagnose = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Appointment");

        appointmentsTable.setBackground(new java.awt.Color(153, 204, 255));
        appointmentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Appointment Date", "Message", "Request Received By", "Status", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(appointmentsTable);

        vwDiganosisBtn.setBackground(new java.awt.Color(153, 204, 255));
        vwDiganosisBtn.setText("View Diagnosis");
        vwDiganosisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vwDiganosisBtnActionPerformed(evt);
            }
        });

        txtDiagnose.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(txtDiagnose, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(vwDiganosisBtn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vwDiganosisBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDiagnose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void vwDiganosisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vwDiganosisBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = appointmentsTable.getSelectedRow();
        String status;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }       
        WorkRequest request = (WorkRequest) appointmentsTable.getValueAt(selectedRow, 0);
      
        txtDiagnose.setText(request.getDiagnose());
    }//GEN-LAST:event_vwDiganosisBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointmentsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtDiagnose;
    private javax.swing.JButton vwDiganosisBtn;
    // End of variables declaration//GEN-END:variables
}
