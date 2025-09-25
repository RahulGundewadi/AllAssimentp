package Assiment3a;

import java.util.Scanner;

//3. Biggest Among Three
//Input 3 numbers.
//Use nested if-else to find and print the greatest number.
public class QB3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c ) {
			System.out.println("the greatest number is a:" +a);
		}else if(b>a && b>c ) {
			System.out.println("the greatest number is b:" +b);
		}else {
			System.out.println("the greatest number is c:" +c);
		}
	}
}
