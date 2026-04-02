package Lessons;

import java.util.Scanner;

public class Game_Level_Unlock {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your current level :");
		int level = scanner.nextInt();

		int coin = 1500;

		if (level >= 5) {

			if (coin >= 1000) {

				System.out.println("Unlock Special Wepon");
			} else if (coin <= 1000) {

				System.out.println("You're getting there.");
			}
		} else {

			System.out.println("One more time");
		}

	}

}
