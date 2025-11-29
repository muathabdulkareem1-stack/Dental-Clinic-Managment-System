package dcc;

import java.util.ArrayList;
import java.util.List;

public  abstract class Patient {
	private  String name;
	private String address;
	private int national_number;
	private int contact_number;
	private String treatmentDescription;
	private Appointment appointment;
	private List<Medicine> medicines = new ArrayList<>();

	public Patient() {
	
	}
	public Patient(String name, String address, int national_number, int contact_number,Appointment appointment) {
		
		this.name = name;
		this.address = address;
		this.national_number = national_number;
		this.contact_number = contact_number;
		this.appointment = appointment;
		
		
	}
	public void addToMedicineList( Medicine medicine) {
		medicines.add(medicine);
	}
	public void printMedicineList() {
		for (Medicine medicine : medicines) {
			System.out.println(medicine);
		}
	}
	
	
		
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	public String getTreatmentDescription() {
		return treatmentDescription;
	}
	public void setTreatmentDescription(String treatmentDescription) {
		this.treatmentDescription = treatmentDescription;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public abstract double getFees();
	
	public abstract void setFees();
	
	public  List<Medicine> getMedicines() {
		return medicines;
	}

}
