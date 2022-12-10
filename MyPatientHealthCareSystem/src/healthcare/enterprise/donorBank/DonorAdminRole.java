/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.Enterprise.donorBank;

import healthcare.Ecosystem;
import healthcare.enterprise.Enterprise;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.role.Role;
import healthcare.userAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;
import userinterface.DonorBankInterface.donorAdmin.DonorAdminWorkArea;

/**
 *
 * @author Tejas
 */
public class DonorAdminRole extends Role {
    
    
    @Override
    public String toString() {
        return String.valueOf("Donor Admin");
    }
    
    @Override
    public JFrame createWorkArea( UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem ecosystem, Network network) {
        return new DonorAdminWorkArea(ecosystem,userAccount,organization,enterprise,network);       
    }
}
