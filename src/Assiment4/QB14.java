package Assiment4;
//14. Write a program to find the factorial value of any number.
public class QB14 {

	public static void main(String[] args) {
		
		int fact =1;
		int num =5;
		
		for(int i=1;i<=5;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
}
