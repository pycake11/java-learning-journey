package Lessons;

import java.util.Scanner;

public class Bank_Loan_Approval {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your salary :");
		Long salary=scanner.nextLong();
		
		
		if(salary >= 500000) {
			
			System.out.println("And then enter credit score :");
			Long creditScore=scanner.nextLong();
			
			if(creditScore >= 700) {
				
				System.out.println("Loan Approved");
				
			}else if(creditScore < 700) {
				
				System.out.println("Loan Rejected");
			}
			
		}else {
			
			System.out.println("Salary not correct.");
		}

	}

}
