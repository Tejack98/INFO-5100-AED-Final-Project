/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.role;

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
        HospitalAdmin("Hospital Admin"),
        Donor("Donor"),
        DonorAdmin("Donor Admin"),
        SupplyManager("Supply Manager"),
        Handler("Handler"),
        VaccinationAdmin("Vaccination Admin"),
        Pharmacist("Pharmacist"),
        LabAdmin("Lab Admin"),
        LabAssistant("Lab Assistant");
               
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
    
    
}
