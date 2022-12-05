/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import healthcare.Enterprise.donorBank.DonorAdminRole;
import healthcare.Enterprise.donorBank.DonorRole;
import healthcare.enterprise.healthCare.DoctorRole;
import healthcare.enterprise.healthCare.HealthCareAdminRole;
import healthcare.enterprise.healthCare.NurseRole;
import healthcare.enterprise.healthCare.PatientRole;
import healthcare.enterprise.lab.LabAdminRole;
import healthcare.enterprise.lab.LabAssistantRole;
import healthcare.person.Person;
import healthcare.systemAdmin.AdminMasterRole;
import healthcare.userAccount.UserAccount;
import static java.time.Clock.system;

/**
 *
 * @author Tejas
 */
public class Configsystem {
    
    public static Ecosystem configureEcosystem(){
        
        Ecosystem ecosystem = Ecosystem.getEcosystemInstance();   
        
        //============SysAdmin===========================================
        
        Person personAdmin = ecosystem.getPersonDirectory().createAndAddPersonAdmin("AdminName");
        UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(0001,"sysadmin", "sysadmin", personAdmin, new AdminMasterRole(),"admin@g.com");
        
        
        //=================================================================
        
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
        
        UserAccount u = ecosystem.getUserAccountDirectory().createUserAccount(4444,"doc", "doc", person, d1,"t@g.com");
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
        
        
        //========================Donor=========================================================
        
        Person dadmin = ecosystem.getPersonDirectory().createAndAddPerson("tej","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        Person donor = ecosystem.getPersonDirectory().createAndAddPerson("Shr","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        
        UserAccount daminUser = ecosystem.getUserAccountDirectory().createUserAccount(7777,"dadmin", "dadmin", dadmin, new DonorAdminRole() ,"labadmin@g.com");
        UserAccount donor_user = ecosystem.getUserAccountDirectory().createUserAccount(8888,"donor", "donor", donor, new DonorRole() ,"labadmin@g.com");
        
        //=====================================================================================
       
        return ecosystem;
    }
    
}
