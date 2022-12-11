/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.enterprise.emergencyUnit;

/**
 *
 * @author Tejas
 */
public class Ambulance {
    private String ambulanceName;
    private String ambulanceNumber;
    private String ambulanceType;
    private String ambulanceDescription;
    private String ambulanceStatus;

    public Ambulance(String ambulanceName, String ambulanceNumber, String ambulanceType, String ambulanceDescription, String status) {
        this.ambulanceName = ambulanceName;
        this.ambulanceNumber = ambulanceNumber;
        this.ambulanceType = ambulanceType;
        this.ambulanceDescription = ambulanceDescription;
        this.ambulanceStatus = status;
    }

    public String getAmbulanceName() {
        return ambulanceName;
    }

    public void setAmbulanceName(String ambulanceName) {
        this.ambulanceName = ambulanceName;
    }

    public String getAmbulanceNumber() {
        return ambulanceNumber;
    }

    public void setAmbulanceNumber(String ambulanceNumber) {
        this.ambulanceNumber = ambulanceNumber;
    }

    public String getAmbulanceType() {
        return ambulanceType;
    }

    public void setAmbulanceType(String ambulanceType) {
        this.ambulanceType = ambulanceType;
    }

    public String getAmbulanceDescription() {
        return ambulanceDescription;
    }

    public void setAmbulanceDescription(String ambulanceDescription) {
        this.ambulanceDescription = ambulanceDescription;
    }

    public String getAmbulanceStatus() {
        return ambulanceStatus;
    }

    public void setAmbulanceStatus(String ambulanceStatus) {
        this.ambulanceStatus = ambulanceStatus;
    }
    
}
