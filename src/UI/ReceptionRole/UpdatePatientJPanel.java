/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ReceptionRole;

import BusinessModel.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author nikhilreddypolepally
 */
public class UpdatePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatientPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;
    Patient patient;

    public UpdatePatientJPanel(JPanel userProcessContainer, Ecosystem system, User user, Patient patient) {
        initComponents();
        this.userAccount = user;
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.patient = patient;

        GenderComboBox.removeAllItems();
        GenderComboBox.addItem("Male");
        GenderComboBox.addItem("Female");
        GenderComboBox.addItem("Other");

        BloodGroupComboBox.removeAllItems();
        BloodGroupComboBox.addItem("A+");
        BloodGroupComboBox.addItem("A-");
        BloodGroupComboBox.addItem("B+");
        BloodGroupComboBox.addItem("B-");
        BloodGroupComboBox.addItem("O+");
        BloodGroupComboBox.addItem("O-");
        BloodGroupComboBox.addItem("AB+");
        BloodGroupComboBox.addItem("AB-");

        txtAddress.setText(patient.getpatient_Address());
        BloodGroupComboBox.setSelectedItem(patient.getpatient_BloodType());
        txtDOB.setDate(patient.getpatient_Dob());
        txtEmail.setText(patient.getpatient_EmailAddress());
        txtFirstName.setText(patient.getpatient_FirstName());
        GenderComboBox.setSelectedItem(patient.getpatient_Gender());
        txtHealthInsuranceID.setText(patient.getpatient_HealthInsuranceID());
        txtInjuryType.setText(patient.getpatient_TypeOfInjury());
        txtLastName.setText(patient.getpatient_LastName());
        txtPhoneNumber.setText(patient.getpatient_MobNum());
        txtUserName.setText(patient.getpatient_UserName());
        txtAccidentLocation.setText(patient.getpatient_LocationOfAccident());
        if (patient.getpatient_InsuranceStatus() != null) {
            if (patient.getpatient_InsuranceStatus().equals("Insurance")) {
                jRadioInsurance.setSelected(true);
                jRadioCash.setSelected(false);
            } else {
                jRadioCash.setSelected(true);
                jRadioInsurance.setSelected(false);
            }
        }
        ImageIcon ii = new ImageIcon(patient.getpatient_PictureUrl());
        Image image = ii.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        lblPhotoImage.setIcon(new ImageIcon(image));

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPatientFirstName = new javax.swing.JLabel();
        lblUpdatePatient = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblPatientLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblPatientGender = new javax.swing.JLabel();
        lblPatientHealthInsuranceID = new javax.swing.JLabel();
        txtHealthInsuranceID = new javax.swing.JTextField();
        lblPatientAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPatientPhone = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblAddress4 = new javax.swing.JLabel();
        txtInjuryType = new javax.swing.JTextField();
        lblPhoneNumber4 = new javax.swing.JLabel();
        lblRestaurantName4 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jRadioCash = new javax.swing.JRadioButton();
        jRadioInsurance = new javax.swing.JRadioButton();
        btnBrowse = new javax.swing.JButton();
        lblPhotoImage = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblPaymentMethod = new javax.swing.JLabel();
        GenderComboBox = new javax.swing.JComboBox<>();
        BloodGroupComboBox = new javax.swing.JComboBox<>();
        lblAccidentLocation = new javax.swing.JLabel();
        txtAccidentLocation = new javax.swing.JTextField();
        txtDOB = new com.toedter.calendar.JDateChooser();
        lblErrorLname = new javax.swing.JLabel();
        lblErrorFname = new javax.swing.JLabel();
        lblErrorHId = new javax.swing.JLabel();
        lblErrorPhone = new javax.swing.JLabel();
        lblErrorAddress = new javax.swing.JLabel();
        lblErrorEmail = new javax.swing.JLabel();
        lblErrorInjury = new javax.swing.JLabel();
        lblErrorUserName = new javax.swing.JLabel();
        lblErrorAccidentLocation = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSubmit1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPatientFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setText("First Name");
        add(lblPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        lblUpdatePatient.setBackground(new java.awt.Color(255, 255, 255));
        lblUpdatePatient.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblUpdatePatient.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdatePatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdatePatient.setText("Update Patient Details");
        add(lblUpdatePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 320, 60));

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyReleased(evt);
            }
        });
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 40));

        lblPatientLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setText("Last Name");
        add(lblPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNameKeyReleased(evt);
            }
        });
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 190, 40));

        lblPatientGender.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientGender.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setText("Gender");
        add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        lblPatientHealthInsuranceID.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientHealthInsuranceID.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID.setText("Insurance Id");
        add(lblPatientHealthInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        txtHealthInsuranceID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthInsuranceIDActionPerformed(evt);
            }
        });
        txtHealthInsuranceID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHealthInsuranceIDKeyReleased(evt);
            }
        });
        add(txtHealthInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 210, 40));

        lblPatientAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        lblPatientAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setText("Address");
        add(lblPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 90, 40));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 940, 40));

        lblPatientPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setText("Mobile Number");
        add(lblPatientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 30));

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 190, 40));

        lblDOB.setBackground(new java.awt.Color(255, 255, 255));
        lblDOB.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB.setText("Date of Birth");
        add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email Address");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 200, 40));

        lblAddress4.setBackground(new java.awt.Color(255, 255, 255));
        lblAddress4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblAddress4.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress4.setText("Blood Group");
        add(lblAddress4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, -1, -1));

        txtInjuryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInjuryTypeActionPerformed(evt);
            }
        });
        txtInjuryType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInjuryTypeKeyReleased(evt);
            }
        });
        add(txtInjuryType, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 210, 40));

        lblPhoneNumber4.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPhoneNumber4.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber4.setText("Injury Type");
        add(lblPhoneNumber4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, -1));

        lblRestaurantName4.setBackground(new java.awt.Color(255, 255, 255));
        lblRestaurantName4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblRestaurantName4.setForeground(new java.awt.Color(255, 255, 255));
        lblRestaurantName4.setText("UserName");
        add(lblRestaurantName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, -1, -1));

        txtUserName.setEditable(false);
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 180, 40));

        btnSubmit.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(202, 97, 71));
        btnSubmit.setText("Update");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 490, 130, 40));

        jRadioCash.setBackground(new java.awt.Color(255, 255, 255));
        jRadioCash.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jRadioCash.setForeground(new java.awt.Color(202, 97, 71));
        jRadioCash.setText(" Cash ");
        jRadioCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioCashActionPerformed(evt);
            }
        });
        add(jRadioCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 291, 80, 30));

        jRadioInsurance.setBackground(new java.awt.Color(255, 255, 255));
        jRadioInsurance.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jRadioInsurance.setForeground(new java.awt.Color(202, 97, 71));
        jRadioInsurance.setText("Insurance ");
        jRadioInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioInsuranceActionPerformed(evt);
            }
        });
        add(jRadioInsurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, -1, 30));

        btnBrowse.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnBrowse.setForeground(new java.awt.Color(202, 97, 71));
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });
        add(btnBrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 170, 120, 40));
        add(lblPhotoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 250, 170, 160));

        lblPhoto.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoto.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPhoto.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoto.setText("Picture");
        add(lblPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, -1, -1));

        lblPaymentMethod.setBackground(new java.awt.Color(255, 255, 255));
        lblPaymentMethod.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPaymentMethod.setForeground(new java.awt.Color(255, 255, 255));
        lblPaymentMethod.setText("Payment ");
        add(lblPaymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, -1, -1));

        GenderComboBox.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        GenderComboBox.setForeground(new java.awt.Color(202, 97, 71));
        GenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        GenderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderComboBoxActionPerformed(evt);
            }
        });
        add(GenderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 220, 40));

        BloodGroupComboBox.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BloodGroupComboBox.setForeground(new java.awt.Color(202, 97, 71));
        BloodGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        BloodGroupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodGroupComboBoxActionPerformed(evt);
            }
        });
        add(BloodGroupComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, 180, 30));

        lblAccidentLocation.setBackground(new java.awt.Color(255, 255, 255));
        lblAccidentLocation.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblAccidentLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblAccidentLocation.setText("Accident Location");
        add(lblAccidentLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 180, 20));

        txtAccidentLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccidentLocationActionPerformed(evt);
            }
        });
        add(txtAccidentLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 210, 40));
        add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 210, 40));

        lblErrorLname.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorLname.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 140, 30));

        lblErrorFname.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorFname.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 150, 26));

        lblErrorHId.setFont(new java.awt.Font("Lucida Grande", 3, 10)); // NOI18N
        lblErrorHId.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorHId, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 146, 20));

        lblErrorPhone.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorPhone.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 150, 26));

        lblErrorAddress.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorAddress.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 148, 26));

        lblErrorEmail.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorEmail.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 150, 26));

        lblErrorInjury.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorInjury.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorInjury, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 150, 26));

        lblErrorUserName.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorUserName.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, 150, 26));

        lblErrorAccidentLocation.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorAccidentLocation.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorAccidentLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 130, 26));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1300, 10));

        btnSubmit1.setBackground(new java.awt.Color(51, 51, 51));
        btnSubmit1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnSubmit1.setForeground(new java.awt.Color(51, 51, 51));
        btnSubmit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/back.png"))); // NOI18N
        btnSubmit1.setBorder(null);
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });
        add(btnSubmit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, 46));
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtHealthInsuranceIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthInsuranceIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHealthInsuranceIDActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtInjuryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInjuryTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInjuryTypeActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if ((lblErrorFname.getText() == null || lblErrorFname.getText().equals(""))
                && (lblErrorLname.getText() == null || lblErrorLname.getText().equals(""))
                && (lblErrorAddress.getText() == null || lblErrorAddress.getText().equals(""))
                && (lblErrorEmail.getText() == null || lblErrorEmail.getText().equals(""))
                && (lblErrorHId.getText() == null || lblErrorHId.getText().equals(""))
                && (lblErrorInjury.getText() == null || lblErrorInjury.getText().equals(""))
                && (lblErrorPhone.getText() == null || lblErrorPhone.getText().equals(""))
                && (lblErrorUserName.getText() == null || lblErrorUserName.getText().equals(""))) {
            patient.setpatient_FirstName(txtFirstName.getText());
            patient.setpatient_LastName(txtLastName.getText());
            patient.setpatient_Age(CalculateAge(txtDOB.getDate(), java.util.Calendar.getInstance().getTime()));
            patient.setpatient_Gender((String) GenderComboBox.getSelectedItem());
            patient.setpatient_HealthInsuranceID(txtHealthInsuranceID.getText());
            patient.setpatient_Address(txtAddress.getText());
            patient.setpatient_MobNum(txtPhoneNumber.getText());
            patient.setpatient_EmailAddress(txtEmail.getText());
            patient.setpatient_Dob(txtDOB.getDate());
            patient.setpatient_TypeOfInjury(txtInjuryType.getText());
            patient.setpatient_BloodType((String) BloodGroupComboBox.getSelectedItem());
            patient.setpatient_UserName(txtUserName.getText());
            patient.setpatient_LocationOfAccident(txtAccidentLocation.getText());
            if (jRadioInsurance.isSelected()) {
                patient.setpatient_InsuranceStatus("Insurance");
            } else {
                patient.setpatient_InsuranceStatus("Cash");
            }
            JOptionPane.showMessageDialog(null, "Update Complete.");

            ReceptionWorkAreaJPanel receptionWorkAreaJPanel = new ReceptionWorkAreaJPanel(userProcessContainer, userAccount, ecoSystem);
            userProcessContainer.add("Reception Work Area", receptionWorkAreaJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Username is not Unique and Please Fill Correct Details");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jRadioCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioCashActionPerformed
        // TODO add your handling code here:
        jRadioCash.setSelected(true);
        jRadioInsurance.setSelected(false);
    }//GEN-LAST:event_jRadioCashActionPerformed

    private void jRadioInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioInsuranceActionPerformed
        // TODO add your handling code here:
        jRadioCash.setSelected(false);
        jRadioInsurance.setSelected(true);
    }//GEN-LAST:event_jRadioInsuranceActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        //Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);

        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);
            //Display image on jlable
            patient.setpatient_PictureUrl(selectedImagePath);

            ImageIcon ii = new ImageIcon(selectedImagePath);
            //Resize image to fit jlabel
            Image image = ii.getImage().getScaledInstance(lblPhotoImage.getWidth(), lblPhotoImage.getHeight(), Image.SCALE_SMOOTH);
            lblPhotoImage.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void GenderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderComboBoxActionPerformed

    private void BloodGroupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodGroupComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodGroupComboBoxActionPerformed

    private void txtFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtFirstName.getText());
        if (!match.matches()) {
            lblErrorFname.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorFname.setText(null);
        }
    }//GEN-LAST:event_txtFirstNameKeyReleased

    private void txtLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtLastName.getText());
        if (!match.matches()) {
            lblErrorLname.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorLname.setText(null);
        }
    }//GEN-LAST:event_txtLastNameKeyReleased

    private void txtInjuryTypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInjuryTypeKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtInjuryType.getText());
        if (!match.matches()) {
            lblErrorInjury.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorInjury.setText(null);
        }
    }//GEN-LAST:event_txtInjuryTypeKeyReleased

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtUserName.getText());
        if (!match.matches()) {
            lblErrorUserName.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorUserName.setText(null);
        }
    }//GEN-LAST:event_txtUserNameKeyReleased

    private void txtHealthInsuranceIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHealthInsuranceIDKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9 '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtHealthInsuranceID.getText());
        if (!match.matches()) {
            lblErrorHId.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorHId.setText(null);
        }
    }//GEN-LAST:event_txtHealthInsuranceIDKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9 '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtAddress.getText());
        if (!match.matches()) {
            lblErrorAddress.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorAddress.setText(null);
        }
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9 +()-]{10,18}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtPhoneNumber.getText());
        if (!match.matches()) {
            lblErrorPhone.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorPhone.setText(null);
        }
    }//GEN-LAST:event_txtPhoneNumberKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtEmail.getText());
        if (!match.matches()) {
            lblErrorEmail.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorEmail.setText(null);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtAccidentLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccidentLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccidentLocationActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
        // TODO add your handling code here:
        ReceptionWorkAreaJPanel patientBillJPanel = new ReceptionWorkAreaJPanel(userProcessContainer,userAccount,ecoSystem);
        userProcessContainer.add("Patient Bill", patientBillJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSubmit1ActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    public int CalculateAge(Date birthDate, Date currentDate) {
        // validate inputs ...                                                                               
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(birthDate));
        int d2 = Integer.parseInt(formatter.format(currentDate));
        int age = (d2 - d1) / 10000;
        return age;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BloodGroupComboBox;
    private javax.swing.JComboBox<String> GenderComboBox;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JRadioButton jRadioCash;
    private javax.swing.JRadioButton jRadioInsurance;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAccidentLocation;
    private javax.swing.JLabel lblAddress4;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblErrorAccidentLocation;
    private javax.swing.JLabel lblErrorAddress;
    private javax.swing.JLabel lblErrorEmail;
    private javax.swing.JLabel lblErrorFname;
    private javax.swing.JLabel lblErrorHId;
    private javax.swing.JLabel lblErrorInjury;
    private javax.swing.JLabel lblErrorLname;
    private javax.swing.JLabel lblErrorPhone;
    private javax.swing.JLabel lblErrorUserName;
    private javax.swing.JLabel lblPatientAddress;
    private javax.swing.JLabel lblPatientFirstName;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientHealthInsuranceID;
    private javax.swing.JLabel lblPatientLastName;
    private javax.swing.JLabel lblPatientPhone;
    private javax.swing.JLabel lblPaymentMethod;
    private javax.swing.JLabel lblPhoneNumber4;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPhotoImage;
    private javax.swing.JLabel lblRestaurantName4;
    private javax.swing.JLabel lblUpdatePatient;
    private javax.swing.JTextField txtAccidentLocation;
    private javax.swing.JTextField txtAddress;
    private com.toedter.calendar.JDateChooser txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHealthInsuranceID;
    private javax.swing.JTextField txtInjuryType;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
