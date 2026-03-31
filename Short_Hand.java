package Lessons;

public class Short_Hand {

	public static void main(String[] args) {
		
	//	variable = (condition) ? expressionTrue :  expressionFalse;
		
	//	int age=13;
		
	//	String result=(age < 12) ? "Access Granted" : "Acess Deined";
		
	//	System.out.println(result);
		
	//	int age =16;
		
	//	System.out.println((age < 18 ) ? "Acess Granted" : "Acess Deined");
		
		
		int age = 18;
		
		String result=(age   >20) ? "You can drive" 
			          : (age   <20)  ? "You can't drive"
			        		  
			        		  :"Show driving creditinal";
		
		
		System.out.println(result);
			        	  
			        	
		
		
		
		
		
	}

}
