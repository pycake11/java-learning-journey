package Lessons;

import java.util.Scanner;

public class Web_Acess_System {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter \"true\" or \"false\" to login :");
		boolean Login = scanner.nextBoolean();

		if (Login) {

			System.out.println("Enter your are \"Admin\" role or \"User\" role :");
			String login_user = scanner.nextLine();

			if (login_user.equalsIgnoreCase("Admin")) {

				System.out.println("Admin Role");

			} else if (login_user.equalsIgnoreCase("User")) {

				System.out.println("User Role");
			}
		} else {

			System.out.println("Wrong Credential");
		}

	}

}
