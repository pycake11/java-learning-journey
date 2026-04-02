package Lessons;

import java.util.Scanner;

public class Network_acess {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		boolean wifi_connected=true;
		
		boolean internet_available=false;
		
		
		
		if(wifi_connected) {
			
			if(internet_available) {
				
				System.out.println("You can access internet.");
				
			} else {
				
				System.out.println("Wifi connected but not internet access.");   
			}
		}else {
			
			System.out.println("Wifi not connected.");
		}

	}

}
