package Lesson3;

import java.util.Scanner;

public class Wile_if_else {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number expect 0 :");
		int num = scanner.nextInt();

		while (num != 0) {

			if (num % 2 == 0) {

				System.out.println("Even");

			} else {

				System.out.println("Odd");

			}

			System.out.print("Enter number expect 0 :");
			num = scanner.nextInt();

		}

		System.out.println("Program closed.");

	}

}
