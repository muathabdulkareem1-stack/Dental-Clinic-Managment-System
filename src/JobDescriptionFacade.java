package dcc;

public class JobDescriptionFacade {
	Receptionist receptionist = new Receptionist();
	Doctor doctor = new Doctor();
	Nurse nurse = new Nurse();
	
	public void printjobDescriptionforAllStaff() {
		System.out.println("nurse job description : " + nurse.getJob_description());
		System.out.println("doctor job description : " + doctor.getJob_description());
		System.out.println("reciptionist job description : " + receptionist.getJob_description());
	}

}
