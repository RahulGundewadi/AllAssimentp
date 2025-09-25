package Assiment3a;

import java.util.Scanner;

//5. Leap Year Checker
//Input a year.
//Check if itʼs a leap year using nested conditions (divisible by 4, not 100 unless divisible by 400)
public class QB5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year");
		int year = sc.nextInt();
		
		if(year % 4 == 0 ) {
			System.out.println("itʼs a leap year");
		}else if( year % 100 == 0 ) {
			System.out.println("itʼs a leap year");
		}else if(year % 400 == 0) {
			System.out.println("itʼs a leap year");
		}
		else {
			System.out.println("itʼs not a leap year");
		}
		
	}
}
