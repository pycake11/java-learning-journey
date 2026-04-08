package Lesson5;

import java.util.Scanner;

public class Pass_Fail_Counter {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int passCount=0;
		
		int failCount=0;
		
		for(int i=1; i <= 5;i++) {
			
			System.out.print("Enter mark for student :");
			int mark=scanner.nextInt();
			
			if(mark >= 50) {
				
				System.out.println("Pass");
				
				passCount++;
				
			}else {
				
				System.out.println("Fail");
				
				failCount++;
			}
		
		}
		
		System.out.println("Pass Student :"+passCount);
		
		System.out.println("Fail Student :"+failCount);
		
		

	}

}
