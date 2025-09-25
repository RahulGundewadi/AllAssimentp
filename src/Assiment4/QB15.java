package Assiment4;
//15. Write a program to find the value of one number raised to the power of another.
public class QB15 {

	public static void main(String[] args) {
		
		int no = 1;
		int number = 2;
		int raised = 4;
		for(int i=1;i<= raised;i++){
			no = no*number;
		}
		System.out.println(no);
	}
}
