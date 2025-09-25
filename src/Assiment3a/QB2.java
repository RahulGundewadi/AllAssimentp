package Assiment3a;

import java.util.Scanner;

//2. Character Classifier
//Input a single character.
//Check if it is uppercase, lowercase, digit, or special character.
public class QB2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char a = sc.next().charAt(0);
		
		if(a>='a' && a<='z') {
			System.out.println(" it is lowercase");
		}else if(a >= 'A' && a <= 'Z') {
			System.out.println(" it is uppercase");
		}else if(a >= '0' && a <=  '9') {
			System.out.println(" it is digit");
		}else {
			System.out.println("it is special character");
		}
	}
}
