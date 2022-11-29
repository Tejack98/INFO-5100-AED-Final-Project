/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.jobQueue;

import java.util.ArrayList;

/**
 *
 * @author Shriya
 */
public class JobQueue {
    
    private ArrayList<JobRequest> jobRequestList;
    private ArrayList<PatientAppointmentRequest> patientAppointmentRequest;
    private ArrayList<DoctorLabRequest> doctorLabRequest;

    public JobQueue() {
        this.jobRequestList = new ArrayList<>();
        this.patientAppointmentRequest =  new ArrayList<>(); 
        this.doctorLabRequest = new ArrayList<>();
    }

    public ArrayList<JobRequest> getJobRequestList() {
        return jobRequestList;
    }

    public ArrayList<PatientAppointmentRequest> getPatientAppointmentRequest() {
        return patientAppointmentRequest;
    }

    public void setPatientAppointmentRequest(ArrayList<PatientAppointmentRequest> patientAppointmentRequest) {
        this.patientAppointmentRequest = patientAppointmentRequest;
    }

    public ArrayList<DoctorLabRequest> getDoctorLabRequest() {
        return doctorLabRequest;
    }

    public void setDoctorLabRequest(ArrayList<DoctorLabRequest> doctorLabRequest) {
        this.doctorLabRequest = doctorLabRequest;
    }

}
