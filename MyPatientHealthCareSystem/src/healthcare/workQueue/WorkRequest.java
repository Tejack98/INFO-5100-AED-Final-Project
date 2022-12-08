/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthcare.workQueue;

import healthcare.userAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Tejas
 */
public class WorkRequest {
    
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private int hashcode;
    private String labresult;
    private String resulttype;
    private String solution;
    private String appointmentDecision;
    private String fromDate;
    private String toDate;
    
    private String doc_med_history;
    private String lab_solution;
    private String diagnose;
    
    public void setAppointmentDecision(String appointmentDecision) {
        this.appointmentDecision = appointmentDecision;}
    private String medlist="";
    
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public int getHashcode() {
        return hashcode;
    }

    public void setHashcode(int hashcode) {
        this.hashcode = hashcode;
    }

    public String getLabresult() {
        return labresult;
    }

    public void setLabresult(String labresult) {
        this.labresult = labresult;
    }

    public String getResulttype() {
        return resulttype;
    }

    public void setResulttype(String resulttype) {
        this.resulttype = resulttype;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getDoc_med_history() {
        return doc_med_history;
    }

    public void setDoc_med_history(String doc_med_history) {
        this.doc_med_history = doc_med_history;
    }

    public String getLab_solution() {
        return lab_solution;
    }

    public void setLab_solution(String lab_solution) {
        this.lab_solution = lab_solution;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getMedlist() {
        return medlist;
    }

    public void setMedlist(String medlist) {
        this.medlist = medlist;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.message);
    }
    
}
