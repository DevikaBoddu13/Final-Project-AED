/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;

import BusinessModel.Ecosystem;
import BusinessModel.UserAccount.User;
import UI.Patient.PatientWorkSpaceJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nikhilreddypolepally
 */
public class Patient_role extends Role{
    

    @Override
     public JPanel createWorkArea(JPanel userProcessContainer, User user, Ecosystem business) {
        return new PatientWorkSpaceJPanel(userProcessContainer, user, business);
    }      
}
