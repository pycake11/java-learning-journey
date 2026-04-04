package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int attempt = 0;

		boolean flag = true;

		Random random = new Random();
		int cu_guess = random.nextInt(11); // or +1

		while (flag) {

			System.out.println("Guess a number between 1 to 10 :");
			int guess = scanner.nextInt();

			if (guess == cu_guess) {

				System.out.println("Correct");

				flag = false;

			} else {

				attempt++;

				if (attempt == 5) {

					System.out.println("Guess limit exceeded");

					flag = false;
				}

				else if (guess > cu_guess) {

					System.out.println("Too High");

				} else {

					System.out.println("Too Low");

				}

				System.out.println("You have " + (5 - attempt) + " left");

			}

		}
		scanner.close();

	}

}
