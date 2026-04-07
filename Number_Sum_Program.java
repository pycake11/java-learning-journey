package Lesson4;

import java.util.Scanner;

public class Number_Sum_Program {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int num;
		int result=0;
		
		do {
			
			System.out.println("Enter a number :");
			 num=scanner.nextInt();
			
			  result=result+num;
		
			
			
		}while(num!=0);
		
		
		
		
		
		System.out.println("Total number is :" +result );

	}

}
