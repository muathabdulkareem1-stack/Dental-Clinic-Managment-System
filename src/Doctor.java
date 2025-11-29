package dcc;

import java.util.List;
import java.util.Scanner;

public class Doctor extends Staff {
	
	private String job_description = "Doctor";
	
	public void addMedicine() {
		int nationalNumber = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter national number of the patient");
		nationalNumber = scanner.nextInt();
		System.out.println("enter name of medicine");
		String name = scanner.next();
		System.out.println("enter dose of medicine");
		int dose = scanner.nextInt();
		Medicine medicine = new Medicine(name, dose);
		for (int i = 0; i < getPatients().size(); i++) {
			if (getPatients().get(i).getNational_number() == nationalNumber) {
				getPatients().get(i).addToMedicineList(medicine);
			}
		}
		
		
	}

	public void addTreatmentDescription() {
		int nationalNumber = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter national number of the patient");
		nationalNumber = scanner.nextInt();
		System.out.println("what is the treatment description");
		String treatmentDescription = scanner.next();
		for (int i = 0; i < getPatients().size(); i++) {
			if (getPatients().get(i).getNational_number() == nationalNumber) {
				getPatients().get(i).setTreatmentDescription(treatmentDescription);
			}
		}
		
	}

	@Override
	public String getJob_description() {
		// TODO Auto-generated method stub
		return job_description;
	}

	@Override
	public void setJob_description() {
		this.job_description = "doctor";
		
	}
}
