package entities;

import java.util.LinkedList;
import java.util.List;

public class Chart {
	
	private Patient patient;
	private List<Consultation> consultations = new LinkedList<Consultation>();
	
	public Chart(Patient patient) {
		this.patient = patient;
	}

	public Consultation crieteConsultation() {
		Consultation consultation = new Consultation(this);
		consultations.add(consultation);
		return consultation;
	}
	
	public List<Consultation> getConsultations() {
		return consultations;
	}
}
