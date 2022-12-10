/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise.supplyChain;

import healthcare.organization.Organization;
import healthcare.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Tejas
 */
public class SupplierOrganization extends Organization {
    
    private ArrayList<Vehicle> vehicleList;
    
    public SupplierOrganization() {
        super(Organization.OrganizationType.Supplier.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(ArrayList<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
    
    public Vehicle addNewVehicle(Vehicle vehicle){
        this.vehicleList.add(vehicle);
        return vehicle;
    }
}
