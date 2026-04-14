package Lesson7;

public class Find_Max_With_Condition {

	public static void main(String[] args) {
		
		int[] number= {89,55,23,99,11,77,44,66};
		
		 int max=number[0];
		for(int num : number) {
		
		if(num > max ) {
			
			max=num;
			
		}
		
		

		}
		
		System.out.println("Max number is :"+max);
		
	}

}
