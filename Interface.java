package Tam;

interface Vehicle{
	
	public void changeGear(int gear);
	public void speedup(int speed);
	public void speedDown(int speed);
	
}

class Bike implements Vehicle{
	private int gear;
	private int speed;

	public void changeGear(int newGear) {
		gear=newGear;
	}
	
	public void speedup(int increment) {
		speed+=increment;
	}
	
	public void speedDown(int decrement) {
		speed-=decrement;
	}
	
	void state() {
		System.out.println("Gear : "+gear+"\nSpeed of Bike : "+speed);
	}
}

class Car implements Vehicle{
	private int gear;
	private int speed;

	public void changeGear(int newGear) {
		gear=newGear;
	}
	
	public void speedup(int increment) {
		speed+=increment;
	}
	
	public void speedDown(int decrement) {
		speed-=decrement;
	}
	
	void state() {
		System.out.println("Gear : "+gear+"\nSpeed of Car : "+speed);
	}
}

public class Main{
	public static void main(String[] args) {
		Bike bike = new Bike();
		
		bike.changeGear(2);
		bike.speedup(100);
		bike.speedDown(20);
		bike.state();
		
		Car car = new Car();
		
		car.changeGear(3);
		car.speedup(150);
		car.speedDown(20);
		car.state();
	}
}
