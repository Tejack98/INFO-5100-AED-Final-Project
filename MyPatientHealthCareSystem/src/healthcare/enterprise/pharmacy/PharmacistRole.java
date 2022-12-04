/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise.pharmacy;

import healthcare.Ecosystem;
import healthcare.enterprise.Enterprise;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.role.Role;
import healthcare.userAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;
import userinterface.Pharmacy.PharmacistWorkArea;
import userinterface.Pharmacy.PharmacyAdminWorkArea;

/**
 *
 * @author Tejas
 */
public class PharmacistRole extends Role {
    
    
    @Override
    public String toString() {
        return String.valueOf("Pharmacist");
    }
    
    @Override
    public JFrame createWorkArea(UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem ecosystem, Network network) {
        return new PharmacistWorkArea(ecosystem);       
    }
    
}
