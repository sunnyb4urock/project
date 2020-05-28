package userinput;

import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		
		// create scanner object
		Scanner input = new Scanner(System.in);
		
		//output the prompt
		System.out.println("Enter a line of text:");
		//String line = input.nextLine() ;
		
		//wait for user to enter something
		int value = input.nextInt();
		
		//final output
		System.out.println("You entered : " + value );
	}

}
