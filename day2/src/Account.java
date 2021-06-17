/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */

public class Account {
	//Instance data members
	private int accNo;
	private String ownerName;
	private double balance;
	private float durationYears;
	// Static data members
	private static float interestRate;
	private static int count;
	//Static init block
	static {
		interestRate = 0.052f;
	}
	public Account() {
		System.out.println("Default Constructor");
		accNo = 12345;
		ownerName = "xyz";
		balance = 20000689.26;
		durationYears = 1.5f;
		count++;
	}
	public Account(int accNo,String ownerName,double balance,float durationYears) {
		System.out.println("Parameterized Constructor");
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.durationYears = durationYears;
		count++;
	}
	// Setter methods
	public void setAccountNo(int accNo) {
		this.accNo = accNo;
	}
	public void setOwnerName(String name) {
		ownerName = name;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	// Getter methods
	public int getAccountNo() {
		return accNo;
	}
	public double getBalance() {
		return balance;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public static void setInterestRate(float interestRate) {
		Account.interestRate = interestRate;
	}
	public static float getInterestRate() {
		return interestRate;
	}
	public static int getCount() {
		return count;
	}
	public void calculateInterest() {
		double interest = balance*interestRate*durationYears;
		System.out.println("Interest is: "+ interest);
	}
	public void printDetails() {
		System.out.println("Account Details:");
		System.out.println("Account Number is: "+ accNo +" Owner Name is: "+ ownerName +" Balance is: " + balance);
	}
}
