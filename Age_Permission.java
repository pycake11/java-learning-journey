package Lessons;

import java.util.Scanner;

public class Age_Permission {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your age :");
		int person_Age=scanner.nextInt();
		
		if (person_Age >= 18) {
			
			System.out.println("Adult");
			
			if(person_Age >= 60) {
				
				System.out.println("Senior Citizen");
			}
		}else {
			
			System.out.println("Minor");
		}
		
		
	    


	}

}
