package Lesson3;

import java.util.Scanner;

public class Password_Logic_System {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean flag = true;

		int attempt = 0;

		while (flag) {

			System.out.print("Enter password to login :");
			String correct_password = scanner.nextLine();

			if (correct_password.equals("java123")) {

				System.out.println("Login Successful");

				break; // flag=false;

			} else if (!correct_password.equals("java123")) {

				System.out.println("Wrong Password");

			}
			attempt++;
			if (attempt == 3) {
				System.out.println("Account locked.");
				flag = false; // break you can also use "break" keyword
			}

		}

		System.out.println("Now You can use this acoount.");

	}

}
