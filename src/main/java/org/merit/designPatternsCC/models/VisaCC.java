package org.merit.designPatternsCC.models;

public class VisaCC extends CreditCard {
	
	public VisaCC() { super(); }
	
	public VisaCC(String number, String expDate, String name) {
		super(number, expDate, name);
	}
	
//	First digit is a 4. Length is either 13 or 16 digits.
	public static boolean isValidNumber(String number) {
		if(number.substring(0, 1).equals("4") && (number.length() == 13 || number.length() == 16)) { return true; }
		return false;
	}
	
	public String toString() {
		return "\nVisaCard: " + super.toString();
	}
}
