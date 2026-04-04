package Lesson3;

import java.util.Scanner;

public class Student_Pass_Fail_System {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean flag = true;

		while (flag) {

			System.out.print("Enter marks :");
			int mark = scanner.nextInt();

			if (mark == -1) {

				flag = false;
			}

			else if (mark >= 0  &&  mark <= 100) {
				
				
				
				if(mark >= 50) {

				System.out.println("Pass");

			}

			else  {

				System.out.println("Fail");

			}
				

		}else {
			System.out.println("Invalid Mark");
			
			flag=false;
			
		}
			
			
			
		}
           
		 System.out.println("-1 is not access.");

		scanner.close();

	}

}
