package org.FullyAbstraction;

public class AxisBank implements RbiBank{

	@Override
	public void savings() {
		System.out.println("savings:9%");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit:2%");
		
		
	}
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.savings();
		a.deposit();
	}

}
