/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import healthcare.enterprise.healthCare.DoctorRole;
import healthcare.enterprise.healthCare.HealthCareAdminRole;
import healthcare.person.Person;
import healthcare.userAccount.UserAccount;

/**
 *
 * @author Tejas
 */
public class Configsystem {
    
    public static Ecosystem configureEcosystem(){
        
        Ecosystem ecosystem = Ecosystem.getEcosystemInstance();   
  
        
        Person person = ecosystem.getPersonDirectory().createAndAddPerson("tej","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        Person person2 = ecosystem.getPersonDirectory().createAndAddPerson("Shr","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        UserAccount u = ecosystem.getUserAccountDirectory().createUserAccount("sys", "sys", person, new DoctorRole(),"t@g.com");
        UserAccount u2 = ecosystem.getUserAccountDirectory().createUserAccount("hadmin", "hadmin", person2, new HealthCareAdminRole(),"s@g.com");

        return ecosystem;
    }
    
}
