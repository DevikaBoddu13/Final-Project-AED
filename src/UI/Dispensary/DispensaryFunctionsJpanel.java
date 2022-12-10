/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Dispensary;

import BusinessModel.Ecosystem;
import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.Pharmacy.Medicine;
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
public class DispensaryFunctionsJpanel extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Ecosystem ecosystem;
    User userAccount;
    Medicine m;
    
    public DispensaryFunctionsJpanel(JPanel userProcessContainer, User account, Ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = business;
        this.userAccount = account;
        populatetableMedicine();
        //populatePatientTable();
    }
    
        private void populatetableMedicine() {
        DefaultTableModel model = (DefaultTableModel) tableTests.getModel();

        model.setRowCount(0);

        for (Medicine t : ecosystem.getPharmacy().getmedList()) {

            
                Object[] row = new Object[4];                
                row[0] = t;
                row[1] = t.getUsage();
                row[2] =t.getQuantity();
                row[3] = t.getPrice();
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTests = new javax.swing.JTable();
        lblName2 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtUsage = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblName3 = new javax.swing.JLabel();
        dBtn = new javax.swing.JButton();
        conBtn = new javax.swing.JButton();
        upBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chemist's shop");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 220, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 139, 1328, 10));

        btnSubmit.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(51, 51, 51));
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/icons8-add-40.png"))); // NOI18N
        btnSubmit.setText("Add Medicine");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 370, 210, 40));

        tableTests.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        tableTests.getTableHeader().setFont(new java.awt.Font("Trebuchet MS", 1, 16));
        tableTests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Medicine Name", "Dosage", "Quantity", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTestsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableTests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 788, 186));

        lblName2.setBackground(new java.awt.Color(0, 0, 0));
        lblName2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblName2.setForeground(new java.awt.Color(255, 255, 255));
        lblName2.setText("Cost");
        add(lblName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 80, 30));

        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 150, 30));
        add(txtUsage, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 170, 30));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 200, 30));

        lblName.setBackground(new java.awt.Color(51, 51, 51));
        lblName.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Medicine Name");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, 30));

        lblName1.setBackground(new java.awt.Color(0, 0, 0));
        lblName1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblName1.setForeground(new java.awt.Color(255, 255, 255));
        lblName1.setText("Dosage");
        add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 80, 30));

        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantityKeyReleased(evt);
            }
        });
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 453, 160, 30));

        lblName3.setBackground(new java.awt.Color(0, 0, 0));
        lblName3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblName3.setForeground(new java.awt.Color(255, 255, 255));
        lblName3.setText("Quantity");
        add(lblName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, 30));

        dBtn.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        dBtn.setForeground(new java.awt.Color(51, 51, 51));
        dBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/icons8-remove-40.png"))); // NOI18N
        dBtn.setText("Delete");
        dBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBtnActionPerformed(evt);
            }
        });
        add(dBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 440, 210, 40));

        conBtn.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        conBtn.setForeground(new java.awt.Color(51, 51, 51));
        conBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/icons8-save-40.png"))); // NOI18N
        conBtn.setText("Save Update");
        conBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conBtnActionPerformed(evt);
            }
        });
        add(conBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 290, 200, 43));

        upBtn.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        upBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/icons8-update-40.png"))); // NOI18N
        upBtn.setText("Update");
        upBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upBtnActionPerformed(evt);
            }
        });
        add(upBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 220, 200, 40));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 213, 32));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 213, 32));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/back.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/dispensary.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 100));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 80, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        if (txtName.getText().equals("") || txtUsage.getText().equals("")|| txtPrice.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all the details");
        } else {
            Medicine m = new Medicine();
            m.setMedName(txtName.getText());
            m.setQuantity(Integer.parseInt(txtQuantity.getText()));
            m.setUsage(txtUsage.getText());
            m.setPrice(Integer.parseInt(txtPrice.getText()));
            ecosystem.getPharmacy().createMedicine(m);

            populatetableMedicine();

        }

        txtName.setText("");
        txtUsage.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void dBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableTests.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Delete Medicine: "+tableTests.getValueAt(selectedRow, 0)+" ??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){

                Medicine p = (Medicine) tableTests.getValueAt(selectedRow, 0);
                ecosystem.getPharmacy().deleteMed(p);
                populatetableMedicine();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Select a Customer to delete!");
        }
    }//GEN-LAST:event_dBtnActionPerformed

    private void conBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conBtnActionPerformed
        // TODO add your handling code here:

        String name = txtName.getText();
        String uname=txtUsage.getText();
        String password=txtPrice.getText();
        String quantity= txtQuantity.getText();
        if(name.equalsIgnoreCase("")||uname.equalsIgnoreCase("")||password.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Pls, Fill data Correctly!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            ecosystem.getPharmacy().updateMeds(m,name,uname,Integer.parseInt(password),Integer.parseInt(quantity));
            populatetableMedicine();
        }
        txtName.setText("");
        txtUsage.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
    }//GEN-LAST:event_conBtnActionPerformed

    private void upBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableTests.getSelectedRow();
        //Tests p = (Tests) tableTests.getValueAt(selectedRow, 0);
        if(selectedRow>=0){
            m = (Medicine) tableTests.getValueAt(selectedRow, 0);
            txtName.setText(m.getMedName());
            txtUsage.setText(m.getUsage());
            txtPrice.setText(Integer.toString(m.getPrice()));
            txtQuantity.setText(Integer.toString(m.getQuantity()));
             //system.getUserAccountDirectory().deleteUserAccount(user);

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
    }//GEN-LAST:event_upBtnActionPerformed

    private void txtQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,10}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtQuantity.getText());
        if (!match.matches() )
        {
            jLabel2.setText("Please input correct data. HINT: number");
        } else 
        {
            jLabel2.setText(null);
        }
    }//GEN-LAST:event_txtQuantityKeyReleased

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
        // TODO add your handling code here:
         String PATTERN = "^[0-9]{0,10}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtPrice.getText());
        if (!match.matches() )
        {
            jLabel3.setText("Please input correct data. HINT: number");
        } 
        else 
        {
            jLabel3.setText(null);
        }
    }//GEN-LAST:event_txtPriceKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //patient.setInsuranceStatus("Approved");
        DispensaryWorkSpaceJPanel bill = new DispensaryWorkSpaceJPanel(userProcessContainer, userAccount, ecosystem);
        userProcessContainer.add("Insurance main", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableTestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTestsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableTestsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton conBtn;
    private javax.swing.JButton dBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JTable tableTests;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtUsage;
    private javax.swing.JButton upBtn;
    // End of variables declaration//GEN-END:variables
}
