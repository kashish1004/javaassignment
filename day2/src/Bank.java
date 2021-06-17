/* Author kashish.jain@stltech.in
 * Creation Date - 9-6-2021
 * Version - 1.0
 * Copyright - Sterlite Technologies Ltd.
 */
public class Bank {

	public static void main(String[] args) {
		System.out.println("Interest Rate is: "+Account.getInterestRate());
		Account a = new Account();
		a.setAccountNo(56789);
		a.setBalance(3456789.25);
		a.setOwnerName("Pqr");
		System.out.println("Acount Number is: "+a.getAccountNo());
		System.out.println("Owner Name is: "+a.getOwnerName());
		System.out.println("Balance is: "+a.getBalance());
		Account b = new Account(15987,"Abcxy",879456.12,1.6f);
		b.printDetails();
		System.out.println("Number of accounts are: "+Account.getCount());

	}

}
