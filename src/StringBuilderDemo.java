
public class StringBuilderDemo {
	/*StringBuilder:
	NOT threadsafe
	faster
	
	Shared resource can cause problems if two actions are happening on it at the same time.*/

	public static void main(String[] args) {
		StringBuilder data = new StringBuilder("Hello");	//default capacity = initialized length(5) + 16
		System.out.println(data);
		System.out.println("Length: "+data.length());		//5
		System.out.println("Capacity is length(5) + 16 = "+ data.capacity());	//21

		System.out.println("---------------");
		
		data.append(" Micheal");		// +8
		System.out.println(data);
		System.out.println("Current Length: "+data.length());		//13
		System.out.println("Current Capacity: "+ data.capacity());		//21
		
		System.out.println("---------------");
		
		data.append(", how are you today?");	// +20
		System.out.println(data);
		System.out.println("Current Length: "+data.length());		//33
		System.out.println("Current Capacity: "+ data.capacity());		//(21+1)*2 = 44
		
		System.out.println("---------------");
		
		data.append(" I am doing well.");	// +17
		System.out.println(data);
		System.out.println("Current Length: "+data.length());		//50
		System.out.println("Current Capacity: "+ data.capacity());		//(44+1)*2 = 90

	}

}
