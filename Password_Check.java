package Lesson4;

import java.util.Scanner;

public class Password_Check {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String password;
		
		
		 do {
			 
			 System.out.println("Enter password :");
				password=scanner.nextLine();
				
				if(password.equals("1234")) {
					
					System.out.println("Login Successful.");
				}else {
					
					System.out.println("Wrong Password.");
				}
				
				
				
				 
			 
		 }while(!password.equals("1234"));
		 
	
		 
		 
		 

	}

}
