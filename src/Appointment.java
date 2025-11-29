package dcc;

import java.time.LocalTime;

public class Appointment {
	
	private LocalTime start_accepting_appointments = LocalTime.of(10, 0);
	private LocalTime stop_accepting_appointments = LocalTime.of(18, 30);
	private Patient patient;
	private LocalTime appointment_time;
	public Appointment( LocalTime appointment_time,Patient patient) {
		if (appointment_time.isAfter(start_accepting_appointments) || appointment_time.isBefore(stop_accepting_appointments)) {
		this.appointment_time = appointment_time;
		this.patient = patient;	
	}
		
	
		
	}
	
	public Patient getPatient() {
		return patient;
	}

	public LocalTime getAppointment_time() {
		return appointment_time;
	}
	public void setAppointment_time(LocalTime appointment_time) {
		this.appointment_time = appointment_time;
	}
	

}
			

