/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Lab;

import BusinessModel.Ecosystem;
import BusinessModel.Patient.PatientBills;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kshama
 */
public class LabTestsRequested extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
    Patient p;
    JPanel userProcessContainer;
    User account;
    Ecosystem ecoSystem;
    public LabTestsRequested(JPanel userProcessContainer, User account, Patient p,Ecosystem ecoSystem) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.p = p;
        populateBillTable();
        jLabel3.setText("Customer Name: "+p.getpatient_FirstName()+" "+p.getpatient_LastName());
       
    }
        private void populateBillTable() {
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();

        model.setRowCount(0);

        for (PatientBills b : p.getpatient_bills()) {

            Object[] row = new Object[6];
            row[0] = b.getName();
            row[1] = b.getOrgType();
            row[2] = b.getAmount();
            row[3] = b.getStatus();
            row[4] = b.getResult();
            row[5] = b;
            if(row[1].equals("Lab")&&row[3].equals("Requested")){
            model.addRow(row);
            }

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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtResult = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 510, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 79, 1517, 10));

        BillTable.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        BillTable.getTableHeader().setFont(new java.awt.Font("Trebuchet MS", 1, 16));
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item Name", "Organization", "Amount", "Status", "Result", "Object"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BillTable);
        if (BillTable.getColumnModel().getColumnCount() > 0) {
            BillTable.getColumnModel().getColumn(5).setMinWidth(0);
            BillTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            BillTable.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 141, 1000, 171));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/icons8-update-40.png"))); // NOI18N
        jButton1.setText("Update Result");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 180, 30));

        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });
        add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 250, 60));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/back.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 50));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 94, 380, 36));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = BillTable.getSelectedRow();
        if(txtResult.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Please Enter Result!!", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        else{
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            } 
            else {
                for(PatientBills b: p.getpatient_bills()){
                    if(b==((PatientBills) BillTable.getValueAt(selectedRowIndex, 5))){
                        
                        b.setStatus("Delivered");
                        b.setResult(txtResult.getText());
                        JOptionPane.showMessageDialog(null, "Results Sent!!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        populateBillTable();
                        
                        break;
                    }
                    
                    
                }
                if(BillTable.getRowCount()==0){
                        p.setpatient_LabStatus("Delivered");
                        
                        LabWorkSpaceJPanel doctorRequestLabTestJPanel = new LabWorkSpaceJPanel(userProcessContainer, account,ecoSystem);
                        userProcessContainer.add("Request Lab Tests", doctorRequestLabTestJPanel);
                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                        layout.next(userProcessContainer);
                }
                
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //patient.setInsuranceStatus("Approved");
        LabWorkSpaceJPanel bill = new LabWorkSpaceJPanel(userProcessContainer, account, ecoSystem);
        userProcessContainer.add("Insurance main", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
