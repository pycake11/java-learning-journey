package Lessons;

import java.util.Scanner;

public class Nested_if {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String Musername="root";
		String Mpassword="1234";
		
		System.out.print("Enter user name :");
		String username=scanner.nextLine();
		
	
	
		
		if(Musername.equals(username)) {
			
			System.out.print("Enter  passwrod :");
			String password=scanner.nextLine();
			
			
			if(Mpassword.equals(password)) {
				
				System.out.println("Login Sucess");
				
			}else {
				
				System.out.println("Wrong Password");
			}
			
			
			
		}else {
			
			System.out.println("User not found");
			
			
		}

	}

}
