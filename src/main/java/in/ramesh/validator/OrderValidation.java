package in.ramesh.validator;

import in.ramesh.model.Order;

public class OrderValidation {

	private OrderValidation() {
		// Default Constructor
	}

	/**
	 * This method is used to check the input value is correct or not.
	 * 
	 * @param hotel
	 * @return
	 */

	public static boolean isValidFood(Order food) {
		boolean isValid = false;
		try {
			boolean foodName = StringValidation.isValidString(food.getFoodName(), "Invalid Food Name");
			boolean foodType = StringValidation.isValidString(food.getFoodType(),"Invalid Food Type");
			boolean hotelName = StringValidation.isValidString(food.getHotelName(),"Invalid Hotel Name");
			if (foodName && foodType && hotelName) {
				isValid = true;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return isValid;
	}
	
}
