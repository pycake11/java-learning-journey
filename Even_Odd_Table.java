package Lesson6;

public class Even_Odd_Table {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				if (j % 2 == 0) {
					System.out.println(j + "(E)");
				} else {

					System.out.println(j + "(O)");
				}

			}

			System.out.println();

		}

	}

}
