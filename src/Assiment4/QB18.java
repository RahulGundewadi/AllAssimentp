package Assiment4;

import java.util.Scanner;

//18. Write a Java program to display the cube of the given number up to an integer.
//Test Data
//Input number of terms : 4
//Expected Output :
//	1 Number is : 1 and cube of 1 is : 1
//	2 Number is : 2 and cube of 2 is : 8
//	3 Number is : 3 and cube of 3 is : 27
//	4 Number is : 4 and cube of 4 is : 64

public class QB18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		
		int number= sc.nextInt();
		
		//int sum = 0;
		
		for(int i=1;i<=number;i++) {
			int sum =  i*i*i;
			System.out.println( i+"  Number is :  "+ i +"  and cube of" + i +"  is : " +sum  );
		}
		//System.out.println(sum);
	}
}
