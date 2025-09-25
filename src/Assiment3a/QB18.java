package Assiment3a;

import java.util.Scanner;

//18. Three-Sided Shape Type
//Input 3 sides of triangle.
//Check and classify: equilateral, isosceles, or scalene.
public class QB18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 sides of triangle");
		int tri1 = sc.nextInt();
		int tri2 = sc.nextInt();
		int tri3 = sc.nextInt();
		
		if(tri1 == tri2 &&  tri2 == tri3 && tri1 == tri3 ) {
			System.out.println("equilateral");
		}else if(tri1 == tri2 ||  tri2 == tri3 ||  tri1 == tri3) {
			System.out.println("isosceles");
		}else {
			System.out.println("scalene");
		}
	}
}
