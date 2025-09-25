package Assiment3a;

import java.util.Scanner;

//11. Exam Pass/Fail
//Input marks in 3 subjects.
//If any subject is below 33, print "Fail", else print "Pass".
public class QB11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Three subjects marks");
		
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		
		if(sub1<33  || sub2<33 || sub3<33) {
			System.out.println("fail");
		}else {
			System.out.println("Pass");
		}
	}
}
