package Assiment2;
//2. WAP to get simple interest using parameterized methods. print statement should be in main class.
//a. Add a new method to find Rate of Interest
//b. Principal amount
//c. Period
public class QB2 {

	public void printSimpleInterest( double interest) {
		
		double simpleinterest = interest;
		System.out.println(simpleinterest);
		
	}
    public void printSimplAamount( double amount) {
		
		double simpleAmount = amount;
		System.out.println(simpleAmount);
		
	}
    
    public void printSimplePeriod( double Period) {
		
		double simplePeriod = Period;
		System.out.println(simplePeriod);
		
	}
    public void simpleInterest(double interest, double amount , double Period) {
    	
    	double simpleInterest = (interest*amount*Period)/100;
    	System.out.println(simpleInterest);
    }
}
