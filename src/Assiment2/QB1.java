package Assiment2;
//1. Write a program to find simple interest using void method. Print those in method.
public class QB1 {

	public void printSimpleInterest() {
		int Amount = 1000; 
		double interest = 10; 
		double period = 1;
		
		double SimpleInterest = (Amount*interest*period)/100;
		System.out.println(SimpleInterest);
	}
}
