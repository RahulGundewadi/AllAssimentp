package Assiment41;

import java.util.Scanner;

//10. Print the first n even numbers.
public class QB10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int n = sc.nextInt();
		
		int i = 1;
		
		while(i<=n) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
