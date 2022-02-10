
public class GettersAndSetters {

	//Java automatically provides a default constructor, unless a Parameterized/Argument constructor is created.
	//If there is a Parameterized/Argument constructor, then the default constructor must be manually created if it is nessasary.
	
	String employeeName;

	
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public GettersAndSetters(String employeeName) {
		this.employeeName = employeeName;
	}

	public GettersAndSetters() {
		employeeName = "Arbuckle";
	}

	public static void main(String[] args) {
		GettersAndSetters c1 = new GettersAndSetters();
		GettersAndSetters c2 = new GettersAndSetters("Narlington");
		GettersAndSetters c3 = new GettersAndSetters();

		System.out.println(c1.employeeName);
		System.out.println(c2.employeeName);
		System.out.println(c3.employeeName);
	}

}
