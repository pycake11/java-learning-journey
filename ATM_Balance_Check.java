package Lesson3;

import java.util.Scanner;

public class ATM_Balance_Check {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int balance = 1000;

		boolean flag = true;

		while (flag) {
			System.out.print("Enter withdraw amount :");
			String amount = scanner.nextLine();

			if (amount.equalsIgnoreCase( "exit")) {
				
			break;

			}
			
			int withdraw=Integer.parseInt(amount);

			if (withdraw <= balance) {

				System.out.println("Withdraw Successful");
			}

			else if (withdraw > balance) {

				System.out.println("Isufficient Balance");
			}
		}
		
		System.out.println("The process is done.");

	}

}
