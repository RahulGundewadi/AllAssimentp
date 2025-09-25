package Assiment4;

import java.util.Scanner;

//21. print 5 stars horizontally with one space in each star.
public class QB21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = sc.nextInt();
		
		for(int i=1; i<=number;i++) {
			System.out.print("  *");
		}
	}
}
