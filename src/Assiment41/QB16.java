package Assiment41;
//16. Calculate the factorial of a number.
public class QB16 {

	public static void main(String[] args) {
		
		int number = 1;
		int fact = 5;
		
		while(fact>=1) {
			number = number*fact;
			
			fact--;
		}
		System.out.println(number);
	}
}
