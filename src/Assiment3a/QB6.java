package Assiment3a;
//6. Grade Calculator
//Input marks (0–100).
//Print grade based on this:
//90–100: A
//80–89: B
//70–79: C
//60–69: D
//Below 60: F

import java.util.Scanner;

public class QB6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Maeks");
		int marks = sc.nextInt();
		
		if(marks>=90 && marks<=100) {
			System.out.println("grade is A : " +marks);
		}else if(marks>=80 && marks<=89) {
			System.out.println("grade is B : " +marks);
		}else if(marks>=70 && marks<=79) {
			System.out.println("grade is C : " +marks);
		}else if(marks>=60 && marks<=69) {
			System.out.println("grade is D : " +marks);
		}else {
			System.out.println("grade is F : " +marks);
		}
	}
}
