package Assiment3a;

import java.util.Scanner;

//9. Positive Negative Zero
//Input a number.
//Check if it's positive, negative, or zero.
public class QB9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int number = sc.nextInt();
		
		
		if(number >=1) {
			System.out.println("it's positive");
		}else if(number < 0) {
			System.out.println("it's negative");
		}if(number == 0) {
			System.out.println("it's zero");
		}
	}
}
