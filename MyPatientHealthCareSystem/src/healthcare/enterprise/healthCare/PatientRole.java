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
import userinterface.HealthcareInterface.patient.PatientDashboard;
import userinterface.HealthcareInterface.patient.PatientWorkArea;

/**
 *
 * @author Tejas
 */
public class PatientRole extends Role {
    
    
    @Override
    public String toString() {
        return String.valueOf("Patient");
    }
    
    @Override
    public JFrame createWorkArea(UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem Ecosystem, Network network) {    
        return new PatientWorkArea();       
    }
    
}
