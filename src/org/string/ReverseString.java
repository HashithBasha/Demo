package org.string;

public class ReverseString {
	
	public static void main(String[] args) {
		
		
		String s="Hashith";  
		
		StringBuffer buffer = new StringBuffer();
		
//		StringBuilder buffer= new StringBuilder();
		
		buffer.append(s);
		
		System.out.println(buffer.reverse());
		
	}

}
