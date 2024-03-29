/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.UserAccount;

import BusinessModel.Employee.Employee;
import BusinessModel.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author kshama
 */
public class UserDirectory {
    
     private final ArrayList<User> userList;

    public UserDirectory() {
        userList = new ArrayList();
    }

    public ArrayList<User> getUserAccountList() {
        return userList;
    }

    public User authenticateUser(String username, String password) {
        System.out.println("USERNAME : "+ username);
          System.out.println("password : "+password);
        for (User ua : userList) {
            System.out.println("username : "+ ua.getUsername());
          System.out.println("password : "+ua.getPassword());
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public User createUser(String username, String password, Employee employee, Role role) {
        System.out.println("#########USER DETAILS#########");
        System.out.println("USERNAME : "+username);
        System.out.println("PASSWORD : "+password);
        System.out.println("ROLE : "+role);
        System.out.println("##############################\n");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmployee(employee);
        user.setRole(role);
        userList.add(user);
        return user;
    }
    public void deleteUser(String username){
       
    for (User ua : userList) {
            if (ua.getUsername().equals(username)) {
                userList.remove(ua);
                break;
            }
        }
        
    }
    public boolean findIfUsernameIsUnique(String username) {
        for (User ua : userList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
        public boolean checkIfUsernameIsUnique(String username) {
        for (User ua : userList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }
    
}
