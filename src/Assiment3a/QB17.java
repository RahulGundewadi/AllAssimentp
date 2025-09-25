package Assiment3a;

import java.util.Scanner;

public class QB17 {
//	17. Login Authentication
//	Input username and password.
//	If both match predefined values (hardcoded), print "Access Granted", else "Denied".
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String us = "Rahul123";
		String ps = "9356";
		
		System.out.println("Enter username");
		String username = sc.next();
		
		System.out.println("Enter password");
		String password = sc.next();
		
		if(username ==  "Rahul123" ) {
			if(password == "9356") {
			System.out.println("Access Granted");
			}
		}else {
			//System.out.println("Denied");
		}
	}
}
