/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.organization;

import healthcare.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Tejas
 */
public class DoctorOrganization extends Organization {
    
    public DoctorOrganization() {
        super(Organization.OrganizationType.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
