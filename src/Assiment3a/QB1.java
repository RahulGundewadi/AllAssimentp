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
		
		int larger = Math.max(a, b);
        int smaller = Math.min(a, b);
		
		if(larger%2==0) {
			//	/*&& b%2==0)*/ {
			
				System.out.println("it is even and laeger"  + larger);
			}else {
				System.out.println("the smaller");
			}
		}
	}

