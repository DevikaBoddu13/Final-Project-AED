/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Lab;

import BusinessModel.Ecosystem;
import BusinessModel.Lab.Tests;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kshama
 */
public class LabFunctions extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Ecosystem ecosystem;
    private User userAccount;
    private Tests t;

    public LabFunctions(JPanel userProcessContainer, User account, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = business;
        this.userAccount = account;
        populatetableTests();

    }

    private void populatetableTests() {
        DefaultTableModel model = (DefaultTableModel) tableTests.getModel();

        model.setRowCount(0);

        for (Tests t : ecosystem.getLab().getTestList()) {

            Object[] row = new Object[3];
            row[0] = t;
            row[1] = t.getUsage();
            row[2] = t.getPrice();
            model.addRow(row);

        }
    }

    private void txtTelephoneNumberKeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:

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
        tableTests = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUsage = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        dBtn4 = new javax.swing.JButton();
        upBtn = new javax.swing.JButton();
        conBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Laboratory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 150, 44));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1390, 10));

        tableTests.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tableTests.getTableHeader().setFont(new java.awt.Font("Trebuchet MS", 1, 16));
        tableTests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Test Name", "Test Usage", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableTests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 860, 270));

        lblName.setBackground(new java.awt.Color(0, 0, 0));
        lblName.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Test Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, -1, 30));

        lblName1.setBackground(new java.awt.Color(0, 0, 0));
        lblName1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblName1.setForeground(new java.awt.Color(255, 255, 255));
        lblName1.setText("Usage");
        add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, -1, 30));

        lblName2.setBackground(new java.awt.Color(0, 0, 0));
        lblName2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblName2.setForeground(new java.awt.Color(255, 255, 255));
        lblName2.setText("Price");
        add(lblName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 520, 60, 30));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 260, 40));
        add(txtUsage, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 260, 40));

        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 560, 260, 40));

        btnSubmit.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(202, 97, 71));
        btnSubmit.setText("Add Test");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 640, 160, 40));

        dBtn4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        dBtn4.setForeground(new java.awt.Color(202, 97, 71));
        dBtn4.setText("Delete");
        dBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBtn4ActionPerformed(evt);
            }
        });
        add(dBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 640, 160, 40));

        upBtn.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        upBtn.setForeground(new java.awt.Color(202, 97, 71));
        upBtn.setText("Update");
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
            }
        });
        add(upBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 640, 160, 40));

        conBtn.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        conBtn.setForeground(new java.awt.Color(202, 97, 71));
        conBtn.setText("Save Update");
        conBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conBtnActionPerformed(evt);
            }
        });
        add(conBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 640, 160, 40));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 490, 120, 32));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/icons8-back-arrow-40.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/icons8-lab-50.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 60, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        if (txtName.getText().equals("") || txtUsage.getText().equals("") || txtPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the details");

        } else {
            Tests t = new Tests();
            t.setTestName(txtName.getText());
            t.setUsage(txtUsage.getText());
            t.setPrice(Integer.parseInt(txtPrice.getText()));
            ecosystem.getLab().createTest(t);

            populatetableTests();

        }

        txtName.setText("");
        txtUsage.setText("");
        txtPrice.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void dBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBtn4ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableTests.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Delete Test: " + tableTests.getValueAt(selectedRow, 0) + " ??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {

                Tests p = (Tests) tableTests.getValueAt(selectedRow, 0);

                ecosystem.getLab().deleteTests(p);
                populatetableTests();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Row!");
        }
    }//GEN-LAST:event_dBtn4ActionPerformed

    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableTests.getSelectedRow();
        //Tests p = (Tests) tableTests.getValueAt(selectedRow, 0);
        if (selectedRow >= 0) {
            t = (Tests) tableTests.getValueAt(selectedRow, 0);
            txtName.setText(t.getTestName());
            txtUsage.setText(t.getUsage());
            txtPrice.setText(Integer.toString(t.getPrice()));
            // system.getUserAccountDirectory().deleteUserAccount(user);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
    }//GEN-LAST:event_upBtnActionPerformed

    private void conBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conBtnActionPerformed
        // TODO add your handling code here:

        String name = txtName.getText();
        String uname = txtUsage.getText();
        String password = txtPrice.getText();
        if (name.equalsIgnoreCase("") || uname.equalsIgnoreCase("") || password.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Pls, Fill data Correctly!!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            ecosystem.getLab().updateTests(t, name, uname, Integer.parseInt(password));
            populatetableTests();
        }
        txtName.setText("");
        txtUsage.setText("");
        txtPrice.setText("");
    }//GEN-LAST:event_conBtnActionPerformed

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,10}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtPrice.getText());
        if (!match.matches() )
        {
            jLabel2.setText("Wrong Input. Please Try Again.");
        } else {
            jLabel2.setText(null);
        }
    }//GEN-LAST:event_txtPriceKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //patient.setInsuranceStatus("Approved");
        LabWorkSpaceJPanel bill = new LabWorkSpaceJPanel(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("Insurance main", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton conBtn;
    private javax.swing.JButton dBtn4;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JTable tableTests;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtUsage;
    private javax.swing.JButton upBtn;
    // End of variables declaration//GEN-END:variables
}
