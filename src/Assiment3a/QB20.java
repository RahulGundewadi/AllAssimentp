package Assiment3a;

import java.util.Scanner;

//20. Simple Voting System
//Input age and citizenship (Y/N).
//If age ≥18 and citizen (Y/y), print "Eligible to vote".
public class QB20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Enter citizenship");
		String c = sc.next();
		String citizenship = "indian";
		
		if(age>=18 && citizenship.contains(c)) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not Eligible to vote");
		}
	}
}
