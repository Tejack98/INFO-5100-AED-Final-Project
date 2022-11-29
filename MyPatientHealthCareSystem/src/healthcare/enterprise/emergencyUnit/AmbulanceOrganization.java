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
public class AmbulanceOrganization extends Organization {
    
    public AmbulanceOrganization() {
        super(Organization.OrganizationType.Ambulance.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
