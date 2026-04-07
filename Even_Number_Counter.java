package Lesson4;

import java.util.Scanner;

public class Even_Number_Counter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number;
		int num = 0;
		do {

			System.out.print("Enter a number as u like :");

			number = scanner.nextInt();

			if (number == -1) {

				break;
			}

			if (number % 2 == 0) {

				num++;

			}

		} while (true);

		System.out.println("Even numbes " + num);

	}

}
