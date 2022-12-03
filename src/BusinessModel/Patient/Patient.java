/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Patient;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kshama
 */
public class Patient {
    
    private String patient_UserName;
    private String patient_FirstName;
    private String patient_LastName;
    private String patient_Gender;
    private String patient_PictureUrl;
    private int patient_Age;
    private Date patient_Dob;
    private String patient_Address;
    private String patient_EmailAddress;
    private String patient_MobNum;
    private String patient_HealthInsuranceID;
    private String patient_BloodType;
    private String patient_TypeOfInjury;
    private Date patient_AdmitDate;
    private String patient_LocationOfAccident;
    private String patient_Status;
    private String patient_BloodBagQuantity;
    private String patient_InsuranceStatus;
    private String patient_LabStatus;
    private String patient_PharmaStatus;
    private String pBloodBankStatus;
    private String patient_PoliceStatus;
    private boolean patient_MedicalConsentform;
    private ArrayList<PatientBills> patient_bills;

    public Patient() {
    }

    public Patient(String patient_UserName) {
        this.patient_UserName = patient_UserName;
        patient_bills = new ArrayList<>();
    }
    
    
    public String getpatient_UserName() {
        return patient_UserName;
    }

    public void setpatient_UserName(String patient_UserName) {
        this.patient_UserName = patient_UserName;
    }

    public String getpatient_FirstName() {
        return patient_FirstName;
    }

    public void setpatient_FirstName(String patient_FirstName) {
        this.patient_FirstName = patient_FirstName;
    }

    public String getpatient_LastName() {
        return patient_LastName;
    }

    public void setpatient_LastName(String patient_LastName) {
        this.patient_LastName = patient_LastName;
    }

    public String getpatient_Gender() {
        return patient_Gender;
    }

    public void setpatient_Gender(String patient_Gender) {
        this.patient_Gender = patient_Gender;
    }

    public String getpatient_PictureUrl() {
        return patient_PictureUrl;
    }

    public void setpatient_PictureUrl(String patient_PictureUrl) {
        this.patient_PictureUrl = patient_PictureUrl;
    }

    public int getpatient_Age() {
        return patient_Age;
    }

    public void setpatient_Age(int patient_Age) {
        this.patient_Age = patient_Age;
    }

    public Date getPdob() {
        return patient_Dob;
    }

    public void setPdob(Date patient_Dob) {
        this.patient_Dob = patient_Dob;
    }

    public String getpatient_Address() {
        return patient_Address;
    }

    public void setpatient_Address(String patient_Address) {
        this.patient_Address = patient_Address;
    }

    public String getpatient_EmailAddress() {
        return patient_EmailAddress;
    }

    public void setpatient_EmailAddress(String patient_EmailAddress) {
        this.patient_EmailAddress = patient_EmailAddress;
    }

    public String getpatient_MobNum() {
        return patient_MobNum;
    }

    public void setpatient_MobNum(String patient_MobNum) {
        this.patient_MobNum = patient_MobNum;
    }

    public String getpatient_HealthInsuranceID() {
        return patient_HealthInsuranceID;
    }

    public void setpatient_HealthInsuranceID(String patient_HealthInsuranceID) {
        this.patient_HealthInsuranceID = patient_HealthInsuranceID;
    }

    public String getpatient_BloodType() {
        return patient_BloodType;
    }

    public void setpatient_BloodType(String patient_BloodType) {
        this.patient_BloodType = patient_BloodType;
    }

    public String getpatient_TypeOfInjury() {
        return patient_TypeOfInjury;
    }

    public void setpatient_TypeOfInjury(String patient_TypeOfInjury) {
        this.patient_TypeOfInjury = patient_TypeOfInjury;
    }

    public Date getpatient_AdmitDate() {
        return patient_AdmitDate;
    }

    public void setpatient_AdmitDate(Date patient_AdmitDate) {
        this.patient_AdmitDate = patient_AdmitDate;
    }

    public String getpatient_LocationOfAccident() {
        return patient_LocationOfAccident;
    }

    public void setpatient_LocationOfAccident(String patient_LocationOfAccident) {
        this.patient_LocationOfAccident = patient_LocationOfAccident;
    }

    public String getpatient_Status() {
        return patient_Status;
    }

    public void setpatient_Status(String patient_Status) {
        this.patient_Status = patient_Status;
    }

    public String getpatient_BloodBagQuantity() {
        return patient_BloodBagQuantity;
    }

    public void setpatient_BloodBagQuantity(String patient_BloodBagQuantity) {
        this.patient_BloodBagQuantity = patient_BloodBagQuantity;
    }

    public String getpatient_InsuranceStatus() {
        return patient_InsuranceStatus;
    }

    public void setpatient_InsuranceStatus(String patient_InsuranceStatus) {
        this.patient_InsuranceStatus = patient_InsuranceStatus;
    }

    public String getpatient_LabStatus() {
        return patient_LabStatus;
    }

    public void setpatient_LabStatus(String patient_LabStatus) {
        this.patient_LabStatus = patient_LabStatus;
    }

    public String getpatient_PharmaStatus() {
        return patient_PharmaStatus;
    }

    public void setpatient_PharmaStatus(String patient_PharmaStatus) {
        this.patient_PharmaStatus = patient_PharmaStatus;
    }

    public String getpBloodBankStatus() {
        return pBloodBankStatus;
    }

    public void setpBloodBankStatus(String pBloodBankStatus) {
        this.pBloodBankStatus = pBloodBankStatus;
    }

    public String getpatient_PoliceStatus() {
        return patient_PoliceStatus;
    }

    public void setpatient_PoliceStatus(String patient_PoliceStatus) {
        this.patient_PoliceStatus = patient_PoliceStatus;
    }

    public boolean ispatient_MedicalConsentform() {
        return patient_MedicalConsentform;
    }

    public void setpatient_MedicalConsentform(boolean patient_MedicalConsentform) {
        this.patient_MedicalConsentform = patient_MedicalConsentform;
    }

    public ArrayList<PatientBills> getpatient_bills() {
        return patient_bills;
    }

    public void setpatient_bills(ArrayList<PatientBills> patient_bills) {
        this.patient_bills = patient_bills;
    }
    
    public void addbill(PatientBills bill){
        patient_bills.add(bill);
    } 
     public float totalBill() {
        float total =0;
           for(PatientBills b:patient_bills){
               total =  total + b.getAmount();
        }
        return total;
    }
    
    
}
