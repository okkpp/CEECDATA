package okkpp.model;

import java.util.HashMap;

public class DataModel {
	
	private String country;
	private String year;
	private HashMap<String, String> map;
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
	public HashMap<String, String> getMap() {
		return map;
	}
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "DataModel [country=" + country + ", year=" + year + ", map=" + map + "]";
	}
	
}
