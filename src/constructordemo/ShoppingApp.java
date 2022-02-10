package constructordemo;

public class ShoppingApp {

	public static void main(String[] args) {
		Review review1 = new Review(10182, "Daniel", 5);
		//review1.setRating(4);
		Review.reviewCount++;
		
		System.out.println(Review.reviewCount);

		Review review2 = new Review(10186, "Richard", 4);
		Review.reviewCount++;

		System.out.println(Review.reviewCount);

		Review review3 = new Review();
		Review.reviewCount++;

		System.out.println(Review.reviewCount);
	}

}
