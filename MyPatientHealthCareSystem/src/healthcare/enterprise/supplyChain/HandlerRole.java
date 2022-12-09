/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise.supplyChain;

import healthcare.Ecosystem;
import healthcare.enterprise.Enterprise;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.role.Role;
import healthcare.userAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;
import userinterface.SupplyChainInterface.handler.HandlerWorkArea;

/**
 *
 * @author Tejas
 */
public class HandlerRole extends Role {
    
    private Vehicle vehicle;
    
    @Override
    public String toString() {
        return String.valueOf("Handler");
    }
    
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    @Override
    public JFrame createWorkArea(UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem ecosystem, Network network) {
        return new HandlerWorkArea(userAccount, organization, enterprise, ecosystem, network);       
    }
    
}
