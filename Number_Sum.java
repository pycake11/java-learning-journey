package Lesson5;

public class Number_Sum {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0) {

				System.out.print("\t" + i);

				sum = sum + i;

			}

		}

		// System.out.println("\n"); or -> System.out.println("\n \n The Sum of even
		// number is :" + sum);

		System.out.println("\n \n The Sum of even number is :" + sum);

	}

}
