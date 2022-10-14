package org.inheritance;

public class Friend extends Single {
	
	public void FriendStatus () {
		System.out.println("friend status is married");
		
	}
	
	public static void main(String[] args) {
		Friend f= new Friend();
		f.FriendStatus();
		f.MyStatus();
	}

}
