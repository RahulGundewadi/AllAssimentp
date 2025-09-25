package Assiment3a;

import java.util.Scanner;

//8. Odd Difference Evaluator
//Input two integers.
//If both are odd, print their absolute difference. If one is even, print "Invalid".
public class QB8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Number");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
           
		if(a%2 != 0 && b%2 != 0) {
			int diff = a-b;
			System.out.println(diff);
		}else {
			System.out.println("Invalid");
		}
		
	}
}
