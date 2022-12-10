/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.InsuranceAuthority;

import BusinessModel.Ecosystem;
import BusinessModel.Patient.PatientBills;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import UI.Patient.PatientInvoiceJPanel;

/**
 *
 * @author nikhilreddypolepally
 */
public class InsuranceWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;
    public InsuranceWorkAreaJPanel(JPanel userProcessContainer, User account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.userAccount = account;
        populatePatientTable();
        
        
    }
          private void populatePatientTable() {
        DefaultTableModel model = (DefaultTableModel) PatientTbl.getModel();

        model.setRowCount(0);

        for (Patient patient : ecoSystem.getInsuranceDirectory().getInsuranceRecord()) {

            Object[] row = new Object[8];
            row[0] = patient.getpatient_FirstName();
            row[1] = patient.getpatient_LastName();
            row[2] = Float.toString(ecoSystem.getPatientDirectory().billTotal(patient));
            row[3] = patient.getpatient_HealthInsuranceID();
            row[4] = patient.getpatient_EmailAddress();
            row[5] = patient.getpatient_PoliceStatus();
            row[6] = patient.getpatient_InsuranceStatus();
            row[7] = patient;
            if(patient.getpatient_InsuranceStatus().equals("Verifying Insurance")){
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
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        PatientTbl = new javax.swing.JTable();
        recBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insurer");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-480, 50, 1380, -1));

        jButton1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 204));
        jButton1.setText("View Details");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 220, 80));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 126, 1380, 10));

        PatientTbl.getTableHeader().setFont(new java.awt.Font("Trebuchet MS", 1, 16));
        PatientTbl.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        PatientTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Last", "Bill Total", "HealthId", "Email", "Police Verification", "Insurance Status", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(PatientTbl);
        if (PatientTbl.getColumnModel().getColumnCount() > 0) {
            PatientTbl.getColumnModel().getColumn(7).setMinWidth(0);
            PatientTbl.getColumnModel().getColumn(7).setPreferredWidth(0);
            PatientTbl.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 980, 260));

        recBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        recBtn.setForeground(new java.awt.Color(0, 153, 204));
        recBtn.setText("View Past Records");
        recBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recBtnActionPerformed(evt);
            }
        });
        add(recBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 220, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = PatientTbl.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            
            Patient d = (Patient) PatientTbl.getValueAt(selectedRow, 7);
            //d.get
            CustomerInfo bill = new CustomerInfo(userProcessContainer,ecoSystem, d, userAccount);
            userProcessContainer.add("Customer Bill", bill);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
                   
          
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void recBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recBtnActionPerformed
        // TODO add your handling code here:
            InsurancePastCustomers bill = new InsurancePastCustomers(userProcessContainer, userAccount,ecoSystem);
            userProcessContainer.add("Past Customers", bill);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_recBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PatientTbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton recBtn;
    // End of variables declaration//GEN-END:variables
}