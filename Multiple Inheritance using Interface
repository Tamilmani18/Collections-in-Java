package Tam;

interface Vehicle{
	
	public void changeGear(int gear);
	public void speedup(int speed);
	public void speedDown(int speed);
	
	default void update(){
		System.out.println("New JDK 8 and 9 Update. In which you can provide Implementation details of interface method(only for default,static,private modifier method)");
	}
	
	static void display1() {
		System.out.println("Static method(called without object)");
	}
	
	private void display2() {
		System.out.println("Private method(Not visible)");
	}
}

interface Bike extends Vehicle{
	default void feature1() {
		System.out.println("You can add extra features for Bike in this interface");
	}
}

interface Car extends Vehicle{
	default void feature2() {
		System.out.println("You can add extra features for Car in this interface");
	}
}

class Sample implements Bike, Car{
	/* 
	Class which implements the interface must contains all the implementation details of all interface methods
	or if you want to provide implementation detail of certain method you can declare the class as abstract.
	You can create another class which extends the  abstract class and you can provide the remaining
	implementation details of methods there.
	*/
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
	
	public void state() {
		System.out.println("Gear : "+gear+"\nSpeed of Vehicle : "+speed);
	}
}

public class Main{
	public static void main(String[] args) {
		Sample obj = new Sample();
		obj.changeGear(1);
		obj.speedup(100);
		obj.speedDown(10);
		obj.state();
		obj.feature1();
		obj.feature2();
		obj.update();
		Vehicle.display1();
		// Vehicle.display2(); Not visible
	}
}
