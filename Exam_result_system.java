package Lessons;

import java.util.Scanner;

public class Exam_result_system {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your mark :");
		int mark=scanner.nextInt();
		
		
		if(mark <= 0  || mark >= 100) {
			
			
				
				System.out.println("Invalid Mark");
				
		}
			
			
		else if(mark >= 40) {
			
			System.out.println("Pass");
			
			if(mark >= 90) {
				
				System.out.println("Distiniction");
				
			}else if(mark >= 75) {
				
				System.out.println("Very Good");
			}
			
			else if(mark >= 60) {
				
				System.out.println("Good");
			}
			
		}else {
			
			System.out.println("Fail");
		}
		
	}

}
