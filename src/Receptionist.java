package dcc;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Receptionist extends Staff {
	private String job_descriptionString = "receptionist";
	
	
	
	public Patient addPatient() {
		int appointmentHour = 0;
		int appointmentMinute = 0;
		Patient testPatient;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello !\n press 1 if you are an ordinary patient \n2 if you are a dental student \n3 if you are a dental consultant");
		int result = scanner.nextInt();
		Patient pt;
		switch (result) {
		case 1: {
			pt = new Ordinary_Patient();
			break;
		}
		case 2 :{
			pt = new Dentist_Student();
			break;
		}
		case 3 :{
			pt = new Dental_Consultant();
			break;
		}
		default:
			pt = new Ordinary_Patient();
			break;
		}
		
		System.out.println("please enter your name \n");
		String name = scanner.next();
		pt.setName(name);
		System.out.println("please enter your address \n");
		String address = scanner.next();
		pt.setAddress(address);
		System.out.println("please enter your national number \n");
		int national_number = scanner.nextInt();
		pt.setNational_number(national_number);
		System.out.println("please enter your contact number\n");
		int contact_number = scanner.nextInt();
		pt.setContact_number(contact_number);
		System.out.println("enter appointment hour");
		appointmentHour = scanner.nextInt();
		System.out.println("enter appointment minute");
		appointmentMinute = scanner.nextInt();
		LocalTime localTime = LocalTime.of(appointmentHour, appointmentMinute);
		
		
		Appointment appointment = new Appointment( localTime,pt);
		addToAppointmentsList(appointment);
		pt.setAppointment(appointment);
		addToPatientsList(pt);
		return pt;
		
		

	}
	


		
	
	public double calculateBill() {
		double result = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter national number");
		int nationalNumber = scanner.nextInt();
		for (int i = 0; i < getPatients().size(); i++) {
			if (nationalNumber == getPatients().get(i).getNational_number()) {
				result = getPatients().get(i).getFees();
			}
		}
		return result;
	}
	
	public void printBill() {
		System.out.println("Total Fees" + calculateBill( ));
	}

	public void printAppointment(String name) {
		for (int i = 0; i < getAppointments().size(); i++) {
			if (getAppointments().get(i).getPatient().getName() == name) {
				System.out.println(getAppointments().get(i).getAppointment_time());
			}
		}
		
	}
	public void printAppointmentsList() {
		for (int i = 0; i < getAppointments().size(); i++) {
			System.out.println("Name: "+ getAppointments().get(i).getPatient().getName()+" Time: "+getAppointments().get(i).getAppointment_time());
		}
	}





	@Override
	public String getJob_description() {
		// TODO Auto-generated method stub
		return job_descriptionString;
	}





	@Override
	public void setJob_description() {
		this.job_descriptionString = "receptionist";
		
	}
	
}
