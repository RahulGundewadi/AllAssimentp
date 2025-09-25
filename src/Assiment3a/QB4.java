package Assiment3a;

import java.util.Scanner;

//4. Triangle Validity
//Input 3 angles.
//Check if they form a valid triangle (sum = 180 and all > 0).
public class QB4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ang1 = sc.nextInt();
		int ang2 = sc.nextInt();
		int ang3 = sc.nextInt();
		
		int sum = ang1+ang2+ang3;
		
		System.out.println(sum);
		
		if(ang1>0 && ang2>0 && ang3>0 && sum == 180) {
			System.out.println("valid triangle");
		}else {
			System.out.println("Not valid triangle");
		}
	}
}
