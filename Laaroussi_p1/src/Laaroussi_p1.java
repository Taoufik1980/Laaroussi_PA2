
/*
 * Taoufik Laaroussi
 * Class COP3300
 * Assignment 2
 * Problem 1 "Encryption"
 * */

/* This program is basic and doesn't check the output
 * So you must enter no more than 4 digits to get the correct answer*/

import java.util.Scanner;

public class Laaroussi_p1 {

	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	int fourDigits;
	int singDigit;
	int tenDigit;
	int hunDigit;
	int ThousDigit;
	
	// Prompt to enter 4 digits in order to decrypts them
	
	System.out.print("Enter an integer of 4 digits: ");
	fourDigits = scnr.nextInt();
	
	//use variable to extract each digit
	
	singDigit = ((fourDigits % 10) + 7) % 10 ;
	//System.out.println("The sing digit is: " + singDigit);
	
	tenDigit = (((fourDigits / 10 ) % 10) + 7) % 10;
	//System.out.println("The tens digit is: " + tenDigit);
	
	hunDigit = (((fourDigits / 100 ) % 10) + 7) % 10;
	//System.out.println("The hundre digit is: " + hunDigit);
	
	ThousDigit = ((fourDigits / 1000 ) + 7) % 10;
	//System.out.println("The thousand digit is: " + ThousDigit);
	
	//Output the data after Encryption
	
	System.out.println("The encrypted integer:" + tenDigit + "" + singDigit + "" + ThousDigit + "" + hunDigit );
	scnr.close();
	}

}