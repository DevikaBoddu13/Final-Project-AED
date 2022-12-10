/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DoctorAdministration;

import BusinessModel.Ecosystem;
import BusinessModel.Doctor.Doctor;
import BusinessModel.Roles.Doctor_role;
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
import UI.ReceptionRole.ReceptionWorkAreaJPanel;

/**
 *
 * @author podda
 */
public class CreateDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorAdministratorWorkAreaJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;
    private Doctor photoDoctor;

    public CreateDoctorJPanel(JPanel userProcessContainer, User user, Ecosystem system) {
        initComponents();
        this.userAccount = user;
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.photoDoctor = new Doctor();

        GComboBox.removeAllItems();
        GComboBox.addItem("Male");
        GComboBox.addItem("Female");
        GComboBox.addItem("Other");

        populateNetworkTable();
    }

    private void populateNetworkTable() {
        // DefaultTableModel model = (DefaultTableModel) ManageCustomersTable.getModel();

        //model.setRowCount(0);
        for (User user : ecoSystem.getUserAccountDirectory().getUserAccountList()) {

            if ("Business.Role.DoctorRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3];
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                // model.addRow(row);
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

        LastNameTxt = new javax.swing.JTextField();
        AddressTxt = new javax.swing.JTextField();
        UserNameLbl = new javax.swing.JLabel();
        txtDoctorID = new javax.swing.JTextField();
        DoctorWorkIDLbl = new javax.swing.JLabel();
        lblExperience = new javax.swing.JLabel();
        PhoneNumberTxt = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        UsernameTxt = new javax.swing.JTextField();
        FirstNameLbl = new javax.swing.JLabel();
        lblSpeciality = new javax.swing.JLabel();
        PasswordTxt = new javax.swing.JTextField();
        DateOfBirthLbl = new javax.swing.JLabel();
        ExperienceTxt = new javax.swing.JTextField();
        PhoneNoLbl = new javax.swing.JLabel();
        GenderLbl = new javax.swing.JLabel();
        PasswordLbl = new javax.swing.JLabel();
        lLastNameLbl = new javax.swing.JLabel();
        FirstNameTxt = new javax.swing.JTextField();
        lblRestaurantInfo = new javax.swing.JLabel();
        EmailTxt = new javax.swing.JTextField();
        EmailLbl = new javax.swing.JLabel();
        SpecialistTxt = new javax.swing.JTextField();
        AddressLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        GComboBox = new javax.swing.JComboBox<>();
        ErrorPhoneLbl = new javax.swing.JLabel();
        ErrorEmailLbl = new javax.swing.JLabel();
        lblErrorAddress = new javax.swing.JLabel();
        lblErrorSpecialist = new javax.swing.JLabel();
        lblErrorWorkExperience = new javax.swing.JLabel();
        ErrorUserNameLbl = new javax.swing.JLabel();
        ErrorPasswordLbl = new javax.swing.JLabel();
        lblPhotoImage = new javax.swing.JLabel();
        qualificationImageLbl = new javax.swing.JButton();
        lblErrorDoctorWorkID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDOB = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LastNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTxtActionPerformed(evt);
            }
        });
        LastNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LastNameTxtKeyReleased(evt);
            }
        });
        add(LastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 180, 30));

        AddressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTxtActionPerformed(evt);
            }
        });
        AddressTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AddressTxtKeyReleased(evt);
            }
        });
        add(AddressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 180, 70));

        UserNameLbl.setBackground(new java.awt.Color(0, 0, 0));
        UserNameLbl.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        UserNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        UserNameLbl.setText("User Name");
        add(UserNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 100, 30));

        txtDoctorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorIDActionPerformed(evt);
            }
        });
        txtDoctorID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDoctorIDKeyReleased(evt);
            }
        });
        add(txtDoctorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 180, 30));

        DoctorWorkIDLbl.setBackground(new java.awt.Color(255, 255, 255));
        DoctorWorkIDLbl.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        DoctorWorkIDLbl.setForeground(new java.awt.Color(255, 255, 255));
        DoctorWorkIDLbl.setText("ID");
        add(DoctorWorkIDLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 30, 30));

        lblExperience.setBackground(new java.awt.Color(255, 255, 255));
        lblExperience.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblExperience.setForeground(new java.awt.Color(255, 255, 255));
        lblExperience.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExperience.setText("Experience");
        add(lblExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 251, 120, 30));

        PhoneNumberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberTxtActionPerformed(evt);
            }
        });
        PhoneNumberTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PhoneNumberTxtKeyReleased(evt);
            }
        });
        add(PhoneNumberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 180, 30));

        btnSubmit.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(202, 97, 71));
        btnSubmit.setText("Create Doctor");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 160, 40));

        UsernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTxtActionPerformed(evt);
            }
        });
        UsernameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UsernameTxtKeyReleased(evt);
            }
        });
        add(UsernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 180, 30));

        FirstNameLbl.setBackground(new java.awt.Color(0, 0, 0));
        FirstNameLbl.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        FirstNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        FirstNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FirstNameLbl.setText("First Name");
        add(FirstNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 110, 30));

        lblSpeciality.setBackground(new java.awt.Color(255, 255, 255));
        lblSpeciality.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblSpeciality.setForeground(new java.awt.Color(255, 255, 255));
        lblSpeciality.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSpeciality.setText("Specialist");
        add(lblSpeciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 90, 30));

        PasswordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTxtActionPerformed(evt);
            }
        });
        PasswordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PasswordTxtKeyReleased(evt);
            }
        });
        add(PasswordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 180, 30));

        DateOfBirthLbl.setBackground(new java.awt.Color(255, 255, 255));
        DateOfBirthLbl.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        DateOfBirthLbl.setForeground(new java.awt.Color(255, 255, 255));
        DateOfBirthLbl.setText("Date of Birth");
        add(DateOfBirthLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 120, 30));

        ExperienceTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExperienceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExperienceTxtActionPerformed(evt);
            }
        });
        ExperienceTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ExperienceTxtKeyReleased(evt);
            }
        });
        add(ExperienceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 180, 30));

        PhoneNoLbl.setBackground(new java.awt.Color(255, 255, 255));
        PhoneNoLbl.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        PhoneNoLbl.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PhoneNoLbl.setText("Phone Number  ");
        add(PhoneNoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, 30));

        GenderLbl.setBackground(new java.awt.Color(255, 255, 255));
        GenderLbl.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        GenderLbl.setForeground(new java.awt.Color(255, 255, 255));
        GenderLbl.setText("Gender  ");
        add(GenderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, 30));

        PasswordLbl.setBackground(new java.awt.Color(0, 0, 0));
        PasswordLbl.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        PasswordLbl.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLbl.setText("Password");
        add(PasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 90, 30));

        lLastNameLbl.setBackground(new java.awt.Color(0, 0, 0));
        lLastNameLbl.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lLastNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        lLastNameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lLastNameLbl.setText("Last Name");
        add(lLastNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 110, 30));

        FirstNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameTxtActionPerformed(evt);
            }
        });
        FirstNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FirstNameTxtKeyReleased(evt);
            }
        });
        add(FirstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 180, 30));

        lblRestaurantInfo.setBackground(new java.awt.Color(255, 255, 255));
        lblRestaurantInfo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblRestaurantInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblRestaurantInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRestaurantInfo.setText("New Doctor");
        add(lblRestaurantInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 310, -1));

        EmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTxtActionPerformed(evt);
            }
        });
        EmailTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailTxtKeyReleased(evt);
            }
        });
        add(EmailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 180, 30));

        EmailLbl.setBackground(new java.awt.Color(255, 255, 255));
        EmailLbl.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        EmailLbl.setForeground(new java.awt.Color(255, 255, 255));
        EmailLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmailLbl.setText("Mail");
        add(EmailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 60, 30));

        SpecialistTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecialistTxtActionPerformed(evt);
            }
        });
        SpecialistTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SpecialistTxtKeyReleased(evt);
            }
        });
        add(SpecialistTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 650, 30));

        AddressLbl.setBackground(new java.awt.Color(255, 255, 255));
        AddressLbl.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        AddressLbl.setForeground(new java.awt.Color(255, 255, 255));
        AddressLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddressLbl.setText("Address");
        add(AddressLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 90, 30));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 715, -1, -1));

        GComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        GComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GComboBoxActionPerformed(evt);
            }
        });
        add(GComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 180, 30));

        ErrorPhoneLbl.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        ErrorPhoneLbl.setForeground(new java.awt.Color(255, 51, 51));
        ErrorPhoneLbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ErrorPhoneLblKeyReleased(evt);
            }
        });
        add(ErrorPhoneLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 180, 30));

        ErrorEmailLbl.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        ErrorEmailLbl.setForeground(new java.awt.Color(255, 51, 51));
        ErrorEmailLbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ErrorEmailLblKeyReleased(evt);
            }
        });
        add(ErrorEmailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, 170, 26));

        lblErrorAddress.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorAddress.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblErrorAddressKeyReleased(evt);
            }
        });
        add(lblErrorAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 180, 30));

        lblErrorSpecialist.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorSpecialist.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorSpecialist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblErrorSpecialistKeyReleased(evt);
            }
        });
        add(lblErrorSpecialist, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 180, 30));

        lblErrorWorkExperience.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorWorkExperience.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorWorkExperience.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblErrorWorkExperienceKeyReleased(evt);
            }
        });
        add(lblErrorWorkExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 250, 180, 30));

        ErrorUserNameLbl.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        ErrorUserNameLbl.setForeground(new java.awt.Color(255, 51, 51));
        ErrorUserNameLbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ErrorUserNameLblKeyReleased(evt);
            }
        });
        add(ErrorUserNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 180, 26));

        ErrorPasswordLbl.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        ErrorPasswordLbl.setForeground(new java.awt.Color(255, 51, 51));
        ErrorPasswordLbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ErrorPasswordLblKeyReleased(evt);
            }
        });
        add(ErrorPasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 90, 180, 30));

        lblPhotoImage.setText("doctor_Image");
        add(lblPhotoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 130, 160));

        qualificationImageLbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        qualificationImageLbl.setForeground(new java.awt.Color(0, 153, 204));
        qualificationImageLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/icons8-image-file-add-45.png"))); // NOI18N
        qualificationImageLbl.setBorder(null);
        qualificationImageLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qualificationImageLblActionPerformed(evt);
            }
        });
        add(qualificationImageLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));
        add(lblErrorDoctorWorkID, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 290, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/icons8-stethoscope-50.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 60, 50));

        txtDOB.setBackground(new java.awt.Color(204, 204, 204));
        txtDOB.setDateFormatString("MM-dd-yyyy");
        txtDOB.setMaxSelectableDate(new Date());
        add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 180, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void LastNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTxtActionPerformed

    private void txtDoctorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorIDActionPerformed

    private void PhoneNumberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberTxtActionPerformed

    private void EmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTxtActionPerformed

    private void SpecialistTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecialistTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpecialistTxtActionPerformed

    private void AddressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTxtActionPerformed

    private void ExperienceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExperienceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExperienceTxtActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if (ecoSystem.getUserAccountDirectory().checkIfUsernameIsUnique(PasswordTxt.getText())
                && (lblErrorAddress.getText() == null || lblErrorAddress.getText().equals(""))
                && (ErrorEmailLbl.getText() == null || ErrorEmailLbl.getText().equals(""))
                && (ErrorPasswordLbl.getText() == null || ErrorPasswordLbl.getText().equals(""))
                && (ErrorPhoneLbl.getText() == null || ErrorPhoneLbl.getText().equals(""))
                && (ErrorUserNameLbl.getText() == null || ErrorUserNameLbl.getText().equals(""))     
                ) {
            Doctor doctor = new Doctor(PasswordTxt.getText());
            doctor.setDoctor_FirstName(FirstNameTxt.getText());
            doctor.setDoctor_LastName(LastNameTxt.getText());
            doctor.setDoc_Age((CalculateAge(txtDOB.getDate(), java.util.Calendar.getInstance().getTime())));
            doctor.setDoc_Gender((String) GComboBox.getSelectedItem());
            doctor.setDoc_ID(txtDoctorID.getText());
            doctor.setDoc_Address(AddressTxt.getText());
            doctor.setDoc_PhoneNumber(PhoneNumberTxt.getText());
            doctor.setDoc_Mail(EmailTxt.getText());
            doctor.setDoc_Specialization(SpecialistTxt.getText());
            doctor.setDoc_Experience(ExperienceTxt.getText());
            doctor.setDoctor_UserName(PasswordTxt.getText());
            photoDoctor = doctor;
            ecoSystem.getUserAccountDirectory().createUser(PasswordTxt.getText(), UsernameTxt.getText(), null, new Doctor_role());
            ecoSystem.getDoctorDirectory().createDoctor(doctor);
            JOptionPane.showMessageDialog(null, "Doctor added.");
            
            DoctorAdminWorkArea doctorAdminWorkArea = new DoctorAdminWorkArea(userProcessContainer, userAccount, ecoSystem);
            userProcessContainer.add("Doctor Admin Work Area", doctorAdminWorkArea);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            
        } else 
        {
            JOptionPane.showMessageDialog(null, "Please Fill Correct Details");
        }
        
        

    }//GEN-LAST:event_btnSubmitActionPerformed

    public int CalculateAge(Date birthDate, Date currentDate) {
        // validate inputs ...                                                                               
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        int d1 = Integer.parseInt(formatter.format(birthDate));
        int d2 = Integer.parseInt(formatter.format(currentDate));
        int age = (d2 - d1) / 10000;
        return age;
    }

    private void PasswordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTxtActionPerformed

    private void FirstNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameTxtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_FirstNameTxtActionPerformed

    private void UsernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTxtActionPerformed

    private void GComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GComboBoxActionPerformed

    private void FirstNameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstNameTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(FirstNameTxt.getText());
        if (!match.matches()) {
            //lblErrorFname.setText("Wrong Input");
        } else {
            //lblErrorFname.setText(null);
        }
    }//GEN-LAST:event_FirstNameTxtKeyReleased

    private void LastNameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastNameTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(LastNameTxt.getText());
        if (!match.matches()) {
            //lblErrorLname.setText("Wrong Input");
        } else {
            //lblErrorLname.setText(null);
        }
    }//GEN-LAST:event_LastNameTxtKeyReleased

    private void ErrorPhoneLblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ErrorPhoneLblKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ErrorPhoneLblKeyReleased

    private void ErrorEmailLblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ErrorEmailLblKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ErrorEmailLblKeyReleased

    private void lblErrorAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblErrorAddressKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblErrorAddressKeyReleased

    private void lblErrorSpecialistKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblErrorSpecialistKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblErrorSpecialistKeyReleased

    private void lblErrorWorkExperienceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblErrorWorkExperienceKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblErrorWorkExperienceKeyReleased

    private void ErrorUserNameLblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ErrorUserNameLblKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ErrorUserNameLblKeyReleased

    private void ErrorPasswordLblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ErrorPasswordLblKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ErrorPasswordLblKeyReleased

    private void txtDoctorIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoctorIDKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9 '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtDoctorID.getText());
        if (!match.matches()) {
            lblErrorDoctorWorkID.setText("Wrong Input");
        } else {
            lblErrorDoctorWorkID.setText(null);
        }
    }//GEN-LAST:event_txtDoctorIDKeyReleased

    private void PhoneNumberTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneNumberTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9 +()-]{10,18}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(PhoneNumberTxt.getText());
        if (!match.matches()) {
            ErrorPhoneLbl.setText("Wrong Input");
        } else {
            ErrorPhoneLbl.setText(null);
        }
    }//GEN-LAST:event_PhoneNumberTxtKeyReleased

    private void EmailTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(EmailTxt.getText());
        if (!match.matches()) {
            ErrorEmailLbl.setText("Wrong Input");
        } else {
            ErrorEmailLbl.setText(null);
        }
    }//GEN-LAST:event_EmailTxtKeyReleased

    private void AddressTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddressTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9 '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(AddressTxt.getText());
        if (!match.matches()) {
            lblErrorAddress.setText("Wrong Input");
        } else {
            lblErrorAddress.setText(null);
        }
    }//GEN-LAST:event_AddressTxtKeyReleased

    private void SpecialistTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SpecialistTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(SpecialistTxt.getText());
        if (!match.matches()) {
            lblErrorSpecialist.setText("Wrong Input");
        } else {
            lblErrorSpecialist.setText(null);
        }
    }//GEN-LAST:event_SpecialistTxtKeyReleased

    private void ExperienceTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ExperienceTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(ExperienceTxt.getText());
        if (!match.matches()) {
            lblErrorWorkExperience.setText("Wrong Input");
        } else {
            lblErrorWorkExperience.setText(null);
        }
    }//GEN-LAST:event_ExperienceTxtKeyReleased

    private void UsernameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9 '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(UsernameTxt.getText());
        if (!match.matches()) {
            ErrorPasswordLbl.setText("Wrong Input");
        } else {
            ErrorPasswordLbl.setText(null);
        }
    }//GEN-LAST:event_UsernameTxtKeyReleased

    private void PasswordTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordTxtKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(PasswordTxt.getText());
        if (!match.matches()) {
            ErrorUserNameLbl.setText("Wrong Input");
        } else {
            ErrorUserNameLbl.setText(null);
        }
    }//GEN-LAST:event_PasswordTxtKeyReleased

    private void qualificationImageLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qualificationImageLblActionPerformed
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
            photoDoctor.setDoc_ImageUrl(selectedImagePath);

            ImageIcon ii = new ImageIcon(selectedImagePath);
            //Resize image to fit jlabel
            Image image = ii.getImage().getScaledInstance(lblPhotoImage.getWidth(), lblPhotoImage.getHeight(), Image.SCALE_SMOOTH);
            lblPhotoImage.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_qualificationImageLblActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLbl;
    private javax.swing.JTextField AddressTxt;
    private javax.swing.JLabel DateOfBirthLbl;
    private javax.swing.JLabel DoctorWorkIDLbl;
    private javax.swing.JLabel EmailLbl;
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JLabel ErrorEmailLbl;
    private javax.swing.JLabel ErrorPasswordLbl;
    private javax.swing.JLabel ErrorPhoneLbl;
    private javax.swing.JLabel ErrorUserNameLbl;
    private javax.swing.JTextField ExperienceTxt;
    private javax.swing.JLabel FirstNameLbl;
    private javax.swing.JTextField FirstNameTxt;
    private javax.swing.JComboBox<String> GComboBox;
    private javax.swing.JLabel GenderLbl;
    private javax.swing.JTextField LastNameTxt;
    private javax.swing.JLabel PasswordLbl;
    private javax.swing.JTextField PasswordTxt;
    private javax.swing.JLabel PhoneNoLbl;
    private javax.swing.JTextField PhoneNumberTxt;
    private javax.swing.JTextField SpecialistTxt;
    private javax.swing.JLabel UserNameLbl;
    private javax.swing.JTextField UsernameTxt;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lLastNameLbl;
    private javax.swing.JLabel lblErrorAddress;
    private javax.swing.JLabel lblErrorDoctorWorkID;
    private javax.swing.JLabel lblErrorSpecialist;
    private javax.swing.JLabel lblErrorWorkExperience;
    private javax.swing.JLabel lblExperience;
    private javax.swing.JLabel lblPhotoImage;
    private javax.swing.JLabel lblRestaurantInfo;
    private javax.swing.JLabel lblSpeciality;
    private javax.swing.JButton qualificationImageLbl;
    private com.toedter.calendar.JDateChooser txtDOB;
    private javax.swing.JTextField txtDoctorID;
    // End of variables declaration//GEN-END:variables
}
