/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Doctor;

import BusinessModel.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author podda
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorsList;
    
    public DoctorDirectory() {
        doctorsList = new ArrayList<Doctor>();
    }
    
    public Doctor createDoctor(Doctor doc) {
        Doctor doctor = new Doctor(doc.getDoctor_UserName());
        doctorsList.add(doc);
        return doctor;
    }

    public void deleteDoc(Doctor p) {
        doctorsList.remove(p);
    }

    public Doctor AddPatient(Doctor doctor, Patient patient) {
        System.out.println("doc existing patients--"+doctor.getDoc_AssessedPatientList());
        doctor.getDoc_AssessedPatientList().add(patient);
        return doctor;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctorsList;
    }

    public void setDoctors(ArrayList<Doctor> doctorsList) {
        this.doctorsList = doctorsList;
    }
    
    
}
