package Lessons;

import java.util.Scanner;

public class Grade_nested {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		boolean cardInserted=true;
		int correctPin=123;
		
		int balance=10000;
		
		
		System.out.println("Enter your pin");
		int pin=scanner.nextInt();
		
	
		
		if(cardInserted) {
			
			if(pin==correctPin) {
				
				
				System.out.println(" Enter your withdraw amount :");
				int withdraw=scanner.nextInt();
				
				
			   if(balance >= withdraw) {
				   
				   System.out.println("Withdarw success");
			   }else if(balance <= withdraw) {
				   
				   System.out.println("Not enough");
			   }
			}else {
				System.out.println("Wrong Pin");
			}
		}else {
			
			System.out.println("Please card inserted.");
		}
		
	}

}
