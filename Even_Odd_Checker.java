package Lesson5;

import java.util.Scanner;

public class Even_Odd_Checker {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number to show even or odd :");

		int num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {

			if (i % 2 == 0) {

				System.out.println(i + "  Even");
			}

			else {

				System.out.println(i + "  Odd");

			}

		}

	}

}
