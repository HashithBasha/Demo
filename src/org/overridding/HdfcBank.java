package org.overridding;

public class HdfcBank extends RbiBank {
	
	@Override
	public void savings() {
		System.out.println("savings:8%");
	}
	
	public static void main(String[] args) {
		HdfcBank h = new HdfcBank();
		h.savings();
		h.deposit();
	}

}
