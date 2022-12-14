/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise.healthCare;

import healthcare.Ecosystem;
import healthcare.enterprise.Enterprise;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.role.Role;
import healthcare.userAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;
import userinterface.HealthcareInterface.healthcareAdmin.HealthCareAdminWorkArea;
import userinterface.HealthcareInterface.healthcareAdmin.doctor.HealthCareAdminDoctorPanel;

/**
 *
 * @author Tejas
 */
public class HealthCareAdminRole extends Role {
    
    
    @Override
    public String toString() {
        return String.valueOf("HealthCare Admin");
    }
    
    @Override
    public JFrame createWorkArea(UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem ecosystem, Network network) {
        return new HealthCareAdminWorkArea(userAccount, organization,enterprise,ecosystem, network);
    }
    
}
