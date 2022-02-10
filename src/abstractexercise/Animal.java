package abstractexercise;

abstract class Animal {
	String picture;
	String food;
	int hunger;
	int boundaries;
	String location;

	abstract void makeNoise();
	abstract void eat();
	abstract void roam();
	void sleep() {
		
	}
}
