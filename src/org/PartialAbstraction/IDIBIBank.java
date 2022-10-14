package org.PartialAbstraction;

public class IDIBIBank  extends RbiBank {

	@Override
	public void deposit() {
		System.out.println("Deposit:5%");
	}
	
	public static void main(String[] args) {
		IDIBIBank b = new IDIBIBank ();
		b.savings();
		b.deposit();
	}

}
