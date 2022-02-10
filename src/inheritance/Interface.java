package inheritance;

interface Beverages {
	// All methods in an interface are abstract by default.
	// public final is added automatically to int, and the value must be declared. (variable is final, cannot change)
	int cost = 5;

	void prepareTea();
	
	//Cannot override these methods
	default void mix() {
		System.out.println("Mix beverages");
	}
	static void ratings() {
		System.out.println("Beverage ratings");
	}
}

interface Games {
	void play();

	void pause();

}
interface ModernGames extends Games {
	void graphics();
	void animations();
}

class Man extends Human implements Beverages, ModernGames {

	@Override
	public void play() {
		System.out.println("Man plays game.");

	}

	@Override
	public void pause() {
		System.out.println("Man pauses game.");

	}

	@Override
	public void prepareTea() {
		System.out.println("Man prepares tea.");
	}

	@Override
	public void graphics() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void animations() {
		// TODO Auto-generated method stub
		
	}

}

abstract class Human {
	int age;

	public void eat() {
		System.out.println("Human eats.");

	}

	public void sleep() {
		System.out.println("Human sleeps.");
	}

}

public class Interface {

	public static void main(String[] args) {
		Man m = new Man();
		m.eat();
		m.sleep();
		m.play();
		m.pause();
		m.prepareTea();
		m.mix();
		//m.ratings();
	}
}