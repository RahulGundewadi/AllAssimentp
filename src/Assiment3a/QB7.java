package Assiment3a;

import java.util.Scanner;

//7. Age Category Checker
//Input age.
//Categorize:
//0–12: Child
//13–17: Teen
//18–59: Adult
//60+: Senior
public class QB7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		
		int age = sc.nextInt();
		
		if(age>=0 && age<=12) {
			System.out.println("child : " +age);
		}else if(age>=13 && age<=17) {
			System.out.println("Teen : " +age);
		}else if(age>=18 && age<=59) {
			System.out.println("Adult : " +age);
		}else {
			System.out.println("Senior : " +age);
		}
	}
}
