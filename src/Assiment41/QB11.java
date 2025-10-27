package Assiment41;

import java.util.Scanner;

//11. Find the sum of numbers from 1 to n .
public class QB11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int sum = 0;
		
		int i = 1;
		
		while(i<=n) {
			sum = sum+i;
			
			i++;
		}
		System.out.println(sum);
	}
}
