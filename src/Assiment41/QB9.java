package Assiment41;

import java.util.Scanner;

//9. Print the first n natural numbers.
public class QB9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int n = sc.nextInt();
		int i = 1;
		
		while(i<= n) {
			System.out.println(i);
			i++;
			
		}
	}
}
