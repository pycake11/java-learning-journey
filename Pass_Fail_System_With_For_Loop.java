package Lesson7;

public class Pass_Fail_System_With_For_Loop {

	public static void main(String[] args) {

		int[] mark = { 40, 60, 70, 85 };

		for (int data : mark) {

			if (data >= 50) {

				System.out.println(data + " Pass");

			} else {

				System.out.println(data + " Fail");

			}

			System.out.println();

		}

	}

}
