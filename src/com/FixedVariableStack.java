package com;

import java.util.Scanner;

//	Main Class for execution of the Stack interface implementation
public class FixedVariableStack {
	//	Main method
	public static void main(String[] args) {
		FixedStack fs = new FixedStack(); 					// fixed stack object
		VariableStack vs = new VariableStack(); 			// variable stack object
		
		int flag = 1, choice, top;
		
		System.out.println("Fixed length stack is created.");
		Scanner in = new Scanner(System.in);				//	Scanner object to get the input from the user
		
		while (flag == 1) { 								// loop to test whether to continue with the fixed stack or not using "flag"
			System.out.println("Choose 1.Push 2.Pop"); 		// choose either to push or pop to/from fixed stack
			choice = in.nextInt();
			try {
				switch (choice) {							// switch case to get based on the user input
				case 1:
					System.out.println("Enter an integer to push"); 
					fs.push(in.nextInt());					// To push the elements to the stack
					break;
				case 2:
					top = fs.pop(); 						// To pop the elements to the stack
					System.out.println("The top of the stack is " + top);
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Press 1.Continue 2.Stop with fixed stack");
			flag = in.nextInt();							// To handle the fixed stack manipulation 
		}
		flag = 1; 											// reassign the flag to continue execution with variable stack
		System.out.println("Variable length stack is created.");
		while (flag == 1) { 								// loop to test whether to continue with the variable stack or not using "flag"
			System.out.println("Choose 1.Push 2.Pop"); 		// choose either to push or pop to/from variable stack
			choice = in.nextInt();
			try {
				switch (choice) {							// switch case to get based on the user input
				case 1: // push case
					System.out.println("Enter an integer to push");
					vs.push(in.nextInt());					// To push the elements to the stack
					break;
				case 2: // pop case
					top = vs.pop();							// To pop the elements to the stack
					System.out.println("The top of the stack is " + top);
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Press 1.Continue 2.Stop with fixed stack");
			flag = in.nextInt();
		}
		in.close();											//	Closing scanner input
	}
}
