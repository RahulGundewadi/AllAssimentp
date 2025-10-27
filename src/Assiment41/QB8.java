package Assiment41;

import java.util.Scanner;

public class QB8 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
         int i = 1;
         System.out.println("enter n");
         int n = sc.nextInt();     
     while(i<= n) {
    	 System.out.println(i*i*i);
    	 i++;
     }
	}
}
