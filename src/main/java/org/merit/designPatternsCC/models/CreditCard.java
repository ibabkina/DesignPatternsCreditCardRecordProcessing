package org.merit.designPatternsCC.models;

public abstract class CreditCard {
	
	private String number;
	private String expDate;
	private String name;
	
	
	public CreditCard() {}
	
	public CreditCard(String number, String expDate, String name) {
		this.number = number;
		this.expDate = expDate;
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	public static CreditCard createCard(String number, String expDate, String name) {

	    if (MasterCC.isValidNumber(number)) {
	        return new MasterCC(number, expDate, name);
	    }
 
	    if (VisaCC.isValidNumber(number)) {
	        return new VisaCC(number, expDate, name);
	    }

	    if (AmExCC.isValidNumber(number)) {
	        return new AmExCC(number, expDate, name);
	    }

	    if (DiscoverCC.isValidNumber(number)) {
	        return new DiscoverCC(number, expDate, name);
	    }

	    return null;
	}
	
	public String toString() {
		return this.getNumber() + "," + this.getExpDate() + "," + this.getName();			
	}
}
	


