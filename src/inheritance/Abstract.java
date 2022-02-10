package inheritance;

abstract class Vehicle {
	abstract void start();
	abstract void stop();
	public void applyBreak() {
		System.out.println("Apply breaks to stop the vehicle.");
	}
}
class Bike extends Vehicle {

	@Override
	void start() {
		System.out.println("Start by turning keys");
		
	}

	@Override
	void stop() {
		System.out.println("Stop by removing keys");
		
	}
	
}

public class Abstract {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();
		b.stop();
		b.applyBreak();
	}
}