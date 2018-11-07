package exceptions;

public class DialogInputException extends Exception{
	
	public DialogInputException(String message) {
		super(message);
	}
	
	public DialogInputException(String message, Throwable ex ) {
		super(message, ex);
	}

}
