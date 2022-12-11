/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.role;

import healthcare.Ecosystem;
import healthcare.enterprise.Enterprise;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.userAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Tejas
 */
public abstract class Role {
    
    public enum RoleType{
        
        Administrator("Administrator"),
        Doctor("Doctor"),
        Patient("Patient"),
        Nurse("Nurse"),
        HealthCareAdmin("HealthCare Admin"),
        Donor("Donor"),
        DonorAdmin("Donor Admin"),
        SupplyManager("Supply Manager"),
        Handler("Handler"),
        VaccinationAdmin("Vaccination Admin"),
        Vaccinator("Vaccinator"),
        PharmacyAdmin("Pharmacy Admin"),
        Pharmacist("Pharmacist"),
        LabAdmin("Lab Admin"),
        LabAssistant("Lab Assistant"),
        EmergencyUnitAdmin("Emergency Unit Admin"),
        AmbulanceHandler("Ambulance Handler"),
        DonationHandler("Donation Handler");
               
        private String value;

        private RoleType(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    
    }
    
    public abstract JFrame createWorkArea(
    UserAccount userAccount,
    Organization organization,
    Enterprise enterprise,
    Ecosystem Ecosystem,
    Network network);
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
