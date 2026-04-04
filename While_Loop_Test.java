package Lesson3;

import java.util.Scanner;

public class While_Loop_Test {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter number as u like :");
		int count=scanner.nextInt();
		
		
		
		while(count >  0) {
			
			System.out.println(count);
			
			count--;
			
		}
		
		System.out.println("Happy Annversiary");

	}

}
