package Lesson7;

public class Positive_Negative_Zero_Chekcer {

	public static void main(String[] args) {

		int[] num = { 3, -1, 0, 5 };

		for (int number : num) {

			if (number < 0) {

				System.out.println(number + " is negative.");

			} else if (number > 0) {

				System.out.println(number + " is positive.");

			} else {

				System.out.println("Is Zero.");

			}
		}

	}

}
