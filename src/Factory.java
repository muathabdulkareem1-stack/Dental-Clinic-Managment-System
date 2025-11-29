package dcc;

import java.util.Scanner;

public class Factory {

	public void nurseSwitch(Nurse nurse) {
		System.out.println("report has been generated");
		nurse.printReport();
	}
	
	public void reciptionistSwitch(Receptionist receptionist, Doctor doctor) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("press 1 to add patient\n press 2 to print bill to patient\npress 3 to print appointments");
		int rcResult = scanner.nextInt();
		switch (rcResult) {
		case 1:
			Patient pt = receptionist.addPatient();
			doctor.addToPatientsList(pt);
			System.out.println("DD");
			break;
		case 2:
			receptionist.printBill();
			break;
		default:
			receptionist.printAppointmentsList();
			break;
		}
	}
	
	public void doctorSwitch(Doctor doctor) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("press 1 to add medicine\n press 2 to add treatment description");
		int doctorResult = scanner.nextInt();
		switch (doctorResult) {
		case 1:
			doctor.addMedicine();
			break;

		default:
			doctor.addTreatmentDescription();
			break;
	}
	}
	
	public void StartSystem() {
		Receptionist receptionist = new Receptionist();
		Nurse nurse = new Nurse();
		Doctor doctor = new Doctor();

		int result = 0;
		while (result != 4) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("welcome to the dcc system\npress 1 for doctor\npress 2 for receptionist\npress 3 for nurse\n press 4 to exit the system");
			 result = scanner.nextInt();
			switch (result) {
			case 1:
				doctorSwitch(doctor);
				break;
			
			case 2:
				reciptionistSwitch(receptionist, doctor);
				break;
			case 3:
				nurse.setPatients(receptionist.getPatients());
				nurseSwitch(nurse);
				break;
			default:
				System.out.println("thank you for using the system");
				break;
		}
	}

		}
	}


