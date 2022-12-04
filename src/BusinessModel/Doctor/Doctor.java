/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Doctor;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author siddh
 */
public class Doctor {
    
    private String doctor_UserName;
    private String doctor_Password;
    private String doctor_FirstName;
    private String doctor_LastName;
    private String doc_Gender;
    private int doc_Age;
    private Date doc_DOB;
    private String doc_PhoneNumber;
    private String doc_Mail;
    private String doc_Address;
    private String doc_ID;
    private String doc_Specialization;
    private String doc_Experience;
    private String doc_ImageUrl;
    private ArrayList<Patient> doc_AssessedPatientList;
    
    public Doctor() {
    
    }
     
    public Doctor(String doctor_UserName) {
        this.doctor_UserName = doctor_UserName;
        this.doc_AssessedPatientList = new ArrayList<Patient>();
    }
    public ArrayList<Patient> getDoc_AssessedPatientList() {
        return doc_AssessedPatientList;
    }

    public void setDoc_AssessedPatientList(ArrayList<Patient> doc_AssessedPatientList) {
        this.doc_AssessedPatientList = doc_AssessedPatientList;
    }

    public String getDoctor_UserName() {
        return doctor_UserName;
    }

    public void setDoctor_UserName(String doctor_UserName) {
        this.doctor_UserName = doctor_UserName;
    }

    public String getDoctor_Password() {
        return doctor_Password;
    }

    public void setDoctor_Password(String doctor_Password) {
        this.doctor_Password = doctor_Password;
    }

    public String getDoctor_FirstName() {
        return doctor_FirstName;
    }

    public void setDoctor_FirstName(String doctor_FirstName) {
        this.doctor_FirstName = doctor_FirstName;
    }

    public String getDoctor_LastName() {
        return doctor_LastName;
    }

    public void setDoctor_LastName(String doctor_LastName) {
        this.doctor_LastName = doctor_LastName;
    }

    public String getDoc_Gender() {
        return doc_Gender;
    }

    public void setDoc_Gender(String doc_Gender) {
        this.doc_Gender = doc_Gender;
    }

    public int getDoc_Age() {
        return doc_Age;
    }

    public void setDoc_Age(int doc_Age) {
        this.doc_Age = doc_Age;
    }

    public Date getDoc_DOB() {
        return doc_DOB;
    }

    public void setDoc_DOB(Date doc_DOB) {
        this.doc_DOB = doc_DOB;
    }

    public String getDoc_PhoneNumber() {
        return doc_PhoneNumber;
    }

    public void setDoc_PhoneNumber(String doc_PhoneNumber) {
        this.doc_PhoneNumber = doc_PhoneNumber;
    }

    public String getDoc_Mail() {
        return doc_Mail;
    }

    public void setDoc_Mail(String doc_Mail) {
        this.doc_Mail = doc_Mail;
    }

    public String getDoc_Address() {
        return doc_Address;
    }

    public void setDoc_Address(String doc_Address) {
        this.doc_Address = doc_Address;
    }

    public String getDoc_ID() {
        return doc_ID;
    }

    public void setDoc_ID(String doc_ID) {
        this.doc_ID = doc_ID;
    }

    public String getDoc_Specialization() {
        return doc_Specialization;
    }

    public void setDoc_Specialization(String doc_Specialization) {
        this.doc_Specialization = doc_Specialization;
    }

    public String getDoc_Experience() {
        return doc_Experience;
    }

    public void setDoc_Experience(String doc_Experience) {
        this.doc_Experience = doc_Experience;
    }

    public String getDoc_ImageUrl() {
        return doc_ImageUrl;
    }

    public void setDoc_ImageUrl(String doc_ImageUrl) {
        this.doc_ImageUrl = doc_ImageUrl;
    }
    
    @Override
    public String toString() {
        return doctor_FirstName;
    }
}
