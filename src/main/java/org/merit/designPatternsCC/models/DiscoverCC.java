package org.merit.designPatternsCC.models;

public class DiscoverCC extends CreditCard {
	
	public DiscoverCC() { super(); }
	
	public DiscoverCC(String number, String expDate, String name) {
		super(number, expDate, name);
	}

	//	First four digits are 6011. Length is 16 digits.
	public static boolean isValidNumber(String number) {
		
//	    System.out.println("number = " + number.substring(0, 3) + ", " + number.length());

		if(number.substring(0, 4).equals("6011") && number.length() == 16) { return true; }
		return false;
	}
	
	public String toString() {
		return "\nDiscoverCard: " + super.toString();
	}
}
