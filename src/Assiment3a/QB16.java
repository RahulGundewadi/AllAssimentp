package Assiment3a;

import java.util.Scanner;

//16. Temperature Converter
//Input a number and a unit (C or F).
//Convert accordingly:
//If C, convert to Fahrenheit.
//If F, convert to Celsius.
public class QB16 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		
		float number = sc.nextFloat();
		
		System.out.println("Enter Unit 1.C 2.F");
		char ch = sc.next().charAt(0);
		//char f = sc.next().charAt(0);
		
		if(ch == 'C') {
			float Fahrenheit =  number*(9/5)+32;
			System.out.println("celsius convert to fahrenheit : " +Fahrenheit);
		}else {
			float Celsius = (number-32)*(9/5);
			System.out.println("Fahrenheit convert to celsius : " +Celsius);
		}
		
	}
}
