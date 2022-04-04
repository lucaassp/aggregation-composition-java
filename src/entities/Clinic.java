package entities;

import java.util.HashMap;
import java.util.Map;

public class Clinic {
	
	private Map<Patient, Chart> chart = new HashMap<>();
	
	public void addPatient(Patient patient) {
		chart.put(patient, new Chart(patient));
	}


	public Chart getChart(Patient patient) {
		return chart.get (patient);
	}
}
