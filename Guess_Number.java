package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Guess_Number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int ran_num;
		int guess_num;
		Random random = new Random();
		ran_num = random.nextInt(10) + 1;

		do {

			System.out.print("Guess a number between 1 and 10 :");

			guess_num = scanner.nextInt();

		} while (guess_num != ran_num);

		System.out.println("Oh , you get it.");

	}

}
