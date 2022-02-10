package inheritance;

class Food {
}

class Pizza extends Food {
}

class Burger extends Food {
}

class Animal {
	int age;

	// Superclass method
	// Return type must be the same type of a subtype of the super class.
	public Food eat() {
		System.out.println("Animals must eat to survive.");
		return null;
	}

	public void sleep() {
		System.out.println("Animals should sleep");
	}

	public static void doWork() {
		System.out.println("Animals doWork called");
	}
}

class Cat extends Animal {
	// Subclass method overrides the superclass method
	@Override
	// @Override can only be written above an overridden method
	public Pizza eat() {
		// calls parent method named "eat"
		super.eat();
		System.out.println("Cat eats fish.");
		return null;
	}

	public static void doWork() {
		System.out.println("Cat doWork called");
	}
}

class Dog extends Animal {
	// Subclass overrides the superclass method
	public Burger eat() {
		System.out.println("Dog eats meat.");
		return null;
	}
}

public class Overriding {

	public static void main(String[] args) {		
		System.out.println("1st way");
		Cat c = new Cat();
		// Calls method "eat" from child class "Cat".
		// If "Cat" did not have a method named "eat", it would call the parent "Animal"
		// class method named "eat".
		c.eat();
		// Since the child class "Cat" does not have a method name "sleep", it calls the
		// parent "Animal" method that is named "sleep".
		//c.sleep();

		// Same as "Cat"
		Dog d = new Dog();
		d.eat();
		//d.sleep();
		
		//The 2nd way of doing it frees up an extra memory for garbage collection. #BEST PRACTICE
		System.out.println("2nd way");
		Animal a = new Cat();
		a.eat();
		a = new Dog();
		a.eat();
	}
	// Access modifier for child method can increase accessibility, but not decrease
	// accessibility
	// Instance methods can only be overridden if they are inherited/visible by the
	// subclass.
}