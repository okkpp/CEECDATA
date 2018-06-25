package okkpp.model;

import java.util.HashMap;

public class DataModel {

	private String country;
	private String year;
	private HashMap<String, String> fields;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public HashMap<String, String> getFields() {
		return fields;
	}

	public void setFields(HashMap<String, String> fields) {
		this.fields = fields;
	}

	@Override
	public String toString() {
		return "DataModel [country=" + country + ", year=" + year + ", fields=" + fields + "]";
	}

}
