package Lesson4;

import java.util.Scanner;

public class ATM_Withdraw_System {

	public static void main(String[] args) {

		int balance = 1000;

		Scanner scanner = new Scanner(System.in);

		String input_amount;

		do {

			System.out.print("Enter the amount you want to withdraw :");
			input_amount = scanner.nextLine();

			if (input_amount.equalsIgnoreCase("exit")) {

				break;

			}

			int withdraw = Integer.parseInt(input_amount);

			if (balance < withdraw) {

				System.out.println("Insufficient Balance.");
			}

			else {

				balance = balance - withdraw;

				System.out.println("Remaining Balance " + balance);

			}

		} while (true);

		System.out.println("Program Stopped.");

	}

}
