/*
 * Taoufik Laaroussi
 * Class COP3300
 * Assignment 2
 * Problem 1 "Decryption"
 * */
/* This program is basic and doesn't check the output
 * So you must enter no more than 4 digits to get the correct answer*/

import java.util.Scanner;

public class Laaroussi_decrypts {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int fourDigits;
		int singDigit;
		int tenDigit;
		int hunDigit;
		int ThousDigit;
		
		// Prompt to enter 4 digits
		
		System.out.print("Enter an integer of 4 digits to decrypt: ");
		fourDigits = scnr.nextInt();
		
		//use variable to extract each digit 
		singDigit = (fourDigits % 10) ;
		singDigit = decryptNumbers(singDigit);
		//System.out.println("The single digit is: " + singDigit);
		
		tenDigit = ((fourDigits / 10 ) % 10);
		tenDigit = decryptNumbers(tenDigit);
		//System.out.println("The tens digit is: " + tenDigit);
		
		hunDigit = ((fourDigits / 100 ) % 10);
		hunDigit = decryptNumbers(hunDigit);
		//System.out.println("The hundred digit is: " + hunDigit);
		
		ThousDigit = (fourDigits / 1000);
		ThousDigit = decryptNumbers(ThousDigit);
		//System.out.println("The thousand digit is: " + ThousDigit);
		
		//Output the data after Decryption

		System.out.println("The encrypted integer:" + tenDigit + "" + singDigit + "" + ThousDigit + "" + hunDigit );
		scnr.close();
	}
	//Function to do the decryption of the digits provided
	
	public static int decryptNumbers(int number) {
		
		if (number == 7 || number == 8 || number == 9 ) {
			number = number - 7;}
		else {		
				number = (number + 10) - 7;
			}
			return number;
		}	
	}

