package Assignment10;

public class QB1 extends Thread{

//	1. Create a Thread by Extending Thread Class
//	Question:
//	Write a program that creates a thread by extending the Thread class. The thread should
//	print numbers from 1 to 10 with a delay of 500ms between each number.
	
	
	@Override
	public void run() {
		for(int i = 1; i<=10;i++ ) {
			System.out.println("Number " 
		    +Thread.currentThread().getName());
		}
	}


	
}
