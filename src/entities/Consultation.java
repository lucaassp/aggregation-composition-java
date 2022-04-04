package entities;

import java.util.Calendar;

public class Consultation implements Event {
	
	private Chart chart;
	private String registerConsultation;
	private Calendar data;
	
	public Consultation(Chart chart) {
		this.chart = chart;
		data = Calendar.getInstance();
	}

	public Chart getChart() {
		return chart;
	}

	public void setChart(Chart chart) {
		this.chart = chart;
	}

	public String getDescripition() {
		return chart.getPatient().getName();
	}
	
	
	public String getRegisterConsultation() {
		return registerConsultation;
	}

	public void setRegisterConsultation(String registerConsultation) {
		this.registerConsultation = registerConsultation;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Calendar getDate() {
		return data;
	}
}
