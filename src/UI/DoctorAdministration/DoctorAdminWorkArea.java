/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DoctorAdministration;

import BusinessModel.Doctor.Doctor;
import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author podda
 */
public class DoctorAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form DoctorAdminWorkArea
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;

    public DoctorAdminWorkArea(JPanel userProcessContainer, User account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.userAccount = account;
        populateNetworkTable();
        populatePatientTable();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) DoctorTable.getModel();

        model.setRowCount(0);

        for (Doctor Doctor : ecoSystem.getDoctorDirectory().getDoctors()) {

            Object[] row = new Object[9];
            row[0] = Doctor.getDoctor_FirstName();
            row[1] = Doctor.getDoctor_LastName();
            row[2] = Doctor.getDoc_ID();
            row[3] = Doctor.getDoc_Experience();
            row[4] = Doctor.getDoc_Age();
            row[5] = Doctor.getDoc_Gender();
            row[6] = Doctor.getDoc_Mail();
            row[7] = Doctor;
            model.addRow(row);

        }
    }

    private void populatePatientTable() {
        DefaultTableModel model = (DefaultTableModel) PatientTable.getModel();

        model.setRowCount(0);

        for (Patient patient : ecoSystem.getPatientDirectory().getPatientList()) {

            Object[] row = new Object[8];
            row[0] = patient.getpatient_FirstName();
            row[1] = patient.getpatient_LastName();
            row[2] = patient.getpatient_TypeOfInjury();
            row[3] = patient.getpatient_BloodType();
            row[4] = patient.getpatient_Age();
            row[5] = patient.getpatient_Gender();
            row[6] = patient.getpatient_EmailAddress();
            row[7] = patient;
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

        lblManageCustomers = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DoctorTable = new javax.swing.JTable();
        btnCreateDoctor = new javax.swing.JButton();
        upBtn = new javax.swing.JButton();
        dBtn4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAssignDoctor1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(1227, 722));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageCustomers.setBackground(new java.awt.Color(255, 255, 255));
        lblManageCustomers.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblManageCustomers.setForeground(new java.awt.Color(255, 255, 255));
        lblManageCustomers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageCustomers.setText("Assign Patients to Doctors");
        add(lblManageCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 720, -1));

        DoctorTable.getTableHeader().setFont(new java.awt.Font("Trebuchet MS", 1, 16));
        DoctorTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        DoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Health ID", "Experience", "Age", "Gender", "Email", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DoctorTable);
        if (DoctorTable.getColumnModel().getColumnCount() > 0) {
            DoctorTable.getColumnModel().getColumn(7).setMinWidth(0);
            DoctorTable.getColumnModel().getColumn(7).setPreferredWidth(0);
            DoctorTable.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 850, 191));

        btnCreateDoctor.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnCreateDoctor.setForeground(new java.awt.Color(202, 97, 71));
        btnCreateDoctor.setText("Create");
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });
        add(btnCreateDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 120, 30));

        upBtn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        upBtn.setForeground(new java.awt.Color(202, 97, 71));
        upBtn.setText("Update");
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
            }
        });
        add(upBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, 130, -1));

        dBtn4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        dBtn4.setForeground(new java.awt.Color(202, 97, 71));
        dBtn4.setText("Delete");
        dBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBtn4ActionPerformed(evt);
            }
        });
        add(dBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 590, 120, -1));

        PatientTable.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        PatientTable.getTableHeader().setFont(new java.awt.Font("Trebuchet MS", 1, 16));
        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Injury", "Blood Type", "Age", "Gender", "Email", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(PatientTable);
        if (PatientTable.getColumnModel().getColumnCount() > 0) {
            PatientTable.getColumnModel().getColumn(7).setMinWidth(0);
            PatientTable.getColumnModel().getColumn(7).setPreferredWidth(0);
            PatientTable.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 850, 193));

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patients");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 160, 40));

        btnAssignDoctor1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnAssignDoctor1.setForeground(new java.awt.Color(202, 97, 71));
        btnAssignDoctor1.setText("Assign Doctor");
        btnAssignDoctor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDoctor1ActionPerformed(evt);
            }
        });
        add(btnAssignDoctor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 150, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Doctors");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
        CreateDoctorJPanel createDoctor = new CreateDoctorJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Add Doctor", createDoctor);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = DoctorTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Doctor d = (Doctor) DoctorTable.getValueAt(selectedRow, 7);
            UpdateDoctorJPanel updateDoc = new UpdateDoctorJPanel(userProcessContainer, userAccount, ecoSystem, d);
            userProcessContainer.add("Update Doctor", updateDoc);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_upBtnActionPerformed

    private void dBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBtn4ActionPerformed
        // TODO add your handling code here:
        int selectedRow = DoctorTable.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Delete Doctor: " + DoctorTable.getValueAt(selectedRow, 7) + " ??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {

                Doctor p = (Doctor) DoctorTable.getValueAt(selectedRow, 7);

                ecoSystem.getDoctorDirectory().deleteDoc(p);
                populateNetworkTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Patient");
        }
    }//GEN-LAST:event_dBtn4ActionPerformed

    private void btnAssignDoctor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDoctor1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = PatientTable.getSelectedRow();
        if (selectedRowIndex < 0) 
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        else 
        {
            Patient patient = (Patient) PatientTable.getValueAt(selectedRowIndex, 7);
            DisplayPatientInfoJPanel displayPatientInfoJPanel = new DisplayPatientInfoJPanel(userProcessContainer, userAccount, ecoSystem, patient);
            userProcessContainer.add("Display Patient", displayPatientInfoJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnAssignDoctor1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DoctorTable;
    private javax.swing.JTable PatientTable;
    private javax.swing.JButton btnAssignDoctor1;
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton dBtn4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblManageCustomers;
    private javax.swing.JButton upBtn;
    // End of variables declaration//GEN-END:variables
}
