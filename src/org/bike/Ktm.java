package org.bike;

public class Ktm implements Bike,Tvs{
	
	public static void main(String[] args) {
		Ktm k=new Ktm();
		k.cost();
		k.speed();
		k.mileage();
	}
	
	@Override
	public void cost() {
		System.out.println("cost=40000");// TODO Auto-generated method stub
		System.out.println("hashithbasha");
		System.out.println("my name is karthiik");

	}

	@Override
	public void speed() {
		System.out.println("speed=890kph");// TODO Auto-generated method stub
		
	}

	@Override
	public void mileage() {
		System.out.println("mileage is 129");
		// TODO Auto-generated method stub
		
	}

}
