/*
 * Taoufik Laaroussi
 * Class COP3300
 * Assignment 2
 * Problem 2 "BMI calculation"
 *This program is basic and doesn't control any input */

//Import Object Scanner to provide the input commands

import java.util.Scanner;

public class Laaroussi_p2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// Output the prompt messages
		
		int choiceVal;
		System.out.println("   ***Welcome to the BMI calulator***");
		System.out.println("||------------------------------------||");
		System.out.println("  Which unit of mesurement do you want to use ?");
		System.out.print("   Please select 1 for Standard, 2 for Metric: ");
		
		// Get the input values of the choice wanted
		
		choiceVal = scnr.nextInt();
		
		// An if statement to evaluate the choice and do the right calculation and output
		
		if(choiceVal == 1) {
			
		//Calculation and output in case the user choose standard option
			
			int heightFeet;
			int heightInches;
			int weightPound;
			double result;
			System.out.print("- Enter your Height in feet:");
			heightFeet = scnr.nextInt();
			System.out.print("- Enter your Height in inches:");
			heightInches = scnr.nextInt();
			System.out.print("- Enter your Weight in pounds:");
			weightPound = scnr.nextInt();
			heightInches+= (heightFeet*12);
			
			// Assign the standard formula to variable result and output the result
			
			result = (double)(703 * weightPound ) / (Math.pow(heightInches, 2));
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			System.out.printf("\n- Your BMI is : %.1f \n\n", result);
			System.out.println("||||||||||||||||||||||||||||||||||||||||||");
			
	}else if(choiceVal == 2) {
		
		//Calculation and output in case the user choose metric option
		
		int heightcent;
		double heightMeters;
		int weightKg;
		double result;
		System.out.print("- Enter your Height in centimeter: ");
		heightcent = scnr.nextInt();
		System.out.print("- Enter your Weight in Kilograms: ");
		weightKg = scnr.nextInt();
		heightMeters = heightcent / 100.0;
		
		// Assign the Metric formula to variable result and output the result
		
		result = (weightKg) / (Math.pow(heightMeters, 2));
		System.out.println("||||||||||||||||||||||||||||||||||||||||||");
		System.out.printf("\n- Your BMI is : %.1f \n\n", result);
		System.out.println("||||||||||||||||||||||||||||||||||||||||||");
		
	// This else is used in case the user choose a different number provided for options to exit the program	
	
	}else {
		System.out.println("Ooops, Wrong Choice !!!");
		System.exit(0);
	}
		//Output the BMI categories provided by the National Heart Lung and Blood
		
		System.out.println("    BMI Categories :");
		System.out.println("    ----------------");
		System.out.println(" * Underweight =< 18.5");
		System.out.println(" * Normal weight = 18.5 - 24.9");
		System.out.println(" * Over weight = 25 - 29.9");
		System.out.println(" * Obesity =  BMI of 30 or greater.");
		System.out.println("  ----------------------------------");
		
	scnr.close();	
	}
}
