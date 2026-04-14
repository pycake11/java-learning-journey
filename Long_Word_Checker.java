package Lesson7;

public class Long_Word_Checker {

	public static void main(String[] args) {

		String[] word = { "banana", "Mango", "apple", "Strawberry", "Grape", "blueberry", "cat", "dog", "bird" };

		for (String checkword : word) {

			if (checkword.length() > 4) {

				System.out.println(checkword+"  is Long Word.");

			}else {
				
				System.out.println(checkword+"  is short word.");
				
			}
			
			System.out.println();
		//	System.out.println();

		}
		
		
	}

}
