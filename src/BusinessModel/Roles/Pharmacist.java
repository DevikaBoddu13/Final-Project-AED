/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;

import BusinessModel.Ecosystem;
import BusinessModel.UserAccount.User;
import UI.Dispensary.DispensaryWorkSpaceJPanel;
import javax.swing.JPanel;

/**
 *
 * @author nikhilreddypolepally
 */
public class Pharmacist extends Role{
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, Ecosystem business) {
        return new DispensaryWorkSpaceJPanel(userProcessContainer, user, business);
    }
    
}
