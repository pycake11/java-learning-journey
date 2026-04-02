package Lessons;

import java.util.Scanner;

public class Testt {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your mark :");
		int mark=scanner.nextInt();
		
		if(mark < 0 || mark > 100 ) {
			
			System.out.println("Invalid Command");
			
			
		}else if(mark >= 40) {
			
			System.out.println("Pass");
			
			if(mark >= 80) {
				
				System.out.println("Grade A");
			}else if(mark >= 60) {
				
				System.out.println("Grade B");
			}else if(mark < 60) {
				
				System.out.println("Grade C");
			}
			
		}else if(mark < 40) {
			
			System.out.println("Fail");
		}
	}

}
