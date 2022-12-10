/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Ambulance;

import BusinessModel.Ambulance.Ambulance;
import BusinessModel.Ecosystem;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kshama
 */
public class AmbulanceInformationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AmbulanceManipulationJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;

    public AmbulanceInformationJPanel(JPanel userProcessContainer, Ecosystem system, User account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecoSystem = system;
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
        lblDriverFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblDriverLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblVehicleNumber = new javax.swing.JLabel();
        txtVehicleNumber = new javax.swing.JTextField();
        lblDriverAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblErrorLname = new javax.swing.JLabel();
        lblErrorFname = new javax.swing.JLabel();
        lblErrorAge = new javax.swing.JLabel();
        lblErrorVNumber = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Ambulance and Driver");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 1434, 78));

        lblDriverFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblDriverFirstName.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblDriverFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblDriverFirstName.setText("Driver First Name");
        add(lblDriverFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyReleased(evt);
            }
        });
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 280, 30));

        lblDriverLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblDriverLastName.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblDriverLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblDriverLastName.setText("Driver Last Name");
        add(lblDriverLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

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
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 280, 30));

        lblVehicleNumber.setBackground(new java.awt.Color(255, 255, 255));
        lblVehicleNumber.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblVehicleNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblVehicleNumber.setText("Vehicle Number");
        add(lblVehicleNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, -1, -1));

        txtVehicleNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleNumberActionPerformed(evt);
            }
        });
        txtVehicleNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtVehicleNumberKeyReleased(evt);
            }
        });
        add(txtVehicleNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 280, 30));

        lblDriverAge.setBackground(new java.awt.Color(255, 255, 255));
        lblDriverAge.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblDriverAge.setForeground(new java.awt.Color(255, 255, 255));
        lblDriverAge.setText("Driver Age");
        add(lblDriverAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, -1, -1));

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, 280, 30));

        btnSubmit.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(202, 97, 71));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 670, 133, 43));

        lblErrorLname.setBackground(new java.awt.Color(255, 255, 255));
        lblErrorLname.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorLname.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 490, 255, 26));

        lblErrorFname.setBackground(new java.awt.Color(255, 255, 255));
        lblErrorFname.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorFname.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 430, 255, 26));

        lblErrorAge.setBackground(new java.awt.Color(255, 255, 255));
        lblErrorAge.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorAge.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 550, 255, 26));

        lblErrorVNumber.setBackground(new java.awt.Color(255, 255, 255));
        lblErrorVNumber.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblErrorVNumber.setForeground(new java.awt.Color(255, 51, 51));
        add(lblErrorVNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 610, 255, 26));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 1434, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/ambulance.gif"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 200, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtVehicleNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleNumberActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handlinglblErrorFnamere:
        if ((lblErrorFname.getText() == null || lblErrorFname.getText().equals(""))
                && (lblErrorLname.getText() == null || lblErrorLname.getText().equals(""))
                && (lblErrorAge.getText() == null || lblErrorAge.getText().equals(""))
                && (lblErrorVNumber.getText() == null || lblErrorVNumber.getText().equals(""))) {
            Ambulance ambulance = new Ambulance();
            ambulance.setDriverFirstName(txtFirstName.getText());
            ambulance.setDriverLastName(txtLastName.getText());
            ambulance.setDriverAge(Integer.parseInt(txtAge.getText()));
            ambulance.setVehicleNo(txtVehicleNumber.getText());
            ambulance.setStatus("Ambulance Available");
            ecoSystem.getAmbulanceDirectory().createAmbulance(ambulance);
            JOptionPane.showMessageDialog(null, "Profile Created");

            AmbulanceWorkAreaJPanel ambulanceWorkAreaJPanel = new AmbulanceWorkAreaJPanel(userProcessContainer, userAccount, ecoSystem);
            userProcessContainer.add("Add Patient", ambulanceWorkAreaJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please Fill All Details Correctly");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

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

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
         String PATTERN = "^[0-9]{2,3}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtAge.getText());
        if (!match.matches()) {
            lblErrorAge.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorAge.setText(null);
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtVehicleNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVehicleNumberKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9 '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtVehicleNumber.getText());
        if (!match.matches()) {
            lblErrorVNumber.setText("Wrong Input. Please Try Again.");
        } else {
            lblErrorVNumber.setText(null);
        }
    }//GEN-LAST:event_txtVehicleNumberKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblDriverAge;
    private javax.swing.JLabel lblDriverFirstName;
    private javax.swing.JLabel lblDriverLastName;
    private javax.swing.JLabel lblErrorAge;
    private javax.swing.JLabel lblErrorFname;
    private javax.swing.JLabel lblErrorLname;
    private javax.swing.JLabel lblErrorVNumber;
    private javax.swing.JLabel lblVehicleNumber;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtVehicleNumber;
    // End of variables declaration//GEN-END:variables
}