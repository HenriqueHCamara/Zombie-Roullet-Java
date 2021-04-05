package exception;

public class AgeFormatException extends Exception{
	
	public String getMessage() {
		return "Invalid Age format\n"
				+ "Age must be a positive number\n"
				+ "Age must be bigger than 9 and smaller than 100\n"
				+ "Age field must not be empty";
	}

}
