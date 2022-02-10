package constructordemo;

public class Review {
	//instance variables
	private int reviewId;
	private String reviewGivenBy;
	private int rating;
	//static variables belongs to the class, and has one value that is shared by class objects (review1, review2, etc.)
	public static int reviewCount;

	public Review() {
		reviewId= -1;
		reviewGivenBy= "NotAvailible";
		rating= -1;
	}

	public Review(int reviewId, String reviewGivenBy, int rating, int reviewCount) {
		super();
		this.reviewId = reviewId;
		this.reviewGivenBy = reviewGivenBy;
		this.rating = rating;
		this.reviewCount = reviewCount;
	}

	public Review(int reviewId, String reviewGivenBy, int rating) {
		this.reviewId = reviewId;
		this.reviewGivenBy = reviewGivenBy;
		this.rating = rating;
	}

	public Review(int reviewId, String reviewGivenBy) {
		this();
		this.reviewId = reviewId;
		this.reviewGivenBy = reviewGivenBy;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewGivenBy() {
		return reviewGivenBy;
	}

	public void setReviewGivenBy(String reviewGivenBy) {
		this.reviewGivenBy = reviewGivenBy;
	}

	public int getRating() {
		return rating;
	}

	/*public void setRating(int rating) {
		this.rating = rating;
	}*/

}
