package Lesson3;

import java.util.Scanner;

public class do_while_loop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number as u like :");
		int i = scanner.nextInt();

		do {

			System.out.println("do while loop at least run onece "+i);

			++i;
		} while (i <= 10);

		System.out.println("After  11 is greater than 10  the condtion is false ");

	}

}
