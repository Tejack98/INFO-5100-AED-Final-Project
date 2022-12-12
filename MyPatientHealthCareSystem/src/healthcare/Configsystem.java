/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare;

import healthcare.Enterprise.donorBank.DonorAdminRole;
import healthcare.Enterprise.donorBank.DonorRole;
import healthcare.enterprise.Enterprise;
import healthcare.enterprise.donorBank.DonationHandlerRole;
import healthcare.enterprise.emergencyUnit.AmbulanceHandlerRole;
import healthcare.enterprise.emergencyUnit.EmergencyUnitAdminRole;
import healthcare.enterprise.healthCare.DoctorRole;
import healthcare.enterprise.healthCare.HealthCareAdminRole;
import healthcare.enterprise.healthCare.NurseRole;
import healthcare.enterprise.healthCare.PatientRole;
import healthcare.enterprise.lab.LabAdminRole;
import healthcare.enterprise.lab.LabAssistantRole;
import healthcare.enterprise.pharmacy.PharmacistRole;
import healthcare.enterprise.pharmacy.PharmacyAdminRole;
import healthcare.enterprise.supplyChain.HandlerRole;
import healthcare.enterprise.supplyChain.SupplyManagerRole;
import healthcare.enterprise.vaccination.VaccinationAdminRole;
import healthcare.enterprise.vaccination.VaccinatorRole;
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
        
        Organization orgdoc = enterprise.getOrganizationDirectory().createNewOrganization(Organization.OrganizationType.Doctor);
        Organization orgnurse = enterprise.getOrganizationDirectory().createNewOrganization(Organization.OrganizationType.Nurse);
        Organization orgpat = enterprise.getOrganizationDirectory().createNewOrganization(Organization.OrganizationType.Patient);
        Organization orglab = enterprise4.getOrganizationDirectory().createNewOrganization(Organization.OrganizationType.Lab);
        Organization orgDonor = enterprise2.getOrganizationDirectory().createNewOrganization(Organization.OrganizationType.DonorBank);
        Organization orgpharmacy = enterprise5.getOrganizationDirectory().createNewOrganization(Organization.OrganizationType.Pharmacy);
        Organization orgsupplier = enterprise6.getOrganizationDirectory().createNewOrganization(Organization.OrganizationType.Supplier);
        Organization orgvehicle = enterprise6.getOrganizationDirectory().createNewOrganization(Organization.OrganizationType.Vehicle);
        Organization orgEmergUnit = enterprise3.getOrganizationDirectory().createNewOrganization(Organization.OrganizationType.EmergencyUnit);
        Organization orgAmbulnce = enterprise3.getOrganizationDirectory().createNewOrganization(Organization.OrganizationType.Ambulance);
        Organization orgVacc = enterprise7.getOrganizationDirectory().createNewOrganization(Organization.OrganizationType.Vaccination);
        
        
        Person person = orgdoc.getPersonDirectory().createAndAddPerson("tej","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034")); 
        Person person2 = enterprise.getPersonDirectory().createAndAddPerson("tej","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034")); 
        Person person3 = orgnurse.getPersonDirectory().createAndAddPerson("Pan","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        Person person4 = orgpat.getPersonDirectory().createAndAddPerson("mat","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        Person person5 = orglab.getPersonDirectory().createAndAddPerson("Mak","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        Person person6 = orglab.getPersonDirectory().createAndAddPerson("Tej","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        Person person7 = orgpharmacy.getPersonDirectory().createAndAddPerson("PPa","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        Person person8 = orgpharmacy.getPersonDirectory().createAndAddPerson("vfd","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        Person person9 = orgEmergUnit.getPersonDirectory().createAndAddPerson("fvd","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        Person person10 = orgEmergUnit.getPersonDirectory().createAndAddPerson("hnt","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        Person person11 = orgVacc.getPersonDirectory().createAndAddPerson("hbg","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        Person person12 = orgVacc.getPersonDirectory().createAndAddPerson("adf","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        
        DoctorRole d1 = new DoctorRole();
        d1.setHospitalName("myHospital");
        d1.setSpeciality("Cardiologist");
        
        NurseRole n1 = new NurseRole();
        n1.setHospitalName("myHospital1");
        n1.setGender("Female");
        
        PatientRole p1 = new PatientRole();
        p1.setHospitalName("myHospital1");
        p1.setGender("Female");
        
        UserAccount u = orgdoc.getUserAccountDirectory().createUserAccount(4444,"doc", "doc", person, d1,"t@g.com");
        UserAccount u2 = enterprise.getUserAccountDirectory().createUserAccount(1111,"hadmin", "hadmin", person2,new HealthCareAdminRole(),"t@g.com");
        UserAccount u3 = orgpat.getUserAccountDirectory().createUserAccount(2222,"pat", "pat", person3, p1,"s@g.com");
        UserAccount u4 = orgnurse.getUserAccountDirectory().createUserAccount(3333,"nurse", "nurse", person4, new NurseRole() ,"s@g.com");
        UserAccount u5 = orglab.getUserAccountDirectory().createUserAccount(2322,"alab", "alab", person5, new LabAdminRole() ,"s@g.com");
        UserAccount u6 = orglab.getUserAccountDirectory().createUserAccount(2233,"lab", "lab", person6, new LabAssistantRole() ,"s@g.com");
        UserAccount u7 = orgpharmacy.getUserAccountDirectory().createUserAccount(2323,"aphr", "aphr", person7, new PharmacyAdminRole() ,"s@g.com");
        UserAccount u8 = orgpharmacy.getUserAccountDirectory().createUserAccount(5433,"phr", "phr", person8, new PharmacistRole() ,"s@g.com");
        UserAccount u9 = orgsupplier.getUserAccountDirectory().createUserAccount(2323,"smgr", "smgr", person7, new SupplyManagerRole() ,"s@g.com");
        UserAccount u10 = orgsupplier.getUserAccountDirectory().createUserAccount(5033,"han", "han", person8, new HandlerRole() ,"s@g.com");
        UserAccount u11 = orgEmergUnit.getUserAccountDirectory().createUserAccount(2323,"aemg", "aemg", person9, new EmergencyUnitAdminRole() ,"s@g.com");
        UserAccount u12 = orgEmergUnit.getUserAccountDirectory().createUserAccount(5033,"ahan", "ahan", person10, new AmbulanceHandlerRole() ,"s@g.com");
        UserAccount u13 = orgVacc.getUserAccountDirectory().createUserAccount(4544,"vac", "vac", person11, new VaccinatorRole() ,"s@g.com");
        UserAccount u14 = orgVacc.getUserAccountDirectory().createUserAccount(6555,"avac", "avac", person12, new VaccinationAdminRole() ,"s@g.com");
        

        Person dadmin = orgDonor.getPersonDirectory().createAndAddPerson("tej","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        Person donor = orgDonor.getPersonDirectory().createAndAddPerson("Shr","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        Person donorHandler = orgDonor.getPersonDirectory().createAndAddPerson("DHan","75 Saint Alphonso","Boston","MA",Long.parseLong("02120"),Long.parseLong("8576938034"));
        
        UserAccount daminUser = orgDonor.getUserAccountDirectory().createUserAccount(7777,"dadmin", "dadmin", dadmin, new DonorAdminRole() ,"labadmin@g.com");
        UserAccount donor_user = orgDonor.getUserAccountDirectory().createUserAccount(8888,"donor", "donor", donor, new DonorRole() ,"labadmin@g.com");
        UserAccount donor_Hand_user = orgDonor.getUserAccountDirectory().createUserAccount(8888,"hdon", "hdon", donorHandler, new DonationHandlerRole(),"labadmin@g.com");
        
        return ecosystem;
    }
    
}
