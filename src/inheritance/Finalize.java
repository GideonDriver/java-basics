package inheritance;

class Customer {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize called, (1) object reclaimed.");
	}
}

public class Finalize {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = c2;
		c1 = null;
		Customer c4 = new Customer();
		c4 = null;
		c2 = null;

		// Only 2 objects will get reclaimed since c3 still points to c2's object (even
		// though c2 doesn't point to it anymore).

		System.gc();
	}

}
