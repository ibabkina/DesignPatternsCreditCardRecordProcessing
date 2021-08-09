package org.merit.designPatternsCC.models;

import java.util.HashSet;
import java.util.Set;

public class MasterCC extends CreditCard {
	
	public MasterCC() { super(); }
	
	public MasterCC(String number, String expDate, String name) {
		super(number, expDate, name);
	}
 
	//	First digit is a 5, second digit is in range 1 through 5 inclusive. Only valid length of number is 16 digits.
	public static boolean isValidNumber(String number) {
		Set<String> set = new HashSet<>();
		set.add("1");
	    set.add("2");
	    set.add("3");
	    set.add("4");
	    set.add("5");
		
//	    System.out.println("number = " + number.substring(0, 1) + ", " + number.substring(1, 2));

		if(number.substring(0, 1).equals("5") && set.contains(number.substring(1, 2)) && number.length() == 16) { return true; }
		return false;
	}

	public String toString() {
		return "\nMasterCard: " + super.toString();
	}
}
