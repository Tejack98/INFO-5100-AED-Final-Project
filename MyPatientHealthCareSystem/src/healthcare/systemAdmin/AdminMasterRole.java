/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.systemAdmin;

import healthcare.Ecosystem;
import healthcare.enterprise.Enterprise;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.role.Role;
import healthcare.userAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Tejas
 */
public class AdminMasterRole extends Role {
    
    
    @Override
    public String toString() {
        return String.valueOf("Administrator");
    }

    @Override
    public JPanel createWorkArea(UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem Ecosystem, Network network) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //return new AdminWorkAreaJPanel(userProcessContainer, enterprise);       
    }
}
