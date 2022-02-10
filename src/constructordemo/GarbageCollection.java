package constructordemo;

class Revature {
	
}

public class GarbageCollection {

	public static void main(String[] args) {
		
		Revature r1 = new Revature();	
		Revature r2 = new Revature();	
		Revature r3 = r1;
		r1= null;
		Revature r4 = r2;
		r3= null;
		
		
		System.gc();
		
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		

	}

}
