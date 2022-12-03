/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Administration;

/**
 *
 * @author shriyapandita
 */
public class ManageLogistics extends javax.swing.JPanel {

    /**
     * Creates new form ManageLogistics
     */
    public ManageLogistics() {
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

        jPanel1 = new javax.swing.JPanel();
        Handler_scrollpane = new javax.swing.JScrollPane();
        handler_tbl = new javax.swing.JTable();
        Vehicle_scrollpane = new javax.swing.JScrollPane();
        Vehicle_tbl = new javax.swing.JTable();
        Handler_lbl = new javax.swing.JLabel();
        Vehicle_lbl = new javax.swing.JLabel();
        Delete_btn = new javax.swing.JButton();
        Delete1_btn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        handler_tbl.setBackground(new java.awt.Color(255, 153, 153));
        handler_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Name", "Contact", "ID"
            }
        ));
        Handler_scrollpane.setViewportView(handler_tbl);

        Vehicle_tbl.setBackground(new java.awt.Color(255, 153, 153));
        Vehicle_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Vehicle Number", "Vehicle Name", "Vehicle Type", "Description"
            }
        ));
        Vehicle_scrollpane.setViewportView(Vehicle_tbl);

        Handler_lbl.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        Handler_lbl.setText("Handler Details");

        Vehicle_lbl.setText("Vehicle Details");

        Delete_btn.setText("Delete");

        Delete1_btn.setText("Delete");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Vehicle_lbl)
                    .addComponent(Handler_lbl)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Delete1_btn)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Vehicle_scrollpane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Handler_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete_btn))))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Handler_lbl)
                .addGap(34, 34, 34)
                .addComponent(Handler_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Delete_btn)
                .addGap(2, 2, 2)
                .addComponent(Vehicle_lbl)
                .addGap(18, 18, 18)
                .addComponent(Vehicle_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Delete1_btn)
                .addContainerGap(73, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete1_btn;
    private javax.swing.JButton Delete_btn;
    private javax.swing.JLabel Handler_lbl;
    private javax.swing.JScrollPane Handler_scrollpane;
    private javax.swing.JLabel Vehicle_lbl;
    private javax.swing.JScrollPane Vehicle_scrollpane;
    private javax.swing.JTable Vehicle_tbl;
    private javax.swing.JTable handler_tbl;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}