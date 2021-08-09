package org.merit.designPatternsCC.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.merit.designPatternsCC.models.CreditCard;

import java.io.*;
import java.text.ParseException;


public class CreditCardService {
	
		private static List<CreditCard> cardList = new ArrayList<>();;
	
		public static boolean readFromFile(String fileName) {
		try {
			Scanner sc = new Scanner(new File(fileName));
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] args = line.split(",");
//				for(String a : args) { System.out.println(a); }
				CreditCard cc = CreditCard.createCard(args[0].trim(), args[1].trim(), args[2].trim()); 
				if (cc != null) { 
					cardList.add(cc);
					System.out.println(cc.toString());
				}
				else { 
					System.out.println("\nUnable to instantiate from known credit types: "
							+ args[0] + "," + args[1] + "," + args[2]);
				}	
			}
		}
			catch(IOException e) {
				System.out.println("IO Issue");
				return false;
			}
			catch(NumberFormatException e) {
				System.out.println("Number Format Issue");
				return false;
			}
//			catch(ParseException e) {
//				System.out.println("Parse Issue");
//				return false;
//			}
			catch(Exception e) {
				System.out.println("Some Other Issue when read the file");
				return false;
			}
			return true;
	}
			
}
				