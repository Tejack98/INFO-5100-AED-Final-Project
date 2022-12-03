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
import javax.swing.JPanel;
import userinterface.HealthcareInterface.doctor.DoctorDashboard;
import userinterface.HealthcareInterface.doctor.DoctorWorkArea;

/**
 *
 * @author Tejas
 */
public class DoctorRole extends Role {
    
    private String speciality;
    private String hospitalName;
    
    
    @Override
    public String toString() {
        return String.valueOf("Doctor");
    }
    
    @Override
    public JPanel createWorkArea(UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem Ecosystem, Network network) {
        return new DoctorDashboard();       
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
}
