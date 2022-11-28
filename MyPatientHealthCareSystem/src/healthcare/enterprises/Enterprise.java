/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprises;

/**
 *
 * @author Shriya
 */
public class Enterprise {
    
    private EnterpriseType enterpriseType;
    
    public enum EnterpriseType{
        HealthCare("HealthCare"),
        DonorBank("DonorBank"),
        Pharmacy("Pharmacy"),
        Lab("Lab"),
        EmergencyUnit("EmergencyUnit"),
        SupplyChain("SupplyChain");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
     
}
