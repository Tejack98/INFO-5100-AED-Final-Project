/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise.emergencyUnit;

import healthcare.organization.Organization;
import healthcare.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Tejas
 */
public class EmergencyUnitOrganization extends Organization {
       
    private ArrayList<Ambulance> ambulanceList;
    
    
    public EmergencyUnitOrganization() {
        super(Organization.OrganizationType.EmergencyUnit.getValue());
        this.ambulanceList = new ArrayList<>();
    }


    public ArrayList<Ambulance> getAmbulanceList() {
        return ambulanceList;
    }

    public void setAmbulanceList(ArrayList<Ambulance> ambulanceList) {
        this.ambulanceList = ambulanceList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    public Ambulance addNewVehicle(Ambulance amb){
        this.ambulanceList.add(amb);
        return amb;
    }
}
