package com.log;

public class Bike {
	
	private void bikeBrand() {
System.out.println("Royal Enfield");
	}
	
	private void bikeModel() {
System.out.println("Hunter 350");
	}
	private void bikePrice() {
System.out.println("1,75,000.Rs");
	}
	public static void main(String[] args) {
		Bike b = new Bike();
		b.bikeBrand();
		b.bikeModel();
		b.bikePrice();
	}
	

}
