package Lesson7;

public class Even_Odd_Checker_With_For_Each_Loop {

	public static void main(String[] args) {
		
		int[] data= {1,2,3,4,5};
		
		for(int num : data) {
			
			if(num % 2== 0) {
				
				System.out.println(num+" is Even");
				
			}else if(num % 1== 0){
				
				System.out.println(num+" is Odd");
			}
		}

	}

}
