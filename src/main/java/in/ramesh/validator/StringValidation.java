package in.ramesh.validator;
import in.ramesh.exception.ValidationException;

public class StringValidation {
	
	private StringValidation() {
		// Default Constructor
	}

	/**
	 * This method is used to validate String
	 * 
	 * @param value
	 * @return 
	 * @throws ValidationException 
	 */

	public static boolean isValidString(String value, String message) throws ValidationException {

		if (value != null && !value.trim().equals("")) {
			return true;
		} else {
			throw new ValidationException(message);
		}
	}

}
