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
public class InsurancePastCustomers extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;
    public InsurancePastCustomers(JPanel userProcessContainer, User account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.userAccount = account;
        
        populatePatientTable1();
        
    }
          
private void populatePatientTable1() {
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();

        model.setRowCount(0);

        for (Patient patient : ecoSystem.getInsuranceDirectory().getInsuranceRecord()) {

            Object[] row = new Object[7];
            row[0] = patient.getpatient_FirstName();
            row[1] = patient.getpatient_LastName();
            row[2] = Float.toString(ecoSystem.getPatientDirectory().billTotal(patient));
            row[3] = patient.getpatient_HealthInsuranceID();
            row[6] = patient.getpatient_InsuranceStatus();
            row[5] = patient.getpatient_PoliceStatus();
            row[4] = patient.getpatient_EmailAddress();
            row[5] = patient;
            if(!patient.getpatient_InsuranceStatus().equals("Verifying Insurance")){
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
        jScrollPane4 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        viewDtlsBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insurer");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 530, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 126, 1400, 10));

        patientTable.getTableHeader().setFont(new java.awt.Font("Trebuchet MS", 1, 16));
        patientTable.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(patientTable);
        if (patientTable.getColumnModel().getColumnCount() > 0) {
            patientTable.getColumnModel().getColumn(7).setMinWidth(0);
            patientTable.getColumnModel().getColumn(7).setPreferredWidth(0);
            patientTable.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 990, 200));

        viewDtlsBtn.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        viewDtlsBtn.setForeground(new java.awt.Color(202, 97, 71));
        viewDtlsBtn.setText("View Details");
        viewDtlsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDtlsBtnActionPerformed(evt);
            }
        });
        add(viewDtlsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 470, 210, 50));

        backBtn.setBackground(new java.awt.Color(0, 102, 102));
        backBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 102, 102));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/back.png"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void viewDtlsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDtlsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{

            Patient d = (Patient) patientTable.getValueAt(selectedRow, 5);
            //d.get
            PastCustomerInfo bill = new PastCustomerInfo(userProcessContainer,ecoSystem, d, userAccount);
            userProcessContainer.add("Past Customer", bill);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_viewDtlsBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        //patient.setInsuranceStatus("Approved");
        InsuranceWorkAreaJPanel bill = new InsuranceWorkAreaJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Insurance main", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton viewDtlsBtn;
    // End of variables declaration//GEN-END:variables
}
