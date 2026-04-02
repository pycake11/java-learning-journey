package Lessons;

import java.util.Scanner;

public class Online_Shopping_Discount {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		
		
		System.out.println("Enter your amount :");
		Long amount=scanner.nextLong();
		scanner.nextLine();
		
		
		if(amount >= 100000) {
			
			System.out.println("Coose VIP or Normal :");
			String cus1=scanner.nextLine();
			
			
			if(cus1.equalsIgnoreCase("VIP")) {
				
				System.out.println("20 % discount");
				
			}
			  else  if(cus1.equalsIgnoreCase("normal")) {
					
					 System.out.println("10 % discount");
					
				
			}else {
				
				System.out.println("Invalid Customer Type.");
			}
			
		}else {
			
			System.out.println("Thank for shopping ");
		}
		

	}

}
