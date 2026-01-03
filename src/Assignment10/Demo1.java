package Assignment10;


public class Demo1 {

	public static void main(String[] args) {
		try {
		for(int i=1; i<=10; i++) {
			System.out.println("Number"+i);
		}
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			QB1 a = new QB1();
			a.start();
	}
}
