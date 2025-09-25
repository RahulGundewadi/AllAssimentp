package Assiment4;

import java.util.Scanner;

//22. print 5 stars vertically with one space in each star.
public class QB22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number =sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			System.out.println("  *");
		}
	}
}
