/*
 * Taoufik Laaroussi
 * Class COP3300
 * Assignment 2
 * Problem 3 "Rating Topics Program"
 * This program is basic and doesn't check the input*/
import java.util.Scanner;
public class Laaroussi_p3 {

	public static void main(String[] args) {
		
	//Variable declaration and 2 type of arrays 1 D and 2D
		
		int i , j, temp, temp2=0, maxTotal, minTotal;
		double average;
		char exitVal = 'y';
		int[] highPointTotal = new int[5];
		String[] subjectArray = new String[] { "Mexico Wall", "Saving the sea world", "Asian food", "Soccer", "Solar energy" };
		int[][] rateArray = new int[5][10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, There are 5 topics wa want you to rate on scale <1 to 10>");
		
		//While loop ask for another user
		
		while(exitVal == 'y' || exitVal == 'Y') {
			for(i=0; i<5; i++) {
			System.out.print(subjectArray[i] + ": ");
			temp = sc.nextInt();
			rateArray[i][temp-1]+=1;	
			}	
			
			System.out.println("Is there another user would like to rate? Press 'y' for yes, or any other key to exit");
			exitVal = sc.next().charAt(0);
		}
		
	// output the header of the Array
		
		System.out.println("");
		System.out.println("The following array represent the rates made for each subject : ");
		System.out.println("-------------------------------------------------");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////////|");
		System.out.println("-------------------------------------------------");
		System.out.println(String.format("|%-21s|", "Subjects")  + String.format("|%-16s|", "  Rating <1 to 10> ") + "Avg||");
		System.out.println("-------------------------------------------------");
		
	//for loop to output the element of the subject array
		
		for(i=0; i < 5; i++) {
			System.out.print("|");
			System.out.print(String.format("|%-21s|", subjectArray[i]));
		
	// another for loop to output the element of the 2D arrays (rates)
			
			for(j=0; j< 10; j++) {
				
				System.out.print(rateArray[i][j] + "|");
				temp2 += (rateArray[i][j]*(j+1));
			}
			
	// Calculate and output the average for each row of the array subject
			
			average = temp2/10.00;
			highPointTotal[i]= temp2;
			System.out.print(average);
			System.out.println("||");
			System.out.println("-------------------------------------------------");
		temp2 = 0;
		}
	
	/*Call two functions maxtotalCalc and minTotalCalc. They calculate the max and min
	 * in each raw and return an array of each row total points.
		*/
		maxTotal = maxTotalCalc(highPointTotal);
		minTotal = minTotalCalc(highPointTotal);
		System.out.println("-------------------------------------------------");
		
	//For loop that looks after the max value and min value in the array returned from the function and output the result
		
		for(int k=0; k<5 ; k++) {
			
			if (maxTotal == highPointTotal[k] ) {
				
				System.out.println( subjectArray[k] + ": " + maxTotal + " || " + "received the highest point total.");
				
			}else if(minTotal == highPointTotal[k]) {
				System.out.println(subjectArray[k] + ": " + minTotal + " || " + "received the lowest point total.");
			}
				
		}
		sc.close();
	}
	
	//Function calculate the max total points and return the result
	
 public static int maxTotalCalc(int [] arr) {
	 int temp = arr[0];
	 for(int i=0 ; i < 5; i++) {
		 
		 if(temp < arr[i]) {
			 
			 temp = arr[i];
		 }
	 }
return temp;
 }
 
//Function calculate the min total points and return the result
 
public static int minTotalCalc(int [] arr) {
	 int temp = arr[0];
	 for( int i=0 ; i < 5; i++) {
		 
		 if(temp > arr[i]) {
			 
			 temp = arr[i];
		 }
	 }
	 return temp;
	 
 }
}
