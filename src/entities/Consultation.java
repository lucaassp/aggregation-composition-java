package entities;

import java.util.Calendar;

public class Consultation {
	
	private Chart chart;
	private String descripition;
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
		return descripition;
	}

	public void setDescripition(String descripition) {
		this.descripition = descripition;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
	
	
}
