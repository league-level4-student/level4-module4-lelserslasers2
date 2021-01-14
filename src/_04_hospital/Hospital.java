package _04_hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> docters = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public void addDoctor(Doctor doctor) {
		docters.add(doctor);
	}
	
	public void addPatient(Patient patient) {
		patients.add(patient);
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public ArrayList<Doctor> getDoctors() {
		return docters;
	}
	
	
}
