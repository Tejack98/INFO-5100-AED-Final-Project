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
import userinterface.HealthcareInterface.nurse.NurseDashboard;
import userinterface.HealthcareInterface.nurse.NurseWorkArea;

/**
 *
 * @author Tejas
 */
public class NurseRole extends Role {
    
    private String gender;
    private String hospitalName;
    
    @Override
    public String toString() {
        return String.valueOf("Nurse");
    }
    
    @Override
    public JFrame createWorkArea( UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem Ecosystem, Network network) {
        return new NurseWorkArea();       
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }  
    
}
