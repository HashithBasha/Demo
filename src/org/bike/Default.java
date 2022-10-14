package org.bike;

public class Default {
	
	static int a=10;
	
    public static void localVariable() {
		// TODO Auto-generated method stub
		a=a+1;
		System.out.println(a);

	}
	
	public static void localVariable2() {
		// TODO Auto-generated method stub
		System.out.println(a++);

	}
	public static void main(String[] args) {
		System.out.println(a);
		localVariable();
		localVariable2();;
		
	}

}
