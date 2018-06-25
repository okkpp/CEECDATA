package okkpp.model;

import java.util.HashMap;

public class DataModel2 {

	private String country;
	private String target;
	private HashMap<String, String> fields;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public HashMap<String, String> getFields() {
		return fields;
	}

	public void setFields(HashMap<String, String> fields) {
		this.fields = fields;
	}

	@Override
	public String toString() {
		return "DataModel2 [country=" + country + ", target=" + target + ", fields=" + fields + "]";
	}

}
