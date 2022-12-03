/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.role.Role;
import healthcare.systemAdmin.AdminMasterRole;
import java.util.ArrayList;

/**
 *
 * @author Tejas
 */
public class Ecosystem extends Organization {
    
    private static Ecosystem ecosystem;
    private ArrayList<Network> networkList;
    
    private Ecosystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }
    
    public static Ecosystem getEcosystemInstance(){
        if(ecosystem == null){
            ecosystem = new Ecosystem();
        }
        return ecosystem;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public void deleteNetwork(Network network)
    {
        networkList.remove(network);
    }
    
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new AdminMasterRole());
        return roleList;
    }
    
    public ArrayList<Network> getNetworkList() {
        System.out.println("In network list");
        System.out.println(networkList);
        return networkList;
    }
    
    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
           return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    
}
