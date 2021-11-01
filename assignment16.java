/*Arya Bhanushali
 * CS50
 *Assignment 16 
 */

package bhanushali_arya5;

import java.util.Scanner;

public class twoFunctions {
	static void average() {
		Scanner input = new Scanner(System.in);	
	    System.out.println("Enter first test score:");
	    int score1 = input.nextInt();
	    Scanner input2 = new Scanner(System.in);
	    System.out.println("Enter second test score:");
	    int score2 = input2.nextInt();
	    calculations(score1,score2);
	}
	
	static void calculations(int score1, int score2) {
		float sum = score1 + score2;
		float average = sum/2;
		System.out.println("The average of your two test scores is: " + average);
		letterGrade(average);
		 
	}
	
	static void letterGrade(float average) {
		if (average>=95) {
			  System.out.print("You have an A+!");
		}
		else if(average>=90){
			  System.out.print("You have an A!");
		}
		else if(average>=80){
			  System.out.print("You have a B!");
		}
		else if(average>=70){
			  System.out.print("You have a C!");
		}
		else {
			  System.out.print("Your average is below a C. Try to score better on the next test!");
		}
		
		
		
	}
	public static void main(String[] args) {
		average();
	}
	   
}
