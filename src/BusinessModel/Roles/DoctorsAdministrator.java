/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;

import BusinessModel.Ecosystem;
import javax.swing.JPanel;
import BusinessModel.UserAccount.User;
import UI.DoctorAdministration.DoctorAdminWorkArea;

/**
 *
 * @author nikhilreddypolepally
 */
public class DoctorsAdministrator extends Role {

    @Override
     public JPanel createWorkArea(JPanel userProcessContainer, User user, Ecosystem business) {
        System.out.println("inside doctors admin role---");
        return new DoctorAdminWorkArea(userProcessContainer, user, business);
    }

}
