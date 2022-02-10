package inheritance;
//toString(). equals(), & hashCode().
import java.util.Objects;

class Product {
	private int productId;
	private String productName;
	private int quantityOnHand;
	private int price;
	private int start;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, int quantityOnHand, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}

	public Product(int productId, String productName, int quantityOnHand, int price, int start) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
		this.start = start;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
				+ ", price=" + price + ", start=" + start + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, productId, productName, quantityOnHand, start);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return price == other.price && productId == other.productId && Objects.equals(productName, other.productName)
				&& quantityOnHand == other.quantityOnHand && start == other.start;
	}
	
}

public class ToString {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Lakme", 199, 99, 5);
		Product product2 = new Product(1, "Lakme", 199, 99, 5);

		System.out.println(product1);
		System.out.println(product2);
		
		System.out.println(product1.equals(product2));
		System.out.println(product1 == product2);
		
		Product product3 = product1;
		System.out.println(product1.equals(product3));
		System.out.println(product1 == product3);
		
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
		System.out.println(product3.hashCode());
	}

}
