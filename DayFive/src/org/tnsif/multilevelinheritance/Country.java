package org.tnsif.multilevelinheritance;

public class Country {
	private String CountryName;
	private String CountryCapital;
	
	//getter and setter methods
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		this.CountryName = countryName;
	}
	public String getCountryCapital() {
		return CountryCapital;
	}
	public void setCountryCapital(String countryCapital) {
		this.CountryCapital = countryCapital;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Country [CountryName=" + CountryName + ", CountryCapital=" + CountryCapital + "]";
	}
	
	
	

}