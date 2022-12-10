/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;

import BusinessModel.Ecosystem;
import BusinessModel.UserAccount.User;
import BusinessModel.UserAccount.User;
import UI.SystemAdmin.ShowAmbulanceDriversJPanel;
//import MainUserInterface.SystemAdmin.AdministratorJPanel;
import UI.SystemAdmin.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nikhilreddypolepally
 */
public class Administrator extends Role{

    public JPanel createWorkArea(JPanel userProcessContainer, User user, Ecosystem system) {
        return new ShowAmbulanceDriversJPanel(userProcessContainer, user, system);
    }

}
