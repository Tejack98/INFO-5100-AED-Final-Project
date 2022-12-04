/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import healthcare.enterprise.healthCare.DoctorRole;
import healthcare.enterprise.healthCare.HealthCareAdminRole;
import healthcare.enterprise.healthCare.NurseRole;
import healthcare.enterprise.healthCare.PatientRole;
import healthcare.enterprise.lab.LabAdminRole;
import healthcare.enterprise.lab.LabAssistantRole;
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
        Person person3 = ecosystem.getPersonDirectory().createAndAddPerson("Pan","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        Person person4 = ecosystem.getPersonDirectory().createAndAddPerson("mat","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        
        DoctorRole d1 = new DoctorRole();
        d1.setHospitalName("myHospital");
        d1.setSpeciality("Cardiologist");
        
        NurseRole n1 = new NurseRole();
        n1.setHospitalName("myHospital1");
        n1.setGender("Female");
        
        UserAccount u = ecosystem.getUserAccountDirectory().createUserAccount(4444,"sys", "sys", person, d1,"t@g.com");
        UserAccount u2 = ecosystem.getUserAccountDirectory().createUserAccount(1111,"hadmin", "hadmin", person2, new HealthCareAdminRole(),"s@g.com");
        UserAccount u3 = ecosystem.getUserAccountDirectory().createUserAccount(2222,"pat", "pat", person3, new PatientRole(),"s@g.com");
        UserAccount u4 = ecosystem.getUserAccountDirectory().createUserAccount(3333,"nurse", "nurse", person4, new NurseRole() ,"s@g.com");
        
        
        //========================================Lab======================================
        
        Person labAdmin = ecosystem.getPersonDirectory().createAndAddPerson("Aditya","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        LabAdminRole lar = new LabAdminRole();  
        Person labAssist = ecosystem.getPersonDirectory().createAndAddPerson("Tejack","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        LabAssistantRole lassistr = new LabAssistantRole();       
        UserAccount la_user = ecosystem.getUserAccountDirectory().createUserAccount(5555,"ladmin", "ladmin", labAdmin, lar ,"labadmin@g.com");
        UserAccount lassist = ecosystem.getUserAccountDirectory().createUserAccount(6666,"lassist", "lassist", labAssist, lassistr ,"labadmin@g.com");
       
        return ecosystem;
    }
    
}
