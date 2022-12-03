    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.userAccount;

import healthcare.person.Person;
import healthcare.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shriya
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        this.userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return this.userAccountList;
    }
    
    public UserAccount authenticateUser(String userName, String userPassword){
         
        for (UserAccount user : this.userAccountList){
            if (user.getUserName().equals(userName) && user.getUserPassword().equals(userPassword)){
                System.out.println(user);
                return user;
            }
        }
        return null;
    }
    
    public UserAccount createUserAccount(String userName, String userPassword, Person person, Role role, String userEmail){
        UserAccount userAccount = new UserAccount();
        userAccount.setUserName(userName);
        userAccount.setUserPassword(userPassword);
        userAccount.setPerson(person);
        userAccount.setRole(role);
        userAccount.setUserEmail(userEmail);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String userName){
        for (UserAccount user : this.userAccountList){
            if (user.getUserName().equals(userName))
                return false;
        }
        return true;
    }
    
}
