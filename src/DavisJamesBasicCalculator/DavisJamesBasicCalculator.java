/*James Davis
 * CIS 2212-501 Java
 * Assignment 02-Basic Calculator
 * Due September 4, 2016
 */
package DavisJamesBasicCalculator;

import java.util.Scanner;

public class DavisJamesBasicCalculator {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
				
		// Displaying the options on the menu screen to the user.	
				System.out.println ("Menu");
				System.out.println ("1. Add");
				System.out.println ("2. Subtract");
				System.out.println ("3. Multiply");
				System.out.println ("4. Divide");
				System.out.println ("5. Generate Random Number\n");
				System.out.print ("What would you like to do? ");
				int choice = input.nextInt();
				
		// Displaying what the user has decided to do through a switch statement.
				switch (choice){
				
			//Case 1 add two numbers.
				case 1: {
					System.out.print("What is the first number? ");
					double num1 = input.nextDouble();
					System.out.print("What is the second number? ");
					double num2 = input.nextDouble();
					double getAnswer = num1 + num2;
					System.out.println ("Answer: " + getAnswer);
				} break;
				
		//Case 2 subtract two numbers.	
				case 2: {
					System.out.print("What is the first number? ");
					double num1 = input.nextDouble();
					System.out.print("What is the second number? ");
					double num2 = input.nextDouble();
					double getAnswer = num1 - num2;	
					System.out.println ("Answer: " + getAnswer);
				} break;
				
		//Case 3 multiply two numbers.
				case 3: {
					System.out.print("What is the first number? ");
					double num1 = input.nextDouble();
					System.out.print("What is the second number? ");
					double num2 = input.nextDouble();
					double getAnswer = num1 * num2;
					System.out.println ("Answer: " + getAnswer); 
				}break;
				
		//Case 4 divide two numbers.
				case 4: {
					System.out.print("What is the first number? ");
					double num1 = input.nextDouble();
					System.out.print("What is the second number? ");
					double num2 = input.nextDouble();
					if(num2 == 0){
						System.out.println ("I'm sorry, you can't divide by zero.");
					}
					else{
						double getAnswer = num1 / num2;
						System.out.println ("Answer: " + getAnswer);
					}	
				}break;
				
		//Case 5 will generate a random number upon the user entering a high and low number for a range. 
				case 5: {
					System.out.print ("What is the lower limit? ");
					double minNumber = input.nextDouble();
					System.out.print ("What is the upper limit? ");
					double maxNumber = input.nextDouble();
					Scanner keyboard = new Scanner (System.in);
					double getAnswer = ((Math.random() * (maxNumber - minNumber) + minNumber));
					System.out.println ("Answer: " + getAnswer);
				}break;
				
		//Default for invalid input entered upon seeing the menu screen.
				default : {System.out.println ("I'm sorry, " + choice + " wasn't one of the options.");
						}
				}
			}
	}
//end
