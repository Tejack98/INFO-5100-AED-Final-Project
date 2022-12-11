/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.Enterprise.donorBank;

import healthcare.Ecosystem;
import healthcare.enterprise.Enterprise;
import healthcare.network.Network;
import healthcare.organization.Organization;
import healthcare.role.Role;
import healthcare.userAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;
import userinterface.DonorBankInterface.donor.DonorWorkArea;
import userinterface.DonorBankInterface.donorAdmin.DonorAdminWorkArea;

/**
 *
 * @author Tejas
 */
public class DonorRole extends Role{
    
    private String bloodType;
    private String Occupation;
    private String dateofbirth;
    private String blooddonate;
    private String sufferdisease;
    private String priorallergies;
    private String previousOrgDonation;

    public String getPreviousOrgDonation() {
        return previousOrgDonation;
    }

    public void setPreviousOrgDonation(String previousOrgDonation) {
        this.previousOrgDonation = previousOrgDonation;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getBlooddonate() {
        return blooddonate;
    }

    public void setBlooddonate(String blooddonate) {
        this.blooddonate = blooddonate;
    }

    public String getSufferdisease() {
        return sufferdisease;
    }

    public void setSufferdisease(String sufferdisease) {
        this.sufferdisease = sufferdisease;
    }

    public String getPriorallergies() {
        return priorallergies;
    }

    public void setPriorallergies(String priorallergies) {
        this.priorallergies = priorallergies;
    }
    
    @Override
    public String toString() {
        return String.valueOf("Donor");
    }
    
    @Override
    public JFrame createWorkArea(UserAccount userAccount, Organization organization, Enterprise enterprise, Ecosystem ecosystem, Network network) { 
        return new DonorWorkArea(ecosystem,userAccount, organization, enterprise, network );       
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    
}
