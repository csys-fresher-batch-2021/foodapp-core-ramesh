package in.ramesh.model;

public class Hotel {

	private String foodName;
	
	private double price;
	
	private String foodType;
	
	private String hotelName;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodname) {
		this.foodName = foodname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getHotelName() {
		return hotelName;
	}
	
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Hotel(String foodName, double price, String foodType, String hotelName) {
		super();
		this.foodName = foodName;
		this.price = price;
		this.foodType = foodType;
		this.hotelName = hotelName;
	}


}
