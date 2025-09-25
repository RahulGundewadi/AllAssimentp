package Assiment4;

import java.util.Scanner;

//3. Write a program to print tables by taking user input.

public class QB3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int a = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			int sum = a*i;
			System.out.println(sum);
		}
	}
}
