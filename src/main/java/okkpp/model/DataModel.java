package okkpp.model;

public class DataModel {
	
	private String country;
	private String year;
	private String target;
	private String targetValue;
	
	public String getTargetValue() {
		return targetValue;
	}
	public void setTargetValue(String targetValue) {
		this.targetValue = targetValue;
	}
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
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "DataModel [country=" + country + ", year=" + year + ", target=" + target + ", targetValue="
				+ targetValue + "]";
	}
	
	
}
