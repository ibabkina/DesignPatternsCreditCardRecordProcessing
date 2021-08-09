package org.merit.designPatternsCC.models;

import java.util.HashSet;
import java.util.Set;

public class AmExCC extends CreditCard {
	
	public AmExCC() { super(); }
	
	public AmExCC(String number, String expDate, String name) {
		super(number, expDate, name);
	}

	//	First digit is a 3 and second digit a 4 or 7. Length is 15 digits.
	public static boolean isValidNumber(String number) {
		Set<String> set = new HashSet<String>();
		set.add("4");
	    set.add("7");
		
	    if(number.substring(0, 1).equals("3") && set.contains(number.substring(1, 2)) && number.length() == 15) { return true; }
		return false;
	}
	
	public String toString() {
		return "\nAmExCard : " + super.toString();
		}
}
