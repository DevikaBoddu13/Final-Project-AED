/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Police;

import BusinessModel.Ecosystem;
import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nikhilreddypolepally
 */
public class PastInfo extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkAreaJPanel
     */
        JPanel userProcessContainer;
    Patient patient;
    Ecosystem ecoSystem;
    User account;
    public PastInfo(JPanel userProcessContainer, Ecosystem business, Patient p,User account) {
        initComponents();
        this.ecoSystem = business;
        this.userProcessContainer = userProcessContainer;
        this.patient = p;
        this.account = account;
        txtFirstName.setText(p.getpatient_FirstName());
        txtLastName.setText(p.getpatient_LastName());
        txtAddress.setText(p.getpatient_Address());
        try{
        SimpleDateFormat input =new SimpleDateFormat("yyyy-MM-dd");
        txtAge.setText((input.format(p.getpatient_Dob())));
        }
        catch(Exception e){}
        txtGender.setText(p.getpatient_Gender());
        txtHealthInsuranceID.setText(p.getpatient_HealthInsuranceID());
        txtPhoneNumber.setText(p.getpatient_MobNum());
        txtInsuranceStatus.setText(p.getpatient_LocationOfAccident());
        txtPoliceVerification.setText(p.getpatient_PoliceStatus());
        
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
        lblPatientPhone = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPatientAddress = new javax.swing.JLabel();
        txtHealthInsuranceID = new javax.swing.JTextField();
        lblPatientHealthInsuranceID = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblPatientGender = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        lblPatientFirstName = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblPatientAge = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblPatientLastName = new javax.swing.JLabel();
        txtPoliceVerification = new javax.swing.JTextField();
        lblPatientPhone1 = new javax.swing.JLabel();
        lblPatientHealthInsuranceID1 = new javax.swing.JLabel();
        txtInsuranceStatus = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Person Information");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 390, 70));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 127, 1402, 10));

        lblPatientPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setText("Phone Number");
        add(lblPatientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        txtAddress.setEditable(false);
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 150, 31));

        lblPatientAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setText("Address");
        add(lblPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        txtHealthInsuranceID.setEditable(false);
        txtHealthInsuranceID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthInsuranceIDActionPerformed(evt);
            }
        });
        add(txtHealthInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 150, 31));

        lblPatientHealthInsuranceID.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientHealthInsuranceID.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID.setText("InsuranceID");
        add(lblPatientHealthInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 128, -1));

        txtGender.setEditable(false);
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 150, 31));

        lblPatientGender.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientGender.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setText("Gender");
        add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 98, -1));

        txtPhoneNumber.setEditable(false);
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 150, 31));

        txtFirstName.setEditable(false);
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 150, 31));

        lblPatientFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setText("First Name");
        add(lblPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 116, -1));

        txtAge.setEditable(false);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 150, 31));

        lblPatientAge.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientAge.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setText("DOB");
        add(lblPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 50, -1));

        txtLastName.setEditable(false);
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 150, 31));

        lblPatientLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setText("Last Name");
        add(lblPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 116, -1));

        txtPoliceVerification.setEditable(false);
        add(txtPoliceVerification, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, 200, 40));

        lblPatientPhone1.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientPhone1.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientPhone1.setText("Police Verification");
        add(lblPatientPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, -1, -1));

        lblPatientHealthInsuranceID1.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientHealthInsuranceID1.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID1.setText("Accident Location");
        add(lblPatientHealthInsuranceID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, -1, -1));

        txtInsuranceStatus.setEditable(false);
        txtInsuranceStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsuranceStatusActionPerformed(evt);
            }
        });
        add(txtInsuranceStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 150, 31));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/back.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtHealthInsuranceIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthInsuranceIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHealthInsuranceIDActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtInsuranceStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsuranceStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInsuranceStatusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        PoliceWorkAreaJPanel bill = new PoliceWorkAreaJPanel(userProcessContainer,account,ecoSystem);
        userProcessContainer.add("Police Workarea", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPatientAddress;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientFirstName;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientHealthInsuranceID;
    private javax.swing.JLabel lblPatientHealthInsuranceID1;
    private javax.swing.JLabel lblPatientLastName;
    private javax.swing.JLabel lblPatientPhone;
    private javax.swing.JLabel lblPatientPhone1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHealthInsuranceID;
    private javax.swing.JTextField txtInsuranceStatus;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPoliceVerification;
    // End of variables declaration//GEN-END:variables
}
