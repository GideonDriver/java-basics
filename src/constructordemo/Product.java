package constructordemo;

public class Product {

	int productId;
	String productName;
	int quantityOnHand;
	float price;
	int star= 5;
	
	//(Default) Constructor will get called automatically when "new Product();" is used
	//Constructor best practice is to initialize the variables
	public Product() {
		System.out.println("PRODUCT DEFAULT CONSTRUCTOR CALLED");
		productId= -1;
		productName= "NotAvailable";
		quantityOnHand= -1;
		price= -1f;
	}
		
	//Parameterized/Argument constructor
	//Used to set what type of variables can be sent to the constructor.
	public Product(int productId, String productName, int quantityOnHand, float price, int star) {
		this();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
		this.star = star;
	}

	public Product(int productId, String productName, int quantityOnHand) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
	}


	public Product(int productId, float price, int star) {
		//"this.();" calls the default constructor
		this();
		this.productId = productId;
		this.price = price;
		this.star = star;
	}


	//This method needs to be called to run.
	public void printProductDetails() {
		int star= 4;
		System.out.println("Product Id: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Quantity On Hand: "+quantityOnHand);
		System.out.println("Price: $"+price);
		//Calls the local variable "star"
		System.out.println("Star: "+star);
		//Calls the instance variable "star"
		System.out.println("Instance Star: "+this.star);

	}

	public static void main(String[] args) {
		//When initialized, calls (special method) constructor
		Product product = new Product();
		//Calls method
		product.printProductDetails();

		Product product2 = new Product();
		product2.printProductDetails();
		
		//Does not call constructor
		Product product3;
		//Creates an object without a name, Calls the constructor, and also calls "printProductDetails" method
		new Product().printProductDetails();
		

		Product product4 = new Product(2,"Aroma",12,19.99f,3);
		product4.printProductDetails();

		Product product5 = new Product(3, "Pendrive",8);
		product5.printProductDetails();

		Product product6 = new Product(4, 89,3);
		product6.printProductDetails();
	}

}
