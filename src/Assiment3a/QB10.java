package Assiment3a;

import java.util.Scanner;

//10. Electricity Bill Calculator
//Input total units consumed.
//Use nested if-else to calculate cost:
//≤100 units: ₹5/unit
//101–300: ₹7/unit
//300: ₹10/unit
public class QB10 {
	
   public static void main(String[] args) {
	
     Scanner sc = new Scanner(System.in);
        
	System.out.println("Enter Electricity Unit");
	int unit = sc.nextInt();
	
	if(unit<=100) {
		System.out.println("5 RS/unit : " +unit);
		int cost = unit*5;
		System.out.println("cost : " + cost);
	}else if(unit>=101 && unit<=300) {
		System.out.println("7 RS/unit : " +unit);
		int cost = unit*7;
		System.out.println("cost : " + cost);
	}else {
		System.out.println("10 RS/unit : " +unit);
		int cost = unit*10;
		System.err.println("cost : " + cost);
	}
}
}
