/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.organization;

import healthcare.enterprises.Enterprise;
import healthcare.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Tejas
 */
public abstract class Organization {
    
    private String organizationName;
    private int organizationId ;
    private static int counter;
    
    static{
        counter = 100;
    }
    
    public Organization(String organizationName) {
        this.organizationName = organizationName;
        this.organizationId = counter;
        counter += 1;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public enum OrganizationType {
        Administrator("Admin Organization", null),
        Doctor("Doctor Organization",Enterprise.EnterpriseType.HealthCare),
        Patient("Patient Organization", Enterprise.EnterpriseType.HealthCare),
        Nurse("Nurse Organization", Enterprise.EnterpriseType.HealthCare),
        Lab("Lab Organization", Enterprise.EnterpriseType.Lab),
        Pharmacy("Pharmacy Organization", Enterprise.EnterpriseType.Pharmacy),
        Supplier("SupplyChain Organization", Enterprise.EnterpriseType.SupplyChain),
        Vehicle("Vehicle Organization",Enterprise.EnterpriseType.SupplyChain),
        EmergencyUnit("Emergency Unit Organization",Enterprise.EnterpriseType.EmergencyUnit),
        DonorBank("DonorBank Organization",Enterprise.EnterpriseType.DonorBank),
        Vaccination("Vaccination Organization",Enterprise.EnterpriseType.Vaccination);
        
        private String value;
        private Enterprise.EnterpriseType enterprise;

        private OrganizationType(String value, Enterprise.EnterpriseType enterprise) {
            this.value = value;
            this.enterprise = enterprise;
        }

        public String getValue() {
            return value;
        }

        public Enterprise.EnterpriseType getEType() {
            return enterprise;
        }
    }
    
    public int getOrganizationID() {
        return organizationId;
    }
    
    public String getOrganizationNameID() {
        return organizationName;
    }
    
}
