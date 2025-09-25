package Assiment3a;

import java.util.Scanner;

public class QB1 {
//1. Even or Odd Difference
//	Input two integers.
//	Print the larger one only if it is even; else print the smaller one.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a%2==0 && b%2==0) {
			if(a%2==0 && a>b) {
				System.out.println("it is even and laeger"  +a);
			}else {
				System.out.println("the smaller");
			}
		}
	}
}
