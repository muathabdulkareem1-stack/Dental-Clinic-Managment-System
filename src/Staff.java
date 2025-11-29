package dcc;

import java.util.*;
import java.time.LocalTime;
import java.util.List;

public abstract class Staff {
	private  String name;
	private String address;
	private int national_number;
	private int contact_number;
	private String job_description;
	 private List<Patient> patients = new ArrayList<>();
	 private List<Appointment> appointments = new ArrayList<>();
	
	
	public Staff() {
		
	}


	public Staff(String name, String address, int national_number, int contact_number) {
		
		this.name = name;
		this.address = address;
		this.national_number = national_number;
		this.contact_number = contact_number;
		
	}
	
	public void addToPatientsList(Patient pt) {
		patients.add(pt);
	}
	public void printPatientsList() {
		for (int i = 0; i < patients.size(); i++) {
			System.out.println(patients.get(i).getName());
		}
	}
		
		public void addToAppointmentsList( Appointment appointment) {
			appointments.add(appointment);
		}
		public void printAppointmentsList() {
			for (int i = 0; i < appointments.size(); i++) {
				System.out.println("Name: "+appointments.get(i).getPatient().getName() + "Time: "+appointments.get(i).getAppointment_time());
			}
		
	}
	public List<Patient> getPatients() {
			return patients;
		}


		public List<Appointment> getAppointments() {
			return appointments;
		}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}


	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}


	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getNational_number() {
		return national_number;
	}


	public void setNational_number(int national_number) {
		this.national_number = national_number;
	}


	public int getContact_number() {
		return contact_number;
	}


	public void setContact_number(int contact_number) {
		this.contact_number = contact_number;
	}


	public abstract String getJob_description();


	public abstract void setJob_description();
	
	



	

}
