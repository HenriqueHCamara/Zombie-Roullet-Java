package exception;

public class PlayerNotFoundException extends Exception{
	
	public String getMessage() {
		return "Player Not Found";
	}

}
