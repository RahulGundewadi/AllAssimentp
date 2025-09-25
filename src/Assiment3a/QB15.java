package Assiment3a;

import java.util.Scanner;

//15. Tax Bracket Checker
//Input income.
//Tax slabs:
//<2.5L: No tax
//2.5L–5L: 5%
//5L–10L: 20%
//10L: 30%
public class QB15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Income");
		long income = sc.nextLong();
		
		if(income<=250000) {
			System.out.println("No tax");
		}else if(income>=250001 && income<=500000){
			System.out.println("5% tax");
		}else if(income>=500001 && income<=1000000){
			System.out.println("20% tax");
		}else {
			System.out.println("30% tax");
		}
		
	}
}
