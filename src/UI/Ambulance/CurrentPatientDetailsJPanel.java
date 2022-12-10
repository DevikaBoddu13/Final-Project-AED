/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Ambulance;

import BusinessModel.Ambulance.Ambulance;
import BusinessModel.Ecosystem;
import BusinessModel.UserAccount.User;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 *
 * @author kshama
 */
public class CurrentPatientDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CurrentPatientDetailsJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    private User userAccount;
    private Ambulance ambulance;

    public CurrentPatientDetailsJPanel(JPanel userProcessContainer, User account, Ecosystem system, Ambulance ambulance) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecoSystem = system;
        this.ambulance = ambulance;

        lblFirstName.setText(ambulance.getAmbulancePatientsList().get(ambulance.getAmbulancePatientsList().size() - 1).getpatient_FirstName());
        lblLastName.setText(ambulance.getAmbulancePatientsList().get(ambulance.getAmbulancePatientsList().size() - 1).getpatient_LastName());
        lblLocation.setText(ambulance.getAmbulancePatientsList().get(ambulance.getAmbulancePatientsList().size() - 1).getpatient_LocationOfAccident());

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
        lblPatientLastName = new javax.swing.JLabel();
        lblPatientFirstName = new javax.swing.JLabel();
        lblPatientLocation = new javax.swing.JLabel();
        btnSetFree = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnSetFree1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JTextField();
        lblLocation = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Emergency Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 30, 1409, 60));

        lblPatientLastName.setBackground(new java.awt.Color(15, 85, 177));
        lblPatientLastName.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setText("Patient Last Name");
        add(lblPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        lblPatientFirstName.setBackground(new java.awt.Color(0, 153, 204));
        lblPatientFirstName.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setText("Patient First Name");
        add(lblPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        lblPatientLocation.setBackground(new java.awt.Color(15, 85, 177));
        lblPatientLocation.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPatientLocation.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLocation.setText("Patient Location");
        add(lblPatientLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 170, -1));

        btnSetFree.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnSetFree.setForeground(new java.awt.Color(202, 97, 73));
        btnSetFree.setText("Relieve");
        btnSetFree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetFreeActionPerformed(evt);
            }
        });
        add(btnSetFree, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 590, 170, 38));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 107, 1432, 10));

        btnSetFree1.setBackground(new java.awt.Color(0, 153, 153));
        btnSetFree1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btnSetFree1.setForeground(new java.awt.Color(0, 153, 153));
        btnSetFree1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/back.png"))); // NOI18N
        btnSetFree1.setBorder(null);
        btnSetFree1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetFree1ActionPerformed(evt);
            }
        });
        add(btnSetFree1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/details.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 100, 140));
        add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 220, 30));
        add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 220, 30));
        add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 220, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetFreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetFreeActionPerformed
        // TODO add your handling code here:

        ambulance.setStatus("Free");
        JOptionPane.showMessageDialog(null, "Status Changed To Free");
        DisplayAmbulancePatientJPanel displayAmbulancePatientJPanel = new DisplayAmbulancePatientJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Ambulance Display", displayAmbulancePatientJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnSetFreeActionPerformed
/**/
    private void btnSetFree1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetFree1ActionPerformed
        // TODO add your handling code here:
        DisplayAmbulancePatientJPanel displayAmbulancePatientJPanel = new DisplayAmbulancePatientJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Ambulance Display", displayAmbulancePatientJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSetFree1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSetFree;
    private javax.swing.JButton btnSetFree1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lblFirstName;
    private javax.swing.JTextField lblLastName;
    private javax.swing.JTextField lblLocation;
    private javax.swing.JLabel lblPatientFirstName;
    private javax.swing.JLabel lblPatientLastName;
    private javax.swing.JLabel lblPatientLocation;
    // End of variables declaration//GEN-END:variables
}