package Assiment3a;

import java.util.Scanner;


//12. Menu Choice (Math Ops)
//Input two numbers.
//Input a choice (1: add, 2: subtract, 3: multiply, 4: divide).
//Print result using nested if-else.
public class QB12 {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Select Choice : ");
		System.out.println("1.add , 2.sub , 3.multiply , 4.divide");
		int choice = sc.nextInt();
		
		if(choice==1) {
			int sum = num1+num2;
			System.out.println(sum);
		}else if(choice==2) {
			int sub = num1-num2;
			System.out.println(sub);
		}else if(choice==3) {
			int mul = num1*num2;
			System.out.println(mul);
		}else {
			int div = num1/num2;
			System.out.println(div);
		}
	}
}
