/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;

import BusinessModel.Ecosystem;
import BusinessModel.UserAccount.User;
import UI.Police.PoliceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nikhilreddypolepally
 */
public class Police extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, Ecosystem business) {
        return new PoliceWorkAreaJPanel(userProcessContainer, user, business);
    }
}
