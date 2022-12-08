/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import healthcare.Enterprise.donorBank.DonorAdminRole;
import healthcare.Enterprise.donorBank.DonorRole;
import healthcare.enterprise.Enterprise;
import healthcare.enterprise.healthCare.DoctorRole;
import healthcare.enterprise.healthCare.HealthCareAdminRole;
import healthcare.enterprise.healthCare.NurseRole;
import healthcare.enterprise.healthCare.PatientRole;
import healthcare.enterprise.lab.LabAdminRole;
import healthcare.enterprise.lab.LabAssistantRole;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.person.Person;
import healthcare.systemAdmin.AdminMasterRole;
import healthcare.userAccount.UserAccount;
import static java.time.Clock.system;
import javax.net.ssl.HostnameVerifier;

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
       
        Network network = ecosystem.createAndAddNetwork();
        network.setNetworkName("BostonNetwork");
        Enterprise enterprise = network.getEnterpriseMasterList().createAndAddEnterprise(Enterprise.EnterpriseType.HealthCare, "My Hospital");
        Enterprise enterprise2 = network.getEnterpriseMasterList().createAndAddEnterprise(Enterprise.EnterpriseType.DonorBank, "Donor Bank");
        Enterprise enterprise3 = network.getEnterpriseMasterList().createAndAddEnterprise(Enterprise.EnterpriseType.EmergencyUnit, "Emergency Unit");
        Enterprise enterprise4 = network.getEnterpriseMasterList().createAndAddEnterprise(Enterprise.EnterpriseType.Lab, "Clinical Lab");
        Enterprise enterprise5 = network.getEnterpriseMasterList().createAndAddEnterprise(Enterprise.EnterpriseType.Pharmacy, "Wellness Pharma");
        Enterprise enterprise6 = network.getEnterpriseMasterList().createAndAddEnterprise(Enterprise.EnterpriseType.SupplyChain, "Insta Med");
        Enterprise enterprise7 = network.getEnterpriseMasterList().createAndAddEnterprise(Enterprise.EnterpriseType.Vaccination, "Vaccination Ent");
        
        
        //=================================================================
        
        Organization org = enterprise.getOrganizationDirectory().createNewOrganization(Organization.OrganizationType.Doctor);
        
        Person person = enterprise.getPersonDirectory().createAndAddPerson("tej","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034")); 
        Person person2 = enterprise.getPersonDirectory().createAndAddPerson("tej","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034")); 
        Person person3 = enterprise.getPersonDirectory().createAndAddPerson("Pan","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        Person person4 = enterprise.getPersonDirectory().createAndAddPerson("mat","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        
        DoctorRole d1 = new DoctorRole();
        d1.setHospitalName("myHospital");
        d1.setSpeciality("Cardiologist");
        
        NurseRole n1 = new NurseRole();
        n1.setHospitalName("myHospital1");
        n1.setGender("Female");
        
        UserAccount u = org.getUserAccountDirectory().createUserAccount(4444,"doc", "doc", person, d1,"t@g.com");
        UserAccount u2 = enterprise.getUserAccountDirectory().createUserAccount(1111,"hadmin", "hadmin", person2,new HealthCareAdminRole(),"t@g.com");
        UserAccount u3 = org.getUserAccountDirectory().createUserAccount(2222,"pat", "pat", person3, new PatientRole(),"s@g.com");
        UserAccount u4 = org.getUserAccountDirectory().createUserAccount(3333,"nurse", "nurse", person4, new NurseRole() ,"s@g.com");
        
        
        return ecosystem;
    }
    
}
