package exceptions;

public class ConsoleInputException extends Exception{

	public ConsoleInputException(String message) {
		super(message);
	}
	
	public ConsoleInputException(String message, Throwable ex) {
		super(message, ex);
	}

}
