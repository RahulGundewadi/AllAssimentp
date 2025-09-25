package Assiment4;

import java.util.Scanner;

//. Write a program to print reverse tables by taking user input.

public class QB4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=10; i>=1; i--) {
			int sum = a*i;
			System.out.println(sum);
		}
		
	}
}
