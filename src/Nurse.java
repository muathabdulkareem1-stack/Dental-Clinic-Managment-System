package dcc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Nurse extends Staff {
	private String job_description = "nurse";
	
	public void printReport() {
		try {
			FileWriter fileWriter = new FileWriter("report.txt");
			fileWriter.write(generateReport());
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public String generateReport() {
			
			String stringToReturn= "";
			for (Patient  patient : getPatients()) {
				stringToReturn += "Appointment time:" + patient.getAppointment().getAppointment_time() + "\n";
				stringToReturn += "National Number: " +  patient.getNational_number() + "\n";
				stringToReturn += "Patient Name: "  + patient.getName() + "\n";
				stringToReturn += "Medicines: " + "\n";
				for (int i = 0; i < patient.getMedicines().size(); i++) {
					Medicine md= patient.getMedicines().get(i);
					stringToReturn += i+1 + " : " + md.getName() + "- (Dose: " + md.getDose() + ")\n";
				}
				stringToReturn += "Treatment Description: " + patient.getTreatmentDescription() + "\n";
				stringToReturn += "-----------------------------------------"+ "\n";
			}
			return stringToReturn;
	}


	@Override
	public String getJob_description() {
		// TODO Auto-generated method stub
		return job_description;
	}


	@Override
	public void setJob_description() {
		// TODO Auto-generated method stub
		this.job_description = "nurse";
	}
		}

	
	
